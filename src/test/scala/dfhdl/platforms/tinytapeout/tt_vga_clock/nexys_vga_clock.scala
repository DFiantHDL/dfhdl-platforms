package dfhdl.platforms.tinytapeout.tt_vga_clock
import dfhdl.*
import dfhdl.platforms.resources.*
import dfhdl.platforms.devboards.digilent.NexysA7
import dfhdl.platforms.ips.xilinxamd.clk_wiz
import hw.constraints.*

class vga_clk_gen extends clk_wiz()
val main_dmn_cfg = RTDomainCfg(ClkCfg(rate = 100.MHz), None)
val vga_dmn_cfg = RTDomainCfg(ClkCfg(rate = 31.5.MHz), RstCfg(active = RstCfg.Active.Low))

@top class nexys_vga_clock extends RTDesign(main_dmn_cfg):
  val clk = Clk <> IN
  val adj_hrs = Bit <> IN
  val adj_min = Bit <> IN
  val adj_sec = Bit <> IN
  val hsync = Bit <> OUT
  val vsync = Bit <> OUT
  val rrggbb = Bits(6) <> OUT

  @timing.clock(rate = 31.5.MHz)
  val vga_dmn = new RTDomain(vga_dmn_cfg):
    val clk = Clk <> VAR
    val rst_n = Rst <> VAR
    val core = new VGA_Clock()
  vga_dmn.core.adj_hrs <> adj_hrs
  vga_dmn.core.adj_min <> adj_min
  vga_dmn.core.adj_sec <> adj_sec
  vga_dmn.core.hsync <> hsync
  vga_dmn.core.vsync <> vsync
  vga_dmn.core.rrggbb <> rrggbb
  val vga_clk_gen_inst = vga_clk_gen()
  vga_clk_gen_inst.clk <> clk.actual
  vga_dmn.clk <> vga_clk_gen_inst.vga_clk.as(vga_dmn.Clk)
  vga_dmn.rst_n <> vga_clk_gen_inst.locked.as(vga_dmn.Rst)
  val devboard = NexysA7()
  devboard.vgaJ3.HS <> hsync
  devboard.vgaJ3.VS <> vsync
  devboard.vgaJ3.R(3) <> rrggbb(5)
  devboard.vgaJ3.R(2) <> rrggbb(4)
  devboard.vgaJ3.G(3) <> rrggbb(3)
  devboard.vgaJ3.G(2) <> rrggbb(2)
  devboard.vgaJ3.B(3) <> rrggbb(1)
  devboard.vgaJ3.B(2) <> rrggbb(0)
  this <> devboard.clocks.CLK_100MHz
  devboard.buttons.BTNL <> adj_hrs
  devboard.buttons.BTNC <> adj_min
  devboard.buttons.BTNR <> adj_sec
  given ExpectedActiveState[Button] = Button.Pressed
end nexys_vga_clock

// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}
import dfhdl.*
import dfhdl.platforms.resources.*
given options.ProgrammerOptions.Tool           = tools.programmers.foss
given options.ElaborationOptions.DefaultRstCfg = None

object common:
  class Demo extends RTDesign:
    val clk     = Clk                <> IN
    val leds    = Bits(8)            <> OUT.REG init b"00000001"
    val dir     = Bit                <> IN
    val cycles  = 2500000
    val counter = UInt.until(cycles) <> VAR.REG init 0

    if (counter == cycles - 1)
      counter.din := 0
      if (dir.reg(2, init = 0))
        leds.din := (leds(6, 0), leds(7))
      else
        leds.din := (leds(0), leds(7, 1))
    else counter.din := counter + 1

    given ExpectedActiveState[Led]    = Led.On
    given ExpectedActiveState[Button] = Button.Pressed
  end Demo
end common

object ulx3s:
  import dfhdl.platforms.devboards.radiona.ULX3S
  given options.CompilerOptions.Backend = backends.verilog.v2001
  @top class Demo extends common.Demo:
    // resource connections
    val devBoard = ULX3S()
    clk  <> devBoard.clocks.Clk_25MHz
    leds <> devBoard.leds.LED
    dir  <> devBoard.buttons.BTN_F1
  end Demo

object nexysA7:
  import dfhdl.platforms.devboards.digilent.NexysA7
  import dfhdl.platforms.pmods.sipeed.PMOD_LEDx8
  given options.CompilerOptions.Backend = backends.vhdl.v2008
  @top class Demo extends common.Demo:
    // resource connections
    val devBoard = NexysA7()
    val ledsPmod = PMOD_LEDx8()
    ledsPmod <> devBoard.pmods.JB
    clk      <> devBoard.clocks.CLK_100MHZ
    leds     <> ledsPmod.LED_BUS
    dir      <> devBoard.buttons.BTNC
  end Demo

object deca:
  import dfhdl.platforms.devboards.terasic.DECA
  given options.CompilerOptions.Backend = backends.vhdl.v93
  @top class Demo extends common.Demo:
    // resource connections
    val devBoard = DECA()
    clk  <> devBoard.clocks.MAX10_CLK1_50MHz
    leds <> devBoard.leds.LED_BUS
    dir  <> devBoard.buttons.KEY1
  end Demo

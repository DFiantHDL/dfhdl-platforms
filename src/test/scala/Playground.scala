// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}
import dfhdl.*
import dfhdl.platforms.resources.*

object common:
  @top class Demo(val ledsCnt: Int = 8) extends RTDesign:
    val leds    = Bits(ledsCnt) <> OUT.REG init b"1".resize(ledsCnt)
    val dir     = Bit           <> IN
    val cycles  = (CLK_FREQ * 3.sec / ledsCnt).toInt
    val counter = Int           <> VAR.REG init 0

    if (counter == cycles - 1)
      counter.din := 0
      if (dir.reg(2, init = 0))
        leds.din := (leds(ledsCnt - 2, 0), leds(ledsCnt - 1))
      else
        leds.din := (leds(0), leds(ledsCnt - 1, 1))
    else counter.din := counter + 1

    given ExpectedActiveState[Led]    = Led.On
    given ExpectedActiveState[Button] = Button.Pressed
  end Demo
end common

object ulx3s:
  import dfhdl.platforms.devboards.radiona.ULX3S
  given options.CompilerOptions.Backend = backends.verilog.v2001
  given options.ProgrammerOptions.Tool  = tools.programmers.foss
  @top class Demo extends common.Demo(8):
    // resource connections
    val devBoard = ULX3S()
    this <> devBoard.clocks.CLK_25MHz
    leds <> devBoard.leds.LED.reverse
    dir  <> devBoard.buttons.BTN_F1
  end Demo

object nexysA7:
  import dfhdl.platforms.devboards.digilent.NexysA7
  import dfhdl.platforms.pmods.sipeed.PMOD_LEDx8
  given options.CompilerOptions.Backend = backends.vhdl.v2008
  given options.ProgrammerOptions.Tool  = tools.programmers.vendor
  @top class Demo extends common.Demo(8):
    val r = Bit <> VAR
    // resource connections
    val devBoard = NexysA7()
    val ledsPmod = PMOD_LEDx8()
    ledsPmod <> devBoard.pmods.JD
    this     <> devBoard.clocks.CLK_100MHZ
    leds     <> ledsPmod.LED_BUS
    dir      <> devBoard.buttons.BTNC
  end Demo
end nexysA7

object deca:
  import dfhdl.platforms.devboards.terasic.DECA
  given options.CompilerOptions.Backend = backends.vhdl.v93
  given options.ProgrammerOptions.Tool  = tools.programmers.vendor
  @top class Demo extends common.Demo(8):
    // resource connections
    val devBoard = DECA()
    this <> devBoard.clocks.MAX10_CLK1_50MHz
    leds <> devBoard.leds.LED_BUS
    dir  <> devBoard.buttons.KEY1
  end Demo

object tangprimer20k:
  import dfhdl.platforms.devboards.sipeed.TangPrimer20K
  import dfhdl.platforms.pmods.digilent.Pmod8LD
  given options.CompilerOptions.Backend = backends.verilog.sv2005
  given options.ProgrammerOptions.Tool  = tools.programmers.foss
  @top class Demo extends common.Demo(8):
    // resource connections
    val devBoard = TangPrimer20K()
    val ledsPmod = Pmod8LD()
    ledsPmod <> devBoard.pmods.PMOD0
    this     <> devBoard.clocks.CLK_27MHz
    leds     <> ledsPmod.LED_BUS.reverse
    dir      <> devBoard.buttons.S1
  end Demo
end tangprimer20k

object atumA3Nano:
  import dfhdl.platforms.devboards.terasic.Atum_A3_Nano
  given options.CompilerOptions.Backend = backends.vhdl
  given options.ProgrammerOptions.Tool  = tools.programmers.vendor
  @top class Demo extends common.Demo(4):
    // resource connections
    val devBoard = Atum_A3_Nano()
    this <> devBoard.clocks.CLOCK0_50MHz
    leds <> devBoard.leds.LED_BUS
    dir  <> devBoard.buttons.KEY0
  end Demo
end atumA3Nano

object systemSim:
  @top class Test extends RTDesign:
    val ulx3sDemo        = ulx3s.Demo()
    val nexysA7Demo      = nexysA7.Demo()
    val decaDemo         = deca.Demo()
    val tangprimer20Demo = tangprimer20k.Demo()
    val dir              = Bit <> VAR
    dir                  <> 0
    ulx3sDemo.dir        <> dir
    nexysA7Demo.dir      <> dir
    decaDemo.dir         <> dir
    tangprimer20Demo.dir <> dir
    val ed = new EDDomain:
      process:
        report(
          s"ULX3S: ${ulx3sDemo.leds} NexysA7: ${nexysA7Demo.leds} DECA: ${decaDemo.leds} TangPrimer20K: ${tangprimer20Demo.leds}"
        )
        wait(1.ms)
  end Test
end systemSim

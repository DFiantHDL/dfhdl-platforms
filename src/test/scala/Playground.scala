import dfhdl.*
// given options.CompilerOptions.LogLevel = options.CompilerOptions.LogLevel.TRACE
given options.ElaborationOptions.DefaultRstCfg = None
// given options.CompilerOptions.Backend = backends.verilog.v95
import dfhdl.platforms.devboards.digilent.NexysA7
import dfhdl.platforms.devboards.sipeed.TangPrimer25K
import dfhdl.platforms.pmods.sipeed.PMOD_LEDx8
import dfhdl.platforms.pmods.sipeed.PMOD_BTN4x4
import dfhdl.platforms.pmods.digilent.Pmod8LD
import dfhdl.platforms.resources.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

@top class ID extends RTDesign:
  val B1, B2, B3, B4     = Bit <> IN
  val y11, y12, y13, y14 = Bit <> OUT
  val y21, y22, y23, y24 = Bit <> OUT
  y11 <> B1
  y12 <> B2
  y13 <> B3
  y14 <> B4
  y21 <> B1
  y22 <> B2
  y23 <> B3
  y24 <> B4
  // resource connections
  val devBoard                        = TangPrimer25K()
  val pmodLED1                        = PMOD_LEDx8()
  val pmodLED2                        = Pmod8LD()
  val pmodBTN                         = PMOD_BTN4x4()
  given ExpectedActiveState[Led]      = Led.On
  given ExpectedActiveState[Button]   = Button.Pressed
  given ExpectedActiveState[SwitchNS] = SwitchNS.North
  pmodLED1 <> devBoard.pmods.J6
  pmodLED2 <> devBoard.pmods.J4
  pmodBTN  <> devBoard.pmods.J5
  y11      <> pmodLED1.LD(7)
  y12      <> pmodLED1.LD(6)
  y13      <> pmodLED1.LD(5)
  y14      <> pmodLED1.LD(4)
  y21      <> pmodLED2.LD(0)
  y22      <> pmodLED2.LD(1)
  y23      <> pmodLED2.LD(2)
  y24      <> pmodLED2.LD(3)
  B1       <> pmodBTN.S1
  B2       <> pmodBTN.S2
  B3       <> pmodBTN.S3
  B4       <> pmodBTN.S4
end ID

@main def main = println("hello")

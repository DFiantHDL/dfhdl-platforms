package dfhdl.platforms.pmods.sipeed
import dfhdl.platforms.resources.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

/*
    ║ ║ ║ ║ ║ ║
   ░░░░░░░░░░░░░
┌───╫─╫─╫─╫─╫─╫───┐
│J1 ● ● ● ● ● ●   │
│                 │
│ 7 6 5 4 3 2 1 0 │
│ █ █ █ █ █ █ █ █ │ Leds are active low: 0 is on, 1 is off
│                 │ If the pins are weakly pulled-down, the leds will be on.
│   PMOD-LEDx8    │
└─────────────────┘
 */
class PMOD_LEDx8 extends SPPmodBoard:
  protected val J1         = SPPmodConn.Male()
  protected val spPmodConn = J1
  val LD                   = IOBus.fill(8)(Led(activeState = Led.Off))
  J1.P(11) <> LD(0)
  J1.P(12) <> LD(1)
  J1.P(9)  <> LD(2)
  J1.P(10) <> LD(3)
  J1.P(7)  <> LD(4)
  J1.P(8)  <> LD(5)
  J1.P(5)  <> LD(6)
  J1.P(6)  <> LD(7)

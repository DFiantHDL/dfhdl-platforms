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
  val LED_BUS              = IOBus.fill(8)(Led(activeState = Led.Off))
  J1.P(11) <> LED_BUS(0)
  J1.P(12) <> LED_BUS(1)
  J1.P(9)  <> LED_BUS(2)
  J1.P(10) <> LED_BUS(3)
  J1.P(7)  <> LED_BUS(4)
  J1.P(8)  <> LED_BUS(5)
  J1.P(5)  <> LED_BUS(6)
  J1.P(6)  <> LED_BUS(7)

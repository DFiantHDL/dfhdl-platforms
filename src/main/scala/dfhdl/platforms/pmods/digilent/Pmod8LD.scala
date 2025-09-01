package dfhdl.platforms.pmods.digilent
import dfhdl.platforms.resources.*
import dfhdl.hw.constraints.io
import dfhdl.platforms.pmods.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

/*
    ║ ║ ║ ║ ║ ║
   ░░░░░░░░░░░░░
┌───╫─╫─╫─╫─╫─╫───┐
│J1 ● ● ● ● ● ●   │
│                 │
│ 7 6 5 4 3 2 1 0 │
│ █ █ █ █ █ █ █ █ │ Leds are active high: 1 is on, 0 is off
│                 │ If the pins are weakly pulled-up, the leds will be on.
│     Pmod8LD     │
└─────────────────┘
 */
class Pmod8LD extends PmodBoard:
  protected val J1       = PmodConn.Male()
  protected val pmodConn = J1
  val LED_BUS            = IOBus.fill(8)(Led(activeState = Led.On))
  J1.P(1)  <> LED_BUS(0)
  J1.P(2)  <> LED_BUS(1)
  J1.P(3)  <> LED_BUS(2)
  J1.P(4)  <> LED_BUS(3)
  J1.P(7)  <> LED_BUS(4)
  J1.P(8)  <> LED_BUS(5)
  J1.P(9)  <> LED_BUS(6)
  J1.P(10) <> LED_BUS(7)

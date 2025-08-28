package dfhdl.platforms.pmods.sipeed
import dfhdl.platforms.resources.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

/*
  ║   ║   ║   ║   ║   ║
 ░░░░░░░░░░░░░░░░░░░░░░░
┌─╫───╫───╫───╫───╫───╫─┐
│ ●   ●   ●   ●   ●   ● │
│                       │
│     S S       S S     │
│  ░░░1░2░░░ ░░░3░4░░░  │
│  ░░┌─┬─┐░░ ░░┌─┬─┐░░  │
│  ░░│█│█│N░ ░░│█│█│N░  │
│  ░░│░│░│S░ ░░│░│░│S░  │
│  ░░└─┴─┘░░ ░░└─┴─┘░░  │
│  ░░░░░░░░░ ░░░░░░░░░  │
│                       │
│ K1    K2    K3    K4  │
│┌───┐ ┌───┐ ┌───┐ ┌───┐│
││╭─╮│ │╭─╮│ │╭─╮│ │╭─╮││
│││ ││ ││ ││ ││ ││ ││ │││
││╰─╯│ │╰─╯│ │╰─╯│ │╰─╯││
│└───┘ └───┘ └───┘ └───┘│
│     PMOD-BTN 4x4      │
└───────────────────────┘
 */
class PMOD_BTN4x4 extends SPPmodBoard:
  protected val J1         = SPPmodConn.Male()
  protected val spPmodConn = J1
  val K1, K2, K3, K4       = Button(activeState = Button.Released)
  val S1, S2, S3, S4       = SwitchNS(activeState = SwitchNS.North)
  J1.P(6)  <> K1
  J1.P(8)  <> K2
  J1.P(9)  <> K3
  J1.P(11) <> K4
  J1.P(5)  <> S1
  J1.P(7)  <> S2
  J1.P(10) <> S3
  J1.P(12) <> S4
end PMOD_BTN4x4

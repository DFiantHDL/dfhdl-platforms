/*
 * Copyright (c) 2024 DFiant Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dfhdl.platforms.pmods.sipeed
import dfhdl.platforms.resources.*
import dfhdl.platforms.pmods.*
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
class PMOD_BTN4x4 extends PmodBoard:
  protected val J1       = PmodConn.SPMale90Deg()
  protected val pmodConn = J1
  @io(standard = io.Standard.LVCMOS)
  val K1, K2, K3, K4 = Button(activeState = Button.Released)
  @io(standard = io.Standard.LVCMOS)
  val S1, S2, S3, S4 = SwitchNS(activeState = SwitchNS.North)
  J1.P(6)  <> K1
  J1.P(8)  <> K2
  J1.P(9)  <> K3
  J1.P(11) <> K4
  J1.P(5)  <> S1
  J1.P(7)  <> S2
  J1.P(10) <> S3
  J1.P(12) <> S4
end PMOD_BTN4x4

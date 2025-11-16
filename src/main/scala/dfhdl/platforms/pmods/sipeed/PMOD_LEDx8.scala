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
│ █ █ █ █ █ █ █ █ │ Leds are active low: 0 is on, 1 is off
│                 │ If the pins are weakly pulled-down, the leds will be on.
│   PMOD-LEDx8    │
└─────────────────┘
 */
class PMOD_LEDx8 extends PmodBoard:
  protected val J1       = PmodConn.SPMale90Deg()
  protected val pmodConn = J1
  val LED_BUS            = IOBus.fill(8)(Led(activeState = Led.Off))
  J1.P(11) <> LED_BUS(0)
  J1.P(12) <> LED_BUS(1)
  J1.P(9)  <> LED_BUS(2)
  J1.P(10) <> LED_BUS(3)
  J1.P(7)  <> LED_BUS(4)
  J1.P(8)  <> LED_BUS(5)
  J1.P(5)  <> LED_BUS(6)
  J1.P(6)  <> LED_BUS(7)

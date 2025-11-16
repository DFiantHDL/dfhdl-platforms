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
package dfhdl.platforms.pmods.tinytapeout
import dfhdl.platforms.resources.*
import dfhdl.platforms.pmods.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class TinyVGA extends PmodBoard:
  protected val J1       = PmodConn.Male()
  protected val pmodConn = J1

  @io(standard = io.Standard.LVCMOS)
  val vga = VGA(bitsPerColor = 2)
  J1.P(1)  <> vga.R(1)
  J1.P(2)  <> vga.G(1)
  J1.P(3)  <> vga.B(1)
  J1.P(4)  <> vga.VS
  J1.P(7)  <> vga.R(0)
  J1.P(8)  <> vga.G(0)
  J1.P(9)  <> vga.B(0)
  J1.P(10) <> vga.HS
end TinyVGA

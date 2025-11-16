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
package dfhdl.platforms.pmods.digilent
import dfhdl.platforms.resources.*
import dfhdl.platforms.pmods.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}
class PmodVGA extends PmodDualBoard:
  protected val J1           = PmodConn.Male()
  protected val J2           = PmodConn.Male()
  protected val pmodDualConn = PmodDualConn.Male(J1, J2)

  @io(standard = io.Standard.LVCMOS)
  val vga = VGA()
  vga.R(0) <> J1.P(1)
  vga.R(1) <> J1.P(2)
  vga.R(2) <> J1.P(3)
  vga.R(3) <> J1.P(4)
  vga.B(0) <> J1.P(7)
  vga.B(1) <> J1.P(8)
  vga.B(2) <> J1.P(9)
  vga.B(3) <> J1.P(10)
  vga.G(0) <> J2.P(1)
  vga.G(1) <> J2.P(2)
  vga.G(2) <> J2.P(3)
  vga.G(3) <> J2.P(4)
  vga.HS   <> J2.P(7)
  vga.VS   <> J2.P(8)
end PmodVGA

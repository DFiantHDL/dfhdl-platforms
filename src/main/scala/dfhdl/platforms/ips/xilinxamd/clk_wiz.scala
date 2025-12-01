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
 *
 * DISCLAIMER: This file contains a DFHDL wrapper around Xilinx/AMD IP/device
 * information. The wrapper code is licensed under Apache 2.0, but the
 * underlying Xilinx/AMD IP/device is subject to Xilinx/AMD's license terms.
 * Users must comply with Xilinx/AMD's End User License Agreement (EULA)
 * and license terms when using Xilinx/AMD products. This wrapper is provided
 * as-is without any warranty or guarantee of compatibility with Xilinx/AMD IP.
 */
package dfhdl.platforms.ips.xilinxamd
import dfhdl.*

class clk_wiz(
    val PRIM_IN_FREQ: Double <> CONST = 100.0,
    val CLKOUT1_REQUESTED_OUT_FREQ: Double <> CONST = 31.5,
    val CLK_OUT1_PORT: String <> CONST = "vga_clk",
    val PRIMARY_PORT: String <> CONST = "clk",
    val USE_RESET: Boolean <> CONST = false,
    val version: String <> CONST = ""
) extends EDBlackBox.VivadoIP:
  val clk = Bit <> IN
  val vga_clk = Bit <> OUT
  val locked = Bit <> OUT

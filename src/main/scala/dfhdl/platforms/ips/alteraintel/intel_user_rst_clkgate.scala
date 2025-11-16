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
 * DISCLAIMER: This file contains a DFHDL wrapper around Intel/Altera IP/device
 * information. The wrapper code is licensed under Apache 2.0, but the
 * underlying Intel/Altera IP/device is subject to Intel/Altera's license terms.
 * Users must comply with Intel/Altera's End User License Agreement (EULA)
 * and license terms when using Intel/Altera products. This wrapper is provided
 * as-is without any warranty or guarantee of compatibility with Intel/Altera IP.
 */
package dfhdl.platforms.ips.alteraintel
import dfhdl.*
import intel_user_rst_clkgate.*
import scala.annotation.targetName

class intel_user_rst_clkgate(
    outputType: OutputType,
    version: String <> CONST = ""
) extends intel_user_rst_clkgate_internal(outputType = outputType.toString, version = version)

object intel_user_rst_clkgate:
  @inline def getGlobalClkEna: Bit <> DFRET =
    class glbl_rst
        extends intel_user_rst_clkgate(outputType = OutputType.ResetInterface, version = "")
    val glbl_rst_inst = glbl_rst()
    !glbl_rst_inst.ninit_done

  enum OutputType derives CanEqual:
    case ResetInterface, ConduitInterface
    override def toString: String = this match
      case ResetInterface   => "Reset Interface"
      case ConduitInterface => "Conduit Interface"

  @targetName("intel_user_rst_clkgate")
  protected class intel_user_rst_clkgate_internal(
      val outputType: String <> CONST,
      val version: String <> CONST = ""
  ) extends EDBlackBox.QsysIP:
    val ninit_done = Bit <> OUT
end intel_user_rst_clkgate

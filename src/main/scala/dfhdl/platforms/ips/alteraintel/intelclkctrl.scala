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
import intelclkctrl.*
import scala.annotation.targetName
import dfhdl.internals.metaContextForward
import dfhdl.core.DFValAny

class intelclkctrl[IN <: Int & Singleton](
    clkInputsNum: IN,
    glitchFreeSwitchover: GlitchFreeSwitchover,
    ctrlMode: CtrlMode,
    version: String = ""
) extends internal_intelclkctrl(
      NUM_CLOCKS = clkInputsNum,
      GLITCH_FREE_SWITCHOVER = glitchFreeSwitchover.ordinal,
      ENABLE = ctrlMode.toENABLE,
      ENABLE_REGISTER_TYPE = ctrlMode.toENABLE_REGISTER_TYPE,
      ENABLE_TYPE = ctrlMode.toENABLE_TYPE,
      CLOCK_DIVIDER = ctrlMode.toCLOCK_DIVIDER,
      CLOCK_DIVIDER_OUTPUTS = ctrlMode.toCLOCK_DIVIDER_OUTPUTS,
      version = version
    ):
  transparent inline def clkselect: DFValAny =
    inline compiletime.constValue[IN] match
      case 2 => clksel2.clkselect
      case 4 => clksel4.clkselect
      case _ => compiletime.error("Cannot access clkselect under the current configuration.")
end intelclkctrl

object intelclkctrl:
  @inline def gated(
      clk: Bit <> VAL,
      ena: Bit <> VAL,
      level: ClockGatingLevel = ClockGatingLevel.RootLevel,
      regMode: ClockGatingRegisterMode = ClockGatingRegisterMode.NegativeLatch
  ): Bit <> DFRET =
    val intelclkctrl_gated = intelclkctrl(
      clkInputsNum = 1,
      glitchFreeSwitchover = GlitchFreeSwitchover.Off,
      ctrlMode = CtrlMode.Gating(level, regMode)
    )
    intelclkctrl_gated.inclk <> clk
    intelclkctrl_gated.ena <> ena
    intelclkctrl_gated.outclk
  end gated

  type ClkInputsNum = 1 | 2 | 4
  enum GlitchFreeSwitchover derives CanEqual:
    case Off, On
  enum CtrlMode derives CanEqual:
    case SelectOnly
    case Gating(level: ClockGatingLevel, regMode: ClockGatingRegisterMode)
    case Division(outputs: ClockDivisionOutputs)
    def toCLOCK_DIVIDER: Int = this match
      case Division(_) => 1
      case _           => 0
    def toCLOCK_DIVIDER_OUTPUTS: Int = this match
      case Division(outputs) => outputs
      case _                 => 0
    def toENABLE: Int = this match
      case Gating(_, _) => 1
      case _            => 0
    def toENABLE_REGISTER_TYPE: Int = this match
      case Gating(regMode = regMode) => regMode.ordinal + 1
      case _                         => 0
    def toENABLE_TYPE: Int = this match
      case Gating(level = level) => level.ordinal + 1
      case _                     => 0
  end CtrlMode

  enum ClockGatingLevel derives CanEqual:
    case RootLevel, DistributedSectorLevel
  enum ClockGatingRegisterMode derives CanEqual:
    case NegativeLatch, NoRegister
  type ClockDivisionOutputs = 1 | 2 | 4

  @targetName("intelclkctrl")
  protected class internal_intelclkctrl(
      val NUM_CLOCKS: Int <> CONST,
      val GLITCH_FREE_SWITCHOVER: Int <> CONST,
      val ENABLE: Int <> CONST,
      val ENABLE_REGISTER_TYPE: Int <> CONST,
      val ENABLE_TYPE: Int <> CONST,
      val CLOCK_DIVIDER: Int <> CONST,
      val CLOCK_DIVIDER_OUTPUTS: Int <> CONST,
      val version: String <> CONST = ""
  ) extends EDBlackBox.QsysIP:

    /** Parameter Values */
    private val clockDivider = CLOCK_DIVIDER.toScalaInt > 0
    private val clockDividerOutputs = CLOCK_DIVIDER_OUTPUTS.toScalaInt
    private val enable = ENABLE.toScalaInt > 0
    private val numClocks = NUM_CLOCKS.toScalaInt

    /** Ports */
    private var allowCreate = true
    @metaContextForward(0)
    private def create[T](arg: => T)(using DFC): T =
      if (allowCreate)
        arg
      else
        throw new IllegalArgumentException(
          "This port cannot be accessed under the current configuration."
        )
    lazy val inclk = create(Bit <> IN)
    lazy val inclk0x, inclk1x, inclk2x, inclk3x = create(Bit <> IN)
    lazy val outclk = create(Bit <> OUT)
    lazy val clock_div1x, clock_div2x, clock_div4x = create(Bit <> OUT)
    lazy val ena = create(Bit <> IN)
    private[intelclkctrl] object clksel2:
      lazy val clkselect = create(Bit <> IN)
    private[intelclkctrl] object clksel4:
      lazy val clkselect = create(Bits(2) <> IN)

    /** Touching the relevant lazy ports according to the activation parameters */
    if (numClocks == 2) clksel2.clkselect
    if (numClocks == 4) clksel4.clkselect
    if (numClocks == 1) inclk
    else
      inclk0x
      if (numClocks >= 2) inclk1x
      if (numClocks >= 3) inclk2x
      if (numClocks >= 4) inclk3x
    if (!clockDivider) outclk
    else
      clock_div1x
      if (clockDividerOutputs >= 2) clock_div2x
      if (clockDividerOutputs >= 4) clock_div4x
    if (enable) ena
    allowCreate = false
  end internal_intelclkctrl
end intelclkctrl

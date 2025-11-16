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
package dfhdl.platforms.tinytapeout
import dfhdl.*
import dfhdl.hw.annotation.unused

abstract class TT10 extends RTDesign:
  override def customTopChecks(): Unit =
    val topName = dfc.getSet.topName
    assert(
      topName.startsWith("tt_um_"),
      s"""A tiny tapeout design name must start with "tt_um_" but found "$topName""""
    )

  /** Dedicated inputs */
  val ui_in = Bits(8) <> IN

  /** Dedicated outputs */
  val uo_out = Bits(8) <> OUT

  /** IOs: Input path */
  val uio_in = Bits(8) <> IN

  /** IOs: Output path */
  val uio_out = Bits(8) <> OUT

  /** IOs: Enable path (active high: 0=input, 1=output) */
  val uio_oe = Bits(8) <> OUT

  /** Always 1 when the design is powered, so you can ignore it */
  @unused.quiet()
  val ena = Bit <> IN
end TT10

object TT10:
  // TODO: read from file
  lazy val configJSON: Map[String, String] = Map(
    "CLOCK_PORT" -> "clk",
    "CLOCK_PERIOD" -> "20"
  )
  lazy val defaultClkCfg = ClkCfg(
    edge = ClkCfg.Edge.Rising,
    rate = configJSON("CLOCK_PERIOD").toDouble.ns,
    portName = configJSON("CLOCK_PORT"),
    inclusionPolicy = ClkCfg.InclusionPolicy.AlwaysAtTop
  )
  lazy val defaultRstCfg = RstCfg(
    mode = RstCfg.Mode.Sync,
    active = RstCfg.Active.Low,
    portName = "rst_n",
    inclusionPolicy = RstCfg.InclusionPolicy.AlwaysAtTop
  )
  given options.ElaborationOptions.Defaults[TT10] =
    options.ElaborationOptions.defaults.copy(
      defaultClkCfg = defaultClkCfg,
      defaultRstCfg = defaultRstCfg
    )
end TT10

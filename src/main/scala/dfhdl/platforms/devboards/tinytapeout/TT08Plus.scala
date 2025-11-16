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
package dfhdl.platforms.devboards.tinytapeout
import dfhdl.platforms.Board
import dfhdl.platforms.devices.tinytapeout.TTDevice
import dfhdl.platforms.resources.*
import TT08Plus.DockConn
import dfhdl.platforms.pmods.*
import dfhdl.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class TT08Plus_Breakout_Board(shuttle: String) extends Board:
  val asic = TTDevice(shuttle)
  val CON1 = DockConn.Female()
  val CON2 = DockConn.Female()

  CON1.P(9)  <> asic.ios.uin0
  CON1.P(11) <> asic.ios.uin1
  CON1.P(13) <> asic.ios.uin3
  CON1.P(17) <> asic.ios.uin4
  CON1.P(19) <> asic.ios.uin5
  CON1.P(35) <> asic.ios.clk
  CON1.P(39) <> asic.ios.uio0
  CON1.P(14) <> asic.ios.uin2
  CON1.P(16) <> asic.ios.uin6
  CON1.P(34) <> asic.ios.uin7
  CON1.P(36) <> asic.ios.rst_n
  CON1.P(40) <> asic.ios.uio1
  CON2.P(19) <> asic.ios.uout6
  CON2.P(21) <> asic.ios.uout4
  CON2.P(25) <> asic.ios.uout2
  CON2.P(27) <> asic.ios.uout0
  CON2.P(31) <> asic.ios.uio6
  CON2.P(33) <> asic.ios.uio4
  CON2.P(37) <> asic.ios.uio2
  CON2.P(20) <> asic.ios.uout7
  CON2.P(22) <> asic.ios.uout5
  CON2.P(26) <> asic.ios.uout3
  CON2.P(28) <> asic.ios.uout1
  CON2.P(32) <> asic.ios.uio7
  CON2.P(34) <> asic.ios.uio5
  CON2.P(38) <> asic.ios.uio3
end TT08Plus_Breakout_Board

class TT08Plus_Demo_Board(clkRate: ClkCfg.Rate) extends Board:
  val CON1 = DockConn.Male()
  val CON2 = DockConn.Male()

  object nets:
    val ui_in0  = CON1.P(9)
    val ui_in1  = CON1.P(11)
    val ui_in3  = CON1.P(13)
    val ui_in4  = CON1.P(17)
    val ui_in5  = CON1.P(19)
    val clk     = CON1.P(35)
    val uio0    = CON1.P(39)
    val ui_in2  = CON1.P(14)
    val ui_in6  = CON1.P(16)
    val ui_in7  = CON1.P(34)
    val rst_n   = CON1.P(36)
    val uio1    = CON1.P(40)
    val uo_out6 = CON2.P(19)
    val uo_out4 = CON2.P(21)
    val uo_out2 = CON2.P(25)
    val uo_out0 = CON2.P(27)
    val uio6    = CON2.P(31)
    val uio4    = CON2.P(33)
    val uio2    = CON2.P(37)
    val uo_out7 = CON2.P(20)
    val uo_out5 = CON2.P(22)
    val uo_out3 = CON2.P(26)
    val uo_out1 = CON2.P(28)
    val uio7    = CON2.P(32)
    val uio5    = CON2.P(34)
    val uio3    = CON2.P(38)
  end nets
  nets // touch to force execution

  object clocks:
    val CLK_1Hz_TO_66MHz = Oscillator(clkRate)
    CLK_1Hz_TO_66MHz <> nets.clk
  clocks // touch to force execution

  object pmods:
    val J3_Input        = PmodConn.Female()
    val J5_Bidir        = PmodConn.Female()
    val J6_Output       = PmodConn.Female()
    val J5_J3_Dual      = PmodDualConn.Female(J5_Bidir, J3_Input)
    val J6_J5_Dual      = PmodDualConn.Female(J6_Output, J5_Bidir)
    val J6_J5_J3_Triple = PmodTripleConn.Female(J6_Output, J5_Bidir, J3_Input)
    J3_Input.P(4)   <> nets.ui_in3
    J3_Input.P(3)   <> nets.ui_in2
    J3_Input.P(2)   <> nets.ui_in1
    J3_Input.P(1)   <> nets.ui_in0
    J3_Input.P(10)  <> nets.ui_in7
    J3_Input.P(9)   <> nets.ui_in6
    J3_Input.P(8)   <> nets.ui_in5
    J3_Input.P(7)   <> nets.ui_in4
    J5_Bidir.P(4)   <> nets.uio3
    J5_Bidir.P(3)   <> nets.uio2
    J5_Bidir.P(2)   <> nets.uio1
    J5_Bidir.P(1)   <> nets.uio0
    J5_Bidir.P(10)  <> nets.uio7
    J5_Bidir.P(9)   <> nets.uio6
    J5_Bidir.P(8)   <> nets.uio5
    J5_Bidir.P(7)   <> nets.uio4
    J6_Output.P(4)  <> nets.uo_out3
    J6_Output.P(3)  <> nets.uo_out2
    J6_Output.P(2)  <> nets.uo_out1
    J6_Output.P(1)  <> nets.uo_out0
    J6_Output.P(10) <> nets.uo_out7
    J6_Output.P(9)  <> nets.uo_out6
    J6_Output.P(8)  <> nets.uo_out5
    J6_Output.P(7)  <> nets.uo_out4
  end pmods
  pmods // touch to force execution
end TT08Plus_Demo_Board

class TT08Plus(shuttle: String, clkRate: ClkCfg.Rate = 50.MHz) extends Board:
  val breakout = TT08Plus_Breakout_Board(shuttle)
  val demo     = TT08Plus_Demo_Board(clkRate)
  breakout.CON1 <> demo.CON1
  breakout.CON2 <> demo.CON2
  export demo.{pmods, clocks}
end TT08Plus

object TT08Plus:
  object DockConn extends Connector.Companion(40)

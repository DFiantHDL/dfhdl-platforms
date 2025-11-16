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
package dfhdl.platforms.devboards.digilent
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.pmods.*
import dfhdl.platforms.resources.*
import dfhdl.internals.CTName
import dfhdl.platforms.devices.xilinxamd.series7.xc7a100tcsg324
import dfhdl.*
import dfhdl.hw.constraints.*
import dfhdl.platforms.devices.Bank
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}
@toolOptions("openFPGALoader" -> "-b nexys_a7_100")
class NexysA7 extends DevBoard:
  @deviceProperties(
    "CONFIG_VOLTAGE" -> "3.3",
    "CFGBVS"         -> "VCCO"
  )
  @deviceConfig(
    flashPartName = "s25fl128sxxxxxx0-spi-x1_x2_x4",
    interface     = deviceConfig.Interface.MasterSPI(busWidth = 4),
    sizeLimitMb   = 128
  )
  final val fpga = xc7a100tcsg324(speedGrade = "1")

  //////////////////////////////////////////
  // Power
  //////////////////////////////////////////
  object power:
    val Vcc = Power(3.3)
    Vcc <> fpga.bank0
    Vcc <> fpga.bank14
    Vcc <> fpga.bank15
    Vcc <> fpga.bank16
    Vcc <> fpga.bank34
    Vcc <> fpga.bank35
  end power
  power // touch to force execution

  //////////////////////////////////////////
  // Pmods
  //////////////////////////////////////////
  object pmods:
    val JA = PmodConn.Female()
    JA.P(1)  <> fpga.ios.C17
    JA.P(2)  <> fpga.ios.D18
    JA.P(3)  <> fpga.ios.E18
    JA.P(4)  <> fpga.ios.G17
    JA.P(7)  <> fpga.ios.D17
    JA.P(8)  <> fpga.ios.E17
    JA.P(9)  <> fpga.ios.F18
    JA.P(10) <> fpga.ios.G18
    val JB = PmodConn.Female()
    JB.P(1)  <> fpga.ios.D14
    JB.P(2)  <> fpga.ios.F16
    JB.P(3)  <> fpga.ios.G16
    JB.P(4)  <> fpga.ios.H14
    JB.P(7)  <> fpga.ios.E16
    JB.P(8)  <> fpga.ios.F13
    JB.P(9)  <> fpga.ios.G13
    JB.P(10) <> fpga.ios.H16
    val JC = PmodConn.Female()
    JC.P(1)  <> fpga.ios.K1
    JC.P(2)  <> fpga.ios.F6
    JC.P(3)  <> fpga.ios.J2
    JC.P(4)  <> fpga.ios.G6
    JC.P(7)  <> fpga.ios.E7
    JC.P(8)  <> fpga.ios.J3
    JC.P(9)  <> fpga.ios.J4
    JC.P(10) <> fpga.ios.E6
    val JD = PmodConn.Female()
    JD.P(1)  <> fpga.ios.H4
    JD.P(2)  <> fpga.ios.H1
    JD.P(3)  <> fpga.ios.G1
    JD.P(4)  <> fpga.ios.G3
    JD.P(7)  <> fpga.ios.H2
    JD.P(8)  <> fpga.ios.G4
    JD.P(9)  <> fpga.ios.G2
    JD.P(10) <> fpga.ios.F3
    val JXADC = PmodConn.Female()
    JXADC.P(1)  <> fpga.ios.A14
    JXADC.P(2)  <> fpga.ios.A13
    JXADC.P(3)  <> fpga.ios.A16
    JXADC.P(4)  <> fpga.ios.A15
    JXADC.P(7)  <> fpga.ios.B17
    JXADC.P(8)  <> fpga.ios.B16
    JXADC.P(9)  <> fpga.ios.A18
    JXADC.P(10) <> fpga.ios.B18
    val JA_JB_Dual    = PmodDualConn.Female(JA, JB)
    val JXADC_JA_Dual = PmodDualConn.Female(JXADC, JA)
    val JC_JD_Dual    = PmodDualConn.Female(JC, JD)
  end pmods
  pmods // touch to force execution

  //////////////////////////////////////////
  // Clocks
  //////////////////////////////////////////
  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val CLK_100MHz = Oscillator(100.MHz)
    CLK_100MHz <> fpga.ios.E3
  clocks // touch to force execution

  //////////////////////////////////////////
  // VGA
  //////////////////////////////////////////
  @io(standard = io.Standard.LVCMOS)
  val vgaJ3 = VGA()
  vgaJ3.R(0) <> fpga.ios.A3
  vgaJ3.R(1) <> fpga.ios.B4
  vgaJ3.R(2) <> fpga.ios.C5
  vgaJ3.R(3) <> fpga.ios.A4
  vgaJ3.G(0) <> fpga.ios.C6
  vgaJ3.G(1) <> fpga.ios.A5
  vgaJ3.G(2) <> fpga.ios.B6
  vgaJ3.G(3) <> fpga.ios.A6
  vgaJ3.B(0) <> fpga.ios.B7
  vgaJ3.B(1) <> fpga.ios.C7
  vgaJ3.B(2) <> fpga.ios.D7
  vgaJ3.B(3) <> fpga.ios.D8
  vgaJ3.HS   <> fpga.ios.B11
  vgaJ3.VS   <> fpga.ios.B12

  //////////////////////////////////////////
  // Switches
  //////////////////////////////////////////
  object switches:
    val SW_BUS = IOBus.fill(16)(SwitchUD())
    SW_BUS(0)  <> fpga.ios.J15
    SW_BUS(1)  <> fpga.ios.L16
    SW_BUS(2)  <> fpga.ios.M13
    SW_BUS(3)  <> fpga.ios.R15
    SW_BUS(4)  <> fpga.ios.R17
    SW_BUS(5)  <> fpga.ios.T18
    SW_BUS(6)  <> fpga.ios.U18
    SW_BUS(7)  <> fpga.ios.R13
    SW_BUS(8)  <> fpga.ios.T8
    SW_BUS(9)  <> fpga.ios.U8
    SW_BUS(10) <> fpga.ios.R16
    SW_BUS(11) <> fpga.ios.T13
    SW_BUS(12) <> fpga.ios.H6
    SW_BUS(13) <> fpga.ios.U12
    SW_BUS(14) <> fpga.ios.U11
    SW_BUS(15) <> fpga.ios.V10
  end switches
  switches // touch to force execution
  //////////////////////////////////////////
  // LEDs
  //////////////////////////////////////////
  object leds:
    val LED_BUS = IOBus.fill(16)(Led())
    LED_BUS(0)  <> fpga.ios.H17
    LED_BUS(1)  <> fpga.ios.K15
    LED_BUS(2)  <> fpga.ios.J13
    LED_BUS(3)  <> fpga.ios.N14
    LED_BUS(4)  <> fpga.ios.R18
    LED_BUS(5)  <> fpga.ios.V17
    LED_BUS(6)  <> fpga.ios.U17
    LED_BUS(7)  <> fpga.ios.U16
    LED_BUS(8)  <> fpga.ios.V16
    LED_BUS(9)  <> fpga.ios.T15
    LED_BUS(10) <> fpga.ios.U14
    LED_BUS(11) <> fpga.ios.T16
    LED_BUS(12) <> fpga.ios.V15
    LED_BUS(13) <> fpga.ios.V14
    LED_BUS(14) <> fpga.ios.V12
    LED_BUS(15) <> fpga.ios.V11
  end leds
  leds // touch to force execution
  //////////////////////////////////////////
  // Buttons
  //////////////////////////////////////////
  object buttons:
    @io(standard = io.Standard.LVCMOS)
    val BTNL, BTNR, BTNU, BTND, BTNC = Button()
    @io(standard = io.Standard.LVCMOS)
    val BTNRES = Button(activeState = Button.Released)
    BTNL   <> fpga.ios.P17
    BTNR   <> fpga.ios.M17
    BTNU   <> fpga.ios.M18
    BTND   <> fpga.ios.P18
    BTNC   <> fpga.ios.N17
    BTNRES <> fpga.ios.C12
  end buttons
  buttons // touch to force execution
  //////////////////////////////////////////
  // UART
  //////////////////////////////////////////
  // val uart = UART()

end NexysA7

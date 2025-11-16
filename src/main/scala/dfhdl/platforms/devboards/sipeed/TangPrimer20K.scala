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
package dfhdl.platforms.devboards.sipeed
import dfhdl.platforms.Board
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.resources.*
import dfhdl.platforms.devices.gowin.GW2A_LV18PG256
import dfhdl.platforms.pmods.*
import dfhdl.hw.constraints.*
import TangPrimer20K.DockConn
import scala.annotation.targetName
import dfhdl.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class TangPrimer20KSOM(
    powerR5Present: Boolean  = true,
    powerR6Present: Boolean  = true,
    powerR9Present: Boolean  = true,
    powerR13Present: Boolean = true
) extends Board:
  val fpga = GW2A_LV18PG256(speedGrade = "C8/I7")
  object nets:
    //format: off
    // U11A BANK3
    val LVDS_IOR29_P             = fpga.ios.T7
    val LVDS_IOR29_N             = fpga.ios.R8
    val M16_MODEO                = fpga.ios.M16
    val B16_MODE1                = fpga.ios.B16
    val C15_MODE2                = fpga.ios.C15
    val B10_IOR31B_RECFGn        = fpga.ios.B10
    val A13_IOR32A_READY         = fpga.ios.A13
    val C13_IOR32B_DONEn         = fpga.ios.C13
    val P10_IOR33A_FLASH_SPI_SO  = fpga.ios.P10
    val R10_IOR33B_FLASH_SPI_SI  = fpga.ios.R10
    val M9_IOR34A_FLASH_SPI_CSn  = fpga.ios.M9
    val L10_IOR34B_FLASH_SPI_CLK = fpga.ios.L10
    val R9_IOR35A_FASTRDn        = fpga.ios.R9
    val T10_IOR35B_FPGA_RSTn     = fpga.ios.T10
    val M8_IOR36A_SDIO_DO        = fpga.ios.M8
    val N9_IOR36B                = fpga.ios.N9
    val LVDS_IOR38_P             = fpga.ios.T9
    val LVDS_IOR38_N             = fpga.ios.P9
    val C10_IOR39A               = fpga.ios.C10
    val LVDS_IOR40_P             = fpga.ios.N8
    val LVDS_IOR40_N             = fpga.ios.L9
    val LVDS_IOR42_P             = fpga.ios.P8
    val LVDS_IOR42_N             = fpga.ios.T8
    val LVDS_IOR44_P             = fpga.ios.M6
    val LVDS_IOR44_N             = fpga.ios.L8
    val M7_IOR47A_SDIO_D1        = fpga.ios.M7
    val N7_IOR47B                = fpga.ios.N7
    val LVDS_IOR49_P             = fpga.ios.R7
    val LVDS_IOR49_N             = fpga.ios.P7
    val N6_IOR51A                = fpga.ios.N6
    val LVDS_IOR53_P             = fpga.ios.P6
    val LVDS_IOR53_N             = fpga.ios.T6
    // U11A BANK2
    val T15_IOR7A_RPLL1_T_in     = fpga.ios.T15
    val R14_IOR7B_SDIO_CMD       = fpga.ios.R14
    val P12_IOR8A_LCD_BLn        = fpga.ios.P12
    val T13_IOR8B_FPGA_RX        = fpga.ios.T13
    val LVDS_IOR11_P             = fpga.ios.R12
    val LVDS_IOR11_N             = fpga.ios.P13
    val LVDS_IOR17_P             = fpga.ios.R11
    val LVDS_IOR17_N             = fpga.ios.T12
    val LVDS_IOR20_P             = fpga.ios.R13
    val LVDS_IOR20_N             = fpga.ios.T14
    val M10_IOR22A_SDIO_D2       = fpga.ios.M10
    val N11_IOR22B_SDIO_D3       = fpga.ios.N11
    val LVDS_IOR24_P             = fpga.ios.T11
    val LVDS_IOR24_N             = fpga.ios.P11
    val JTAG_TDO                 = fpga.ios.C6
    val JTAG_TMS                 = fpga.ios.B8
    val JTAG_TCK                 = fpga.ios.A7
    val JTAG_TDI                 = fpga.ios.A6
    val N10_IOR27A_SDIO_CLK      = fpga.ios.N10
    val M11_IOR27B_FPGA_TX       = fpga.ios.M11
    // U11A BANK1
    val LVDS_RX1_P               = fpga.ios.K14
    val LVDS_RX1_N               = fpga.ios.K15
    val LVDS_IOT32_P             = fpga.ios.J11
    val LVDS_IOT32_N             = fpga.ios.L12
    val LVDS_RX2_P               = fpga.ios.L16
    val LVDS_RX2_N               = fpga.ios.L14
    val LVDS_IOT36_P             = fpga.ios.K13
    val LVDS_IOT36_N             = fpga.ios.K12
    val LVDS_IOT38_P             = fpga.ios.K11
    val LVDS_IOT38_N             = fpga.ios.L13
    val LVDS_IOT40_P             = fpga.ios.M14
    val LVDS_IOT40_N             = fpga.ios.M15
    val LVDS_IOT44_P             = fpga.ios.D14
    val LVDS_IOT44_N             = fpga.ios.E15
    val LVDS_RX4_P               = fpga.ios.N15
    val LVDS_RX4_N               = fpga.ios.P16
    val LVDS_RX3_P               = fpga.ios.N16
    val LVDS_RX3_N               = fpga.ios.N14
    val LVDS_RX5_P               = fpga.ios.P15
    val LVDS_RX5_N               = fpga.ios.R16
    // U11A BANK0
    val L15_IOT2A_LCD_SDA        = fpga.ios.L15
    val LVDS_TX1_P               = fpga.ios.D16
    val LVDS_TX1_N               = fpga.ios.E14
    val C16_IOT5A_LCD_CSn        = fpga.ios.C16
    val D15_IOR5B_SDIO_DET       = fpga.ios.D15
    val LVDS_TX2_P               = fpga.ios.E16
    val LVDS_TX2_N               = fpga.ios.F15
    val LVDS_IOT8_P              = fpga.ios.F13
    val LVDS_IOT8_N              = fpga.ios.G12
    val F14_IOT9A                = fpga.ios.F14
    val F16_IOT9B                = fpga.ios.F16
    val F12_IOT12A_LCD_SCL       = fpga.ios.F12
    val G13_IOT12B_LCD_RSTn      = fpga.ios.G13
    val G15_IOT13A               = fpga.ios.G15
    val G14_IOT13B               = fpga.ios.G14
    val LVDS_IOT14_P             = fpga.ios.G11
    val LVDS_IOT14_N             = fpga.ios.H12
    val LVDS_TX3_P               = fpga.ios.G16
    val LVDS_TX3_N               = fpga.ios.H15
    val LVDS_IOT18_P             = fpga.ios.H13
    val LVDS_IOT18_N             = fpga.ios.J12
    val LVDS_TX4_P               = fpga.ios.H14
    val LVDS_TX4_N               = fpga.ios.H16
    val LVDS_IOT22_P             = fpga.ios.J16
    val LVDS_IOT22_N             = fpga.ios.J14
    val LVDS_TX5_P               = fpga.ios.J15
    val LVDS_TX5_N               = fpga.ios.K16
    val H11_IOT27A_OSC_CK        = fpga.ios.H11
    val J13_IOT27B_LCD_RSn       = fpga.ios.J13
    // U11A BANK4
    val DDR3_WEn                 = fpga.ios.L2
    val DDR3_DQ13                = fpga.ios.H3
    val DDR3_CKEN                = fpga.ios.J2
    val DDR3_BA2                 = fpga.ios.H5
    val DDR3_A10                 = fpga.ios.K3
    val DDR3_DQSU_P              = fpga.ios.J5
    val DDR3_DQSU_N              = fpga.ios.K6
    val DDR3_DQ11                = fpga.ios.L1
    val DDR3_DQ9                 = fpga.ios.K4
    val DDR3_UDM                 = fpga.ios.K5
    val DDR3_DQ10                = fpga.ios.N2
    val DDR3_DQ8                 = fpga.ios.M3
    val DDR3_DQ15                = fpga.ios.M2
    val DDR3_DQ14                = fpga.ios.R1
    val DDR3_DQ12                = fpga.ios.P4
    val T4_IOB45B_1V5            = fpga.ios.T4
    val DDR3_ODT0                = fpga.ios.R3
    val T2_IOB48B_1V5            = fpga.ios.T2
    val DDR3_CS0n                = fpga.ios.P5
    val DDR3_RASn                = fpga.ios.R4
    val T3_IOB52B_1V5            = fpga.ios.T3
    val DDR3_CASn                = fpga.ios.R6
    val T5_IOB54B_1V5            = fpga.ios.T5
    // U11A BANK5
    val DDR3_A1                  = fpga.ios.A4
    val DDR3_A2                  = fpga.ios.D6
    val DDR3_A12                 = fpga.ios.A3
    val DDR3_A8                  = fpga.ios.A5
    val DDR3_A6                  = fpga.ios.B1
    val DDR3_BA1                 = fpga.ios.D3
    val DDR3_DQ4                 = fpga.ios.E2
    val DDR3_DQ7                 = fpga.ios.B3
    val DDR3_DQ5                 = fpga.ios.C1
    val DDR3_DQ6                 = fpga.ios.E1
    val DDR3_DQ2                 = fpga.ios.F4
    val DDR3_DQ3                 = fpga.ios.F3
    val DDR3_DQ0                 = fpga.ios.G5
    val DDR3_DQSL_P              = fpga.ios.G2
    val DDR3_DQSL_N              = fpga.ios.G3
    val DDR3_DQ1                 = fpga.ios.F5
    val DDR3_LDM                 = fpga.ios.G1
    val DDR3_BA0                 = fpga.ios.H4
    val DDR3_CK_P                = fpga.ios.J1
    val DDR3_CK_N                = fpga.ios.J3
    // U11A BANK6
    val DDR3_A13                 = fpga.ios.C8
    val DDR3_A9                  = fpga.ios.F9
    val DDR3_RSTn                = fpga.ios.B9
    val DDR3_A3                  = fpga.ios.F8
    val DDR3_A7                  = fpga.ios.D8
    val E9_IOL38B_1V5            = fpga.ios.E9
    val DDR3_A11                 = fpga.ios.B7
    val C7_IOL40B_1V5            = fpga.ios.C7
    val DDR3_A0                  = fpga.ios.F7
    val E8_IOL45B_1V5            = fpga.ios.E8
    val DDR3_A4                  = fpga.ios.C4
    val DDR3_A5                  = fpga.ios.E6
    val D7_IOL53B_1V5            = fpga.ios.D7
    // U11A BANK7
    val B14_IOL2A                = fpga.ios.B14
    val A15_IOL2B                = fpga.ios.A15
    val C12_IOL7A                = fpga.ios.C12
    val B12_IOL7B                = fpga.ios.B12
    val B13_IOL8A                = fpga.ios.B13
    val A14_IOL8B                = fpga.ios.A14
    val F10_IOL11A               = fpga.ios.F10
    val B11_IOL13A               = fpga.ios.B11
    val A12_IOL13B               = fpga.ios.A12
    val A11_IOL15A               = fpga.ios.A11
    val C11_IOL15B               = fpga.ios.C11
    val D10_IOL17A               = fpga.ios.D10
    val E10_IOL17B               = fpga.ios.E10
    val D11_IOL22A               = fpga.ios.D11
    val A9_IOL27A                = fpga.ios.A9
    val C9_IOL27B                = fpga.ios.C9
    //format: on
  end nets
  nets // touch to force execution

  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val CLK_27MHz = Oscillator(27.MHz)
    CLK_27MHz <> nets.H11_IOT27A_OSC_CK
  end clocks
  clocks // touch to force execution

  object power:
    @targetName("VCCIO0_1")
    val `VCCO0&1` = Power()
    @targetName("F_VCCIO0_1")
    val `F_VCCO0&1` = Power()
    val VCCO7       = Power()
    val F_VCCO7     = Power()
    val VCC_3V3     = Power(3.3)
    val VCC_1V5     = Power(1.5)
    fpga.bank0 <> power.`VCCO0&1`
    fpga.bank1 <> power.`VCCO0&1`
    fpga.bank2 <> power.VCC_3V3
    fpga.bank3 <> power.VCC_3V3
    fpga.bank4 <> power.VCC_1V5
    fpga.bank5 <> power.VCC_1V5
    fpga.bank6 <> power.VCC_1V5
    fpga.bank7 <> power.VCCO7
    if (powerR5Present)
      `VCCO0&1` <> VCC_3V3
    if (powerR6Present)
      `VCCO0&1` <> `F_VCCO0&1`
    if (powerR9Present)
      VCCO7 <> VCC_3V3
    if (powerR13Present)
      VCCO7 <> F_VCCO7
  end power
  power // touch to force execution

  object Docking:
    val CARD1 = DockConn.Male()
    // CARD1B Odd
    CARD1.P(73)  <> nets.LVDS_IOT40_N
    CARD1.P(75)  <> nets.LVDS_IOT40_P
    CARD1.P(77)  <> nets.LVDS_IOT8_P
    CARD1.P(79)  <> nets.LVDS_IOT8_N
    CARD1.P(81)  <> nets.T15_IOR7A_RPLL1_T_in
    CARD1.P(83)  <> nets.LVDS_IOT22_P
    CARD1.P(85)  <> nets.LVDS_IOT22_N
    CARD1.P(89)  <> nets.G14_IOT13B
    CARD1.P(91)  <> nets.G15_IOT13A
    CARD1.P(95)  <> nets.F14_IOT9A
    CARD1.P(97)  <> nets.F16_IOT9B
    CARD1.P(101) <> nets.LVDS_IOT44_N
    CARD1.P(103) <> nets.LVDS_IOT44_P
    CARD1.P(107) <> nets.A15_IOL2B
    CARD1.P(109) <> nets.B14_IOL2A
    CARD1.P(113) <> nets.A14_IOL8B
    CARD1.P(115) <> nets.B13_IOL8A
    CARD1.P(119) <> nets.C12_IOL7A
    CARD1.P(121) <> nets.B12_IOL7B
    CARD1.P(123) <> nets.A12_IOL13B
    CARD1.P(125) <> nets.C11_IOL15B
    CARD1.P(129) <> nets.B11_IOL13A
    CARD1.P(131) <> nets.A11_IOL15A
    CARD1.P(135) <> nets.C10_IOR39A
    // CARD1.P(143) <> nets.B8_IOR25B_JTAG_TMS
    // CARD1.P(147) <> nets.C6_IOR25A_JTAG_TDO
    // CARD1.P(149) <> nets.A7_IOR26A_JTAG_TCK
    // CARD1.P(153) <> nets.A6_IOR26B_JTAG_TDI
    CARD1.P(157) <> nets.C7_IOL40B_1V5
    CARD1.P(159) <> nets.D7_IOL53B_1V5
    CARD1.P(163) <> nets.T2_IOB48B_1V5
    CARD1.P(165) <> nets.T3_IOB52B_1V5
    CARD1.P(169) <> nets.T4_IOB45B_1V5
    CARD1.P(171) <> nets.T5_IOB54B_1V5
    CARD1.P(175) <> nets.N6_IOR51A
    CARD1.P(177) <> nets.N7_IOR47B
    CARD1.P(181) <> nets.N9_IOR36B
    CARD1.P(183) <> nets.R9_IOR35A_FASTRDn
    CARD1.P(191) <> nets.LVDS_IOR40_P
    CARD1.P(193) <> nets.LVDS_IOR40_N
    // CARD1B Even
    CARD1.P(74)  <> nets.LVDS_IOT38_N
    CARD1.P(76)  <> nets.LVDS_IOT38_P
    CARD1.P(78)  <> nets.LVDS_IOT36_N
    CARD1.P(80)  <> nets.LVDS_IOT36_P
    CARD1.P(84)  <> nets.LVDS_IOT18_P
    CARD1.P(86)  <> nets.LVDS_IOT18_N
    CARD1.P(90)  <> nets.LVDS_IOT14_N
    CARD1.P(92)  <> nets.LVDS_IOT14_P
    CARD1.P(96)  <> nets.B10_IOR31B_RECFGn
    CARD1.P(98)  <> nets.A13_IOR32A_READY
    CARD1.P(130) <> nets.LVDS_TX2_P
    CARD1.P(132) <> nets.LVDS_TX2_N
    CARD1.P(136) <> nets.C13_IOR32B_DONEn
    CARD1.P(140) <> nets.LVDS_TX1_P
    CARD1.P(142) <> nets.LVDS_TX1_N
    CARD1.P(146) <> nets.C9_IOL27B
    CARD1.P(148) <> nets.A9_IOL27A
    CARD1.P(152) <> nets.LVDS_IOT32_N
    CARD1.P(154) <> nets.LVDS_IOT32_P
    CARD1.P(158) <> nets.E9_IOL38B_1V5
    CARD1.P(160) <> nets.E8_IOL45B_1V5
    CARD1.P(164) <> power.`F_VCCO0&1`
    CARD1.P(166) <> power.`F_VCCO0&1`
    CARD1.P(170) <> power.F_VCCO7
    CARD1.P(174) <> power.F_VCCO7
    CARD1.P(176) <> nets.F10_IOL11A
    CARD1.P(180) <> nets.D11_IOL22A
    CARD1.P(182) <> nets.D10_IOL17A
    CARD1.P(186) <> nets.E10_IOL17B
    CARD1.P(192) <> nets.LVDS_IOR49_P
    CARD1.P(194) <> nets.LVDS_IOR49_N
    CARD1.P(198) <> nets.LVDS_IOR44_P
    CARD1.P(200) <> nets.LVDS_IOR44_N
    // CARD1A Odd
    CARD1.P(1)  <> nets.T13_IOR8B_FPGA_RX
    CARD1.P(11) <> nets.M11_IOR27B_FPGA_TX
    CARD1.P(15) <> nets.T10_IOR35B_FPGA_RSTn
    CARD1.P(27) <> nets.LVDS_IOR53_N
    CARD1.P(29) <> nets.LVDS_IOR53_P
    CARD1.P(33) <> nets.LVDS_IOR29_P
    CARD1.P(35) <> nets.LVDS_IOR29_N
    CARD1.P(39) <> nets.LVDS_IOR42_N
    CARD1.P(41) <> nets.LVDS_IOR42_P
    CARD1.P(45) <> nets.LVDS_IOR38_P
    CARD1.P(47) <> nets.LVDS_IOR38_N
    CARD1.P(51) <> nets.LVDS_IOR24_N
    CARD1.P(53) <> nets.LVDS_IOR24_P
    CARD1.P(57) <> nets.LVDS_IOR17_P
    CARD1.P(59) <> nets.LVDS_IOR17_N
    CARD1.P(63) <> nets.LVDS_IOR11_P
    CARD1.P(65) <> nets.LVDS_IOR11_N
    CARD1.P(67) <> nets.LVDS_IOR20_P
    CARD1.P(69) <> nets.LVDS_IOR20_N
    // CARD1A Even
    CARD1.P(28) <> nets.LVDS_RX5_N
    CARD1.P(30) <> nets.LVDS_RX5_P
    CARD1.P(34) <> nets.LVDS_RX4_N
    CARD1.P(36) <> nets.LVDS_RX4_P
    CARD1.P(40) <> nets.LVDS_RX3_P
    CARD1.P(42) <> nets.LVDS_RX3_N
    CARD1.P(44) <> nets.LVDS_RX2_P
    CARD1.P(46) <> nets.LVDS_RX2_N
    CARD1.P(50) <> nets.LVDS_RX1_N
    CARD1.P(52) <> nets.LVDS_RX1_P
    CARD1.P(56) <> nets.LVDS_TX5_N
    CARD1.P(58) <> nets.LVDS_TX5_P
    CARD1.P(62) <> nets.LVDS_TX4_N
    CARD1.P(64) <> nets.LVDS_TX4_P
    CARD1.P(68) <> nets.LVDS_TX3_P
    CARD1.P(70) <> nets.LVDS_TX3_N
  end Docking
  Docking // touch to force execution
end TangPrimer20KSOM

class TangPrimer20KDock extends Board:
  //////////////////////////////////////////
  // Docking
  //////////////////////////////////////////
  object Docking:
    val SLOT1 = DockConn.Female()
  end Docking

  object power:
    // here this power pin is not the source, since the SOM
    // board defines its actual power source. so it is not
    // defined with a level voltage and are stricly used as a power
    // net that is fed from the SOM board.
    val VCC_3V3 = Power()
  end power
  power // touch to force execution

  object nets:
    //format: off
    // SLOT1A Odd
    val T13_IOR8B_FPGA_RX0   = Docking.SLOT1.P(1)
    val M11_IOR27B_FPGA_TX0  = Docking.SLOT1.P(11)
    val T10_IOR35B_FPGA_RSTn = Docking.SLOT1.P(15)
    val DFP_IOR53_N          = Docking.SLOT1.P(27)
    val DFP_IOR53_P          = Docking.SLOT1.P(29)
    val DFP_IOR29_P          = Docking.SLOT1.P(33)
    val DFP_IOR29_N          = Docking.SLOT1.P(35)
    val DFP_IOR42_N          = Docking.SLOT1.P(39)
    val DFP_IOR42_P          = Docking.SLOT1.P(41)
    val DFP_IOR38_P          = Docking.SLOT1.P(45)
    val DFP_IOR38_N          = Docking.SLOT1.P(47)
    val DFP_IOR24_N          = Docking.SLOT1.P(51)
    val DFP_IOR24_P          = Docking.SLOT1.P(53)
    val DFP_IOR17_P          = Docking.SLOT1.P(57)
    val DFP_IOR17_N          = Docking.SLOT1.P(59)
    val DFP_IOR11_P          = Docking.SLOT1.P(63)
    val DFP_IOR11_N          = Docking.SLOT1.P(65)
    val DFP_IOR20_P          = Docking.SLOT1.P(67)
    val DFP_IOR20_N          = Docking.SLOT1.P(69)
    // SLOT1A Even
    val LVDS_RX5_N           = Docking.SLOT1.P(28)
    val LVDS_RX5_P           = Docking.SLOT1.P(30)
    val LVDS_RX4_N           = Docking.SLOT1.P(34)
    val LVDS_RX4_P           = Docking.SLOT1.P(36)
    val LVDS_RX3_P           = Docking.SLOT1.P(40)
    val LVDS_RX3_N           = Docking.SLOT1.P(42)
    val LVDS_RX2_P           = Docking.SLOT1.P(44)
    val LVDS_RX2_N           = Docking.SLOT1.P(46)
    val LVDS_RX1_N           = Docking.SLOT1.P(50)
    val LVDS_RX1_P           = Docking.SLOT1.P(52)
    val LVDS_TX5_N           = Docking.SLOT1.P(56)
    val LVDS_TX5_P           = Docking.SLOT1.P(58)
    val LVDS_TX4_N           = Docking.SLOT1.P(62)
    val LVDS_TX4_P           = Docking.SLOT1.P(64)
    val LVDS_TX3_P           = Docking.SLOT1.P(68)
    val LVDS_TX3_N           = Docking.SLOT1.P(70)
    // SLOT1B Odd
    val DFP_IOT40_N          = Docking.SLOT1.P(73)
    val DFP_IOT40_P          = Docking.SLOT1.P(75)
    val DFP_IOT8_P           = Docking.SLOT1.P(77)
    val DFP_IOT8_N           = Docking.SLOT1.P(79)
    val T15_IOR7A_RPLL1_T_in = Docking.SLOT1.P(81)
    val DFP_IOT22_P          = Docking.SLOT1.P(83)
    val DFP_IOT22_N          = Docking.SLOT1.P(85)
    val G14_IOT13B           = Docking.SLOT1.P(89)
    val G15_IOT13A           = Docking.SLOT1.P(91)
    val F14_IOT9A            = Docking.SLOT1.P(95)
    val F16_IOT9B            = Docking.SLOT1.P(97)
    val DFP_IOT44_N          = Docking.SLOT1.P(101)
    val DFP_IOT44_P          = Docking.SLOT1.P(103)
    val A15_IOL2B            = Docking.SLOT1.P(107)
    val B14_IOL2A            = Docking.SLOT1.P(109)
    val A14_IOL8B            = Docking.SLOT1.P(113)
    val B13_IOL8A            = Docking.SLOT1.P(115)
    val C12_IOL7A            = Docking.SLOT1.P(119)
    val B12_IOL7B            = Docking.SLOT1.P(121)
    val A12_IOL13B           = Docking.SLOT1.P(123)
    val C11_IOL15B           = Docking.SLOT1.P(125)
    val B11_IOL13A           = Docking.SLOT1.P(129)
    val A11_IOL15A           = Docking.SLOT1.P(131)
    val C10_IOR39A           = Docking.SLOT1.P(135)
    val B8_IOR25B_JTAG_TMS   = Docking.SLOT1.P(143)
    val C6_IOR25A_JTAG_TDO   = Docking.SLOT1.P(147)
    val A7_IOR26A_JTAG_TCK   = Docking.SLOT1.P(149)
    val A6_IOR26B_JTAG_TDI   = Docking.SLOT1.P(153)
    val C7_IOL40B_1V5        = Docking.SLOT1.P(157)
    val D7_IOL53B_1V5        = Docking.SLOT1.P(159)
    val T2_IOB48B_1V5        = Docking.SLOT1.P(163)
    val T3_IOB52B_1V5        = Docking.SLOT1.P(165)
    val T4_IOB45B_1V5        = Docking.SLOT1.P(169)
    val T5_IOB54B_1V5        = Docking.SLOT1.P(171)
    val N6_IOR51A            = Docking.SLOT1.P(175)
    val N7_IOR47B            = Docking.SLOT1.P(177)
    val N9_IOR36B            = Docking.SLOT1.P(181)
    val R9_IOR35A_FASTRDn    = Docking.SLOT1.P(183)
    val DFP_IOR40_P          = Docking.SLOT1.P(191)
    val DFP_IOR40_N          = Docking.SLOT1.P(193)
    // SLOT1B Even
    val DFP_IOT38_N          = Docking.SLOT1.P(74)
    val DFP_IOT38_P          = Docking.SLOT1.P(76)
    val DFP_IOT36_N          = Docking.SLOT1.P(78)
    val DFP_IOT36_P          = Docking.SLOT1.P(80)
    val DFP_IOT18_P          = Docking.SLOT1.P(84)
    val DFP_IOT18_N          = Docking.SLOT1.P(86)
    val DFP_IOT14_N          = Docking.SLOT1.P(90)
    val DFP_IOT14_P          = Docking.SLOT1.P(92)
    val B10_IOR31B_RECFGn    = Docking.SLOT1.P(96)
    val A13_IOR32A_READY     = Docking.SLOT1.P(98)
    val LVDS_TX2_P           = Docking.SLOT1.P(130)
    val LVDS_TX2_N           = Docking.SLOT1.P(132)
    val C13_IOR32B_DONE      = Docking.SLOT1.P(136)
    val LVDS_TX1_P           = Docking.SLOT1.P(140)
    val LVDS_TX1_N           = Docking.SLOT1.P(142)
    val C9_IOL27B            = Docking.SLOT1.P(146)
    val A9_IOL27A            = Docking.SLOT1.P(148)
    val DFP_IOT32_N          = Docking.SLOT1.P(152)
    val DFP_IOT32_P          = Docking.SLOT1.P(154)
    val E9_IOL38B_1V5        = Docking.SLOT1.P(158)
    val E8_IOL45B_1V5        = Docking.SLOT1.P(160)
    val F10_IOL11A           = Docking.SLOT1.P(176)
    val D11_IOL22A           = Docking.SLOT1.P(180)
    val D10_IOL17A           = Docking.SLOT1.P(182)
    val E10_IOL17B           = Docking.SLOT1.P(186)
    val DFP_IOR49_P          = Docking.SLOT1.P(192)
    val DFP_IOR49_N          = Docking.SLOT1.P(194)
    val DFP_IOR44_P          = Docking.SLOT1.P(198)
    val DFP_IOR44_N          = Docking.SLOT1.P(200)
    // P006_LCD
    val RGB_LCD_R0           = DFP_IOR40_N
    val RGB_LCD_R1           = DFP_IOR40_P
    val RGB_LCD_R2           = N9_IOR36B
    val RGB_LCD_R3           = N7_IOR47B
    val RGB_LCD_R4           = N6_IOR51A
    val RGB_LCD_G0           = D11_IOL22A
    val RGB_LCD_G1           = A11_IOL15A
    val RGB_LCD_G2           = B11_IOL13A
    val RGB_LCD_G3           = DFP_IOR49_N
    val RGB_LCD_G4           = DFP_IOR49_P
    val RGB_LCD_G5           = D10_IOL17A
    val RGB_LCD_B0           = B12_IOL7B
    val RGB_LCD_B1           = C12_IOL7A
    val RGB_LCD_B2           = B13_IOL8A
    val RGB_LCD_B3           = A14_IOL8B
    val RGB_LCD_B4           = B14_IOL2A
    val RGB_LCD_CLK          = R9_IOR35A_FASTRDn
    val RGB_LCD_HSYNC        = A15_IOL2B
    val RGB_LCD_VSYNC        = DFP_IOT44_P
    val RGB_LCD_DE           = DFP_IOT44_N
    val RGB_LCD_BL           = E10_IOL17B
    val TP_SDA               = F14_IOT9A
    val TP_SCK               = F16_IOT9B
    val TP_INT               = C11_IOL15B
    val TP_RST               = A12_IOL13B
    // P001_BL702
    val BL702_UART1_RX       = M11_IOR27B_FPGA_TX0
    val BL702_UART1_TX       = T13_IOR8B_FPGA_RX0
    val BL702_JTAG_TCK       = A7_IOR26A_JTAG_TCK
    val BL702_JTAG_TDO       = C6_IOR25A_JTAG_TDO
    val BL702_JTAG_TDI       = A6_IOR26B_JTAG_TDI
    val BL702_JTAG_TMS       = B8_IOR25B_JTAG_TMS
    // P002_USB PHY
    val USB_DATA0            = DFP_IOT14_P
    val USB_DATA1            = DFP_IOT14_N
    val USB_DATA2            = DFP_IOT18_N
    val USB_DATA3            = DFP_IOT18_P
    val USB_DATA4            = DFP_IOR20_N
    val USB_DATA5            = DFP_IOR20_P
    val USB_DATA6            = DFP_IOR11_N
    val USB_DATA7            = DFP_IOR11_P
    val USB_RESET            = F10_IOL11A
    val USB_NXT              = DFP_IOT36_P
    val USB_DIR              = DFP_IOT36_N
    val USB_STP              = DFP_IOT38_P
    val USB_CLKOUT           = T15_IOR7A_RPLL1_T_in
    // P003_Audio
    val HP_BCK               = LVDS_RX4_P
    val HP_DIN               = LVDS_RX5_P
    val HP_WS                = LVDS_RX4_N
    val PA_EN                = LVDS_RX5_N
    // P008_Camera
    val DVP_D0               = DFP_IOR17_N
    val DVP_D1               = DFP_IOR24_P
    val DVP_D2               = DFP_IOR24_N
    val DVP_D3               = DFP_IOR17_P
    val DVP_D4               = DFP_IOT40_N
    val DVP_D5               = DFP_IOT40_P
    val DVP_D6               = DFP_IOT22_P
    val DVP_D7               = DFP_IOT22_N
    val DVP_SCL              = F14_IOT9A
    val DVP_SDA              = F16_IOT9B
    val DVP_PCLK             = DFP_IOT8_P
    val DVP_XCLK             = DFP_IOT8_N
    val DVP_RST              = DFP_IOT38_N
    val DVP_VSYNC            = G15_IOT13A
    val DVP_PWDN             = C10_IOR39A
    val DVP_HSYNC            = G14_IOT13B
    // P004_HDMI
    val HDMI_TX0_P           = LVDS_TX4_P
    val HDMI_TX0_N           = LVDS_TX4_N
    val HDMI_TX1_P           = LVDS_TX5_P
    val HDMI_TX1_N           = LVDS_TX5_N
    val HDMI_TX2_P           = LVDS_RX1_P
    val HDMI_TX2_N           = LVDS_RX1_N
    val HDMI_TXC_P           = LVDS_TX3_P
    val HDMI_TXC_N           = LVDS_TX3_N
    val HDMI_HPD             = DFP_IOT32_P
    val HDMI_CEC             = DFP_IOT32_N
    val HDMI_SDA             = F14_IOT9A
    val HDMI_SCL             = F16_IOT9B
    // P005_Ethernet
    val RTL_PHY_TXD0         = LVDS_TX1_P
    val RTL_PHY_TXD1         = LVDS_TX1_N
    val RTL_PHY_TXEN         = LVDS_TX2_P
    val RTL_PHY_RST          = F10_IOL11A
    val RTL_PHY_MDC          = F14_IOT9A
    val RTL_PHY_MDIO         = F16_IOT9B
    val RTL_PHY_RXD0         = LVDS_TX2_N
    val RTL_PHY_RXD1         = C9_IOL27B
    val RTL_PHY_CRS          = DFP_IOR44_P
    val RTL_PHY_RXER         = DFP_IOR44_N
    val RTL_PHY_TXCLK        = A9_IOL27A
    // P007_Things
    val MIC_DAT0             = DFP_IOR42_P
    val MIC_DAT1             = DFP_IOR42_N
    val MIC_DAT2             = DFP_IOR29_N
    val MIC_DAT3             = DFP_IOR29_P
    val MIC_WS               = DFP_IOR53_P
    val MIC_BCK              = DFP_IOR53_N
    val MIC_LED_CLK          = DFP_IOR38_N
    val WS2812_DAT           = DFP_IOR38_P
    // Silicone keys (1..5)
    val Silicone_Key_1       = T10_IOR35B_FPGA_RSTn
    val Silicone_Key_2       = T3_IOB52B_1V5
    val Silicone_Key_3       = T2_IOB48B_1V5
    val Silicone_Key_4       = D7_IOL53B_1V5
    val Silicone_Key_5       = C7_IOL40B_1V5
    // Orange LEDs (0..5)
    val Orange_LED0          = C13_IOR32B_DONE
    val Orange_LED1          = A13_IOR32A_READY
    val Orange_LED2          = LVDS_RX3_P
    val Orange_LED3          = LVDS_RX3_N
    val Orange_LED4          = LVDS_RX2_N
    val Orange_LED5          = LVDS_RX2_P
    // Switches (1..5)
    val SW1                  = B10_IOR31B_RECFGn
    val SW2                  = E9_IOL38B_1V5
    val SW3                  = E8_IOL45B_1V5
    val SW4                  = T4_IOB45B_1V5
    val SW5                  = T5_IOB54B_1V5
    //format: on
  end nets
  nets // touch to force execution

  //////////////////////////////////////////
  // Pmods
  //////////////////////////////////////////
  object pmods:
    val J5           = PmodConn.SPFemaleStanding()
    val J6           = PmodConn.SPFemaleStanding()
    val J12          = PmodConn.SPFemaleStanding()
    val J14          = PmodConn.SPFemaleStanding()
    val J14_J12_Dual = PmodDualConn.Female(J14, J12)
    val J12_J6_Dual  = PmodDualConn.Female(J12, J6)
    val J6_J5_Dual   = PmodDualConn.Female(J6, J5)
    val PMOD0        = J14
    val PMOD1        = J12
    val PMOD2        = J6
    val PMOD3        = J5
    val PMOD01_Dual  = J14_J12_Dual
    val PMOD12_Dual  = J12_J6_Dual
    val PMOD23_Dual  = J6_J5_Dual
    // J5
    J5.P(5)  <> nets.RGB_LCD_R0
    J5.P(7)  <> nets.RGB_LCD_R2
    J5.P(9)  <> nets.RGB_LCD_R4
    J5.P(11) <> nets.RGB_LCD_G1
    J5.P(6)  <> nets.RGB_LCD_R1
    J5.P(8)  <> nets.RGB_LCD_R3
    J5.P(10) <> nets.RGB_LCD_G0
    J5.P(12) <> nets.RGB_LCD_G2
    // J6
    J6.P(5)  <> nets.RGB_LCD_B0
    J6.P(7)  <> nets.RGB_LCD_B2
    J6.P(9)  <> nets.RGB_LCD_B4
    J6.P(11) <> nets.RGB_LCD_VSYNC
    J6.P(6)  <> nets.RGB_LCD_B1
    J6.P(8)  <> nets.RGB_LCD_B3
    J6.P(10) <> nets.RGB_LCD_HSYNC
    J6.P(12) <> nets.RGB_LCD_DE
    // J12
    J12.P(5)  <> nets.DVP_D7
    J12.P(7)  <> nets.DVP_D5
    J12.P(9)  <> nets.DVP_D0
    J12.P(11) <> nets.DVP_D1
    J12.P(6)  <> nets.DVP_D6
    J12.P(8)  <> nets.DVP_D4
    J12.P(10) <> nets.DVP_D3
    J12.P(12) <> nets.DVP_D2
    // J14
    J14.P(5)  <> nets.MIC_LED_CLK
    J14.P(7)  <> nets.MIC_DAT1
    J14.P(9)  <> nets.MIC_DAT2
    J14.P(11) <> nets.MIC_BCK
    J14.P(6)  <> nets.WS2812_DAT
    J14.P(8)  <> nets.MIC_DAT0
    J14.P(10) <> nets.MIC_DAT3
    J14.P(12) <> nets.MIC_WS
  end pmods
  pmods // touch to force execution

  //////////////////////////////////////////
  // LEDs
  //////////////////////////////////////////
  object leds:
    val LED_BUS = IOBus.fill(6)(Led(activeState = Led.Off))
    LED_BUS(0) <> nets.Orange_LED0
    LED_BUS(1) <> nets.Orange_LED1
    LED_BUS(2) <> nets.Orange_LED2
    LED_BUS(3) <> nets.Orange_LED3
    LED_BUS(4) <> nets.Orange_LED4
    LED_BUS(5) <> nets.Orange_LED5
  end leds
  leds // touch to force execution

  //////////////////////////////////////////
  // Buttons
  //////////////////////////////////////////
  object buttons:
    // S0..S4 according to the names written on the board itself
    // (this is different than the names in the schematics)
    @io(standard = io.Standard.LVCMOS)
    val S0, S1, S2, S3, S4 = Button(activeState = Button.Released)
    S0 <> nets.Silicone_Key_1
    S1 <> nets.Silicone_Key_2
    S2 <> nets.Silicone_Key_3
    S3 <> nets.Silicone_Key_4
    S4 <> nets.Silicone_Key_5
  end buttons
  buttons // touch to force execution

  //////////////////////////////////////////
  // Switches
  //////////////////////////////////////////
  object switches:
    @io(standard = io.Standard.LVCMOS)
    val SW1, SW2, SW3, SW4, SW5 = SwitchUD(activeState = SwitchUD.Up)
    SW1 <> nets.SW1
    SW2 <> nets.SW2
    SW3 <> nets.SW3
    SW4 <> nets.SW4
    SW5 <> nets.SW5
  end switches
  switches // touch to force execution
end TangPrimer20KDock

/*       TangPrimer20K Dock Board + SOM Board
 */
@toolOptions("openFPGALoader" -> "-b tangprimer20k")
class TangPrimer20K extends DevBoard:
  val som  = TangPrimer20KSOM()
  val dock = TangPrimer20KDock()
  som.Docking.CARD1 <> dock.Docking.SLOT1
  export som.fpga
  export dock.{pmods, buttons, leds, switches}
  export som.clocks

object TangPrimer20K:
  object DockConn extends Connector.Companion(204)

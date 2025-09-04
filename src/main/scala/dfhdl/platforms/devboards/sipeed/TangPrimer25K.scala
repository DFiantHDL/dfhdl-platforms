package dfhdl.platforms.devboards.sipeed
import dfhdl.platforms.Board
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.resources.*
import dfhdl.platforms.devices.gowin.GW5A_LV25MG121
import dfhdl.platforms.pmods.*
import dfhdl.hw.constraints.*
import TangPrimer25K.BTBConn
import scala.annotation.targetName
import dfhdl.MHz
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class TangPrimer25KCore extends Board:
  val fpga = GW5A_LV25MG121(speedGrade = "C1/I0", _deviceVersion = "A")
  object nets:
    val CLK              = fpga.ios.E2
    val FLASH_SPI_CS_N   = fpga.ios.E6
    val FLASH_SPI_WP_N   = fpga.ios.D5
    val FLASH_SPI_HOLD_N = fpga.ios.E4
    val FLASH_SPI_MISO   = fpga.ios.E5
    val FLASH_SPI_MOSI   = fpga.ios.D6
    val FLASH_SPI_CLK    = fpga.ios.E7
  end nets
  nets // touch to force execution

  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val CLK_50MHz = Oscillator(50.MHz)
    CLK_50MHz <> nets.CLK
  end clocks
  clocks // touch to force execution

  object power:
    @targetName("VCCIO0_1")
    val `VCCIO0/1` = Power()
    @targetName("VCCIO2_3")
    val `VCCIO2/3` = Power()
    @targetName("VCCIO6_7")
    val `VCCIO6/7` = Power()
    val VDD_3V3    = Power(3.3)
    val VDD_2V5    = Power(2.5)
    val VDD_1V8    = Power(1.8)
  object BTB:
    val J1 = BTBConn.Male()
    // J1 power pins
    J1.P(24) <> power.`VCCIO0/1`
    J1.P(26) <> power.`VCCIO0/1`
    J1.P(29) <> power.`VCCIO6/7`
    J1.P(31) <> power.`VCCIO6/7`
    // J1 even IO pins
    J1.P(4)  <> fpga.ios.byName.IOT61A
    J1.P(6)  <> fpga.ios.byName.IOT61B
    J1.P(8)  <> fpga.ios.byName.IOT63A
    J1.P(10) <> fpga.ios.byName.IOT63B
    J1.P(12) <> fpga.ios.byName.IOT66A
    J1.P(14) <> fpga.ios.byName.IOT66B
    J1.P(16) <> fpga.ios.byName.IOT68A
    J1.P(18) <> fpga.ios.byName.IOT68B
    J1.P(20) <> fpga.ios.byName.IOT72A
    J1.P(22) <> fpga.ios.byName.IOT72B
    J1.P(30) <> fpga.ios.byName.IOT23A
    J1.P(32) <> fpga.ios.byName.IOT23B
    J1.P(34) <> fpga.ios.byName.IOT21A
    J1.P(36) <> fpga.ios.byName.IOT21B
    J1.P(38) <> fpga.ios.byName.IOT19A
    J1.P(40) <> fpga.ios.byName.IOT19B
    J1.P(42) <> fpga.ios.byName.IOT15A
    J1.P(44) <> fpga.ios.byName.IOT15B
    J1.P(46) <> fpga.ios.byName.IOT11A
    J1.P(48) <> fpga.ios.byName.IOT11B
    J1.P(52) <> fpga.ios.byName.IOL3A
    J1.P(54) <> fpga.ios.byName.IOL3B
    J1.P(56) <> fpga.ios.byName.IOL14A
    J1.P(58) <> fpga.ios.byName.IOL14B
    // J1 odd IO pins
    J1.P(3)  <> fpga.ios.byName.IOT31A
    J1.P(5)  <> fpga.ios.byName.IOT31B
    J1.P(7)  <> fpga.ios.byName.IOT56A
    J1.P(9)  <> fpga.ios.byName.IOT56B
    J1.P(11) <> fpga.ios.byName.IOT58A
    J1.P(13) <> fpga.ios.byName.IOT58B
    J1.P(17) <> fpga.ios.byName.READY
    J1.P(19) <> fpga.ios.byName.IOB56A
    J1.P(21) <> fpga.ios.byName.IOB56B
    J1.P(23) <> fpga.ios.byName.IOB60A
    J1.P(25) <> fpga.ios.byName.DONE
    J1.P(33) <> fpga.ios.byName.IOT1A
    J1.P(35) <> fpga.ios.byName.IOT1B
    J1.P(37) <> fpga.ios.byName.IOT3A
    J1.P(39) <> fpga.ios.byName.IOT3B
    J1.P(41) <> fpga.ios.byName.IOT7A
    J1.P(43) <> fpga.ios.byName.IOT7B
    J1.P(47) <> fpga.ios.byName.IOL9A
    J1.P(49) <> fpga.ios.byName.IOL9B
    J1.P(51) <> fpga.ios.byName.IOL5A
    J1.P(53) <> fpga.ios.byName.IOL5B
    J1.P(55) <> fpga.ios.byName.IOL12A
    J1.P(57) <> fpga.ios.byName.IOL12B

    val J2 = BTBConn.Male()
    // J2 power pins
    J2.P(2)  <> power.`VCCIO2/3`
    J2.P(4)  <> power.`VCCIO2/3`
    J2.P(38) <> power.VDD_1V8
    J2.P(40) <> power.VDD_1V8
    J2.P(42) <> power.VDD_2V5
    J2.P(44) <> power.VDD_2V5
    J2.P(46) <> power.VDD_3V3
    J2.P(48) <> power.VDD_3V3
    J2.P(50) <> power.VDD_3V3
    // J2 even IO pins
    J2.P(6)  <> fpga.ios.byName.IOR18A
    J2.P(8)  <> fpga.ios.byName.IOR18B
    J2.P(10) <> fpga.ios.byName.IOR20A
    J2.P(12) <> fpga.ios.byName.IOR20B
    J2.P(14) <> fpga.ios.byName.IOR22A
    J2.P(16) <> fpga.ios.byName.IOR22B
    J2.P(18) <> fpga.ios.byName.IOR24A
    J2.P(20) <> fpga.ios.byName.IOR24B
    J2.P(22) <> fpga.ios.byName.IOR31A
    J2.P(24) <> fpga.ios.byName.IOR31B
    J2.P(26) <> fpga.ios.byName.IOR33A
    J2.P(28) <> fpga.ios.byName.IOR33B
    J2.P(30) <> fpga.ios.byName.IOB89A
    J2.P(32) <> fpga.ios.byName.IOB89B
    J2.P(34) <> fpga.ios.byName.IOB91A
    J2.P(36) <> fpga.ios.byName.IOB91B
    // J2 odd IO pins
    J2.P(3)  <> fpga.ios.byName.IOB4A
    J2.P(5)  <> fpga.ios.byName.IOB4B
    J2.P(7)  <> fpga.ios.byName.IOB26A
    J2.P(9)  <> fpga.ios.byName.IOB26B
    J2.P(11) <> fpga.ios.byName.IOB24A
    J2.P(15) <> fpga.ios.byName.IOB12B
    J2.P(17) <> fpga.ios.byName.IOB14B
    J2.P(31) <> fpga.ios.byName.M0_D3P
    J2.P(33) <> fpga.ios.byName.M0_D3N
    J2.P(37) <> fpga.ios.byName.M0_D2P
    J2.P(39) <> fpga.ios.byName.M0_D2N
    J2.P(43) <> fpga.ios.byName.M0_CKP
    J2.P(45) <> fpga.ios.byName.M0_CKN
    J2.P(49) <> fpga.ios.byName.M0_D1P
    J2.P(51) <> fpga.ios.byName.M0_D1N
    J2.P(55) <> fpga.ios.byName.M0_D0P
    J2.P(57) <> fpga.ios.byName.M0_D0N
  end BTB
  BTB // touch to force execution

  fpga.bank0 <> power.`VCCIO0/1`
  fpga.bank1 <> power.`VCCIO0/1`
  fpga.bank2 <> power.`VCCIO2/3`
  fpga.bank3 <> power.`VCCIO2/3`
  fpga.bank4 <> power.VDD_3V3
  fpga.bank5 <> power.VDD_3V3
  fpga.bank6 <> power.`VCCIO6/7`
  fpga.bank7 <> power.`VCCIO6/7`
end TangPrimer25KCore

class TangPrimer25KBase extends Board:
  object power:
    @targetName("VCCIO0_1")
    val `VCCIO0/1` = Power()
    @targetName("VCCIO2_3")
    val `VCCIO2/3` = Power()
    @targetName("VCCIO6_7")
    val `VCCIO6/7` = Power()
    // here these power pins are not the source, since the core
    // board defines their actual power source. so they are not
    // defined with a level voltage and are stricly used as power
    // nets that are fed from the core board.
    val VDD_3V3 = Power()
    val VDD_2V5 = Power()
    val VDD_1V8 = Power()
    // the base board defines the actual io bank power
    `VCCIO0/1` <> VDD_3V3
    `VCCIO2/3` <> VDD_3V3
    `VCCIO6/7` <> VDD_3V3
  end power
  power // touch to force execution

  //////////////////////////////////////////
  // BTB
  //////////////////////////////////////////
  object BTB:
    val J1 = BTBConn.Female()
    J1.P(24) <> power.`VCCIO0/1`
    J1.P(26) <> power.`VCCIO0/1`
    J1.P(29) <> power.`VCCIO6/7`
    J1.P(31) <> power.`VCCIO6/7`

    val J2 = BTBConn.Female()
    J2.P(2)  <> power.`VCCIO2/3`
    J2.P(4)  <> power.`VCCIO2/3`
    J2.P(38) <> power.VDD_1V8
    J2.P(40) <> power.VDD_1V8
    J2.P(42) <> power.VDD_2V5
    J2.P(44) <> power.VDD_2V5
    J2.P(46) <> power.VDD_3V3
    J2.P(48) <> power.VDD_3V3
    J2.P(50) <> power.VDD_3V3
  end BTB

  object nets:
    // J1
    val L9_IOT31A_40P          = BTB.J1.P(3)
    val H5_IOT61A              = BTB.J1.P(4)
    val K9_IOT31B_40P          = BTB.J1.P(5)
    val J5_IOT61B              = BTB.J1.P(6)
    val J8_IOT56A_40P          = BTB.J1.P(7)
    val L5_IOT63A              = BTB.J1.P(8)
    val K8_IOT56B_40P          = BTB.J1.P(9)
    val K5_IOT63B              = BTB.J1.P(10)
    val F7_IOT58A_40P          = BTB.J1.P(11)
    val H8_IOT66A              = BTB.J1.P(12)
    val F6_IOT58B_40P          = BTB.J1.P(13)
    val E8_READY               = BTB.J1.P(17)
    val H7_IOT66B              = BTB.J1.P(14)
    val G7_IOT68A              = BTB.J1.P(16)
    val G8_IOT68B              = BTB.J1.P(18)
    val B3_IOB56A_FPGA_UART_RX = BTB.J1.P(19)
    val F5_IOT72A              = BTB.J1.P(20)
    val C3_IOB56B_FPGA_UART_TX = BTB.J1.P(21)
    val G5_IOT72B              = BTB.J1.P(22)
    val E3_IOB60A_40P          = BTB.J1.P(23)
    val D7_DONE                = BTB.J1.P(25)
    val L6_IOT23A_USB_P        = BTB.J1.P(30)
    val K6_IOT23B_USB_N        = BTB.J1.P(32)
    val J11_IOT1A_40P          = BTB.J1.P(33)
    val K7_IOT21A_40P          = BTB.J1.P(34)
    val J10_IOT1B_40P          = BTB.J1.P(35)
    val J7_IOT21B_40P          = BTB.J1.P(36)
    val H11_IOT3A_S1           = BTB.J1.P(37)
    val L7_IOT19A_40P          = BTB.J1.P(38)
    val H10_IOT3B_S2           = BTB.J1.P(39)
    val L8_IOT19B_40P          = BTB.J1.P(40)
    val G11_IOT7A              = BTB.J1.P(41)
    val L10_IOT15A_40P         = BTB.J1.P(42)
    val G10_IOT7B              = BTB.J1.P(43)
    val K10_IOT15B_40P         = BTB.J1.P(44)
    val K11_IOT11A             = BTB.J1.P(46)
    val D11_IOL9A              = BTB.J1.P(47)
    val L11_IOT11B             = BTB.J1.P(48)
    val D10_IOL9B              = BTB.J1.P(49)
    val C11_IOL5A              = BTB.J1.P(51)
    val E11_IOL3A              = BTB.J1.P(52)
    val C10_IOL5B              = BTB.J1.P(53)
    val E10_IOL3B              = BTB.J1.P(54)
    val B11_IOL12A             = BTB.J1.P(55)
    val A11_IOL14A             = BTB.J1.P(56)
    val B10_IOL12B             = BTB.J1.P(57)
    val A10_IOL14B             = BTB.J1.P(58)
    // J2
    val B2_IOB4A_40P  = BTB.J2.P(3)
    val C2_IOB4B_40P  = BTB.J2.P(5)
    val L2_IOR18A_40P = BTB.J2.P(6)
    val F2_IOB26A_40P = BTB.J2.P(7)
    val L1_IOR18B_40P = BTB.J2.P(8)
    val F1_IOB26B_40P = BTB.J2.P(9)
    val K1_IOR20A_40P = BTB.J2.P(10)
    val A1_IOB24A_40P = BTB.J2.P(11)
    val K2_IOR20B_40P = BTB.J2.P(12)
    val J4_IOR22A_40P = BTB.J2.P(14)
    val E1_IOB12B_40P = BTB.J2.P(15)
    val K4_IOR22B_40P = BTB.J2.P(16)
    val D1_IOB14B_40P = BTB.J2.P(17)
    val G2_IOR24A_40P = BTB.J2.P(18)
    val G1_IOR24B_40P = BTB.J2.P(20)
    val L4_IOR31A_40P = BTB.J2.P(22)
    val L3_IOR31B_40P = BTB.J2.P(24)
    val J1_IOR33A_40P = BTB.J2.P(26)
    val J2_IOR33B_40P = BTB.J2.P(28)
    val G4_IOB89A_40P = BTB.J2.P(30)
    val M0_D3_P       = BTB.J2.P(31)
    val H4_IOB89B_40P = BTB.J2.P(32)
    val M0_D3_N       = BTB.J2.P(33)
    val H1_IOB91A_40P = BTB.J2.P(34)
    val H2_IOB91B_40P = BTB.J2.P(36)
    val M0_D2_P       = BTB.J2.P(37)
    val M0_D2_N       = BTB.J2.P(39)
    val M0_CK_P       = BTB.J2.P(43)
    val M0_CK_N       = BTB.J2.P(45)
    val M0_D1_P       = BTB.J2.P(49)
    val M0_D1_N       = BTB.J2.P(51)
    val M0_D0_P       = BTB.J2.P(55)
    val M0_D0_N       = BTB.J2.P(57)
  end nets
  nets // touch to force execution

  //////////////////////////////////////////
  // Pmods
  //////////////////////////////////////////
  object pmods:
    val J4         = PmodConn.SPFemale90Deg()
    val J5         = PmodConn.SPFemale90Deg()
    val J6         = PmodConn.SPFemale90Deg()
    val J4_J5_Dual = PmodDualConn.Female(J4, J5)
    val J5_J6_Dual = PmodDualConn.Female(J5, J6)
    // J4
    J4.P(5)  <> nets.C11_IOL5A
    J4.P(7)  <> nets.B11_IOL12A
    J4.P(9)  <> nets.D11_IOL9A
    J4.P(11) <> nets.G11_IOT7A
    J4.P(6)  <> nets.C10_IOL5B
    J4.P(8)  <> nets.B10_IOL12B
    J4.P(10) <> nets.D10_IOL9B
    J4.P(12) <> nets.G10_IOT7B
    // J5
    J5.P(5)  <> nets.L5_IOT63A
    J5.P(7)  <> nets.K11_IOT11A
    J5.P(9)  <> nets.E11_IOL3A
    J5.P(11) <> nets.A11_IOL14A
    J5.P(6)  <> nets.K5_IOT63B
    J5.P(8)  <> nets.L11_IOT11B
    J5.P(10) <> nets.E10_IOL3B
    J5.P(12) <> nets.A10_IOL14B
    // J6
    J6.P(5)  <> nets.H5_IOT61A
    J6.P(7)  <> nets.H8_IOT66A
    J6.P(9)  <> nets.G7_IOT68A
    J6.P(11) <> nets.F5_IOT72A
    J6.P(6)  <> nets.J5_IOT61B
    J6.P(8)  <> nets.H7_IOT66B
    J6.P(10) <> nets.G8_IOT68B
    J6.P(12) <> nets.G5_IOT72B
  end pmods
  pmods // touch to force execution

  //////////////////////////////////////////
  // Buttons
  //////////////////////////////////////////
  object buttons:
    @io(standard = io.Standard.LVCMOS, pullMode = io.PullMode.DOWN)
    val S1, S2 = Button()
    nets.H11_IOT3A_S1 <> S1
    nets.H10_IOT3B_S2 <> S2
  end buttons
  buttons // touch to force execution
end TangPrimer25KBase

/*       TangPrimer25K Base Board + Core Board
┌───┬─────────────────────────────────────────────────┬───┐
│ J3│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│   │
│   └─────────────────────────────────────────────────┘   │
│       █Power   ┌────────────────────┐             S1╭─╮ │
├─────┐ █Ready   │   FPGA Core Board  │               ├─┤ │
│ <   │ █Done    │                    │             S2╰─╯ │
│     │          │                    │               ╭───┤
│ <   │USB       │                    │  USB Debugger │   │
├─────┘Host      │      TANG25K       │               ╰───┤
│                └────────────────────┘                   │
│╔══════════════╗     ╔══════════════╗    ╔══════════════╗│
│║     Pmod     ║     ║     Pmod     ║    ║     Pmod     ║│
│║      J6      ║     ║      J5      ║    ║      J4      ║│
└╚══════════════╝─────╚══════════════╝────╚══════════════╝┘
 */
@toolOptions("openFPGALoader" -> "-b tangprimer25k")
class TangPrimer25K extends DevBoard:
  val core = TangPrimer25KCore()
  val base = TangPrimer25KBase()
  core.BTB.J1 <> base.BTB.J1
  core.BTB.J2 <> base.BTB.J2
  export core.fpga
  export base.{pmods, buttons}
  export core.clocks

object TangPrimer25K:
  object BTBConn extends Connector.Companion(60)
  object SDRAMConn extends Connector.Companion(40)

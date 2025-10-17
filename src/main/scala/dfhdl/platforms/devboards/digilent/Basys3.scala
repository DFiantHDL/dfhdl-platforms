package dfhdl.platforms.devboards.digilent
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.pmods.*
import dfhdl.platforms.resources.*
import dfhdl.platforms.devices.xilinxamd.series7.xc7a35tcpg236
import dfhdl.*
import dfhdl.hw.constraints.*

// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}
@toolOptions("openFPGALoader" -> "-b basys3")
class Basys3 extends DevBoard:
  @deviceProperties(
    "CONFIG_VOLTAGE" -> "3.3",
    "CFGBVS"         -> "VCCO"
  )
  @deviceConfig(
    flashPartName = "s25fl032p-spi-x1_x2_x4",
    interface     = deviceConfig.Interface.MasterSPI(busWidth = 4),
    sizeLimitMb   = 32
  )
  final val fpga = xc7a35tcpg236(speedGrade = "1")

  //////////////////////////////////////////
  // Nets
  //////////////////////////////////////////
  object nets:
    //format: off
    // IC7A BANK14
    val VGA_G3       = fpga.ios.D17
    val LED6         = fpga.ios.U14
    val VGA_R1       = fpga.ios.H19
    val VGA_R0       = fpga.ios.G19
    val VGA_G1       = fpga.ios.H17
    val VGA_G2       = fpga.ios.G17
    val VGA_R2       = fpga.ios.J19
    val VGA_G0       = fpga.ios.J17
    val VGA_B3       = fpga.ios.J18
    val VGA_B1       = fpga.ios.L18
    val VGA_B2       = fpga.ios.K18
    val VGA_B0       = fpga.ios.N18
    val VGA_R3       = fpga.ios.N19
    val VGA_HS       = fpga.ios.P19
    val VGA_VS       = fpga.ios.R19
    val JC2          = fpga.ios.M18
    val JC8          = fpga.ios.M19
    val JC7          = fpga.ios.L17
    val JC1          = fpga.ios.K17
    val JC3          = fpga.ios.N17
    val JC9          = fpga.ios.P17
    val JC4          = fpga.ios.P18
    val JC10         = fpga.ios.R18
    val BTNL         = fpga.ios.W19
    val BTNR         = fpga.ios.T17
    val BTNU         = fpga.ios.T18
    val BTND         = fpga.ios.U17
    val BTNC         = fpga.ios.U18
    val SW1          = fpga.ios.V16
    val SW0          = fpga.ios.V17
    val SW2          = fpga.ios.W16
    val SW3          = fpga.ios.W17
    val SW5          = fpga.ios.V15
    val SW4          = fpga.ios.W15
    val SW7          = fpga.ios.W13
    val SW6          = fpga.ios.W14
    val LED5         = fpga.ios.U15
    val LED0         = fpga.ios.U16
    val LED8         = fpga.ios.V13
    val LED7         = fpga.ios.V14
    // IC7B BANK16
    val JB1          = fpga.ios.A14
    val JB7          = fpga.ios.A15
    val JB9          = fpga.ios.C15
    val JB3          = fpga.ios.B15
    val JB2          = fpga.ios.A16
    val JB8          = fpga.ios.A17
    val JB10         = fpga.ios.C16
    val JB4          = fpga.ios.B16
    val PS2_CLK      = fpga.ios.C17
    val PS2_DATA     = fpga.ios.B17
    val UART_TXD_IN  = fpga.ios.B18
    val UART_RXD_OUT = fpga.ios.A18
    // IC7C BANK34
    val SW15         = fpga.ios.R2
    val SW10         = fpga.ios.T2
    val SW11         = fpga.ios.R3
    val SW9          = fpga.ios.T3
    val SW14         = fpga.ios.T1
    val SW13         = fpga.ios.U1
    val SW8          = fpga.ios.V2
    val SW12         = fpga.ios.W2
    val LED9         = fpga.ios.V3
    val LED10        = fpga.ios.W3
    val LED11        = fpga.ios.U3
    val AN0          = fpga.ios.U2
    val AN1          = fpga.ios.U4
    val AN2          = fpga.ios.V4
    val CLK100MHZ    = fpga.ios.W5
    val AN3          = fpga.ios.W4
    val CA           = fpga.ios.W7
    val CB           = fpga.ios.W6
    val CC           = fpga.ios.U8
    val CD           = fpga.ios.V8
    val CE           = fpga.ios.U5
    val CF           = fpga.ios.V5
    val CG           = fpga.ios.U7
    val DP           = fpga.ios.V7
    // IC7D BANK35
    val JA10         = fpga.ios.G3
    val JA4          = fpga.ios.G2
    val JA9          = fpga.ios.H2
    val JA3          = fpga.ios.J2
    val JA7          = fpga.ios.H1
    val JA1          = fpga.ios.J1
    val JA8          = fpga.ios.K2
    val JA2          = fpga.ios.L2
    val LED15        = fpga.ios.L1
    val XA1_P        = fpga.ios.J3
    val XA1_N        = fpga.ios.K3
    val XA2_P        = fpga.ios.L3
    val XA2_N        = fpga.ios.M3
    val XA3_P        = fpga.ios.M2
    val XA3_N        = fpga.ios.M1
    val XA4_P        = fpga.ios.N2
    val XA4_N        = fpga.ios.N1
    val LED13        = fpga.ios.N3
    val LED12        = fpga.ios.P3
    val LED14        = fpga.ios.P1
    // IC7F CONFIG
    val QSPI_DQ0     = fpga.ios.D18
    val LED1         = fpga.ios.E19
    val LED2         = fpga.ios.U19
    val LED4         = fpga.ios.W18
    val QSPI_SCK     = fpga.ios.C11
    val QSPI_DQ1     = fpga.ios.D19
    val LED3         = fpga.ios.V19
    val QSPI_CS      = fpga.ios.K19
    val QSPI_DQ2     = fpga.ios.G18
    val QSPI_DQ3     = fpga.ios.F18
    // renamed nets after resistors
    val XADC1_P      = XA1_P
    val XADC1_N      = XA1_N
    val XADC2_P      = XA2_P
    val XADC2_N      = XA2_N
    val XADC3_P      = XA3_P
    val XADC3_N      = XA3_N
    val XADC4_P      = XA4_P
    val XADC4_N      = XA4_N
    //format: on
  end nets
  nets // touch to force execution

  //////////////////////////////////////////
  // Clocks
  //////////////////////////////////////////
  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val CLK_100MHz = Oscillator(100.MHz)
    CLK_100MHz <> nets.CLK100MHZ
  end clocks
  clocks // touch to force execution

  //////////////////////////////////////////
  // Power
  //////////////////////////////////////////
  object power:
    val VCC3V3 = Power(3.3)
    fpga.bank0  <> VCC3V3
    fpga.bank14 <> VCC3V3
    fpga.bank16 <> VCC3V3
    fpga.bank34 <> VCC3V3
    fpga.bank35 <> VCC3V3
  end power
  power // touch to force execution

  //////////////////////////////////////////
  // LEDs
  //////////////////////////////////////////
  object leds:
    val LED_BUS = IOBus.fill(16)(Led())
    LED_BUS(0)  <> nets.LED0
    LED_BUS(1)  <> nets.LED1
    LED_BUS(2)  <> nets.LED2
    LED_BUS(3)  <> nets.LED3
    LED_BUS(4)  <> nets.LED4
    LED_BUS(5)  <> nets.LED5
    LED_BUS(6)  <> nets.LED6
    LED_BUS(7)  <> nets.LED7
    LED_BUS(8)  <> nets.LED8
    LED_BUS(9)  <> nets.LED9
    LED_BUS(10) <> nets.LED10
    LED_BUS(11) <> nets.LED11
    LED_BUS(12) <> nets.LED12
    LED_BUS(13) <> nets.LED13
    LED_BUS(14) <> nets.LED14
    LED_BUS(15) <> nets.LED15
  end leds
  leds // touch to force execution

  //////////////////////////////////////////
  // Buttons
  //////////////////////////////////////////
  object buttons:
    @io(standard = io.Standard.LVCMOS)
    val BTNL, BTNR, BTNU, BTND, BTNC = Button()
    BTNL <> nets.BTNL
    BTNR <> nets.BTNR
    BTNU <> nets.BTNU
    BTND <> nets.BTND
    BTNC <> nets.BTNC
  end buttons
  buttons // touch to force execution

  //////////////////////////////////////////
  // Switches
  //////////////////////////////////////////
  object switches:
    @io(standard = io.Standard.LVCMOS)
    val SW_BUS = IOBus.fill(16)(SwitchUD())
    SW_BUS(0)  <> nets.SW0
    SW_BUS(1)  <> nets.SW1
    SW_BUS(2)  <> nets.SW2
    SW_BUS(3)  <> nets.SW3
    SW_BUS(4)  <> nets.SW4
    SW_BUS(5)  <> nets.SW5
    SW_BUS(6)  <> nets.SW6
    SW_BUS(7)  <> nets.SW7
    SW_BUS(8)  <> nets.SW8
    SW_BUS(9)  <> nets.SW9
    SW_BUS(10) <> nets.SW10
    SW_BUS(11) <> nets.SW11
    SW_BUS(12) <> nets.SW12
    SW_BUS(13) <> nets.SW13
    SW_BUS(14) <> nets.SW14
    SW_BUS(15) <> nets.SW15
  end switches
  switches // touch to force execution

  //////////////////////////////////////////
  // VGA
  //////////////////////////////////////////
  @io(standard = io.Standard.LVCMOS)
  val vgaJ1 = VGA()
  vgaJ1.R(0) <> nets.VGA_R0
  vgaJ1.R(1) <> nets.VGA_R1
  vgaJ1.R(2) <> nets.VGA_R2
  vgaJ1.R(3) <> nets.VGA_R3
  vgaJ1.G(0) <> nets.VGA_G0
  vgaJ1.G(1) <> nets.VGA_G1
  vgaJ1.G(2) <> nets.VGA_G2
  vgaJ1.G(3) <> nets.VGA_G3
  vgaJ1.B(0) <> nets.VGA_B0
  vgaJ1.B(1) <> nets.VGA_B1
  vgaJ1.B(2) <> nets.VGA_B2
  vgaJ1.B(3) <> nets.VGA_B3
  vgaJ1.HS   <> nets.VGA_HS
  vgaJ1.VS   <> nets.VGA_VS

  //////////////////////////////////////////
  // Pmods
  //////////////////////////////////////////
  object pmods:
    val JA, JB, JC, JXADC = PmodConn.Female()
    val JXADC_JA_Dual     = PmodDualConn.Female(JXADC, JA)
    val JB_JC_Dual        = PmodDualConn.Female(JB, JC)
    JA.P(1)     <> nets.JA1
    JA.P(2)     <> nets.JA2
    JA.P(3)     <> nets.JA3
    JA.P(4)     <> nets.JA4
    JA.P(7)     <> nets.JA7
    JA.P(8)     <> nets.JA8
    JA.P(9)     <> nets.JA9
    JA.P(10)    <> nets.JA10
    JB.P(1)     <> nets.JB1
    JB.P(2)     <> nets.JB2
    JB.P(3)     <> nets.JB3
    JB.P(4)     <> nets.JB4
    JB.P(7)     <> nets.JB7
    JB.P(8)     <> nets.JB8
    JB.P(9)     <> nets.JB9
    JB.P(10)    <> nets.JB10
    JC.P(1)     <> nets.JC1
    JC.P(2)     <> nets.JC2
    JC.P(3)     <> nets.JC3
    JC.P(4)     <> nets.JC4
    JC.P(7)     <> nets.JC7
    JC.P(8)     <> nets.JC8
    JC.P(9)     <> nets.JC9
    JC.P(10)    <> nets.JC10
    JXADC.P(1)  <> nets.XADC1_P
    JXADC.P(2)  <> nets.XADC2_P
    JXADC.P(3)  <> nets.XADC3_P
    JXADC.P(4)  <> nets.XADC4_P
    JXADC.P(7)  <> nets.XADC1_N
    JXADC.P(8)  <> nets.XADC2_N
    JXADC.P(9)  <> nets.XADC3_N
    JXADC.P(10) <> nets.XADC4_N
  end pmods
  pmods // touch to force execution

  //////////////////////////////////////////
  // Seven Segment Display
  //////////////////////////////////////////
  val sevenSegDisplay = SevenSegDisplay(
    digits             = 4,
    selectActiveState  = SevenSegDisplay.Select.Disabled,
    segmentActiveState = SevenSegDisplay.Segment.Off
  )
  sevenSegDisplay.SELECT(0) <> nets.AN0
  sevenSegDisplay.SELECT(1) <> nets.AN1
  sevenSegDisplay.SELECT(2) <> nets.AN2
  sevenSegDisplay.SELECT(3) <> nets.AN3
  sevenSegDisplay.A         <> nets.CA
  sevenSegDisplay.B         <> nets.CB
  sevenSegDisplay.C         <> nets.CC
  sevenSegDisplay.D         <> nets.CD
  sevenSegDisplay.E         <> nets.CE
  sevenSegDisplay.F         <> nets.CF
  sevenSegDisplay.G         <> nets.CG
  sevenSegDisplay.DP        <> nets.DP
end Basys3

package dfhdl.platforms.devboards.radiona
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.resources.*
import dfhdl.platforms.devices.lattice.LFE5U_85F_6BG381C
import dfhdl.hw.constraints.*
import dfhdl.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

/** @param P2V5_3V3_Sel
  *   J5 power selection. 2.5V or 3.3V. IMPORTANT: Only modify this parameter if you modified the
  *   solder on J5 to select 2.5V instead of 3.3V.
  */
@toolOptions("openFPGALoader" -> "-b ulx3s")
class ULX3S(P2V5_3V3_Sel: 2.5 | 3.3 = 3.3) extends DevBoard:
  @deviceConfig(
    flashPartName = "IS25LP128F-JBLE",
    interface     = deviceConfig.Interface.MasterSPI(busWidth = 1),
    sizeLimitMB   = 128,
    masterRate    = 62.MHz
  )
  final val fpga = LFE5U_85F_6BG381C()
  object nets:
    //format: off
    // U1A BANK0
    val GP0                = fpga.ios.B11
    val GP1                = fpga.ios.A10
    val GP2                = fpga.ios.A9
    val GP3                = fpga.ios.B9
    val GP4                = fpga.ios.A7
    val GP5                = fpga.ios.C8
    val SW1                = fpga.ios.E8
    val GP6                = fpga.ios.C6
    val SW4                = fpga.ios.E7
    val WIFI_GPIO35        = fpga.ios.E6
    val GP7                = fpga.ios.A6
    val GN0                = fpga.ios.C11
    val GN1                = fpga.ios.A11
    val GN2                = fpga.ios.B10
    val GN3                = fpga.ios.C10
    val WIFI_GPIO25        = fpga.ios.E9
    val GN4                = fpga.ios.A8
    val GN5                = fpga.ios.B8
    val SW2                = fpga.ios.D8
    val GN6                = fpga.ios.C7
    val SW3                = fpga.ios.D7
    val BTN_PWRn           = fpga.ios.D6
    val GN7                = fpga.ios.B6
    // U1A BANK1
    val FPDI_UTIL          = fpga.ios.A19
    val FPDI_CEC           = fpga.ios.A18
    val `FPDI_CLK+`        = fpga.ios.A17
    val GP23               = fpga.ios.B17
    val GP24               = fpga.ios.C16
    val `FPDI_D0+`         = fpga.ios.A16
    val `USB_FPGA_D+`      = fpga.ios.D15
    val GP22               = fpga.ios.B15
    val GP25               = fpga.ios.D14
    val `FPDI_D1+`         = fpga.ios.A14
    val GP27               = fpga.ios.D13
    val GP26               = fpga.ios.B13
    val `FPDI_D2+`         = fpga.ios.A12
    val `USB_FPGA_PULL_D+` = fpga.ios.B12
    val FPDI_HPD           = fpga.ios.B20
    val FPDI_SDA           = fpga.ios.B19
    val `FPDI_CLK-`        = fpga.ios.B18
    val GN23               = fpga.ios.C17
    val GN24               = fpga.ios.D16
    val `FPDI_D0-`         = fpga.ios.B16
    val `USB_FPGA_D-`      = fpga.ios.E15
    val GN22               = fpga.ios.C15
    val GN25               = fpga.ios.E14
    val `FPDI_D1-`         = fpga.ios.C14
    val GN27               = fpga.ios.E13
    val GN26               = fpga.ios.C13
    val `FPDI_D2-`         = fpga.ios.A13
    val FPDI_SCL           = fpga.ios.E12
    val `USB_FPGA_PULL_D-` = fpga.ios.C12
    // U1C BANK2
    val SDRAM_A7           = fpga.ios.J20
    val SDRAM_A8           = fpga.ios.J19
    val SDRAM_D14          = fpga.ios.J18
    val SDRAM_A12          = fpga.ios.G19
    val SDRAM_CKE          = fpga.ios.F20
    val SDRAM_DQM1         = fpga.ios.E20
    val SDRAM_D9           = fpga.ios.D20
    val SDRAM_D11          = fpga.ios.C20
    val SDRAM_D15          = fpga.ios.J17
    val GP18               = fpga.ios.H18
    val SHUTDOWN           = fpga.ios.G16
    val GP19               = fpga.ios.F17
    val SDRAM_D12          = fpga.ios.E18
    val GP20               = fpga.ios.D18
    // val `USB_FPGA_D+` = fpga.ios.E16 //TODO: why are two banks connected to the same net?
    val GP21               = fpga.ios.C18
    val SDRAM_A4           = fpga.ios.K20
    val SDRAM_A5           = fpga.ios.K19
    val SDRAM_A6           = fpga.ios.K18
    val SDRAM_A9           = fpga.ios.H20
    val SDRAM_A11          = fpga.ios.G20
    val SDRAM_CLK          = fpga.ios.F19
    val SDRAM_D8           = fpga.ios.E19
    val SDRAM_D10          = fpga.ios.D19
    val SDRAM_D0           = fpga.ios.J16
    val GN18               = fpga.ios.H17
    val BTN_R              = fpga.ios.H16
    val GN19               = fpga.ios.G18
    val SDRAM_D13          = fpga.ios.F18
    val GN20               = fpga.ios.E17
    // val `USB_FPGA_D-` = fpga.ios.F16 //TODO: why are two banks connected to the same net?
    val GN21               = fpga.ios.D17
    // U1D BANK3
    val ADC_MISO           = fpga.ios.U16
    val GP14               = fpga.ios.U18
    val SDRAM_DQM0         = fpga.ios.U19
    val SDRAM_nCAS         = fpga.ios.T19
    val SDRAM_nWE          = fpga.ios.T20
    val SDRAM_nCS          = fpga.ios.P20
    val SDRAM_BA0          = fpga.ios.P19
    val SDRAM_A10          = fpga.ios.N19
    val ADC_MOSI           = fpga.ios.R16
    val GP15               = fpga.ios.N17
    val SDRAM_D3           = fpga.ios.N18
    val GP16               = fpga.ios.N16
    val SDRAM_D1           = fpga.ios.L18
    val GP17               = fpga.ios.L16
    val SDRAM_A3           = fpga.ios.L19
    val SDRAM_A2           = fpga.ios.L20
    val SDRAM_D6           = fpga.ios.T17
    val GN14               = fpga.ios.U17
    val SDRAM_D5           = fpga.ios.T18
    val BTN_U              = fpga.ios.R18
    val SDRAM_D7           = fpga.ios.U20
    val SDRAM_nRAS         = fpga.ios.R20
    val SDRAM_D4           = fpga.ios.P18
    val SDRAM_BA1          = fpga.ios.N20
    val ADC_CSn            = fpga.ios.R17
    val GN15               = fpga.ios.P16
    val ADC_SCLK           = fpga.ios.P17
    val GN16               = fpga.ios.M17
    val SDRAM_D2           = fpga.ios.M18
    val GN17               = fpga.ios.L17
    val SDRAM_A1           = fpga.ios.M19
    val SDRAM_A0           = fpga.ios.M20
    // U1E BANK6
    val SD_CLK             = fpga.ios.H2
    val CLK_25MHz          = fpga.ios.G2
    val SD_D0              = fpga.ios.J3
    val OLED_BL            = fpga.ios.J4
    val SD_D1              = fpga.ios.H1
    val SD_D3              = fpga.ios.K2
    val FTDI_RXD           = fpga.ios.L4
    val WIFI_TXD           = fpga.ios.K4
    val WIFI_GPIO19        = fpga.ios.N4
    val USER_PROGRAMN      = fpga.ios.M4
    val FTDI_TXDEN         = fpga.ios.L3
    val WIFI_GPIO27        = fpga.ios.N3
    val WIFI_GPIO26        = fpga.ios.L1
    val OLED_CS            = fpga.ios.N2
    val OLED_MOSI          = fpga.ios.P3
    val OLED_DC            = fpga.ios.P1
    val WIFI_GPIO0         = fpga.ios.F1
    val WIFI_RXD           = fpga.ios.K3
    val WIFI_EN            = fpga.ios.J5
    val SD_D2              = fpga.ios.K1
    val SD_CMD             = fpga.ios.J1
    val FTDI_nRXLED        = fpga.ios.L5
    val WIFI_GPIO21        = fpga.ios.K5
    val SD_WP              = fpga.ios.P5
    val SD_CD              = fpga.ios.N5
    val WIFI_GPIO22        = fpga.ios.L2
    val FTDI_nRTS          = fpga.ios.M3
    val FTDI_nDTR          = fpga.ios.N1
    val FTDI_TXD           = fpga.ios.M1
    val OLED_CLK           = fpga.ios.P4
    val OLED_RES           = fpga.ios.P2
    // U1F BANK7
    val AUDIO_R1           = fpga.ios.B5
    val GP8                = fpga.ios.A4
    val AUDIO_R0           = fpga.ios.A3
    val GP10               = fpga.ios.C4
    val AUDIO_L2           = fpga.ios.C3
    val AUDIO_L0           = fpga.ios.E4
    val AUDIO_V3           = fpga.ios.E5
    val GP11               = fpga.ios.F4
    val LED0               = fpga.ios.B2
    val GP9                = fpga.ios.A2
    val LED3               = fpga.ios.D2
    val LED2               = fpga.ios.C1
    val AUDIO_V0           = fpga.ios.H5
    val GP13               = fpga.ios.H4
    val AUDIO_V1           = fpga.ios.F2
    val GP12               = fpga.ios.G3
    val AUDIO_R3           = fpga.ios.C5
    val GN8                = fpga.ios.A5
    val AUDIO_L3           = fpga.ios.B3
    val GN10               = fpga.ios.B4
    val AUDIO_L1           = fpga.ios.D3
    val AUDIO_R2           = fpga.ios.D5
    val AUDIO_V2           = fpga.ios.F5
    val GN11               = fpga.ios.E3
    val LED1               = fpga.ios.C2
    val GN9                = fpga.ios.B1
    val LED6               = fpga.ios.E1
    val LED4               = fpga.ios.D1
    val LED7               = fpga.ios.H3
    val GN13               = fpga.ios.G5
    val LED5               = fpga.ios.E2
    val GN12               = fpga.ios.F3
    // U1G BANK8
    val BTN_F1             = fpga.ios.R1
    val BTN_L              = fpga.ios.U1
    val FLASH_nHOLD        = fpga.ios.W1
    val FLASH_MISO         = fpga.ios.V2
    val FLASH_nCS          = fpga.ios.R2
    val FPGA_INITN         = fpga.ios.V3
    val FPGA_PROGRAMN      = fpga.ios.W3
    val FLASH_SCK          = fpga.ios.U3
    val FPGA_DONE          = fpga.ios.Y3
    val BTN_F2             = fpga.ios.T1
    val BTN_D              = fpga.ios.V1
    val FLASH_nWP          = fpga.ios.Y2
    val FLASH_MOSI         = fpga.ios.W2
    //format: on
  end nets
  nets // touch to force execution

  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val Clk_25MHz = Oscillator(25.MHz)
    Clk_25MHz <> nets.CLK_25MHz
  end clocks
  clocks // touch to force execution

  object power:
    val P2V5_3V3 = Power()
    val P3V3     = Power(3.3)
    val P2V5     = Power(2.5)
    if (P2V5_3V3_Sel == 2.5)
      P2V5_3V3 <> P2V5
    else
      P2V5_3V3 <> P3V3
    end if
    fpga.bank0 <> P2V5_3V3
    fpga.bank1 <> P3V3
    fpga.bank2 <> P3V3
    fpga.bank3 <> P3V3
    fpga.bank6 <> P3V3
    fpga.bank7 <> P2V5_3V3
    fpga.bank8 <> P3V3
  end power
  power // touch to force execution

  object leds:
    val LED = IOBus.fill(8)(Led())
    LED(7) <> nets.LED7
    LED(6) <> nets.LED6
    LED(5) <> nets.LED5
    LED(4) <> nets.LED4
    LED(3) <> nets.LED3
    LED(2) <> nets.LED2
    LED(1) <> nets.LED1
    LED(0) <> nets.LED0
  end leds
  leds // touch to force execution

  object buttons:
    @io(standard = io.Standard.LVCMOS, pullMode = io.PullMode.DOWN)
    val BTN_F1, BTN_F2, BTN_L, BTN_D, BTN_U, BTN_R = Button()
    @io(standard = io.Standard.LVCMOS, pullMode = io.PullMode.UP)
    val BTN_PWRn = Button(activeState = Button.Released)
    BTN_F1   <> nets.BTN_F1
    BTN_F2   <> nets.BTN_F2
    BTN_L    <> nets.BTN_L
    BTN_D    <> nets.BTN_D
    BTN_U    <> nets.BTN_U
    BTN_R    <> nets.BTN_R
    BTN_PWRn <> nets.BTN_PWRn
  end buttons
  buttons // touch to force execution

end ULX3S

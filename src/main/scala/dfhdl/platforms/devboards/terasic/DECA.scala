package dfhdl.platforms.devboards.terasic
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.resources.*
import dfhdl.platforms.devices.alteraintel.`10M50DAF484C6GES`
import dfhdl.hw.constraints.*
import dfhdl.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

@toolOptions("openFPGALoader" -> "-b deca")
class DECA extends DevBoard:
  @deviceConfig(
    flashPartName = "N25Q512A83GSF40F",
    interface     = deviceConfig.Interface.MasterSPI(busWidth = 4),
    sizeLimitMB   = 64
  )
  final val fpga = `10M50DAF484C6GES`()

  object nets:
    //format: off
    // U1A BANK-1A
    val ADC1IN1           = fpga.ios.F5
    val ADC1IN2           = fpga.ios.F4
    val ADC1IN3           = fpga.ios.J8
    val ADC1IN4           = fpga.ios.J9
    val ADC1IN6           = fpga.ios.H3
    val ADC1IN5           = fpga.ios.J4
    val LINE_IN_L_ADC     = fpga.ios.H4
    val ADC1IN7           = fpga.ios.K5
    // U1A BANK-2
    val NET_RX_DV         = fpga.ios.P4
    val NET_CRS           = fpga.ios.P5
    val MIPI_MD_n3        = fpga.ios.N3
    val MIPI_MD_p3        = fpga.ios.N2
    val NET_COL           = fpga.ios.R4
    val NET_MDC           = fpga.ios.R5
    val MIPI_MD_n2        = fpga.ios.T1
    val MIPI_MD_p2        = fpga.ios.T2
    val NET_MDIO          = fpga.ios.N8
    val NET_TXD2          = fpga.ios.N9
    val MIPI_MD_n1        = fpga.ios.P1
    val MIPI_MD_p1        = fpga.ios.N1
    val MIPI_RESET_n      = fpga.ios.T3
    val NET_TXD0          = fpga.ios.U2
    val MIPI_WP           = fpga.ios.U1
    val NET_RX_ER         = fpga.ios.V1
    val NET_RXD1          = fpga.ios.U4
    val NET_RXD0          = fpga.ios.U5
    val MIPI_MCLK         = fpga.ios.U3
    val MIPI_CORE_EN      = fpga.ios.V3
    val NET_RXD3          = fpga.ios.P8
    val NET_RXD2          = fpga.ios.R7
    val NET_TXD1          = fpga.ios.W1
    val NET_TXD3          = fpga.ios.W2
    val MIPI_MD_n0        = fpga.ios.R1
    val MIPI_MD_p0        = fpga.ios.R2
    val MIPI_I2C_SDA      = fpga.ios.M2
    val MIPI_I2C_SCL      = fpga.ios.M1
    // U1B BANK-3
    val GPIO1_D13         = fpga.ios.Y7
    val LIGHT_I2C_SCL     = fpga.ios.Y8
    val CAP_SENSE_I2C_SCL = fpga.ios.AB2
    val CAP_SENSE_I2C_SDA = fpga.ios.AB3
    val PMONITOR_I2C_SCL  = fpga.ios.Y3
    val PMONITOR_ALERT    = fpga.ios.Y4
    val GPIO1_D10         = fpga.ios.AB6
    val GPIO1_D9          = fpga.ios.AB7
    val LIGHT_I2C_SDA     = fpga.ios.AA8
    val GPIO1_D6          = fpga.ios.AB8
    val LIGHT_INT         = fpga.ios.AA9
    val RH_TEMP_DRDY_n    = fpga.ios.AB9
    val FLASH_DATA1       = fpga.ios.V4
    val FLASH_DATA2       = fpga.ios.V5
    val PMONITOR_I2C_SDA  = fpga.ios.Y1
    val TEMP_SIO          = fpga.ios.Y2
    val TEMP_SC           = fpga.ios.AA1
    val SYS_RESET_n       = fpga.ios.AA2
    val GPIO1_D0          = fpga.ios.Y5
    val GPIO1_D1          = fpga.ios.Y6
    val GPIO1_D16         = fpga.ios.W9
    val FLASH_RESET_n     = fpga.ios.W10
    val GPIO1_D3          = fpga.ios.W7
    val GPIO1_D4          = fpga.ios.W8
    val FLASH_NCSO        = fpga.ios.R10
    val FLASH_DATA3       = fpga.ios.P10
    val GPIO1_D12         = fpga.ios.AA6
    val GPIO1_D11         = fpga.ios.AA7
    val GPIO1_D17         = fpga.ios.W5
    val GPIO1_D2          = fpga.ios.W6
    val RH_TEMP_I2C_SCL   = fpga.ios.Y10
    val RH_TEMP_I2C_SDA   = fpga.ios.AA10
    val PWR_BUT           = fpga.ios.U6
    val GPIO1_D15         = fpga.ios.U7
    val GPIO1_D19         = fpga.ios.W4
    val GPIO1_D22         = fpga.ios.W3
    val GPIO1_D7          = fpga.ios.V7
    val GPIO1_D5          = fpga.ios.V8
    val GPIO1_D18         = fpga.ios.R9
    val GPIO1_D20         = fpga.ios.P9
    val TEMP_CS_n         = fpga.ios.AB4
    // U1B BANK-4
    val GPIO0_D35         = fpga.ios.W11
    val GPIO0_D32         = fpga.ios.Y11
    val GPIO0_D30         = fpga.ios.AB10
    val GPIO0_D28         = fpga.ios.AB11
    val GPIO0_D26         = fpga.ios.AB12
    val GPIO0_D24         = fpga.ios.AB13
    val GPIO0_D34         = fpga.ios.W12
    val GPIO0_D33         = fpga.ios.W13
    val GPIO0_D23         = fpga.ios.AA14
    val GPIO0_D18         = fpga.ios.AB15
    val GPIO0_D21         = fpga.ios.AA15
    val GPIO0_D9          = fpga.ios.Y16
    val GPIO0_D16         = fpga.ios.AB16
    val GPIO0_D15         = fpga.ios.AA16
    val GPIO0_D8          = fpga.ios.AB19
    val GPIO0_D7          = fpga.ios.AB20
    val GPIO0_D5          = fpga.ios.AA19
    val GPIO0_D1          = fpga.ios.Y18
    val GPIO0_D6          = fpga.ios.AB21
    val GPIO0_D4          = fpga.ios.AA20
    val GPIO0_D14         = fpga.ios.AB17
    val GPIO0_D11         = fpga.ios.AB18
    val GPIO0_D37         = fpga.ios.V11
    val GPIO0_D36         = fpga.ios.V12
    val FLASH_DCLK        = fpga.ios.R12
    val FLASH_DATA0       = fpga.ios.P12
    val GPIO0_D29         = fpga.ios.AA11
    val GPIO0_D27         = fpga.ios.AA12
    val GPIO0_D38         = fpga.ios.V13
    val GPIO0_D41         = fpga.ios.W14
    val GPIO0_D43         = fpga.ios.R13
    val SD_SEL            = fpga.ios.P13
    val GPIO0_D31         = fpga.ios.Y13
    val GPIO0_D20         = fpga.ios.Y14
    val GPIO0_D39         = fpga.ios.V14
    val GPIO0_D19         = fpga.ios.W15
    val GPIO0_D42         = fpga.ios.U15
    val GPIO0_D10         = fpga.ios.V16
    val GPIO0_D3          = fpga.ios.AA17
    val GPIO0_D40         = fpga.ios.Y17
    val GPIO0_D12         = fpga.ios.V15
    val GPIO0_D17         = fpga.ios.W16
    val GPIO0_D2          = fpga.ios.Y19
    val GPIO0_D0          = fpga.ios.W18
    val GPIO0_D25         = fpga.ios.AA13
    val GPIO0_D22         = fpga.ios.AB14
    // U1C BANK-5
    val DDR3_RESET_n      = fpga.ios.U19
    val DDR3_A6           = fpga.ios.V18
    val DDR3_A9           = fpga.ios.W22
    val DDR3_A11          = fpga.ios.Y22
    val DDR3_A14          = fpga.ios.W20
    val DDR3_BA1          = fpga.ios.W19
    val DDR3_A4           = fpga.ios.Y21
    val DDR3_A8           = fpga.ios.Y20
    val DDR3_A7           = fpga.ios.U20
    val DDR3_A1           = fpga.ios.V20
    val DDR3_A13          = fpga.ios.V22
    val DDR3_A2           = fpga.ios.V21
    val DDR3_VREF         = fpga.ios.P22
    val AUDIO_BCLK        = fpga.ios.R14
    val AUDIO_WCLK        = fpga.ios.R15
    val AUDIO_MCLK        = fpga.ios.P14
    val AUDIO_DIN_MFP1    = fpga.ios.P15
    val AUDIO_SPI_SELECT  = fpga.ios.N22
    val AUDIO_SDA_MOSI    = fpga.ios.P21
    val AUDIO_DOUT_MFP2   = fpga.ios.P18
    val AUDIO_SCL_SS_n    = fpga.ios.P20
    val AUDIO_SCLK_MFP3   = fpga.ios.P19
    val AUDIO_RESET_n     = fpga.ios.M21
    val AUDIO_GPIO_MFP5   = fpga.ios.M22
    val AUDIO_MISO_MFP4   = fpga.ios.N21
    val SD_D0_DIR         = fpga.ios.T22
    val SD_CMD            = fpga.ios.T21
    val SD_DAT1           = fpga.ios.T18
    val SD_DAT2           = fpga.ios.T19
    val SD_DAT3           = fpga.ios.R20
    val SD_CLK            = fpga.ios.T20
    val SD_CMD_DIR        = fpga.ios.U22
    val SD_D123_DIR       = fpga.ios.U21
    val SD_DAT0           = fpga.ios.R18
    val SD_FB_CLK         = fpga.ios.R22
    // U1C BANK-6
    val KEY0              = fpga.ios.H21
    val KEY1              = fpga.ios.H22
    val SW0               = fpga.ios.J21
    val SW1               = fpga.ios.J22
    val DDR3_CS_n         = fpga.ios.F22
    val DDR3_ODT          = fpga.ios.G22
    val DDR3_DQ5          = fpga.ios.M14
    val DDR3_DQ3          = fpga.ios.M15
    val DDR3_A0           = fpga.ios.E21
    val DDR3_WE_n         = fpga.ios.E22
    val DDR3_DM0          = fpga.ios.N19
    val DDR3_A12          = fpga.ios.N18
    val DDR3_DQ6          = fpga.ios.M20
    val DDR3_DQ7          = fpga.ios.N20
    val DDR3_A10          = fpga.ios.C22
    val DDR3_RAS_n        = fpga.ios.D22
    val DDR3_DQ2          = fpga.ios.L18
    val DDR3_DQ4          = fpga.ios.M18
    val DDR3_DQ0          = fpga.ios.L20
    val DDR3_DQ1          = fpga.ios.L19
    val DDR3_CAS_n        = fpga.ios.E20
    val DDR3_BA2          = fpga.ios.F19
    val DDR3_DQS_n1       = fpga.ios.K15
    val DDR3_DQS_p1       = fpga.ios.K14
    val DDR3_BA0          = fpga.ios.D19
    val DDR3_A3           = fpga.ios.C20
    val DDR3_DQ10         = fpga.ios.J18
    val DDR3_DQ9          = fpga.ios.K18
    val DDR3_DQ11         = fpga.ios.K20
    val DDR3_DQ8          = fpga.ios.K19
    val DDR3_CKE          = fpga.ios.B22
    val DDR3_DM1          = fpga.ios.J15
    val DDR3_A5           = fpga.ios.J14
    val DDR3_DQ12         = fpga.ios.H18
    val DDR3_DQ15         = fpga.ios.H19
    val DDR3_DQ14         = fpga.ios.H20
    val DDR3_DQ13         = fpga.ios.J20
    val DDR3_CK_n         = fpga.ios.E18
    val DDR3_CK_p         = fpga.ios.D18
    // U1D BANK-7
    val HDMI_TX_D9        = fpga.ios.A17
    val HDMI_TX_D22       = fpga.ios.A18
    val HDMI_TX_D11       = fpga.ios.C15
    val HDMI_TX_D17       = fpga.ios.C16
    val HDMI_TX_D15       = fpga.ios.A16
    val HDMI_TX_D10       = fpga.ios.B16
    val USB_DIR           = fpga.ios.J13
    val USB_DATA4         = fpga.ios.H14
    val HDMI_TX_D23       = fpga.ios.C13
    val HDMI_TX_D8        = fpga.ios.C14
    val HDMI_TX_D21       = fpga.ios.B14
    val HDMI_TX_D12       = fpga.ios.A14
    val USB_DATA6         = fpga.ios.E15
    val USB_RESET_n       = fpga.ios.E16
    val USB_DATA1         = fpga.ios.E13
    val HDMI_TX_D4        = fpga.ios.D14
    val USB_DATA0         = fpga.ios.E12
    val HDMI_TX_D6        = fpga.ios.D13
    val USB_STP           = fpga.ios.J12
    val USB_DATA2         = fpga.ios.H13
    val HDMI_TX_D14       = fpga.ios.A12
    val HDMI_TX_D16       = fpga.ios.A13
    val HDMI_SCLK         = fpga.ios.D12
    val HDMI_TX_D18       = fpga.ios.C12
    val HDMI_LRCLK        = fpga.ios.A10
    val HDMI_I2S1         = fpga.ios.A11
    val HDMI_I2C_SCL      = fpga.ios.C10
    val HDMI_TX_VS        = fpga.ios.C11
    val HDMI_TX_HS        = fpga.ios.B11
    val HDMI_TX_D20       = fpga.ios.B12
    val USB_CS            = fpga.ios.J11
    val USB_NXT           = fpga.ios.H12
    val HDMI_I2S3         = fpga.ios.B8
    val HDMI_I2S0         = fpga.ios.A9
    val HDMI_TX_D2        = fpga.ios.C17
    val HDMI_TX_D1        = fpga.ios.D17
    val HDMI_TX_DE        = fpga.ios.C9
    val HDMI_TX_INT       = fpga.ios.B10
    val HDMI_MCLK         = fpga.ios.A7
    val HDMI_I2S2         = fpga.ios.A8
    val USB_DATA7         = fpga.ios.F15
    val USB_CLKOUT_NOPLL  = fpga.ios.F16
    val HDMI_TX_D5        = fpga.ios.B19
    val HDMI_TX_D3        = fpga.ios.C19
    val HDMI_TX_D19       = fpga.ios.B17
    val HDMI_TX_D0        = fpga.ios.C18
    val HDMI_TX_D7        = fpga.ios.A19
    val HDMI_TX_CLK       = fpga.ios.A20
    val USB_DATA3         = fpga.ios.E14
    val USB_DATA5         = fpga.ios.D15
    val HDMI_I2C_SDA      = fpga.ios.B15
    val HDMI_TX_D13       = fpga.ios.A15
    // U1D BANK-8
    val LED0              = fpga.ios.C7
    val LED1              = fpga.ios.C8
    val LED2              = fpga.ios.A6
    val LED3              = fpga.ios.B7
    val USB_FAULT_n       = fpga.ios.D8
    val MIPI_LP_MD_p0     = fpga.ios.A4
    val LED5              = fpga.ios.A5
    val G_SENSOR_CS_n     = fpga.ios.E9
    val MIPI_LP_MD_n3     = fpga.ios.A2
    val MIPI_LP_MD_n0     = fpga.ios.A3
    val MIPI_LP_MD_p3     = fpga.ios.B3
    val LED6              = fpga.ios.B4
    val G_SENSOR_SCLK     = fpga.ios.B5
    val LED4              = fpga.ios.C4
    val G_SENSOR_INT1     = fpga.ios.E8
    val G_SENSOR_SDO      = fpga.ios.D5
    val LED7              = fpga.ios.C5
    val MIPI_LP_MD_p2     = fpga.ios.B1
    val MIPI_LP_MD_n2     = fpga.ios.B2
    val MIPI_LP_MD_n1     = fpga.ios.C2
    val MIPI_LP_MD_p1     = fpga.ios.C3
    val G_SENSOR_INT2     = fpga.ios.D7
    val G_SENSOR_SDI      = fpga.ios.C6
    //U1E CLOCKS
    val MIPI_MC_n         = fpga.ios.N4
    val MIPI_MC_p         = fpga.ios.N5
    val MAX10_CLK1_50     = fpga.ios.M8
    val ADC_CLK_10        = fpga.ios.M9
    val NET_PCF_EN        = fpga.ios.V9
    val GPIO1_D14         = fpga.ios.V10
    val GPIO1_D8          = fpga.ios.R11
    val MAX10_CLK2_50     = fpga.ios.P11
    val DDR3_CLK_50       = fpga.ios.N15
    val MIPI_LP_MC_n      = fpga.ios.E10
    val MIPI_LP_MC_p      = fpga.ios.E11
    val USB_CLKIN         = fpga.ios.H11
    val NET_TX_EN         = fpga.ios.P3
    val NET_RESET_n       = fpga.ios.R3
    val NET_TX_CLK        = fpga.ios.T5
    val NET_RX_CLK        = fpga.ios.T6
    val GPIO0_D13         = fpga.ios.W17
    val GPIO1_D21         = fpga.ios.V17
    val DDR3_DQS_n0       = fpga.ios.L15
    val DDR3_DQS_p0       = fpga.ios.L14
    val USB_CLKOUT        = fpga.ios.G17
    //format: on
  end nets
  nets // touch to force execution

  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val ADC_CLK_10MHz = Oscillator(10.MHz)
    ADC_CLK_10MHz <> nets.ADC_CLK_10
    @io(standard = io.Standard.LVCMOS)
    val MAX10_CLK1_50MHz = Oscillator(50.MHz)
    MAX10_CLK1_50MHz <> nets.MAX10_CLK1_50
    @io(standard = io.Standard.LVCMOS)
    val MAX10_CLK2_50MHz = Oscillator(50.MHz)
    MAX10_CLK2_50MHz <> nets.MAX10_CLK2_50
    @io(standard = io.Standard.LVCMOS)
    val DDR3_CLK_50MHz = Oscillator(50.MHz)
    DDR3_CLK_50MHz <> nets.DDR3_CLK_50
  end clocks
  clocks // touch to force execution

  object power:
    val VCC2P5      = Power(2.5)
    val VCC3P3      = Power(3.3)
    val VCC1P5_DDR3 = Power(1.5)
    val VCC1P8      = Power(1.8)
    val VCC1P2      = Power(1.2)

    fpga.bank1A <> VCC2P5
    fpga.bank1B <> VCC2P5
    fpga.bank2  <> VCC2P5
    fpga.bank3  <> VCC3P3
    fpga.bank4  <> VCC3P3
    fpga.bank5  <> VCC1P5_DDR3
    fpga.bank6  <> VCC1P5_DDR3
    fpga.bank7  <> VCC1P8
    fpga.bank8  <> VCC1P2
  end power
  power // touch to force execution

  object leds:
    val LED_BUS = IOBus.fill(8)(Led(activeState = Led.Off))
    LED_BUS(0) <> nets.LED0
    LED_BUS(1) <> nets.LED1
    LED_BUS(2) <> nets.LED2
    LED_BUS(3) <> nets.LED3
    LED_BUS(4) <> nets.LED4
    LED_BUS(5) <> nets.LED5
    LED_BUS(6) <> nets.LED6
    LED_BUS(7) <> nets.LED7
  end leds
  leds // touch to force execution

  object buttons:
    @io(schmittTrigger = true)
    val KEY0 = Button(activeState = Button.Released)
    KEY0 <> nets.KEY0
    @io(schmittTrigger = true)
    val KEY1 = Button(activeState = Button.Released)
    KEY1 <> nets.KEY1
  end buttons
  buttons // touch to force execution

  object switches:
    @io(schmittTrigger = true)
    val SW0 = SwitchUD(activeState = SwitchUD.Up)
    SW0 <> nets.SW0
    @io(schmittTrigger = true)
    val SW1 = SwitchUD(activeState = SwitchUD.Up)
    SW1 <> nets.SW1
  end switches
  switches // touch to force execution
end DECA

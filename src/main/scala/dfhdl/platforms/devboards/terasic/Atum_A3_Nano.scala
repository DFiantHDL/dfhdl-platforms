package dfhdl.platforms.devboards.terasic
import dfhdl.platforms.devboards.DevBoard
import dfhdl.platforms.resources.*
import dfhdl.platforms.devices.alteraintel.A3CZ135BB18AE7S
import dfhdl.hw.constraints.*
import dfhdl.*
import dfhdl.platforms.pmods.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class Atum_A3_Nano extends DevBoard:
  @deviceConfig(
    flashPartName = "MT25QU128",
    interface     = deviceConfig.Interface.MasterSPI(busWidth = 4),
    sizeLimitMb   = 128
  )
  final val fpga = A3CZ135BB18AE7S()

  object nets:
    //format: off
    // U11B BANK 3AT
    val SW0           = fpga.ios.A19
    val SW1           = fpga.ios.A22
    val HDMI_TX_D23   = fpga.ios.B24
    val HDMI_TX_D11   = fpga.ios.A24
    val HDMI_TX_D10   = fpga.ios.B26
    val HDMI_TX_D9    = fpga.ios.A26
    val HDMI_TX_D7    = fpga.ios.B27
    val HDMI_TX_D6    = fpga.ios.A34
    val HDMI_TX_D12   = fpga.ios.A31
    val HDMI_TX_D8    = fpga.ios.B29
    val HDMI_TX_D14   = fpga.ios.A37
    val CAM_D_n3      = fpga.ios.A42
    val CAM_D_p3      = fpga.ios.B39
    val CAM_D_n2      = fpga.ios.A44
    val CAM_D_p2      = fpga.ios.B42
    val CAM_CLK_n     = fpga.ios.A45
    val CAM_CLK_p     = fpga.ios.B45
    val CAM_D_n1      = fpga.ios.B51
    val CAM_D_p1      = fpga.ios.B50
    val CAM_D_n0      = fpga.ios.A47
    val CAM_D_p0      = fpga.ios.B47
    val HDMI_TX_D17   = fpga.ios.F32
    val HDMI_TX_D21   = fpga.ios.K32
    val HDMI_TX_D19   = fpga.ios.K35
    val HDMI_TX_D13   = fpga.ios.H35
    val HDMI_TX_D15   = fpga.ios.F35
    val HDMI_TX_D16   = fpga.ios.F40
    val CAM_RZQ1      = fpga.ios.F43
    val HDMI_TX_D22   = fpga.ios.K40
    val CLOCK0_50     = fpga.ios.K43
    val HDMI_TX_D2    = fpga.ios.G51
    val HDMI_TX_D0    = fpga.ios.G52
    val HDMI_TX_D1    = fpga.ios.J52
    val HDMI_TX_D3    = fpga.ios.J51
    val HDMI_TX_CLK_n = fpga.ios.M52
    val HDMI_TX_CLK_p = fpga.ios.L51
    val HDMI_TX_VS    = fpga.ios.N52
    val HDMI_TX_D4    = fpga.ios.M51
    val HDMI_TX_D18   = fpga.ios.V52
    val HDMI_TX_D20   = fpga.ios.V51
    val HDMI_TX_HS    = fpga.ios.R52
    val HDMI_TX_DE    = fpga.ios.R51
    // U11C BANK 6A
    val DRAM_ADDR7    = fpga.ios.BH32
    val DRAM_CLK      = fpga.ios.BK32
    val DRAM_ADDR4    = fpga.ios.BH26
    val DRAM_ADDR1    = fpga.ios.BH27
    val DRAM_ADDR3    = fpga.ios.BH21
    val DRAM_ADDR6    = fpga.ios.BK18
    val DRAM_ADDR12   = fpga.ios.BK26
    val DRAM_ADDR5    = fpga.ios.BH18
    val DRAM_WE_N     = fpga.ios.BM34
    val DRAM_ADDR11   = fpga.ios.BN29
    val DRAM_CS_N     = fpga.ios.BN34
    val DRAM_BA1      = fpga.ios.BM29
    val DRAM_ADDR2    = fpga.ios.BM26
    val DRAM_RAS_N    = fpga.ios.BM31
    val DRAM_ADDR10   = fpga.ios.BN27
    val DRAM_ADDR0    = fpga.ios.BN26
    val DRAM_ADDR8    = fpga.ios.BM24
    // U11C BANK 6B
    val DRAM_DQ8      = fpga.ios.BM37
    val DRAM_DQ9      = fpga.ios.BN37
    val DRAM_DQ14     = fpga.ios.BN39
    val DRAM_DQ12     = fpga.ios.BM44
    val DRAM_DQ10     = fpga.ios.BM42
    val DRAM_DQ11     = fpga.ios.BN42
    val DRAM_DQ15     = fpga.ios.BM45
    val DRAM_DQ13     = fpga.ios.BN45
    val DRAM_DQ3      = fpga.ios.BM47
    val DRAM_DQ2      = fpga.ios.BN47
    val DRAM_DQ1      = fpga.ios.BM51
    val DRAM_DQ0      = fpga.ios.BM50
    val DRAM_DQ7      = fpga.ios.BH46
    val DRAM_DQ6      = fpga.ios.BK50
    val DRAM_DQ5      = fpga.ios.BH50
    val DRAM_DQ4      = fpga.ios.BL51
    val DRAM_CKE      = fpga.ios.BK40
    val DRAM_ADDR9    = fpga.ios.BH35
    val DRAM_BA0      = fpga.ios.BH43
    val DRAM_CAS_N    = fpga.ios.BH40
    // U11D BANK 6C
    val GPIO_D32      = fpga.ios.B16
    val GPIO_D33      = fpga.ios.A14
    val GPIO_D35      = fpga.ios.B19
    val GPIO_D30      = fpga.ios.B14
    val GPIO_D1       = fpga.ios.A11
    val GPIO_D20      = fpga.ios.A9
    val GPIO_D3       = fpga.ios.B11
    val GPIO_D18      = fpga.ios.B8
    val CLOCK1_50     = fpga.ios.A8
    val GPIO_D0       = fpga.ios.B3
    val GPIO_D5       = fpga.ios.B5
    val GPIO_D9       = fpga.ios.C2
    val GPIO_D13      = fpga.ios.K7
    val GPIO_D7       = fpga.ios.F3
    val GPIO_D16      = fpga.ios.D3
    val GPIO_D10      = fpga.ios.U12
    val GPIO_D12      = fpga.ios.P9
    val GPIO_D8       = fpga.ios.U9
    val GPIO_D6       = fpga.ios.W9
    // U11D BANK 6D
    val GPIO_D11      = fpga.ios.F7
    val GPIO_D4       = fpga.ios.H7
    val GPIO_D22      = fpga.ios.F13
    val GPIO_D19      = fpga.ios.F10
    val GPIO_D17      = fpga.ios.H13
    val GPIO_D27      = fpga.ios.K21
    val GPIO_D15      = fpga.ios.K13
    val GPIO_D14      = fpga.ios.K10
    val GPIO_D2       = fpga.ios.D18
    val GPIO_D21      = fpga.ios.D10
    val GPIO_D24      = fpga.ios.F18
    val GPIO_D34      = fpga.ios.F21
    val GPIO_D23      = fpga.ios.K18
    val GPIO_D25      = fpga.ios.H21
    val GPIO_D31      = fpga.ios.F27
    val GPIO_D26      = fpga.ios.D26
    val GPIO_D28      = fpga.ios.H27
    val GPIO_D29      = fpga.ios.F26
    val CAM_I2C_SDA   = fpga.ios.K26
    val CAM_I2C_SCL   = fpga.ios.K27
    // U11E BANK 6E
    val NET_RESET_n   = fpga.ios.AW12
    val NET_MDIO      = fpga.ios.BH7
    val NET_MDC       = fpga.ios.BB9
    val NET_RX_CTRL   = fpga.ios.AU4
    val NET_RX_CLK    = fpga.ios.AT9
    val NET_TX_CTRL   = fpga.ios.AU6
    val NET_TX_CLK    = fpga.ios.AY6
    val NET_RX_DATA3  = fpga.ios.BH3
    val NET_RX_DATA2  = fpga.ios.BB12
    val NET_RX_DATA1  = fpga.ios.BF9
    val NET_RX_DATA0  = fpga.ios.BF12
    val NET_TX_DATA3  = fpga.ios.BM3
    val NET_TX_DATA2  = fpga.ios.BM2
    val NET_TX_DATA1  = fpga.ios.BK10
    val NET_TX_DATA0  = fpga.ios.BH10
    // U11E BANK 6F
    val DRAM_DQ31     = fpga.ios.BN16
    val DRAM_DQM1     = fpga.ios.BM19
    val DRAM_DQM3     = fpga.ios.BM14
    val DRAM_DQ29     = fpga.ios.BN14
    val DRAM_DQ27     = fpga.ios.BN11
    val DRAM_DQ30     = fpga.ios.BM11
    val DRAM_DQ28     = fpga.ios.BN8
    val DRAM_DQ26     = fpga.ios.BM8
    val DRAM_DQ24     = fpga.ios.BN5
    val DRAM_DQ25     = fpga.ios.BM9
    val DRAM_DQM2     = fpga.ios.BJ2
    val DRAM_DQ19     = fpga.ios.BJ1
    val DRAM_DQ21     = fpga.ios.BG1
    val DRAM_DQ16     = fpga.ios.BG2
    val DRAM_DQ22     = fpga.ios.BC1
    val DRAM_DQ18     = fpga.ios.BC2
    val DRAM_DQ20     = fpga.ios.BE4
    val DRAM_DQ17     = fpga.ios.BA2
    val DRAM_DQ23     = fpga.ios.BD1
    val DRAM_DQM0     = fpga.ios.BE6
    // U11F BANK 6G
    val TMD0_D7       = fpga.ios.AA6
    val TMD0_D3       = fpga.ios.AE12
    val TMD0_D5       = fpga.ios.AA4
    val TMD0_D2       = fpga.ios.AB9
    val TMD0_D6       = fpga.ios.AH12
    val TMD0_D1       = fpga.ios.P6
    val TMD0_D0       = fpga.ios.AD6
    val TMD0_D4       = fpga.ios.P4
    val CLOCK2_50     = fpga.ios.AH9
    val TMD1_D7       = fpga.ios.AK2
    val TMD1_D4       = fpga.ios.AL12
    val TMD1_D2       = fpga.ios.AK1
    val TMD1_D3       = fpga.ios.AR1
    val TMD1_D5       = fpga.ios.AJ4
    val TMD1_D1       = fpga.ios.AJ6
    val TMD1_D0       = fpga.ios.AR2
    val TMD1_D6       = fpga.ios.AV1
    val DDC_I2C_SDA   = fpga.ios.AN1
    val DDC_I2C_SCL   = fpga.ios.AV2
    val CAM_GPIO      = fpga.ios.AL9
    // U11F BANK 6H
    val LED0          = fpga.ios.AG2
    val LED1          = fpga.ios.AM6
    val LED2          = fpga.ios.AF1
    val LED3          = fpga.ios.AF2
    val SD_DATA0      = fpga.ios.AC2
    val SD_DATA1      = fpga.ios.AC1
    val SD_DATA2      = fpga.ios.V2
    val SD_DATA3      = fpga.ios.V1
    val CLOCK3_50     = fpga.ios.R2
    val SD_CLK        = fpga.ios.Y1
    val SD_CMD        = fpga.ios.N1
    val HDMI_I2C_SDA  = fpga.ios.N2
    val HDMI_I2C_SCL  = fpga.ios.M2
    val FPGA_UART_TX  = fpga.ios.T6
    val FPGA_UART_RX  = fpga.ios.L1
    val HDMI_ISEL     = fpga.ios.J2
    val HDMI_PD_n     = fpga.ios.J1
    val KEY0          = fpga.ios.E2
    val KEY1          = fpga.ios.K3
    //format: on
  end nets
  nets // touch to force execution

  object clocks:
    @io(standard = io.Standard.LVCMOS)
    val CLOCK0_50MHz = Oscillator(50.MHz)
    CLOCK0_50MHz <> nets.CLOCK0_50
    @io(standard = io.Standard.LVCMOS)
    val CLOCK1_50MHz = Oscillator(50.MHz)
    CLOCK1_50MHz <> nets.CLOCK1_50
    @io(standard = io.Standard.LVCMOS)
    val CLOCK2_50MHz = Oscillator(50.MHz)
    CLOCK2_50MHz <> nets.CLOCK2_50
    @io(standard = io.Standard.LVCMOS)
    val CLOCK3_50MHz = Oscillator(50.MHz)
    CLOCK3_50MHz <> nets.CLOCK3_50
  end clocks
  clocks // touch to force execution

  object power:
    val VCC3P3 = Power(3.3)
    val VCC1P8 = Power(1.8)
    val VCC1P2 = Power(1.2)

    fpga.bank3A_T <> VCC1P2
    fpga.bank6A   <> VCC1P8
    fpga.bank6B   <> VCC1P8
    fpga.bank6C   <> VCC3P3
    fpga.bank6D   <> VCC3P3
    fpga.bank6E   <> VCC1P8
    fpga.bank6F   <> VCC1P8
    fpga.bank6G   <> VCC3P3
    fpga.bank6H   <> VCC3P3
  end power
  power // touch to force execution

  object leds:
    @io(standard = io.Standard.LVCMOS, driveStrength = 9)
    val LED_BUS = IOBus.fill(4)(Led(activeState = Led.Off))
    LED_BUS(0) <> nets.LED0
    LED_BUS(1) <> nets.LED1
    LED_BUS(2) <> nets.LED2
    LED_BUS(3) <> nets.LED3
  end leds
  leds // touch to force execution

  object buttons:
    @io(standard = io.Standard.LVCMOS)
    val KEY0, KEY1 = Button(activeState = Button.Released)
    KEY0 <> nets.KEY0
    KEY1 <> nets.KEY1
  end buttons
  buttons // touch to force execution

  object switches:
    @io(standard = io.Standard.LVCMOS)
    val SW0, SW1 = SwitchUD(activeState = SwitchUD.Up)
    SW0 <> nets.SW0
    SW1 <> nets.SW1
  end switches
  switches // touch to force execution

  object pmods:
    val JP2          = PmodConn.Female()
    val PMOD_0       = JP2
    val JP3          = PmodConn.Female()
    val PMOD_1       = JP3
    val JP2_JP3_Dual = PmodDualConn.Female(JP2, JP3)
    val PMOD01_Dual  = JP2_JP3_Dual
    JP2.P(1)  <> nets.TMD0_D0
    JP2.P(2)  <> nets.TMD0_D1
    JP2.P(3)  <> nets.TMD0_D2
    JP2.P(4)  <> nets.TMD0_D3
    JP2.P(7)  <> nets.TMD0_D4
    JP2.P(8)  <> nets.TMD0_D5
    JP2.P(9)  <> nets.TMD0_D6
    JP2.P(10) <> nets.TMD0_D7
    JP3.P(1)  <> nets.TMD1_D0
    JP3.P(2)  <> nets.TMD1_D1
    JP3.P(3)  <> nets.TMD1_D2
    JP3.P(4)  <> nets.TMD1_D3
    JP3.P(7)  <> nets.TMD1_D4
    JP3.P(8)  <> nets.TMD1_D5
    JP3.P(9)  <> nets.TMD1_D6
    JP3.P(10) <> nets.TMD1_D7
  end pmods
  pmods // touch to force execution
end Atum_A3_Nano

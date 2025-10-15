package dfhdl.platforms.devices.xilinxamd.series7
import dfhdl.hw.constraints.*
import Pin.IOType.*
import Pin.NA

//format: off
class xc7a100tcsg324(val speedGrade: String) extends Device:
  final lazy val deviceName: String = "xc7a100t"
  final lazy val packageName: String = "csg324"
  class Bank0 extends Bank(CONFIG):
    object pins:
      val P10 = Pin(name = "DONE_0",                       memory = NA)
      val E10 = Pin(name = "TCK_0",                        memory = NA)
      val E8  = Pin(name = "VCCBATT_0",                    memory = NA)
      val K9  = Pin(name = "VN_0",                         memory = NA)
      val K10 = Pin(name = "VREFP_0",                      memory = NA)
      val H9  = Pin(name = "GNDADC_0",                     memory = NA)
      val H10 = Pin(name = "VCCADC_0",                     memory = NA)
      val L10 = Pin(name = "DXP_0",                        memory = NA)
      val E9  = Pin(name = "CCLK_0",                       memory = NA)
      val J10 = Pin(name = "VP_0",                         memory = NA)
      val J9  = Pin(name = "VREFN_0",                      memory = NA)
      val L9  = Pin(name = "DXN_0",                        memory = NA)
      val E13 = Pin(name = "TDO_0",                        memory = NA)
      val E11 = Pin(name = "TDI_0",                        memory = NA)
      val P7  = Pin(name = "INIT_B_0",                     memory = NA)
      val P13 = Pin(name = "M1_0",                         memory = NA)
      val P12 = Pin(name = "M0_0",                         memory = NA)
      val E12 = Pin(name = "TMS_0",                        memory = NA)
      val P9  = Pin(name = "PROGRAM_B_0",                  memory = NA)
      val P8  = Pin(name = "CFGBVS_0",                     memory = NA)
      val P11 = Pin(name = "M2_0",                         memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val DONE_0                       = P10
      val TCK_0                        = E10
      val VCCBATT_0                    = E8
      val VN_0                         = K9
      val VREFP_0                      = K10
      val GNDADC_0                     = H9
      val VCCADC_0                     = H10
      val DXP_0                        = L10
      val CCLK_0                       = E9
      val VP_0                         = J10
      val VREFN_0                      = J9
      val DXN_0                        = L9
      val TDO_0                        = E13
      val TDI_0                        = E11
      val INIT_B_0                     = P7
      val M1_0                         = P13
      val M0_0                         = P12
      val TMS_0                        = E12
      val PROGRAM_B_0                  = P9
      val CFGBVS_0                     = P8
      val M2_0                         = P11
    end byName
  end Bank0
  val bank0 = new Bank0

  class Bank14 extends Bank(HR):
    object pins:
      val R11 = Pin(name = "IO_0_14",                      memory = NA)
      val K17 = Pin(name = "IO_L1P_T0_D00_MOSI_14",        memory = 0)
      val K18 = Pin(name = "IO_L1N_T0_D01_DIN_14",         memory = 0)
      val L14 = Pin(name = "IO_L2P_T0_D02_14",             memory = 0)
      val M14 = Pin(name = "IO_L2N_T0_D03_14",             memory = 0)
      val L15 = Pin(name = "IO_L3P_T0_DQS_PUDC_B_14",      memory = 0)
      val L16 = Pin(name = "IO_L3N_T0_DQS_EMCCLK_14",      memory = 0)
      val L18 = Pin(name = "IO_L4P_T0_D04_14",             memory = 0)
      val M18 = Pin(name = "IO_L4N_T0_D05_14",             memory = 0)
      val R12 = Pin(name = "IO_L5P_T0_D06_14",             memory = 0)
      val R13 = Pin(name = "IO_L5N_T0_D07_14",             memory = 0)
      val L13 = Pin(name = "IO_L6P_T0_FCS_B_14",           memory = 0)
      val M13 = Pin(name = "IO_L6N_T0_D08_VREF_14",        memory = 0)
      val R18 = Pin(name = "IO_L7P_T1_D09_14",             memory = 1)
      val T18 = Pin(name = "IO_L7N_T1_D10_14",             memory = 1)
      val N14 = Pin(name = "IO_L8P_T1_D11_14",             memory = 1)
      val P14 = Pin(name = "IO_L8N_T1_D12_14",             memory = 1)
      val N17 = Pin(name = "IO_L9P_T1_DQS_14",             memory = 1)
      val P18 = Pin(name = "IO_L9N_T1_DQS_D13_14",         memory = 1)
      val M16 = Pin(name = "IO_L10P_T1_D14_14",            memory = 1)
      val M17 = Pin(name = "IO_L10N_T1_D15_14",            memory = 1)
      val N15 = Pin(name = "IO_L11P_T1_SRCC_14",           memory = 1)
      val N16 = Pin(name = "IO_L11N_T1_SRCC_14",           memory = 1)
      val P17 = Pin(name = "IO_L12P_T1_MRCC_14",           memory = 1)
      val R17 = Pin(name = "IO_L12N_T1_MRCC_14",           memory = 1)
      val P15 = Pin(name = "IO_L13P_T2_MRCC_14",           memory = 2)
      val R15 = Pin(name = "IO_L13N_T2_MRCC_14",           memory = 2)
      val T14 = Pin(name = "IO_L14P_T2_SRCC_14",           memory = 2)
      val T15 = Pin(name = "IO_L14N_T2_SRCC_14",           memory = 2)
      val R16 = Pin(name = "IO_L15P_T2_DQS_RDWR_B_14",     memory = 2)
      val T16 = Pin(name = "IO_L15N_T2_DQS_DOUT_CSO_B_14", memory = 2)
      val V15 = Pin(name = "IO_L16P_T2_CSI_B_14",          memory = 2)
      val V16 = Pin(name = "IO_L16N_T2_A15_D31_14",        memory = 2)
      val U17 = Pin(name = "IO_L17P_T2_A14_D30_14",        memory = 2)
      val U18 = Pin(name = "IO_L17N_T2_A13_D29_14",        memory = 2)
      val U16 = Pin(name = "IO_L18P_T2_A12_D28_14",        memory = 2)
      val V17 = Pin(name = "IO_L18N_T2_A11_D27_14",        memory = 2)
      val T11 = Pin(name = "IO_L19P_T3_A10_D26_14",        memory = 3)
      val U11 = Pin(name = "IO_L19N_T3_A09_D25_VREF_14",   memory = 3)
      val U12 = Pin(name = "IO_L20P_T3_A08_D24_14",        memory = 3)
      val V12 = Pin(name = "IO_L20N_T3_A07_D23_14",        memory = 3)
      val V10 = Pin(name = "IO_L21P_T3_DQS_14",            memory = 3)
      val V11 = Pin(name = "IO_L21N_T3_DQS_A06_D22_14",    memory = 3)
      val U14 = Pin(name = "IO_L22P_T3_A05_D21_14",        memory = 3)
      val V14 = Pin(name = "IO_L22N_T3_A04_D20_14",        memory = 3)
      val T13 = Pin(name = "IO_L23P_T3_A03_D19_14",        memory = 3)
      val U13 = Pin(name = "IO_L23N_T3_A02_D18_14",        memory = 3)
      val T9  = Pin(name = "IO_L24P_T3_A01_D17_14",        memory = 3)
      val T10 = Pin(name = "IO_L24N_T3_A00_D16_14",        memory = 3)
      val R10 = Pin(name = "IO_25_14",                     memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_0_14                      = R11
      val IO_L1P_T0_D00_MOSI_14        = K17
      val IO_L1N_T0_D01_DIN_14         = K18
      val IO_L1_14                     = DiffPair(IO_L1P_T0_D00_MOSI_14, IO_L1N_T0_D01_DIN_14)
      val IO_L2P_T0_D02_14             = L14
      val IO_L2N_T0_D03_14             = M14
      val IO_L2_T0_14                  = DiffPair(IO_L2P_T0_D02_14, IO_L2N_T0_D03_14)
      val IO_L3P_T0_DQS_PUDC_B_14      = L15
      val IO_L3N_T0_DQS_EMCCLK_14      = L16
      val IO_L3_T0_DQS_14              = DiffPair(IO_L3P_T0_DQS_PUDC_B_14, IO_L3N_T0_DQS_EMCCLK_14)
      val IO_L4P_T0_D04_14             = L18
      val IO_L4N_T0_D05_14             = M18
      val IO_L4_T0_14                  = DiffPair(IO_L4P_T0_D04_14, IO_L4N_T0_D05_14)
      val IO_L5P_T0_D06_14             = R12
      val IO_L5N_T0_D07_14             = R13
      val IO_L5_T0_14                  = DiffPair(IO_L5P_T0_D06_14, IO_L5N_T0_D07_14)
      val IO_L6P_T0_FCS_B_14           = L13
      val IO_L6N_T0_D08_VREF_14        = M13
      val IO_L6_T0_14                  = DiffPair(IO_L6P_T0_FCS_B_14, IO_L6N_T0_D08_VREF_14)
      val IO_L7P_T1_D09_14             = R18
      val IO_L7N_T1_D10_14             = T18
      val IO_L7_T1_14                  = DiffPair(IO_L7P_T1_D09_14, IO_L7N_T1_D10_14)
      val IO_L8P_T1_D11_14             = N14
      val IO_L8N_T1_D12_14             = P14
      val IO_L8_T1_14                  = DiffPair(IO_L8P_T1_D11_14, IO_L8N_T1_D12_14)
      val IO_L9P_T1_DQS_14             = N17
      val IO_L9N_T1_DQS_D13_14         = P18
      val IO_L9_T1_DQS_14              = DiffPair(IO_L9P_T1_DQS_14, IO_L9N_T1_DQS_D13_14)
      val IO_L10P_T1_D14_14            = M16
      val IO_L10N_T1_D15_14            = M17
      val IO_L10_T1_14                 = DiffPair(IO_L10P_T1_D14_14, IO_L10N_T1_D15_14)
      val IO_L11P_T1_SRCC_14           = N15
      val IO_L11N_T1_SRCC_14           = N16
      val IO_L11_T1_SRCC_14            = DiffPair(IO_L11P_T1_SRCC_14, IO_L11N_T1_SRCC_14)
      val IO_L12P_T1_MRCC_14           = P17
      val IO_L12N_T1_MRCC_14           = R17
      val IO_L12_T1_MRCC_14            = DiffPair(IO_L12P_T1_MRCC_14, IO_L12N_T1_MRCC_14)
      val IO_L13P_T2_MRCC_14           = P15
      val IO_L13N_T2_MRCC_14           = R15
      val IO_L13_T2_MRCC_14            = DiffPair(IO_L13P_T2_MRCC_14, IO_L13N_T2_MRCC_14)
      val IO_L14P_T2_SRCC_14           = T14
      val IO_L14N_T2_SRCC_14           = T15
      val IO_L14_T2_SRCC_14            = DiffPair(IO_L14P_T2_SRCC_14, IO_L14N_T2_SRCC_14)
      val IO_L15P_T2_DQS_RDWR_B_14     = R16
      val IO_L15N_T2_DQS_DOUT_CSO_B_14 = T16
      val IO_L15_T2_DQS_14             = DiffPair(IO_L15P_T2_DQS_RDWR_B_14, IO_L15N_T2_DQS_DOUT_CSO_B_14)
      val IO_L16P_T2_CSI_B_14          = V15
      val IO_L16N_T2_A15_D31_14        = V16
      val IO_L16_T2_14                 = DiffPair(IO_L16P_T2_CSI_B_14, IO_L16N_T2_A15_D31_14)
      val IO_L17P_T2_A14_D30_14        = U17
      val IO_L17N_T2_A13_D29_14        = U18
      val IO_L17_T2_14                 = DiffPair(IO_L17P_T2_A14_D30_14, IO_L17N_T2_A13_D29_14)
      val IO_L18P_T2_A12_D28_14        = U16
      val IO_L18N_T2_A11_D27_14        = V17
      val IO_L18_T2_14                 = DiffPair(IO_L18P_T2_A12_D28_14, IO_L18N_T2_A11_D27_14)
      val IO_L19P_T3_A10_D26_14        = T11
      val IO_L19N_T3_A09_D25_VREF_14   = U11
      val IO_L19_T3_14                 = DiffPair(IO_L19P_T3_A10_D26_14, IO_L19N_T3_A09_D25_VREF_14)
      val IO_L20P_T3_A08_D24_14        = U12
      val IO_L20N_T3_A07_D23_14        = V12
      val IO_L20_T3_14                 = DiffPair(IO_L20P_T3_A08_D24_14, IO_L20N_T3_A07_D23_14)
      val IO_L21P_T3_DQS_14            = V10
      val IO_L21N_T3_DQS_A06_D22_14    = V11
      val IO_L21_T3_DQS_14             = DiffPair(IO_L21P_T3_DQS_14, IO_L21N_T3_DQS_A06_D22_14)
      val IO_L22P_T3_A05_D21_14        = U14
      val IO_L22N_T3_A04_D20_14        = V14
      val IO_L22_T3_14                 = DiffPair(IO_L22P_T3_A05_D21_14, IO_L22N_T3_A04_D20_14)
      val IO_L23P_T3_A03_D19_14        = T13
      val IO_L23N_T3_A02_D18_14        = U13
      val IO_L23_T3_14                 = DiffPair(IO_L23P_T3_A03_D19_14, IO_L23N_T3_A02_D18_14)
      val IO_L24P_T3_A01_D17_14        = T9
      val IO_L24N_T3_A00_D16_14        = T10
      val IO_L24_T3_14                 = DiffPair(IO_L24P_T3_A01_D17_14, IO_L24N_T3_A00_D16_14)
      val IO_25_14                     = R10
    end byName
  end Bank14
  val bank14 = new Bank14

  class Bank15 extends Bank(HR):
    object pins:
      val G13 = Pin(name = "IO_0_15",                      memory = NA)
      val D14 = Pin(name = "IO_L1P_T0_AD0P_15",            memory = 0)
      val C14 = Pin(name = "IO_L1N_T0_AD0N_15",            memory = 0)
      val B13 = Pin(name = "IO_L2P_T0_AD8P_15",            memory = 0)
      val B14 = Pin(name = "IO_L2N_T0_AD8N_15",            memory = 0)
      val C12 = Pin(name = "IO_L3P_T0_DQS_AD1P_15",        memory = 0)
      val B12 = Pin(name = "IO_L3N_T0_DQS_AD1N_15",        memory = 0)
      val B11 = Pin(name = "IO_L4P_T0_15",                 memory = 0)
      val A11 = Pin(name = "IO_L4N_T0_15",                 memory = 0)
      val F13 = Pin(name = "IO_L5P_T0_AD9P_15",            memory = 0)
      val F14 = Pin(name = "IO_L5N_T0_AD9N_15",            memory = 0)
      val D12 = Pin(name = "IO_L6P_T0_15",                 memory = 0)
      val D13 = Pin(name = "IO_L6N_T0_VREF_15",            memory = 0)
      val B16 = Pin(name = "IO_L7P_T1_AD2P_15",            memory = 1)
      val B17 = Pin(name = "IO_L7N_T1_AD2N_15",            memory = 1)
      val A15 = Pin(name = "IO_L8P_T1_AD10P_15",           memory = 1)
      val A16 = Pin(name = "IO_L8N_T1_AD10N_15",           memory = 1)
      val A13 = Pin(name = "IO_L9P_T1_DQS_AD3P_15",        memory = 1)
      val A14 = Pin(name = "IO_L9N_T1_DQS_AD3N_15",        memory = 1)
      val B18 = Pin(name = "IO_L10P_T1_AD11P_15",          memory = 1)
      val A18 = Pin(name = "IO_L10N_T1_AD11N_15",          memory = 1)
      val E15 = Pin(name = "IO_L11P_T1_SRCC_15",           memory = 1)
      val E16 = Pin(name = "IO_L11N_T1_SRCC_15",           memory = 1)
      val D15 = Pin(name = "IO_L12P_T1_MRCC_15",           memory = 1)
      val C15 = Pin(name = "IO_L12N_T1_MRCC_15",           memory = 1)
      val H16 = Pin(name = "IO_L13P_T2_MRCC_15",           memory = 2)
      val G16 = Pin(name = "IO_L13N_T2_MRCC_15",           memory = 2)
      val F15 = Pin(name = "IO_L14P_T2_SRCC_15",           memory = 2)
      val F16 = Pin(name = "IO_L14N_T2_SRCC_15",           memory = 2)
      val H14 = Pin(name = "IO_L15P_T2_DQS_15",            memory = 2)
      val G14 = Pin(name = "IO_L15N_T2_DQS_ADV_B_15",      memory = 2)
      val E17 = Pin(name = "IO_L16P_T2_A28_15",            memory = 2)
      val D17 = Pin(name = "IO_L16N_T2_A27_15",            memory = 2)
      val K13 = Pin(name = "IO_L17P_T2_A26_15",            memory = 2)
      val J13 = Pin(name = "IO_L17N_T2_A25_15",            memory = 2)
      val H17 = Pin(name = "IO_L18P_T2_A24_15",            memory = 2)
      val G17 = Pin(name = "IO_L18N_T2_A23_15",            memory = 2)
      val J14 = Pin(name = "IO_L19P_T3_A22_15",            memory = 3)
      val H15 = Pin(name = "IO_L19N_T3_A21_VREF_15",       memory = 3)
      val C16 = Pin(name = "IO_L20P_T3_A20_15",            memory = 3)
      val C17 = Pin(name = "IO_L20N_T3_A19_15",            memory = 3)
      val E18 = Pin(name = "IO_L21P_T3_DQS_15",            memory = 3)
      val D18 = Pin(name = "IO_L21N_T3_DQS_A18_15",        memory = 3)
      val G18 = Pin(name = "IO_L22P_T3_A17_15",            memory = 3)
      val F18 = Pin(name = "IO_L22N_T3_A16_15",            memory = 3)
      val J17 = Pin(name = "IO_L23P_T3_FOE_B_15",          memory = 3)
      val J18 = Pin(name = "IO_L23N_T3_FWE_B_15",          memory = 3)
      val K15 = Pin(name = "IO_L24P_T3_RS1_15",            memory = 3)
      val J15 = Pin(name = "IO_L24N_T3_RS0_15",            memory = 3)
      val K16 = Pin(name = "IO_25_15",                     memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_0_15                      = G13
      val IO_L1P_T0_AD0P_15            = D14
      val IO_L1N_T0_AD0N_15            = C14
      val IO_L1_T0_AD0_15              = DiffPair(IO_L1P_T0_AD0P_15, IO_L1N_T0_AD0N_15)
      val IO_L2P_T0_AD8P_15            = B13
      val IO_L2N_T0_AD8N_15            = B14
      val IO_L2_T0_AD8_15              = DiffPair(IO_L2P_T0_AD8P_15, IO_L2N_T0_AD8N_15)
      val IO_L3P_T0_DQS_AD1P_15        = C12
      val IO_L3N_T0_DQS_AD1N_15        = B12
      val IO_L3_T0_DQS_AD1_15          = DiffPair(IO_L3P_T0_DQS_AD1P_15, IO_L3N_T0_DQS_AD1N_15)
      val IO_L4P_T0_15                 = B11
      val IO_L4N_T0_15                 = A11
      val IO_L4_T0_15                  = DiffPair(IO_L4P_T0_15, IO_L4N_T0_15)
      val IO_L5P_T0_AD9P_15            = F13
      val IO_L5N_T0_AD9N_15            = F14
      val IO_L5_T0_AD9_15              = DiffPair(IO_L5P_T0_AD9P_15, IO_L5N_T0_AD9N_15)
      val IO_L6P_T0_15                 = D12
      val IO_L6N_T0_VREF_15            = D13
      val IO_L6_T0_15                  = DiffPair(IO_L6P_T0_15, IO_L6N_T0_VREF_15)
      val IO_L7P_T1_AD2P_15            = B16
      val IO_L7N_T1_AD2N_15            = B17
      val IO_L7_T1_AD2_15              = DiffPair(IO_L7P_T1_AD2P_15, IO_L7N_T1_AD2N_15)
      val IO_L8P_T1_AD10P_15           = A15
      val IO_L8N_T1_AD10N_15           = A16
      val IO_L8_T1_AD10_15             = DiffPair(IO_L8P_T1_AD10P_15, IO_L8N_T1_AD10N_15)
      val IO_L9P_T1_DQS_AD3P_15        = A13
      val IO_L9N_T1_DQS_AD3N_15        = A14
      val IO_L9_T1_DQS_AD3_15          = DiffPair(IO_L9P_T1_DQS_AD3P_15, IO_L9N_T1_DQS_AD3N_15)
      val IO_L10P_T1_AD11P_15          = B18
      val IO_L10N_T1_AD11N_15          = A18
      val IO_L10_T1_AD11_15            = DiffPair(IO_L10P_T1_AD11P_15, IO_L10N_T1_AD11N_15)
      val IO_L11P_T1_SRCC_15           = E15
      val IO_L11N_T1_SRCC_15           = E16
      val IO_L11_T1_SRCC_15            = DiffPair(IO_L11P_T1_SRCC_15, IO_L11N_T1_SRCC_15)
      val IO_L12P_T1_MRCC_15           = D15
      val IO_L12N_T1_MRCC_15           = C15
      val IO_L12_T1_MRCC_15            = DiffPair(IO_L12P_T1_MRCC_15, IO_L12N_T1_MRCC_15)
      val IO_L13P_T2_MRCC_15           = H16
      val IO_L13N_T2_MRCC_15           = G16
      val IO_L13_T2_MRCC_15            = DiffPair(IO_L13P_T2_MRCC_15, IO_L13N_T2_MRCC_15)
      val IO_L14P_T2_SRCC_15           = F15
      val IO_L14N_T2_SRCC_15           = F16
      val IO_L14_T2_SRCC_15            = DiffPair(IO_L14P_T2_SRCC_15, IO_L14N_T2_SRCC_15)
      val IO_L15P_T2_DQS_15            = H14
      val IO_L15N_T2_DQS_ADV_B_15      = G14
      val IO_L15_T2_DQS_15             = DiffPair(IO_L15P_T2_DQS_15, IO_L15N_T2_DQS_ADV_B_15)
      val IO_L16P_T2_A28_15            = E17
      val IO_L16N_T2_A27_15            = D17
      val IO_L16_T2_15                 = DiffPair(IO_L16P_T2_A28_15, IO_L16N_T2_A27_15)
      val IO_L17P_T2_A26_15            = K13
      val IO_L17N_T2_A25_15            = J13
      val IO_L17_T2_15                 = DiffPair(IO_L17P_T2_A26_15, IO_L17N_T2_A25_15)
      val IO_L18P_T2_A24_15            = H17
      val IO_L18N_T2_A23_15            = G17
      val IO_L18_T2_15                 = DiffPair(IO_L18P_T2_A24_15, IO_L18N_T2_A23_15)
      val IO_L19P_T3_A22_15            = J14
      val IO_L19N_T3_A21_VREF_15       = H15
      val IO_L19_T3_15                 = DiffPair(IO_L19P_T3_A22_15, IO_L19N_T3_A21_VREF_15)
      val IO_L20P_T3_A20_15            = C16
      val IO_L20N_T3_A19_15            = C17
      val IO_L20_T3_15                 = DiffPair(IO_L20P_T3_A20_15, IO_L20N_T3_A19_15)
      val IO_L21P_T3_DQS_15            = E18
      val IO_L21N_T3_DQS_A18_15        = D18
      val IO_L21_T3_DQS_15             = DiffPair(IO_L21P_T3_DQS_15, IO_L21N_T3_DQS_A18_15)
      val IO_L22P_T3_A17_15            = G18
      val IO_L22N_T3_A16_15            = F18
      val IO_L22_T3_15                 = DiffPair(IO_L22P_T3_A17_15, IO_L22N_T3_A16_15)
      val IO_L23P_T3_FOE_B_15          = J17
      val IO_L23N_T3_FWE_B_15          = J18
      val IO_L23_T3_15                 = DiffPair(IO_L23P_T3_FOE_B_15, IO_L23N_T3_FWE_B_15)
      val IO_L24P_T3_RS1_15            = K15
      val IO_L24N_T3_RS0_15            = J15
      val IO_L24_T3_15                 = DiffPair(IO_L24P_T3_RS1_15, IO_L24N_T3_RS0_15)
      val IO_25_15                     = K16
    end byName
  end Bank15
  val bank15 = new Bank15

  class Bank16 extends Bank(HR):
    object pins:
      val D9  = Pin(name = "IO_L6N_T0_VREF_16",            memory = 0)
      val C9  = Pin(name = "IO_L11P_T1_SRCC_16",           memory = 1)
      val B9  = Pin(name = "IO_L11N_T1_SRCC_16",           memory = 1)
      val B8  = Pin(name = "IO_L12P_T1_MRCC_16",           memory = 1)
      val A8  = Pin(name = "IO_L12N_T1_MRCC_16",           memory = 1)
      val C11 = Pin(name = "IO_L13P_T2_MRCC_16",           memory = 2)
      val C10 = Pin(name = "IO_L13N_T2_MRCC_16",           memory = 2)
      val A10 = Pin(name = "IO_L14P_T2_SRCC_16",           memory = 2)
      val A9  = Pin(name = "IO_L14N_T2_SRCC_16",           memory = 2)
      val D10 = Pin(name = "IO_L19N_T3_VREF_16",           memory = 3)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_L6N_T0_VREF_16            = D9
      val IO_L11P_T1_SRCC_16           = C9
      val IO_L11N_T1_SRCC_16           = B9
      val IO_L11_T1_SRCC_16            = DiffPair(IO_L11P_T1_SRCC_16, IO_L11N_T1_SRCC_16)
      val IO_L12P_T1_MRCC_16           = B8
      val IO_L12N_T1_MRCC_16           = A8
      val IO_L12_T1_MRCC_16            = DiffPair(IO_L12P_T1_MRCC_16, IO_L12N_T1_MRCC_16)
      val IO_L13P_T2_MRCC_16           = C11
      val IO_L13N_T2_MRCC_16           = C10
      val IO_L13_T2_MRCC_16            = DiffPair(IO_L13P_T2_MRCC_16, IO_L13N_T2_MRCC_16)
      val IO_L14P_T2_SRCC_16           = A10
      val IO_L14N_T2_SRCC_16           = A9
      val IO_L14_T2_SRCC_16            = DiffPair(IO_L14P_T2_SRCC_16, IO_L14N_T2_SRCC_16)
      val IO_L19N_T3_VREF_16           = D10
    end byName
  end Bank16
  val bank16 = new Bank16

  class Bank34 extends Bank(HR):
    object pins:
      val K6  = Pin(name = "IO_0_34",                      memory = NA)
      val L1  = Pin(name = "IO_L1P_T0_34",                 memory = 0)
      val M1  = Pin(name = "IO_L1N_T0_34",                 memory = 0)
      val K3  = Pin(name = "IO_L2P_T0_34",                 memory = 0)
      val L3  = Pin(name = "IO_L2N_T0_34",                 memory = 0)
      val N2  = Pin(name = "IO_L3P_T0_DQS_34",             memory = 0)
      val N1  = Pin(name = "IO_L3N_T0_DQS_34",             memory = 0)
      val M3  = Pin(name = "IO_L4P_T0_34",                 memory = 0)
      val M2  = Pin(name = "IO_L4N_T0_34",                 memory = 0)
      val K5  = Pin(name = "IO_L5P_T0_34",                 memory = 0)
      val L4  = Pin(name = "IO_L5N_T0_34",                 memory = 0)
      val L6  = Pin(name = "IO_L6P_T0_34",                 memory = 0)
      val L5  = Pin(name = "IO_L6N_T0_VREF_34",            memory = 0)
      val U1  = Pin(name = "IO_L7P_T1_34",                 memory = 1)
      val V1  = Pin(name = "IO_L7N_T1_34",                 memory = 1)
      val U4  = Pin(name = "IO_L8P_T1_34",                 memory = 1)
      val U3  = Pin(name = "IO_L8N_T1_34",                 memory = 1)
      val U2  = Pin(name = "IO_L9P_T1_DQS_34",             memory = 1)
      val V2  = Pin(name = "IO_L9N_T1_DQS_34",             memory = 1)
      val V5  = Pin(name = "IO_L10P_T1_34",                memory = 1)
      val V4  = Pin(name = "IO_L10N_T1_34",                memory = 1)
      val R3  = Pin(name = "IO_L11P_T1_SRCC_34",           memory = 1)
      val T3  = Pin(name = "IO_L11N_T1_SRCC_34",           memory = 1)
      val T5  = Pin(name = "IO_L12P_T1_MRCC_34",           memory = 1)
      val T4  = Pin(name = "IO_L12N_T1_MRCC_34",           memory = 1)
      val N5  = Pin(name = "IO_L13P_T2_MRCC_34",           memory = 2)
      val P5  = Pin(name = "IO_L13N_T2_MRCC_34",           memory = 2)
      val P4  = Pin(name = "IO_L14P_T2_SRCC_34",           memory = 2)
      val P3  = Pin(name = "IO_L14N_T2_SRCC_34",           memory = 2)
      val P2  = Pin(name = "IO_L15P_T2_DQS_34",            memory = 2)
      val R2  = Pin(name = "IO_L15N_T2_DQS_34",            memory = 2)
      val M4  = Pin(name = "IO_L16P_T2_34",                memory = 2)
      val N4  = Pin(name = "IO_L16N_T2_34",                memory = 2)
      val R1  = Pin(name = "IO_L17P_T2_34",                memory = 2)
      val T1  = Pin(name = "IO_L17N_T2_34",                memory = 2)
      val M6  = Pin(name = "IO_L18P_T2_34",                memory = 2)
      val N6  = Pin(name = "IO_L18N_T2_34",                memory = 2)
      val R6  = Pin(name = "IO_L19P_T3_34",                memory = 3)
      val R5  = Pin(name = "IO_L19N_T3_VREF_34",           memory = 3)
      val V7  = Pin(name = "IO_L20P_T3_34",                memory = 3)
      val V6  = Pin(name = "IO_L20N_T3_34",                memory = 3)
      val U9  = Pin(name = "IO_L21P_T3_DQS_34",            memory = 3)
      val V9  = Pin(name = "IO_L21N_T3_DQS_34",            memory = 3)
      val U7  = Pin(name = "IO_L22P_T3_34",                memory = 3)
      val U6  = Pin(name = "IO_L22N_T3_34",                memory = 3)
      val R7  = Pin(name = "IO_L23P_T3_34",                memory = 3)
      val T6  = Pin(name = "IO_L23N_T3_34",                memory = 3)
      val R8  = Pin(name = "IO_L24P_T3_34",                memory = 3)
      val T8  = Pin(name = "IO_L24N_T3_34",                memory = 3)
      val U8  = Pin(name = "IO_25_34",                     memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_0_34                      = K6
      val IO_L1P_T0_34                 = L1
      val IO_L1N_T0_34                 = M1
      val IO_L1_T0_34                  = DiffPair(IO_L1P_T0_34, IO_L1N_T0_34)
      val IO_L2P_T0_34                 = K3
      val IO_L2N_T0_34                 = L3
      val IO_L2_T0_34                  = DiffPair(IO_L2P_T0_34, IO_L2N_T0_34)
      val IO_L3P_T0_DQS_34             = N2
      val IO_L3N_T0_DQS_34             = N1
      val IO_L3_T0_DQS_34              = DiffPair(IO_L3P_T0_DQS_34, IO_L3N_T0_DQS_34)
      val IO_L4P_T0_34                 = M3
      val IO_L4N_T0_34                 = M2
      val IO_L4_T0_34                  = DiffPair(IO_L4P_T0_34, IO_L4N_T0_34)
      val IO_L5P_T0_34                 = K5
      val IO_L5N_T0_34                 = L4
      val IO_L5_T0_34                  = DiffPair(IO_L5P_T0_34, IO_L5N_T0_34)
      val IO_L6P_T0_34                 = L6
      val IO_L6N_T0_VREF_34            = L5
      val IO_L6_T0_34                  = DiffPair(IO_L6P_T0_34, IO_L6N_T0_VREF_34)
      val IO_L7P_T1_34                 = U1
      val IO_L7N_T1_34                 = V1
      val IO_L7_T1_34                  = DiffPair(IO_L7P_T1_34, IO_L7N_T1_34)
      val IO_L8P_T1_34                 = U4
      val IO_L8N_T1_34                 = U3
      val IO_L8_T1_34                  = DiffPair(IO_L8P_T1_34, IO_L8N_T1_34)
      val IO_L9P_T1_DQS_34             = U2
      val IO_L9N_T1_DQS_34             = V2
      val IO_L9_T1_DQS_34              = DiffPair(IO_L9P_T1_DQS_34, IO_L9N_T1_DQS_34)
      val IO_L10P_T1_34                = V5
      val IO_L10N_T1_34                = V4
      val IO_L10_T1_34                 = DiffPair(IO_L10P_T1_34, IO_L10N_T1_34)
      val IO_L11P_T1_SRCC_34           = R3
      val IO_L11N_T1_SRCC_34           = T3
      val IO_L11_T1_SRCC_34            = DiffPair(IO_L11P_T1_SRCC_34, IO_L11N_T1_SRCC_34)
      val IO_L12P_T1_MRCC_34           = T5
      val IO_L12N_T1_MRCC_34           = T4
      val IO_L12_T1_MRCC_34            = DiffPair(IO_L12P_T1_MRCC_34, IO_L12N_T1_MRCC_34)
      val IO_L13P_T2_MRCC_34           = N5
      val IO_L13N_T2_MRCC_34           = P5
      val IO_L13_T2_MRCC_34            = DiffPair(IO_L13P_T2_MRCC_34, IO_L13N_T2_MRCC_34)
      val IO_L14P_T2_SRCC_34           = P4
      val IO_L14N_T2_SRCC_34           = P3
      val IO_L14_T2_SRCC_34            = DiffPair(IO_L14P_T2_SRCC_34, IO_L14N_T2_SRCC_34)
      val IO_L15P_T2_DQS_34            = P2
      val IO_L15N_T2_DQS_34            = R2
      val IO_L15_T2_DQS_34             = DiffPair(IO_L15P_T2_DQS_34, IO_L15N_T2_DQS_34)
      val IO_L16P_T2_34                = M4
      val IO_L16N_T2_34                = N4
      val IO_L16_T2_34                 = DiffPair(IO_L16P_T2_34, IO_L16N_T2_34)
      val IO_L17P_T2_34                = R1
      val IO_L17N_T2_34                = T1
      val IO_L17_T2_34                 = DiffPair(IO_L17P_T2_34, IO_L17N_T2_34)
      val IO_L18P_T2_34                = M6
      val IO_L18N_T2_34                = N6
      val IO_L18_T2_34                 = DiffPair(IO_L18P_T2_34, IO_L18N_T2_34)
      val IO_L19P_T3_34                = R6
      val IO_L19N_T3_VREF_34           = R5
      val IO_L19_T3_34                 = DiffPair(IO_L19P_T3_34, IO_L19N_T3_VREF_34)
      val IO_L20P_T3_34                = V7
      val IO_L20N_T3_34                = V6
      val IO_L20_T3_34                 = DiffPair(IO_L20P_T3_34, IO_L20N_T3_34)
      val IO_L21P_T3_DQS_34            = U9
      val IO_L21N_T3_DQS_34            = V9
      val IO_L21_T3_DQS_34             = DiffPair(IO_L21P_T3_DQS_34, IO_L21N_T3_DQS_34)
      val IO_L22P_T3_34                = U7
      val IO_L22N_T3_34                = U6
      val IO_L22_T3_34                 = DiffPair(IO_L22P_T3_34, IO_L22N_T3_34)
      val IO_L23P_T3_34                = R7
      val IO_L23N_T3_34                = T6
      val IO_L23_T3_34                 = DiffPair(IO_L23P_T3_34, IO_L23N_T3_34)
      val IO_L24P_T3_34                = R8
      val IO_L24N_T3_34                = T8
      val IO_L24_T3_34                 = DiffPair(IO_L24P_T3_34, IO_L24N_T3_34)
      val IO_25_34                     = U8
    end byName
  end Bank34
  val bank34 = new Bank34

  class Bank35 extends Bank(HR):
    object pins:
      val F5  = Pin(name = "IO_0_35",                      memory = NA)
      val C6  = Pin(name = "IO_L1P_T0_AD4P_35",            memory = 0)
      val C5  = Pin(name = "IO_L1N_T0_AD4N_35",            memory = 0)
      val B7  = Pin(name = "IO_L2P_T0_AD12P_35",           memory = 0)
      val B6  = Pin(name = "IO_L2N_T0_AD12N_35",           memory = 0)
      val A6  = Pin(name = "IO_L3P_T0_DQS_AD5P_35",        memory = 0)
      val A5  = Pin(name = "IO_L3N_T0_DQS_AD5N_35",        memory = 0)
      val D8  = Pin(name = "IO_L4P_T0_35",                 memory = 0)
      val C7  = Pin(name = "IO_L4N_T0_35",                 memory = 0)
      val E6  = Pin(name = "IO_L5P_T0_AD13P_35",           memory = 0)
      val E5  = Pin(name = "IO_L5N_T0_AD13N_35",           memory = 0)
      val E7  = Pin(name = "IO_L6P_T0_35",                 memory = 0)
      val D7  = Pin(name = "IO_L6N_T0_VREF_35",            memory = 0)
      val C4  = Pin(name = "IO_L7P_T1_AD6P_35",            memory = 1)
      val B4  = Pin(name = "IO_L7N_T1_AD6N_35",            memory = 1)
      val A4  = Pin(name = "IO_L8P_T1_AD14P_35",           memory = 1)
      val A3  = Pin(name = "IO_L8N_T1_AD14N_35",           memory = 1)
      val B1  = Pin(name = "IO_L9P_T1_DQS_AD7P_35",        memory = 1)
      val A1  = Pin(name = "IO_L9N_T1_DQS_AD7N_35",        memory = 1)
      val B3  = Pin(name = "IO_L10P_T1_AD15P_35",          memory = 1)
      val B2  = Pin(name = "IO_L10N_T1_AD15N_35",          memory = 1)
      val D5  = Pin(name = "IO_L11P_T1_SRCC_35",           memory = 1)
      val D4  = Pin(name = "IO_L11N_T1_SRCC_35",           memory = 1)
      val E3  = Pin(name = "IO_L12P_T1_MRCC_35",           memory = 1)
      val D3  = Pin(name = "IO_L12N_T1_MRCC_35",           memory = 1)
      val F4  = Pin(name = "IO_L13P_T2_MRCC_35",           memory = 2)
      val F3  = Pin(name = "IO_L13N_T2_MRCC_35",           memory = 2)
      val E2  = Pin(name = "IO_L14P_T2_SRCC_35",           memory = 2)
      val D2  = Pin(name = "IO_L14N_T2_SRCC_35",           memory = 2)
      val H2  = Pin(name = "IO_L15P_T2_DQS_35",            memory = 2)
      val G2  = Pin(name = "IO_L15N_T2_DQS_35",            memory = 2)
      val C2  = Pin(name = "IO_L16P_T2_35",                memory = 2)
      val C1  = Pin(name = "IO_L16N_T2_35",                memory = 2)
      val H1  = Pin(name = "IO_L17P_T2_35",                memory = 2)
      val G1  = Pin(name = "IO_L17N_T2_35",                memory = 2)
      val F1  = Pin(name = "IO_L18P_T2_35",                memory = 2)
      val E1  = Pin(name = "IO_L18N_T2_35",                memory = 2)
      val G6  = Pin(name = "IO_L19P_T3_35",                memory = 3)
      val F6  = Pin(name = "IO_L19N_T3_VREF_35",           memory = 3)
      val G4  = Pin(name = "IO_L20P_T3_35",                memory = 3)
      val G3  = Pin(name = "IO_L20N_T3_35",                memory = 3)
      val J4  = Pin(name = "IO_L21P_T3_DQS_35",            memory = 3)
      val H4  = Pin(name = "IO_L21N_T3_DQS_35",            memory = 3)
      val J3  = Pin(name = "IO_L22P_T3_35",                memory = 3)
      val J2  = Pin(name = "IO_L22N_T3_35",                memory = 3)
      val K2  = Pin(name = "IO_L23P_T3_35",                memory = 3)
      val K1  = Pin(name = "IO_L23N_T3_35",                memory = 3)
      val H6  = Pin(name = "IO_L24P_T3_35",                memory = 3)
      val H5  = Pin(name = "IO_L24N_T3_35",                memory = 3)
      val J5  = Pin(name = "IO_25_35",                     memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_0_35                      = F5
      val IO_L1P_T0_AD4P_35            = C6
      val IO_L1N_T0_AD4N_35            = C5
      val IO_L1_T0_AD4_35              = DiffPair(IO_L1P_T0_AD4P_35, IO_L1N_T0_AD4N_35)
      val IO_L2P_T0_AD12P_35           = B7
      val IO_L2N_T0_AD12N_35           = B6
      val IO_L2_T0_AD12_35             = DiffPair(IO_L2P_T0_AD12P_35, IO_L2N_T0_AD12N_35)
      val IO_L3P_T0_DQS_AD5P_35        = A6
      val IO_L3N_T0_DQS_AD5N_35        = A5
      val IO_L3_T0_DQS_AD5_35          = DiffPair(IO_L3P_T0_DQS_AD5P_35, IO_L3N_T0_DQS_AD5N_35)
      val IO_L4P_T0_35                 = D8
      val IO_L4N_T0_35                 = C7
      val IO_L4_T0_35                  = DiffPair(IO_L4P_T0_35, IO_L4N_T0_35)
      val IO_L5P_T0_AD13P_35           = E6
      val IO_L5N_T0_AD13N_35           = E5
      val IO_L5_T0_AD13_35             = DiffPair(IO_L5P_T0_AD13P_35, IO_L5N_T0_AD13N_35)
      val IO_L6P_T0_35                 = E7
      val IO_L6N_T0_VREF_35            = D7
      val IO_L6_T0_35                  = DiffPair(IO_L6P_T0_35, IO_L6N_T0_VREF_35)
      val IO_L7P_T1_AD6P_35            = C4
      val IO_L7N_T1_AD6N_35            = B4
      val IO_L7_T1_AD6_35              = DiffPair(IO_L7P_T1_AD6P_35, IO_L7N_T1_AD6N_35)
      val IO_L8P_T1_AD14P_35           = A4
      val IO_L8N_T1_AD14N_35           = A3
      val IO_L8_T1_AD14_35             = DiffPair(IO_L8P_T1_AD14P_35, IO_L8N_T1_AD14N_35)
      val IO_L9P_T1_DQS_AD7P_35        = B1
      val IO_L9N_T1_DQS_AD7N_35        = A1
      val IO_L9_T1_DQS_AD7_35          = DiffPair(IO_L9P_T1_DQS_AD7P_35, IO_L9N_T1_DQS_AD7N_35)
      val IO_L10P_T1_AD15P_35          = B3
      val IO_L10N_T1_AD15N_35          = B2
      val IO_L10_T1_AD15_35            = DiffPair(IO_L10P_T1_AD15P_35, IO_L10N_T1_AD15N_35)
      val IO_L11P_T1_SRCC_35           = D5
      val IO_L11N_T1_SRCC_35           = D4
      val IO_L11_T1_SRCC_35            = DiffPair(IO_L11P_T1_SRCC_35, IO_L11N_T1_SRCC_35)
      val IO_L12P_T1_MRCC_35           = E3
      val IO_L12N_T1_MRCC_35           = D3
      val IO_L12_T1_MRCC_35            = DiffPair(IO_L12P_T1_MRCC_35, IO_L12N_T1_MRCC_35)
      val IO_L13P_T2_MRCC_35           = F4
      val IO_L13N_T2_MRCC_35           = F3
      val IO_L13_T2_MRCC_35            = DiffPair(IO_L13P_T2_MRCC_35, IO_L13N_T2_MRCC_35)
      val IO_L14P_T2_SRCC_35           = E2
      val IO_L14N_T2_SRCC_35           = D2
      val IO_L14_T2_SRCC_35            = DiffPair(IO_L14P_T2_SRCC_35, IO_L14N_T2_SRCC_35)
      val IO_L15P_T2_DQS_35            = H2
      val IO_L15N_T2_DQS_35            = G2
      val IO_L15_T2_DQS_35             = DiffPair(IO_L15P_T2_DQS_35, IO_L15N_T2_DQS_35)
      val IO_L16P_T2_35                = C2
      val IO_L16N_T2_35                = C1
      val IO_L16_T2_35                 = DiffPair(IO_L16P_T2_35, IO_L16N_T2_35)
      val IO_L17P_T2_35                = H1
      val IO_L17N_T2_35                = G1
      val IO_L17_T2_35                 = DiffPair(IO_L17P_T2_35, IO_L17N_T2_35)
      val IO_L18P_T2_35                = F1
      val IO_L18N_T2_35                = E1
      val IO_L18_T2_35                 = DiffPair(IO_L18P_T2_35, IO_L18N_T2_35)
      val IO_L19P_T3_35                = G6
      val IO_L19N_T3_VREF_35           = F6
      val IO_L19_T3_35                 = DiffPair(IO_L19P_T3_35, IO_L19N_T3_VREF_35)
      val IO_L20P_T3_35                = G4
      val IO_L20N_T3_35                = G3
      val IO_L20_T3_35                 = DiffPair(IO_L20P_T3_35, IO_L20N_T3_35)
      val IO_L21P_T3_DQS_35            = J4
      val IO_L21N_T3_DQS_35            = H4
      val IO_L21_T3_DQS_35             = DiffPair(IO_L21P_T3_DQS_35, IO_L21N_T3_DQS_35)
      val IO_L22P_T3_35                = J3
      val IO_L22N_T3_35                = J2
      val IO_L22_T3_35                 = DiffPair(IO_L22P_T3_35, IO_L22N_T3_35)
      val IO_L23P_T3_35                = K2
      val IO_L23N_T3_35                = K1
      val IO_L23_T3_35                 = DiffPair(IO_L23P_T3_35, IO_L23N_T3_35)
      val IO_L24P_T3_35                = H6
      val IO_L24N_T3_35                = H5
      val IO_L24_T3_35                 = DiffPair(IO_L24P_T3_35, IO_L24N_T3_35)
      val IO_25_35                     = J5
    end byName
  end Bank35
  val bank35 = new Bank35

  object ios:
    export bank14.pins.*
    export bank15.pins.*
    export bank16.pins.*
    export bank34.pins.*
    export bank35.pins.*
    object byName:
      export bank14.byName.*
      export bank15.byName.*
      export bank16.byName.*
      export bank34.byName.*
      export bank35.byName.*
    end byName
  end ios
  ios // touch to force execution
end xc7a100tcsg324

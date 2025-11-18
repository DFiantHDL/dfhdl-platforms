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
 *
 * DISCLAIMER: This file contains a DFHDL wrapper around Xilinx/AMD IP/device
 * information. The wrapper code is licensed under Apache 2.0, but the
 * underlying Xilinx/AMD IP/device is subject to Xilinx/AMD's license terms.
 * Users must comply with Xilinx/AMD's End User License Agreement (EULA)
 * and license terms when using Xilinx/AMD products. This wrapper is provided
 * as-is without any warranty or guarantee of compatibility with Xilinx/AMD IP.
 */
package dfhdl.platforms.devices.xilinxamd.series7
import dfhdl.hw.constraints.*
import Pin.IOType.*
import Pin.NA

//format: off
class xc7a35tcpg236(val speedGrade: String) extends Device:
  final lazy val deviceName: String = "xc7a35t"
  final lazy val packageName: String = "cpg236"
  class Bank0 extends Bank(CONFIG):
    object pins:
      val U12 = Pin(name = "DONE_0",                       memory = NA)
      val A11 = Pin(name = "DXP_0",                        memory = NA)
      val C12 = Pin(name = "GNDADC_0",                     memory = NA)
      val C13 = Pin(name = "VCCADC_0",                     memory = NA)
      val B12 = Pin(name = "VREFP_0",                      memory = NA)
      val B13 = Pin(name = "VN_0",                         memory = NA)
      val C9  = Pin(name = "VCCBATT_0",                    memory = NA)
      val C8  = Pin(name = "TCK_0",                        memory = NA)
      val B11 = Pin(name = "DXN_0",                        memory = NA)
      val A13 = Pin(name = "VREFN_0",                      memory = NA)
      val A12 = Pin(name = "VP_0",                         memory = NA)
      val C11 = Pin(name = "CCLK_0",                       memory = NA)
      val V12 = Pin(name = "M0_0",                         memory = NA)
      val W11 = Pin(name = "M1_0",                         memory = NA)
      val U11 = Pin(name = "INIT_B_0",                     memory = NA)
      val W10 = Pin(name = "TDI_0",                        memory = NA)
      val W8  = Pin(name = "TDO_0",                        memory = NA)
      val U10 = Pin(name = "M2_0",                         memory = NA)
      val V11 = Pin(name = "CFGBVS_0",                     memory = NA)
      val V10 = Pin(name = "PROGRAM_B_0",                  memory = NA)
      val W9  = Pin(name = "TMS_0",                        memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val DONE_0                       = U12
      val DXP_0                        = A11
      val GNDADC_0                     = C12
      val VCCADC_0                     = C13
      val VREFP_0                      = B12
      val VN_0                         = B13
      val VCCBATT_0                    = C9
      val TCK_0                        = C8
      val DXN_0                        = B11
      val VREFN_0                      = A13
      val VP_0                         = A12
      val CCLK_0                       = C11
      val M0_0                         = V12
      val M1_0                         = W11
      val INIT_B_0                     = U11
      val TDI_0                        = W10
      val TDO_0                        = W8
      val M2_0                         = U10
      val CFGBVS_0                     = V11
      val PROGRAM_B_0                  = V10
      val TMS_0                        = W9
    end byName
  end Bank0
  val bank0 = new Bank0

  class Bank14 extends Bank(HR):
    object pins:
      val D17 = Pin(name = "IO_0_14",                      memory = NA)
      val D18 = Pin(name = "IO_L1P_T0_D00_MOSI_14",        memory = 0)
      val D19 = Pin(name = "IO_L1N_T0_D01_DIN_14",         memory = 0)
      val G18 = Pin(name = "IO_L2P_T0_D02_14",             memory = 0)
      val F18 = Pin(name = "IO_L2N_T0_D03_14",             memory = 0)
      val E18 = Pin(name = "IO_L3P_T0_DQS_PUDC_B_14",      memory = 0)
      val E19 = Pin(name = "IO_L3N_T0_DQS_EMCCLK_14",      memory = 0)
      val H19 = Pin(name = "IO_L4P_T0_D04_14",             memory = 0)
      val G19 = Pin(name = "IO_L4N_T0_D05_14",             memory = 0)
      val H17 = Pin(name = "IO_L5P_T0_D06_14",             memory = 0)
      val G17 = Pin(name = "IO_L5N_T0_D07_14",             memory = 0)
      val K19 = Pin(name = "IO_L6P_T0_FCS_B_14",           memory = 0)
      val J19 = Pin(name = "IO_L6N_T0_D08_VREF_14",        memory = 0)
      val J17 = Pin(name = "IO_L7P_T1_D09_14",             memory = 1)
      val J18 = Pin(name = "IO_L7N_T1_D10_14",             memory = 1)
      val L18 = Pin(name = "IO_L8P_T1_D11_14",             memory = 1)
      val K18 = Pin(name = "IO_L8N_T1_D12_14",             memory = 1)
      val N18 = Pin(name = "IO_L9P_T1_DQS_14",             memory = 1)
      val N19 = Pin(name = "IO_L9N_T1_DQS_D13_14",         memory = 1)
      val P19 = Pin(name = "IO_L10P_T1_D14_14",            memory = 1)
      val R19 = Pin(name = "IO_L10N_T1_D15_14",            memory = 1)
      val M18 = Pin(name = "IO_L11P_T1_SRCC_14",           memory = 1)
      val M19 = Pin(name = "IO_L11N_T1_SRCC_14",           memory = 1)
      val L17 = Pin(name = "IO_L12P_T1_MRCC_14",           memory = 1)
      val K17 = Pin(name = "IO_L12N_T1_MRCC_14",           memory = 1)
      val N17 = Pin(name = "IO_L13P_T2_MRCC_14",           memory = 2)
      val P17 = Pin(name = "IO_L13N_T2_MRCC_14",           memory = 2)
      val P18 = Pin(name = "IO_L14P_T2_SRCC_14",           memory = 2)
      val R18 = Pin(name = "IO_L14N_T2_SRCC_14",           memory = 2)
      val U19 = Pin(name = "IO_L15P_T2_DQS_RDWR_B_14",     memory = 2)
      val V19 = Pin(name = "IO_L15N_T2_DQS_DOUT_CSO_B_14", memory = 2)
      val W18 = Pin(name = "IO_L16P_T2_CSI_B_14",          memory = 2)
      val W19 = Pin(name = "IO_L16N_T2_A15_D31_14",        memory = 2)
      val T17 = Pin(name = "IO_L17P_T2_A14_D30_14",        memory = 2)
      val T18 = Pin(name = "IO_L17N_T2_A13_D29_14",        memory = 2)
      val U17 = Pin(name = "IO_L18P_T2_A12_D28_14",        memory = 2)
      val U18 = Pin(name = "IO_L18N_T2_A11_D27_14",        memory = 2)
      val V16 = Pin(name = "IO_L19P_T3_A10_D26_14",        memory = 3)
      val V17 = Pin(name = "IO_L19N_T3_A09_D25_VREF_14",   memory = 3)
      val W16 = Pin(name = "IO_L20P_T3_A08_D24_14",        memory = 3)
      val W17 = Pin(name = "IO_L20N_T3_A07_D23_14",        memory = 3)
      val V15 = Pin(name = "IO_L21P_T3_DQS_14",            memory = 3)
      val W15 = Pin(name = "IO_L21N_T3_DQS_A06_D22_14",    memory = 3)
      val W13 = Pin(name = "IO_L22P_T3_A05_D21_14",        memory = 3)
      val W14 = Pin(name = "IO_L22N_T3_A04_D20_14",        memory = 3)
      val U15 = Pin(name = "IO_L23P_T3_A03_D19_14",        memory = 3)
      val U16 = Pin(name = "IO_L23N_T3_A02_D18_14",        memory = 3)
      val V13 = Pin(name = "IO_L24P_T3_A01_D17_14",        memory = 3)
      val V14 = Pin(name = "IO_L24N_T3_A00_D16_14",        memory = 3)
      val U14 = Pin(name = "IO_25_14",                     memory = NA)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_0_14                      = D17
      val IO_L1P_T0_D00_MOSI_14        = D18
      val IO_L1N_T0_D01_DIN_14         = D19
      val IO_L1_T0_14                  = DiffPair(IO_L1P_T0_D00_MOSI_14, IO_L1N_T0_D01_DIN_14)
      val IO_L2P_T0_D02_14             = G18
      val IO_L2N_T0_D03_14             = F18
      val IO_L2_T0_14                  = DiffPair(IO_L2P_T0_D02_14, IO_L2N_T0_D03_14)
      val IO_L3P_T0_DQS_PUDC_B_14      = E18
      val IO_L3N_T0_DQS_EMCCLK_14      = E19
      val IO_L3_T0_DQS_14              = DiffPair(IO_L3P_T0_DQS_PUDC_B_14, IO_L3N_T0_DQS_EMCCLK_14)
      val IO_L4P_T0_D04_14             = H19
      val IO_L4N_T0_D05_14             = G19
      val IO_L4_T0_14                  = DiffPair(IO_L4P_T0_D04_14, IO_L4N_T0_D05_14)
      val IO_L5P_T0_D06_14             = H17
      val IO_L5N_T0_D07_14             = G17
      val IO_L5_T0_14                  = DiffPair(IO_L5P_T0_D06_14, IO_L5N_T0_D07_14)
      val IO_L6P_T0_FCS_B_14           = K19
      val IO_L6N_T0_D08_VREF_14        = J19
      val IO_L6_T0_14                  = DiffPair(IO_L6P_T0_FCS_B_14, IO_L6N_T0_D08_VREF_14)
      val IO_L7P_T1_D09_14             = J17
      val IO_L7N_T1_D10_14             = J18
      val IO_L7_T1_14                  = DiffPair(IO_L7P_T1_D09_14, IO_L7N_T1_D10_14)
      val IO_L8P_T1_D11_14             = L18
      val IO_L8N_T1_D12_14             = K18
      val IO_L8_T1_14                  = DiffPair(IO_L8P_T1_D11_14, IO_L8N_T1_D12_14)
      val IO_L9P_T1_DQS_14             = N18
      val IO_L9N_T1_DQS_D13_14         = N19
      val IO_L9_T1_DQS_14              = DiffPair(IO_L9P_T1_DQS_14, IO_L9N_T1_DQS_D13_14)
      val IO_L10P_T1_D14_14            = P19
      val IO_L10N_T1_D15_14            = R19
      val IO_L10_T1_14                 = DiffPair(IO_L10P_T1_D14_14, IO_L10N_T1_D15_14)
      val IO_L11P_T1_SRCC_14           = M18
      val IO_L11N_T1_SRCC_14           = M19
      val IO_L11_T1_SRCC_14            = DiffPair(IO_L11P_T1_SRCC_14, IO_L11N_T1_SRCC_14)
      val IO_L12P_T1_MRCC_14           = L17
      val IO_L12N_T1_MRCC_14           = K17
      val IO_L12_T1_MRCC_14            = DiffPair(IO_L12P_T1_MRCC_14, IO_L12N_T1_MRCC_14)
      val IO_L13P_T2_MRCC_14           = N17
      val IO_L13N_T2_MRCC_14           = P17
      val IO_L13_T2_MRCC_14            = DiffPair(IO_L13P_T2_MRCC_14, IO_L13N_T2_MRCC_14)
      val IO_L14P_T2_SRCC_14           = P18
      val IO_L14N_T2_SRCC_14           = R18
      val IO_L14_T2_SRCC_14            = DiffPair(IO_L14P_T2_SRCC_14, IO_L14N_T2_SRCC_14)
      val IO_L15P_T2_DQS_RDWR_B_14     = U19
      val IO_L15N_T2_DQS_DOUT_CSO_B_14 = V19
      val IO_L15_T2_DQS_14             = DiffPair(IO_L15P_T2_DQS_RDWR_B_14, IO_L15N_T2_DQS_DOUT_CSO_B_14)
      val IO_L16P_T2_CSI_B_14          = W18
      val IO_L16N_T2_A15_D31_14        = W19
      val IO_L16_T2_14                 = DiffPair(IO_L16P_T2_CSI_B_14, IO_L16N_T2_A15_D31_14)
      val IO_L17P_T2_A14_D30_14        = T17
      val IO_L17N_T2_A13_D29_14        = T18
      val IO_L17_T2_14                 = DiffPair(IO_L17P_T2_A14_D30_14, IO_L17N_T2_A13_D29_14)
      val IO_L18P_T2_A12_D28_14        = U17
      val IO_L18N_T2_A11_D27_14        = U18
      val IO_L18_T2_14                 = DiffPair(IO_L18P_T2_A12_D28_14, IO_L18N_T2_A11_D27_14)
      val IO_L19P_T3_A10_D26_14        = V16
      val IO_L19N_T3_A09_D25_VREF_14   = V17
      val IO_L19_T3_14                 = DiffPair(IO_L19P_T3_A10_D26_14, IO_L19N_T3_A09_D25_VREF_14)
      val IO_L20P_T3_A08_D24_14        = W16
      val IO_L20N_T3_A07_D23_14        = W17
      val IO_L20_T3_14                 = DiffPair(IO_L20P_T3_A08_D24_14, IO_L20N_T3_A07_D23_14)
      val IO_L21P_T3_DQS_14            = V15
      val IO_L21N_T3_DQS_A06_D22_14    = W15
      val IO_L21_T3_DQS_14             = DiffPair(IO_L21P_T3_DQS_14, IO_L21N_T3_DQS_A06_D22_14)
      val IO_L22P_T3_A05_D21_14        = W13
      val IO_L22N_T3_A04_D20_14        = W14
      val IO_L22_T3_14                 = DiffPair(IO_L22P_T3_A05_D21_14, IO_L22N_T3_A04_D20_14)
      val IO_L23P_T3_A03_D19_14        = U15
      val IO_L23N_T3_A02_D18_14        = U16
      val IO_L23_T3_14                 = DiffPair(IO_L23P_T3_A03_D19_14, IO_L23N_T3_A02_D18_14)
      val IO_L24P_T3_A01_D17_14        = V13
      val IO_L24N_T3_A00_D16_14        = V14
      val IO_L24_T3_14                 = DiffPair(IO_L24P_T3_A01_D17_14, IO_L24N_T3_A00_D16_14)
      val IO_25_14                     = U14
    end byName
  end Bank14
  val bank14 = new Bank14

  class Bank16 extends Bank(HR):
    object pins:
      val A14 = Pin(name = "IO_L6P_T0_16",                 memory = 0)
      val A15 = Pin(name = "IO_L6N_T0_VREF_16",            memory = 0)
      val C15 = Pin(name = "IO_L11P_T1_SRCC_16",           memory = 1)
      val B15 = Pin(name = "IO_L11N_T1_SRCC_16",           memory = 1)
      val A16 = Pin(name = "IO_L12P_T1_MRCC_16",           memory = 1)
      val A17 = Pin(name = "IO_L12N_T1_MRCC_16",           memory = 1)
      val C16 = Pin(name = "IO_L13P_T2_MRCC_16",           memory = 2)
      val B16 = Pin(name = "IO_L13N_T2_MRCC_16",           memory = 2)
      val C17 = Pin(name = "IO_L14P_T2_SRCC_16",           memory = 2)
      val B17 = Pin(name = "IO_L14N_T2_SRCC_16",           memory = 2)
      val B18 = Pin(name = "IO_L19P_T3_16",                memory = 3)
      val A18 = Pin(name = "IO_L19N_T3_VREF_16",           memory = 3)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_L6P_T0_16                 = A14
      val IO_L6N_T0_VREF_16            = A15
      val IO_L6_T0_16                  = DiffPair(IO_L6P_T0_16, IO_L6N_T0_VREF_16)
      val IO_L11P_T1_SRCC_16           = C15
      val IO_L11N_T1_SRCC_16           = B15
      val IO_L11_T1_SRCC_16            = DiffPair(IO_L11P_T1_SRCC_16, IO_L11N_T1_SRCC_16)
      val IO_L12P_T1_MRCC_16           = A16
      val IO_L12N_T1_MRCC_16           = A17
      val IO_L12_T1_MRCC_16            = DiffPair(IO_L12P_T1_MRCC_16, IO_L12N_T1_MRCC_16)
      val IO_L13P_T2_MRCC_16           = C16
      val IO_L13N_T2_MRCC_16           = B16
      val IO_L13_T2_MRCC_16            = DiffPair(IO_L13P_T2_MRCC_16, IO_L13N_T2_MRCC_16)
      val IO_L14P_T2_SRCC_16           = C17
      val IO_L14N_T2_SRCC_16           = B17
      val IO_L14_T2_SRCC_16            = DiffPair(IO_L14P_T2_SRCC_16, IO_L14N_T2_SRCC_16)
      val IO_L19P_T3_16                = B18
      val IO_L19N_T3_VREF_16           = A18
      val IO_L19_T3_16                 = DiffPair(IO_L19P_T3_16, IO_L19N_T3_VREF_16)
    end byName
  end Bank16
  val bank16 = new Bank16

  class Bank34 extends Bank(HR):
    object pins:
      val R2  = Pin(name = "IO_L1P_T0_34",                 memory = 0)
      val T2  = Pin(name = "IO_L1N_T0_34",                 memory = 0)
      val R3  = Pin(name = "IO_L2P_T0_34",                 memory = 0)
      val T3  = Pin(name = "IO_L2N_T0_34",                 memory = 0)
      val T1  = Pin(name = "IO_L3P_T0_DQS_34",             memory = 0)
      val U1  = Pin(name = "IO_L3N_T0_DQS_34",             memory = 0)
      val V2  = Pin(name = "IO_L5P_T0_34",                 memory = 0)
      val W2  = Pin(name = "IO_L5N_T0_34",                 memory = 0)
      val V3  = Pin(name = "IO_L6P_T0_34",                 memory = 0)
      val W3  = Pin(name = "IO_L6N_T0_VREF_34",            memory = 0)
      val U3  = Pin(name = "IO_L9P_T1_DQS_34",             memory = 1)
      val U2  = Pin(name = "IO_L9N_T1_DQS_34",             memory = 1)
      val U4  = Pin(name = "IO_L11P_T1_SRCC_34",           memory = 1)
      val V4  = Pin(name = "IO_L11N_T1_SRCC_34",           memory = 1)
      val W5  = Pin(name = "IO_L12P_T1_MRCC_34",           memory = 1)
      val W4  = Pin(name = "IO_L12N_T1_MRCC_34",           memory = 1)
      val W7  = Pin(name = "IO_L13P_T2_MRCC_34",           memory = 2)
      val W6  = Pin(name = "IO_L13N_T2_MRCC_34",           memory = 2)
      val U8  = Pin(name = "IO_L14P_T2_SRCC_34",           memory = 2)
      val V8  = Pin(name = "IO_L14N_T2_SRCC_34",           memory = 2)
      val U5  = Pin(name = "IO_L16P_T2_34",                memory = 2)
      val V5  = Pin(name = "IO_L16N_T2_34",                memory = 2)
      val U7  = Pin(name = "IO_L19P_T3_34",                memory = 3)
      val V7  = Pin(name = "IO_L19N_T3_VREF_34",           memory = 3)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_L1P_T0_34                 = R2
      val IO_L1N_T0_34                 = T2
      val IO_L1_T0_34                  = DiffPair(IO_L1P_T0_34, IO_L1N_T0_34)
      val IO_L2P_T0_34                 = R3
      val IO_L2N_T0_34                 = T3
      val IO_L2_T0_34                  = DiffPair(IO_L2P_T0_34, IO_L2N_T0_34)
      val IO_L3P_T0_DQS_34             = T1
      val IO_L3N_T0_DQS_34             = U1
      val IO_L3_T0_DQS_34              = DiffPair(IO_L3P_T0_DQS_34, IO_L3N_T0_DQS_34)
      val IO_L5P_T0_34                 = V2
      val IO_L5N_T0_34                 = W2
      val IO_L5_T0_34                  = DiffPair(IO_L5P_T0_34, IO_L5N_T0_34)
      val IO_L6P_T0_34                 = V3
      val IO_L6N_T0_VREF_34            = W3
      val IO_L6_T0_34                  = DiffPair(IO_L6P_T0_34, IO_L6N_T0_VREF_34)
      val IO_L9P_T1_DQS_34             = U3
      val IO_L9N_T1_DQS_34             = U2
      val IO_L9_T1_DQS_34              = DiffPair(IO_L9P_T1_DQS_34, IO_L9N_T1_DQS_34)
      val IO_L11P_T1_SRCC_34           = U4
      val IO_L11N_T1_SRCC_34           = V4
      val IO_L11_T1_SRCC_34            = DiffPair(IO_L11P_T1_SRCC_34, IO_L11N_T1_SRCC_34)
      val IO_L12P_T1_MRCC_34           = W5
      val IO_L12N_T1_MRCC_34           = W4
      val IO_L12_T1_MRCC_34            = DiffPair(IO_L12P_T1_MRCC_34, IO_L12N_T1_MRCC_34)
      val IO_L13P_T2_MRCC_34           = W7
      val IO_L13N_T2_MRCC_34           = W6
      val IO_L13_T2_MRCC_34            = DiffPair(IO_L13P_T2_MRCC_34, IO_L13N_T2_MRCC_34)
      val IO_L14P_T2_SRCC_34           = U8
      val IO_L14N_T2_SRCC_34           = V8
      val IO_L14_T2_SRCC_34            = DiffPair(IO_L14P_T2_SRCC_34, IO_L14N_T2_SRCC_34)
      val IO_L16P_T2_34                = U5
      val IO_L16N_T2_34                = V5
      val IO_L16_T2_34                 = DiffPair(IO_L16P_T2_34, IO_L16N_T2_34)
      val IO_L19P_T3_34                = U7
      val IO_L19N_T3_VREF_34           = V7
      val IO_L19_T3_34                 = DiffPair(IO_L19P_T3_34, IO_L19N_T3_VREF_34)
    end byName
  end Bank34
  val bank34 = new Bank34

  class Bank35 extends Bank(HR):
    object pins:
      val G3  = Pin(name = "IO_L1P_T0_AD4P_35",            memory = 0)
      val G2  = Pin(name = "IO_L1N_T0_AD4N_35",            memory = 0)
      val H2  = Pin(name = "IO_L2P_T0_AD12P_35",           memory = 0)
      val J2  = Pin(name = "IO_L2N_T0_AD12N_35",           memory = 0)
      val H1  = Pin(name = "IO_L3P_T0_DQS_AD5P_35",        memory = 0)
      val J1  = Pin(name = "IO_L3N_T0_DQS_AD5N_35",        memory = 0)
      val K2  = Pin(name = "IO_L5P_T0_AD13P_35",           memory = 0)
      val L2  = Pin(name = "IO_L5N_T0_AD13N_35",           memory = 0)
      val L1  = Pin(name = "IO_L6N_T0_VREF_35",            memory = 0)
      val J3  = Pin(name = "IO_L7P_T1_AD6P_35",            memory = 1)
      val K3  = Pin(name = "IO_L7N_T1_AD6N_35",            memory = 1)
      val L3  = Pin(name = "IO_L8P_T1_AD14P_35",           memory = 1)
      val M3  = Pin(name = "IO_L8N_T1_AD14N_35",           memory = 1)
      val M2  = Pin(name = "IO_L9P_T1_DQS_AD7P_35",        memory = 1)
      val M1  = Pin(name = "IO_L9N_T1_DQS_AD7N_35",        memory = 1)
      val N2  = Pin(name = "IO_L10P_T1_AD15P_35",          memory = 1)
      val N1  = Pin(name = "IO_L10N_T1_AD15N_35",          memory = 1)
      val N3  = Pin(name = "IO_L12P_T1_MRCC_35",           memory = 1)
      val P3  = Pin(name = "IO_L12N_T1_MRCC_35",           memory = 1)
      val P1  = Pin(name = "IO_L19N_T3_VREF_35",           memory = 3)
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IO_L1P_T0_AD4P_35            = G3
      val IO_L1N_T0_AD4N_35            = G2
      val IO_L1_T0_AD4_35              = DiffPair(IO_L1P_T0_AD4P_35, IO_L1N_T0_AD4N_35)
      val IO_L2P_T0_AD12P_35           = H2
      val IO_L2N_T0_AD12N_35           = J2
      val IO_L2_T0_AD12_35             = DiffPair(IO_L2P_T0_AD12P_35, IO_L2N_T0_AD12N_35)
      val IO_L3P_T0_DQS_AD5P_35        = H1
      val IO_L3N_T0_DQS_AD5N_35        = J1
      val IO_L3_T0_DQS_AD5_35          = DiffPair(IO_L3P_T0_DQS_AD5P_35, IO_L3N_T0_DQS_AD5N_35)
      val IO_L5P_T0_AD13P_35           = K2
      val IO_L5N_T0_AD13N_35           = L2
      val IO_L5_T0_AD13_35             = DiffPair(IO_L5P_T0_AD13P_35, IO_L5N_T0_AD13N_35)
      val IO_L6N_T0_VREF_35            = L1
      val IO_L7P_T1_AD6P_35            = J3
      val IO_L7N_T1_AD6N_35            = K3
      val IO_L7_T1_AD6_35              = DiffPair(IO_L7P_T1_AD6P_35, IO_L7N_T1_AD6N_35)
      val IO_L8P_T1_AD14P_35           = L3
      val IO_L8N_T1_AD14N_35           = M3
      val IO_L8_T1_AD14_35             = DiffPair(IO_L8P_T1_AD14P_35, IO_L8N_T1_AD14N_35)
      val IO_L9P_T1_DQS_AD7P_35        = M2
      val IO_L9N_T1_DQS_AD7N_35        = M1
      val IO_L9_T1_DQS_AD7_35          = DiffPair(IO_L9P_T1_DQS_AD7P_35, IO_L9N_T1_DQS_AD7N_35)
      val IO_L10P_T1_AD15P_35          = N2
      val IO_L10N_T1_AD15N_35          = N1
      val IO_L10_T1_AD15_35            = DiffPair(IO_L10P_T1_AD15P_35, IO_L10N_T1_AD15N_35)
      val IO_L12P_T1_MRCC_35           = N3
      val IO_L12N_T1_MRCC_35           = P3
      val IO_L12_T1_MRCC_35            = DiffPair(IO_L12P_T1_MRCC_35, IO_L12N_T1_MRCC_35)
      val IO_L19N_T3_VREF_35           = P1
    end byName
  end Bank35
  val bank35 = new Bank35

  object ios:
    export bank0.pins.*
    export bank14.pins.*
    export bank16.pins.*
    export bank34.pins.*
    export bank35.pins.*
    object byName:
      export bank0.byName.*
      export bank14.byName.*
      export bank16.byName.*
      export bank34.byName.*
      export bank35.byName.*
    end byName
  end ios
  ios // touch to force execution
end xc7a35tcpg236

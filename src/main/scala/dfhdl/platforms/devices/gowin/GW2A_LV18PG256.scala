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
 * DISCLAIMER: This file contains a DFHDL wrapper around Gowin IP/device
 * information. The wrapper code is licensed under Apache 2.0, but the
 * underlying Gowin IP/device is subject to Gowin's license terms.
 * Users must comply with Gowin's End User License Agreement (EULA)
 * and license terms when using Gowin products. This wrapper is provided
 * as-is without any warranty or guarantee of compatibility with Gowin IP.
 */
package dfhdl.platforms.devices.gowin
import dfhdl.hw.constraints.io

class GW2A_LV18PG256(val speedGrade: String) extends Device:
  lazy val deviceName: String = "GW2A-18C"
  lazy val packageName: String = "PBGA256"
  lazy val partName: String = s"GW2A-LV18PG256$speedGrade"
  lazy val deviceVersion: String = "C"

  class Bank0 extends Bank:
    object pins:
      val F12 = Pin("IOT12A")
      val G13 = Pin("IOT12B")
      val G15 = Pin("IOT13A")
      val G14 = Pin("IOT13B")
      val G11 = Pin("IOT14A")
      val H12 = Pin("IOT14B")
      val G16 = Pin("IOT16A")
      val H15 = Pin("IOT16B")
      val H13 = Pin("IOT18A")
      val J12 = Pin("IOT18B")
      val H14 = Pin("IOT20A")
      val H16 = Pin("IOT20B")
      val J16 = Pin("IOT22A")
      val J14 = Pin("IOT22B")
      val J15 = Pin("IOT24A")
      val K16 = Pin("IOT24B")
      val H11 = Pin("IOT27A/GCLKT_0")
      val J13 = Pin("IOT27B/GCLKC_0")
      val L15 = Pin("IOT2A")
      val D16 = Pin("IOT4A")
      val E14 = Pin("IOT4B")
      val C16 = Pin("IOT5A")
      val D15 = Pin("IOT5B")
      val E16 = Pin("IOT6A")
      val F15 = Pin("IOT6B")
      val F13 = Pin("IOT8A")
      val G12 = Pin("IOT8B")
      val F14 = Pin("IOT9A")
      val F16 = Pin("IOT9B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOT12A = F12
      val IOT12B = G13
      val IOT13A = G15
      val IOT13B = G14
      val IOT14A = G11
      val IOT14B = H12
      val IOT16A = G16
      val IOT16B = H15
      val IOT18A = H13
      val IOT18B = J12
      val IOT20A = H14
      val IOT20B = H16
      val IOT22A = J16
      val IOT22B = J14
      val IOT24A = J15
      val IOT24B = K16
      val IOT27A = H11
      val GCLKT_0 = H11
      val IOT27B = J13
      val GCLKC_0 = J13
      val IOT2A = L15
      val IOT4A = D16
      val IOT4B = E14
      val IOT5A = C16
      val IOT5B = D15
      val IOT6A = E16
      val IOT6B = F15
      val IOT8A = F13
      val IOT8B = G12
      val IOT9A = F14
      val IOT9B = F16
    end byName
  end Bank0
  val bank0 = new Bank0

  class Bank1 extends Bank:
    object pins:
      val K14 = Pin("IOT30A/GCLKT_1")
      val K15 = Pin("IOT30B/GCLKC_1")
      val J11 = Pin("IOT32A")
      val L12 = Pin("IOT32B")
      val L16 = Pin("IOT34A")
      val L14 = Pin("IOT34B")
      val K13 = Pin("IOT36A")
      val K12 = Pin("IOT36B")
      val K11 = Pin("IOT38A")
      val L13 = Pin("IOT38B")
      val M14 = Pin("IOT40A")
      val M15 = Pin("IOT40B")
      val D14 = Pin("IOT44A")
      val E15 = Pin("IOT44B")
      val N15 = Pin("IOT48A")
      val P16 = Pin("IOT48B")
      val N16 = Pin("IOT52A")
      val N14 = Pin("IOT52B")
      val P15 = Pin("IOT54A")
      val R16 = Pin("IOT54B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOT30A = K14
      val GCLKT_1 = K14
      val IOT30B = K15
      val GCLKC_1 = K15
      val IOT32A = J11
      val IOT32B = L12
      val IOT34A = L16
      val IOT34B = L14
      val IOT36A = K13
      val IOT36B = K12
      val IOT38A = K11
      val IOT38B = L13
      val IOT40A = M14
      val IOT40B = M15
      val IOT44A = D14
      val IOT44B = E15
      val IOT48A = N15
      val IOT48B = P16
      val IOT52A = N16
      val IOT52B = N14
      val IOT54A = P15
      val IOT54B = R16
    end byName
  end Bank1
  val bank1 = new Bank1

  class Bank2 extends Bank:
    object pins:
      val R12 = Pin("IOR11A")
      val P13 = Pin("IOR11B")
      val R11 = Pin("IOR17A")
      val T12 = Pin("IOR17B")
      val R13 = Pin("IOR20A")
      val T14 = Pin("IOR20B")
      val M10 = Pin("IOR22A")
      val N11 = Pin("IOR22B")
      val T11 = Pin("IOR24A")
      val P11 = Pin("IOR24B")
      val C6 = Pin("IOR25A/TDO")
      val B8 = Pin("IOR25B/TMS")
      val A7 = Pin("IOR26A/TCK")
      val A6 = Pin("IOR26B/TDI")
      val N10 = Pin("IOR27A/GCLKT_2")
      val M11 = Pin("IOR27B/GCLKC_2")
      val T15 = Pin("IOR7A/RPLL1_T_in")
      val R14 = Pin("IOR7B/RPLL1_C_in")
      val P12 = Pin("IOR8A/RPLL1_T_fb")
      val T13 = Pin("IOR8B/RPLL1_C_fb")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOR11A = R12
      val IOR11B = P13
      val IOR17A = R11
      val IOR17B = T12
      val IOR20A = R13
      val IOR20B = T14
      val IOR22A = M10
      val IOR22B = N11
      val IOR24A = T11
      val IOR24B = P11
      val IOR25A = C6
      val TDO = C6
      val IOR25B = B8
      val TMS = B8
      val IOR26A = A7
      val TCK = A7
      val IOR26B = A6
      val TDI = A6
      val IOR27A = N10
      val GCLKT_2 = N10
      val IOR27B = M11
      val GCLKC_2 = M11
      val IOR7A = T15
      val RPLL1_T_in = T15
      val IOR7B = R14
      val RPLL1_C_in = R14
      val IOR8A = P12
      val RPLL1_T_fb = P12
      val IOR8B = T13
      val RPLL1_C_fb = T13
    end byName
  end Bank2
  val bank2 = new Bank2

  class Bank3 extends Bank:
    object pins:
      val T7 = Pin("IOR29A/GCLKT_3")
      val R8 = Pin("IOR29B/GCLKC_3")
      val M16 = Pin("IOR30A/MODE0")
      val B16 = Pin("IOR30B/MODE1")
      val C15 = Pin("IOR31A/MODE2")
      @io(dualPurposeGroups = "reconfign")
      val B10 = Pin("IOR31B/RECONFIG_N")
      @io(dualPurposeGroups = "ready")
      val A13 = Pin("IOR32A/READY")
      @io(dualPurposeGroups = "done")
      val C13 = Pin("IOR32B/DONE")
      val P10 = Pin("IOR33A/MI/D7")
      val R10 = Pin("IOR33B/MO/D6")
      val M9 = Pin("IOR34A/MCS_N/D5")
      val L10 = Pin("IOR34B/MCLK/D4")
      val R9 = Pin("IOR35A/FASTRD_N/D3")
      @io(dualPurposeGroups = "sspi")
      val T10 = Pin("IOR35B/SI/D2")
      @io(dualPurposeGroups = "sspi")
      val M8 = Pin("IOR36A/SO/D1")
      @io(dualPurposeGroups = "sspi")
      val N9 = Pin("IOR36B/SSPI_CS_N/D0")
      @io(dualPurposeGroups = "sspi")
      val T9 = Pin("IOR38A/DIN/CLKHOLD_N")
      @io(dualPurposeGroups = "sspi")
      val P9 = Pin("IOR38B/DOUT/WE_N")
      val C10 = Pin("IOR39A/SCLK")
      val N8 = Pin("IOR40A")
      val L9 = Pin("IOR40B")
      val P8 = Pin("IOR42A")
      val T8 = Pin("IOR42B")
      val M6 = Pin("IOR44A")
      val L8 = Pin("IOR44B")
      val M7 = Pin("IOR47A/RPLL2_T_fb")
      val N7 = Pin("IOR47B/RPLL2_C_fb")
      val R7 = Pin("IOR49A")
      val P7 = Pin("IOR49B")
      val N6 = Pin("IOR51A")
      val P6 = Pin("IOR53A")
      val T6 = Pin("IOR53B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOR29A = T7
      val GCLKT_3 = T7
      val IOR29B = R8
      val GCLKC_3 = R8
      val IOR30A = M16
      val MODE0 = M16
      val IOR30B = B16
      val MODE1 = B16
      val IOR31A = C15
      val MODE2 = C15
      val IOR31B = B10
      val RECONFIG_N = B10
      val IOR32A = A13
      val READY = A13
      val IOR32B = C13
      val DONE = C13
      val IOR33A = P10
      val MI = P10
      val D7 = P10
      val IOR33B = R10
      val MO = R10
      val D6 = R10
      val IOR34A = M9
      val MCS_N = M9
      val D5 = M9
      val IOR34B = L10
      val MCLK = L10
      val D4 = L10
      val IOR35A = R9
      val FASTRD_N = R9
      val D3 = R9
      val IOR35B = T10
      val SI = T10
      val D2 = T10
      val IOR36A = M8
      val SO = M8
      val D1 = M8
      val IOR36B = N9
      val SSPI_CS_N = N9
      val D0 = N9
      val IOR38A = T9
      val DIN = T9
      val CLKHOLD_N = T9
      val IOR38B = P9
      val DOUT = P9
      val WE_N = P9
      val IOR39A = C10
      val SCLK = C10
      val IOR40A = N8
      val IOR40B = L9
      val IOR42A = P8
      val IOR42B = T8
      val IOR44A = M6
      val IOR44B = L8
      val IOR47A = M7
      val RPLL2_T_fb = M7
      val IOR47B = N7
      val RPLL2_C_fb = N7
      val IOR49A = R7
      val IOR49B = P7
      val IOR51A = N6
      val IOR53A = P6
      val IOR53B = T6
    end byName
  end Bank3
  val bank3 = new Bank3

  class Bank4 extends Bank:
    object pins:
      val L2 = Pin("IOB30A/GCLKT_4")
      val M1 = Pin("IOB30B/GCLKC_4")
      val H3 = Pin("IOB32A")
      val H1 = Pin("IOB32B")
      val J2 = Pin("IOB34A")
      val K1 = Pin("IOB34B")
      val H5 = Pin("IOB35A")
      val J4 = Pin("IOB35B")
      val K3 = Pin("IOB36A")
      val K2 = Pin("IOB36B")
      val J5 = Pin("IOB37A")
      val K6 = Pin("IOB37B")
      val L1 = Pin("IOB38A")
      val L3 = Pin("IOB38B")
      val K4 = Pin("IOB39A")
      val L5 = Pin("IOB39B")
      val K5 = Pin("IOB40A")
      val L4 = Pin("IOB40B")
      val N2 = Pin("IOB41A")
      val P1 = Pin("IOB41B")
      val M3 = Pin("IOB42A")
      val N1 = Pin("IOB42B")
      val M2 = Pin("IOB43A")
      val N3 = Pin("IOB43B")
      val R1 = Pin("IOB44A")
      val P2 = Pin("IOB44B")
      val P4 = Pin("IOB45A")
      val T4 = Pin("IOB45B")
      val R3 = Pin("IOB48A")
      val T2 = Pin("IOB48B")
      val P5 = Pin("IOB50A")
      val R5 = Pin("IOB50B")
      val R4 = Pin("IOB52A")
      val T3 = Pin("IOB52B")
      val R6 = Pin("IOB54A")
      val T5 = Pin("IOB54B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOB30A = L2
      val GCLKT_4 = L2
      val IOB30B = M1
      val GCLKC_4 = M1
      val IOB32A = H3
      val IOB32B = H1
      val IOB34A = J2
      val IOB34B = K1
      val IOB35A = H5
      val IOB35B = J4
      val IOB36A = K3
      val IOB36B = K2
      val IOB37A = J5
      val IOB37B = K6
      val IOB38A = L1
      val IOB38B = L3
      val IOB39A = K4
      val IOB39B = L5
      val IOB40A = K5
      val IOB40B = L4
      val IOB41A = N2
      val IOB41B = P1
      val IOB42A = M3
      val IOB42B = N1
      val IOB43A = M2
      val IOB43B = N3
      val IOB44A = R1
      val IOB44B = P2
      val IOB45A = P4
      val IOB45B = T4
      val IOB48A = R3
      val IOB48B = T2
      val IOB50A = P5
      val IOB50B = R5
      val IOB52A = R4
      val IOB52B = T3
      val IOB54A = R6
      val IOB54B = T5
    end byName
  end Bank4
  val bank4 = new Bank4

  class Bank5 extends Bank:
    object pins:
      val E2 = Pin("IOB12A")
      val E3 = Pin("IOB12B")
      val B3 = Pin("IOB13A")
      val A2 = Pin("IOB13B")
      val C1 = Pin("IOB14A")
      val D2 = Pin("IOB14B")
      val E1 = Pin("IOB16A")
      val F2 = Pin("IOB16B")
      val F4 = Pin("IOB18A")
      val G6 = Pin("IOB18B")
      val F3 = Pin("IOB19A")
      val F1 = Pin("IOB19B")
      val G5 = Pin("IOB20A")
      val G4 = Pin("IOB20B")
      val G2 = Pin("IOB21A")
      val G3 = Pin("IOB21B")
      val F5 = Pin("IOB22A")
      val H6 = Pin("IOB22B")
      val G1 = Pin("IOB24A")
      val H2 = Pin("IOB24B")
      val H4 = Pin("IOB26A")
      val J6 = Pin("IOB26B")
      val J1 = Pin("IOB27A/GCLKT_5")
      val J3 = Pin("IOB27B/GCLKC_5")
      val A4 = Pin("IOB2A")
      val C5 = Pin("IOB2B")
      val D6 = Pin("IOB3A")
      val E7 = Pin("IOB3B")
      val A3 = Pin("IOB4A")
      val B4 = Pin("IOB4B")
      val A5 = Pin("IOB7A")
      val B6 = Pin("IOB7B")
      val B1 = Pin("IOB8A")
      val C2 = Pin("IOB8B")
      val D3 = Pin("IOB9A")
      val D1 = Pin("IOB9B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOB12A = E2
      val IOB12B = E3
      val IOB13A = B3
      val IOB13B = A2
      val IOB14A = C1
      val IOB14B = D2
      val IOB16A = E1
      val IOB16B = F2
      val IOB18A = F4
      val IOB18B = G6
      val IOB19A = F3
      val IOB19B = F1
      val IOB20A = G5
      val IOB20B = G4
      val IOB21A = G2
      val IOB21B = G3
      val IOB22A = F5
      val IOB22B = H6
      val IOB24A = G1
      val IOB24B = H2
      val IOB26A = H4
      val IOB26B = J6
      val IOB27A = J1
      val GCLKT_5 = J1
      val IOB27B = J3
      val GCLKC_5 = J3
      val IOB2A = A4
      val IOB2B = C5
      val IOB3A = D6
      val IOB3B = E7
      val IOB4A = A3
      val IOB4B = B4
      val IOB7A = A5
      val IOB7B = B6
      val IOB8A = B1
      val IOB8B = C2
      val IOB9A = D3
      val IOB9B = D1
    end byName
  end Bank5
  val bank5 = new Bank5

  class Bank6 extends Bank:
    object pins:
      val C8 = Pin("IOL29A/GCLKT_6")
      val A8 = Pin("IOL29B/GCLKC_6")
      val F9 = Pin("IOL31A")
      val E11 = Pin("IOL31B")
      val B9 = Pin("IOL33A")
      val A10 = Pin("IOL33B")
      val F8 = Pin("IOL35A")
      val D9 = Pin("IOL35B")
      val D8 = Pin("IOL38A")
      val E9 = Pin("IOL38B")
      val B7 = Pin("IOL40A")
      val C7 = Pin("IOL40B")
      val F7 = Pin("IOL45A/LPLL2_T_in")
      val E8 = Pin("IOL45B/LPLL2_C_in")
      val C4 = Pin("IOL47A/LPLL2_T_fb")
      val B5 = Pin("IOL47B/LPLL2_C_fb")
      val E6 = Pin("IOL53A")
      val D7 = Pin("IOL53B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOL29A = C8
      val GCLKT_6 = C8
      val IOL29B = A8
      val GCLKC_6 = A8
      val IOL31A = F9
      val IOL31B = E11
      val IOL33A = B9
      val IOL33B = A10
      val IOL35A = F8
      val IOL35B = D9
      val IOL38A = D8
      val IOL38B = E9
      val IOL40A = B7
      val IOL40B = C7
      val IOL45A = F7
      val LPLL2_T_in = F7
      val IOL45B = E8
      val LPLL2_C_in = E8
      val IOL47A = C4
      val LPLL2_T_fb = C4
      val IOL47B = B5
      val LPLL2_C_fb = B5
      val IOL53A = E6
      val IOL53B = D7
    end byName
  end Bank6
  val bank6 = new Bank6

  class Bank7 extends Bank:
    object pins:
      val F10 = Pin("IOL11A")
      val B11 = Pin("IOL13A")
      val A12 = Pin("IOL13B")
      val A11 = Pin("IOL15A")
      val C11 = Pin("IOL15B")
      val D10 = Pin("IOL17A")
      val E10 = Pin("IOL17B")
      val D11 = Pin("IOL22A")
      val A9 = Pin("IOL27A/GCLKT_7")
      val C9 = Pin("IOL27B/GCLKC_7")
      val B14 = Pin("IOL2A")
      val A15 = Pin("IOL2B")
      val C12 = Pin("IOL7A/LPLL1_T_in")
      val B12 = Pin("IOL7B/LPLL1_C_in")
      val B13 = Pin("IOL8A/LPLL1_T_fb")
      val A14 = Pin("IOL8B/LPLL1_C_fb")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOL11A = F10
      val IOL13A = B11
      val IOL13B = A12
      val IOL15A = A11
      val IOL15B = C11
      val IOL17A = D10
      val IOL17B = E10
      val IOL22A = D11
      val IOL27A = A9
      val GCLKT_7 = A9
      val IOL27B = C9
      val GCLKC_7 = C9
      val IOL2A = B14
      val IOL2B = A15
      val IOL7A = C12
      val LPLL1_T_in = C12
      val IOL7B = B12
      val LPLL1_C_in = B12
      val IOL8A = B13
      val LPLL1_T_fb = B13
      val IOL8B = A14
      val LPLL1_C_fb = A14
    end byName
  end Bank7
  val bank7 = new Bank7

  object ios:
    export bank0.pins.*
    export bank1.pins.*
    export bank2.pins.*
    export bank3.pins.*
    export bank4.pins.*
    export bank5.pins.*
    export bank6.pins.*
    export bank7.pins.*
    object byName:
      export bank0.byName.*
      export bank1.byName.*
      export bank2.byName.*
      export bank3.byName.*
      export bank4.byName.*
      export bank5.byName.*
      export bank6.byName.*
      export bank7.byName.*
    end byName
  end ios
end GW2A_LV18PG256

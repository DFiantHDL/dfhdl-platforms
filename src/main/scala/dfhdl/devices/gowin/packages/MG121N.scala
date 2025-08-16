package dfhdl.platforms.devices.gowin.packages
import dfhdl.platforms.devices.gowin.*
import dfhdl.hw.constraints.io

trait MG121N extends dfhdl.platforms.devices.Package:
  final lazy val packageName: String = "MG121N"

  class Bank0 extends Bank:
    object pins:
      val L9 = Pin("IOT31A")
      val K9 = Pin("IOT31B")
      val J8 = Pin("IOT56A/GCLKT_0/TPLL_T_IN1")
      val K8 = Pin("IOT56B/GCLKC_0/TPLL_C_FB1")
      val F7 = Pin("IOT58A/GCLKT_1/TPLL_T_IN2")
      val F6 = Pin("IOT58B/GCLKC_1/TPLL_C_FB0")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOT31A = L9
      val IOT31B = K9
      val IOT56A = J8
      val IOT56B = K8
      val IOT58A = F7
      val IOT58B = F6
      val GCLKT_0 = J8
      val GCLKC_0 = K8
      val GCLKT_1 = F7
      val GCLKC_1 = F6
      val TPLL_T_IN1 = J8
      val TPLL_C_FB1 = K8
      val TPLL_T_IN2 = F7
      val TPLL_C_FB0 = F6
    end byName
  end Bank0
  val bank0 = new Bank0

  class Bank1 extends Bank:
    object pins:
      val H5 = Pin("IOT61A/GCLKT_2/TPLL_T_IN0")
      val J5 = Pin("IOT61B/GCLKC_2")
      val L5 = Pin("IOT63A/GCLKT_3/RPLL0_T_IN0")
      val K5 = Pin("IOT63B/GCLKC_3")
      val H8 = Pin("IOT66A")
      val H7 = Pin("IOT66B")
      val G7 = Pin("IOT68A")
      val G8 = Pin("IOT68B")
      val F5 = Pin("IOT72A")
      val G5 = Pin("IOT72B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOT61A = H5
      val IOT61B = J5
      val IOT63A = L5
      val IOT63B = K5
      val IOT66A = H8
      val IOT66B = H7
      val IOT68A = G7
      val IOT68B = G8
      val IOT72A = F5
      val IOT72B = G5
      val GCLKT_2 = H5
      val GCLKC_2 = J5
      val GCLKT_3 = L5
      val GCLKC_3 = K5
      val TPLL_T_IN0 = H5
      val RPLL0_T_IN0 = L5
    end byName
  end Bank1
  val bank1 = new Bank1

  class Bank2 extends Bank:
    object pins:
      val L2 = Pin("IOR18A")
      val L1 = Pin("IOR18B")
      val K1 = Pin("IOR20A")
      val K2 = Pin("IOR20B")
      val J4 = Pin("IOR22A")
      val K4 = Pin("IOR22B")
      val G2 = Pin("IOR24A")
      val G1 = Pin("IOR24B")
      val L4 = Pin("IOR31A/GCLKT_4/RPLL1_T_IN0")
      val L3 = Pin("IOR31B/GCLKC_4/RPLL1_C_FB1")
      val J1 = Pin("IOR33A/GCLKT_5/RPLL1_T_IN1")
      val J2 = Pin("IOR33B/GCLKC_5/RPLL1_C_FB0")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOR18A = L2
      val IOR18B = L1
      val IOR20A = K1
      val IOR20B = K2
      val IOR22A = J4
      val IOR22B = K4
      val IOR24A = G2
      val IOR24B = G1
      val IOR31A = L4
      val IOR31B = L3
      val IOR33A = J1
      val IOR33B = J2
      val GCLKT_4 = L4
      val GCLKC_4 = L3
      val GCLKT_5 = J1
      val GCLKC_5 = J2
      val RPLL1_T_IN0 = L4
      val RPLL1_C_FB1 = L3
      val RPLL1_T_IN1 = J1
      val RPLL1_C_FB0 = J2
    end byName
  end Bank2
  val bank2 = new Bank2

  class Bank3 extends Bank:
    object pins:
      val G4 = Pin("IOB89A/GCLKT_7/BPLL_T_IN0")
      val H4 = Pin("IOB89B/GCLKC_7")
      val H1 = Pin("IOB91A/GCLKT_6A")
      val H2 = Pin("IOB91B/GCLKC_6A")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOB89A = G4
      val IOB89B = H4
      val IOB91A = H1
      val IOB91B = H2
      val GCLKT_7 = G4
      val GCLKC_7 = H4
      val GCLKT_6A = H1
      val GCLKC_6A = H2
      val BPLL_T_IN0 = G4
    end byName
  end Bank3
  val bank3 = new Bank3

  class Bank4 extends Bank:
    object pins:
      @io(dualPurposeGroups = "ready")
      val E8 = Pin("IOB37A/READY")
      @io(dualPurposeGroups = "cpu/mspi")
      val E6 = Pin("IOB37B/MCS_N/CSO_B")
      @io(dualPurposeGroups = "cpu/mspi")
      val D5 = Pin("IOB54A/GCLKT_11B/D01/MI2")
      @io(dualPurposeGroups = "cpu/mspi")
      val E4 = Pin("IOB54B/GCLKC_11B/D02/MI3/BPLL_C_FB1")
      val B3 = Pin("IOB56A")
      val C3 = Pin("IOB56B")
      @io(dualPurposeGroups = "cpu/mspi")
      val E5 = Pin("IOB58A/D00/MISO/MI1/DIN")
      @io(dualPurposeGroups = "mspi")
      val D6 = Pin("IOB58B/MOSI/CSI_B/MI0")
      val E3 = Pin("IOB60A")
      val E7 = Pin("IOB62A/CCLK")
      @io(dualPurposeGroups = "done")
      val D7 = Pin("IOB64A/DONE")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOB37A = E8
      val IOB37B = E6
      val IOB54A = D5
      val IOB54B = E4
      val IOB56A = B3
      val IOB56B = C3
      val IOB58A = E5
      val IOB58B = D6
      val IOB60A = E3
      val IOB62A = E7
      val IOB64A = D7
      val READY = E8
      val MCS_N = E6
      val CSO_B = E6
      val GCLKT_11B = D5
      val GCLKC_11B = E4
      val D01 = D5
      val MI2 = D5
      val D02 = E4
      val MI3 = E4
      val BPLL_C_FB1 = E4
      val D00 = E5
      val MISO = E5
      val MI1 = E5
      val DIN = E5
      val MOSI = D6
      val CSI_B = D6
      val MI0 = D6
      val CCLK = E7
      val DONE = D7
    end byName
  end Bank4
  val bank4 = new Bank4

  class Bank5 extends Bank:
    object pins:
      @io(dualPurposeGroups = "cpu")
      val B1 = Pin("IOB10A/D03/SSPI_CN")
      @io(dualPurposeGroups = "cpu")
      val A3 = Pin("IOB10B/D04/SI/SSI0")
      @io(dualPurposeGroups = "cpu")
      val E2 = Pin("IOB12A/GCLKT_10B/D07/SSPI_WPN/SSI2")
      @io(dualPurposeGroups = "cpu")
      val E1 = Pin("IOB12B/GCLKC_10B/RDWR_B/LPLL1_C_IN1")
      val C1 = Pin("IOB14A/SSPI_CLK")
      val D1 = Pin("IOB14B/CLKHOLD_N/SSI3")
      @io(dualPurposeGroups = "reconfign")
      val D8 = Pin("IOB1A/RECONFIGN")
      val A1 = Pin("IOB24A")
      val F2 = Pin("IOB26A/GCLKT_12")
      val F1 = Pin("IOB26B/GCLKC_12")
      @io(dualPurposeGroups = "cpu")
      val B2 = Pin("IOB4A/D08/SDA")
      @io(dualPurposeGroups = "cpu")
      val C2 = Pin("IOB4B/D09/SCL/LPLL1_C_FB0")
      @io(dualPurposeGroups = "cpu")
      val A2 = Pin("IOB8A/D05/SO/SSI1")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOB10A = B1
      val IOB10B = A3
      val IOB12A = E2
      val IOB12B = E1
      val IOB14A = C1
      val IOB14B = D1
      val IOB1A = D8
      val IOB24A = A1
      val IOB26A = F2
      val IOB26B = F1
      val IOB4A = B2
      val IOB4B = C2
      val IOB8A = A2
      val D03 = B1
      val SSPI_CN = B1
      val D04 = A3
      val SI = A3
      val SSI0 = A3
      val GCLKT_10B = E2
      val D07 = E2
      val SSPI_WPN = E2
      val SSI2 = E2
      val GCLKC_10B = E1
      val RDWR_B = E1
      val LPLL1_C_IN1 = E1
      val SSPI_CLK = C1
      val CLKHOLD_N = D1
      val SSI3 = D1
      val RECONFIGN = D8
      val GCLKT_12 = F2
      val GCLKC_12 = F1
      val D08 = B2
      val SDA = B2
      val D09 = C2
      val SCL = C2
      val LPLL1_C_FB0 = C2
      val D05 = A2
      val SO = A2
      val SSI1 = A2
    end byName
  end Bank5
  val bank5 = new Bank5

  class Bank6 extends Bank:
    object pins:
      val B11 = Pin("IOL12A")
      val B10 = Pin("IOL12B")
      val A11 = Pin("IOL14A/LPLL1_T_IN0")
      val A10 = Pin("IOL14B")
      val E11 = Pin("IOL3A/GCLKT_14A/LPLL0_T_IN2")
      val E10 = Pin("IOL3B/GCLKC_14/LPLL0_C_FB0")
      val C11 = Pin("IOL5A/GCLKT_13/LPLL0_T_IN1")
      val C10 = Pin("IOL5B/GCLKC_13/LPLL0_C_FB1")
      val D11 = Pin("IOL9A")
      val D10 = Pin("IOL9B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOL12A = B11
      val IOL12B = B10
      val IOL14A = A11
      val IOL14B = A10
      val IOL3A = E11
      val IOL3B = E10
      val IOL5A = C11
      val IOL5B = C10
      val IOL9A = D11
      val IOL9B = D10
      val LPLL1_T_IN0 = A11
      val GCLKT_14A = E11
      val LPLL0_T_IN2 = E11
      val GCLKC_14 = E10
      val LPLL0_C_FB0 = E10
      val GCLKT_13 = C11
      val LPLL0_T_IN1 = C11
      val GCLKC_13 = C10
      val LPLL0_C_FB1 = C10
    end byName
  end Bank6
  val bank6 = new Bank6

  class Bank7 extends Bank:
    object pins:
      val K11 = Pin("IOT11A")
      val L11 = Pin("IOT11B")
      val L10 = Pin("IOT15A")
      val K10 = Pin("IOT15B")
      val L7 = Pin("IOT19A")
      val L8 = Pin("IOT19B")
      val J11 = Pin("IOT1A/GCLKT_15/LPLL0_T_IN0")
      val J10 = Pin("IOT1B/GCLKC_15")
      val K7 = Pin("IOT21A")
      val J7 = Pin("IOT21B")
      val L6 = Pin("IOT23A")
      val K6 = Pin("IOT23B")
      val H11 = Pin("IOT3A/GCLKT_16")
      val H10 = Pin("IOT3B/GCLKC_16")
      val G11 = Pin("IOT7A")
      val G10 = Pin("IOT7B")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOT11A = K11
      val IOT11B = L11
      val IOT15A = L10
      val IOT15B = K10
      val IOT19A = L7
      val IOT19B = L8
      val IOT1A = J11
      val IOT1B = J10
      val IOT21A = K7
      val IOT21B = J7
      val IOT23A = L6
      val IOT23B = K6
      val IOT3A = H11
      val IOT3B = H10
      val IOT7A = G11
      val IOT7B = G10
      val GCLKT_15 = J11
      val LPLL0_T_IN0 = J11
      val GCLKC_15 = J10
      val GCLKT_16 = H11
      val GCLKC_16 = H10
    end byName
  end Bank7
  val bank7 = new Bank7

  class MIPI extends Bank:
    object pins:
      val B7 = Pin("M0_CKN")
      val A7 = Pin("M0_CKP")
      val B9 = Pin("M0_D0N")
      val A9 = Pin("M0_D0P")
      val B8 = Pin("M0_D1N")
      val A8 = Pin("M0_D1P")
      val B6 = Pin("M0_D2N")
      val A6 = Pin("M0_D2P")
      val B5 = Pin("M0_D3N")
      val A5 = Pin("M0_D3P")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val M0_CKN = B7
      val M0_CKP = A7
      val M0_D0N = B9
      val M0_D0P = A9
      val M0_D1N = B8
      val M0_D1P = A8
      val M0_D2N = B6
      val M0_D2P = A6
      val M0_D3N = B5
      val M0_D3P = A5
    end byName
  end MIPI
  val mipi = new MIPI

  object ios:
    export bank0.pins.*
    export bank1.pins.*
    export bank2.pins.*
    export bank3.pins.*
    export bank4.pins.*
    export bank5.pins.*
    export bank6.pins.*
    export bank7.pins.*
    export mipi.pins.*
    object byName:
      export bank0.byName.*
      export bank1.byName.*
      export bank2.byName.*
      export bank3.byName.*
      export bank4.byName.*
      export bank5.byName.*
      export bank6.byName.*
      export bank7.byName.*
      export mipi.byName.*
    end byName
  end ios
end MG121N

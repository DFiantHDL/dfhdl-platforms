package dfhdl.platforms.devices.lattice.packages
import dfhdl.platforms.devices.lattice.*
import dfhdl.hw.constraints.io

trait BG381 extends dfhdl.platforms.devices.Package:
  final lazy val packageName: String = "BG381"

  class Bank0 extends Bank:
    object pins:
      val C6 = Pin("PT11A")
      val C7 = Pin("PT11B")
      val E8 = Pin("PT13A")
      val D8 = Pin("PT13B")
      val C8 = Pin("PT15A")
      val B8 = Pin("PT15B")
      val A7 = Pin("PT18A")
      val A8 = Pin("PT18B")
      val D9 = Pin("PT20A")
      val E9 = Pin("PT20B")
      val A6 = Pin("PT4A/ULC_GPLL1T_IN")
      val B6 = Pin("PT4B/ULC_GPLL1C_IN")
      val C9 = Pin("PT54A")
      val D10 = Pin("PT56A")
      val E10 = Pin("PT56B")
      val B9 = Pin("PT58A")
      val C10 = Pin("PT58B")
      val A9 = Pin("PT60A/GR_PCLK0_1")
      val B10 = Pin("PT60B/GR_PCLK0_0")
      val A10 = Pin("PT63A/PCLKT0_1")
      val A11 = Pin("PT63B/PCLKC0_1")
      val B11 = Pin("PT65A/PCLKT0_0")
      val C11 = Pin("PT65B/PCLKC0_0")
      val E6 = Pin("PT6A")
      val D6 = Pin("PT6B")
      val E7 = Pin("PT9A")
      val D7 = Pin("PT9B")
    end pins
    pins
    object byName:
      import pins.*
      val PT11A = C6
      val PT11B = C7
      val PT13A = E8
      val PT13B = D8
      val PT15A = C8
      val PT15B = B8
      val PT18A = A7
      val PT18B = A8
      val PT20A = D9
      val PT20B = E9
      val PT4A = A6
      val ULC_GPLL1T_IN = A6
      val PT4B = B6
      val ULC_GPLL1C_IN = B6
      val PT54A = C9
      val PT56A = D10
      val PT56B = E10
      val PT58A = B9
      val PT58B = C10
      val PT60A = A9
      val GR_PCLK0_1 = A9
      val PT60B = B10
      val GR_PCLK0_0 = B10
      val PT63A = A10
      val PCLKT0_1 = A10
      val PT63B = A11
      val PCLKC0_1 = A11
      val PT65A = B11
      val PCLKT0_0 = B11
      val PT65B = C11
      val PCLKC0_0 = C11
      val PT6A = E6
      val PT6B = D6
      val PT9A = E7
      val PT9B = D7
    end byName
  end Bank0
  val bank0 = new Bank0

  class Bank1 extends Bank:
    object pins:
      val A15 = Pin("PT103A")
      val B15 = Pin("PT105A")
      val C15 = Pin("PT105B")
      val D15 = Pin("PT107A")
      val E15 = Pin("PT107B")
      val A16 = Pin("PT110A")
      val B16 = Pin("PT110B")
      val C16 = Pin("PT112A")
      val D16 = Pin("PT112B")
      val B17 = Pin("PT114A")
      val C17 = Pin("PT114B")
      val A17 = Pin("PT116A")
      val B18 = Pin("PT116B")
      val A18 = Pin("PT119A")
      val B19 = Pin("PT119B")
      val A19 = Pin("PT121A/URC_GPLL1T_IN")
      val B20 = Pin("PT121B/URC_GPLL1C_IN")
      val D11 = Pin("PT69A/PCLKT1_1")
      val E11 = Pin("PT69B/PCLKC1_1")
      val B12 = Pin("PT71A/PCLKT1_0")
      val C12 = Pin("PT71B/PCLKC1_0")
      val D12 = Pin("PT74A/GR_PCLK1_0")
      val E12 = Pin("PT74B/GR_PCLK1_1")
      val A12 = Pin("PT76A")
      val A13 = Pin("PT76B")
      val B13 = Pin("PT78A")
      val C13 = Pin("PT78B")
      val D13 = Pin("PT80A")
      val E13 = Pin("PT80B")
      val A14 = Pin("PT83A")
      val C14 = Pin("PT83B")
      val D14 = Pin("PT85A")
      val E14 = Pin("PT85B")
    end pins
    pins
    object byName:
      import pins.*
      val PT103A = A15
      val PT105A = B15
      val PT105B = C15
      val PT107A = D15
      val PT107B = E15
      val PT110A = A16
      val PT110B = B16
      val PT112A = C16
      val PT112B = D16
      val PT114A = B17
      val PT114B = C17
      val PT116A = A17
      val PT116B = B18
      val PT119A = A18
      val PT119B = B19
      val PT121A = A19
      val URC_GPLL1T_IN = A19
      val PT121B = B20
      val URC_GPLL1C_IN = B20
      val PT69A = D11
      val PCLKT1_1 = D11
      val PT69B = E11
      val PCLKC1_1 = E11
      val PT71A = B12
      val PCLKT1_0 = B12
      val PT71B = C12
      val PCLKC1_0 = C12
      val PT74A = D12
      val GR_PCLK1_0 = D12
      val PT74B = E12
      val GR_PCLK1_1 = E12
      val PT76A = A12
      val PT76B = A13
      val PT78A = B13
      val PT78B = C13
      val PT80A = D13
      val PT80B = E13
      val PT83A = A14
      val PT83B = C14
      val PT85A = D14
      val PT85B = E14
    end byName
  end Bank1
  val bank1 = new Bank1

  class Bank2 extends Bank:
    object pins:
      val C18 = Pin("PR11A/URC_GPLL0T_IN")
      val D17 = Pin("PR11B/URC_GPLL0C_IN")
      val E16 = Pin("PR11C")
      val F16 = Pin("PR11D")
      val D18 = Pin("PR14A")
      val E17 = Pin("PR14B")
      val E18 = Pin("PR14C")
      val F18 = Pin("PR14D")
      val F17 = Pin("PR17A")
      val G18 = Pin("PR17B")
      val G16 = Pin("PR17C")
      val H16 = Pin("PR17D")
      val H18 = Pin("PR20A")
      val H17 = Pin("PR20B")
      val J17 = Pin("PR20C")
      val J16 = Pin("PR20D")
      val K16 = Pin("PR29A")
      val K17 = Pin("PR29B")
      val C20 = Pin("PR35A")
      val D19 = Pin("PR35B")
      val D20 = Pin("PR35C/VREF1_2")
      val E19 = Pin("PR35D")
      val E20 = Pin("PR38A")
      val F19 = Pin("PR38B")
      val F20 = Pin("PR38C")
      val G20 = Pin("PR38D")
      val G19 = Pin("PR41A/GR_PCLK2_1")
      val H20 = Pin("PR41B")
      val J18 = Pin("PR41C/GR_PCLK2_0")
      val K18 = Pin("PR41D")
      val J19 = Pin("PR44A/PCLKT2_1")
      val K19 = Pin("PR44B/PCLKC2_1")
      val J20 = Pin("PR44C/PCLKT2_0")
      val K20 = Pin("PR44D/PCLKC2_0")
    end pins
    pins
    object byName:
      import pins.*
      val PR11A = C18
      val URC_GPLL0T_IN = C18
      val PR11B = D17
      val URC_GPLL0C_IN = D17
      val PR11C = E16
      val PR11D = F16
      val PR14A = D18
      val PR14B = E17
      val PR14C = E18
      val PR14D = F18
      val PR17A = F17
      val PR17B = G18
      val PR17C = G16
      val PR17D = H16
      val PR20A = H18
      val PR20B = H17
      val PR20C = J17
      val PR20D = J16
      val PR29A = K16
      val PR29B = K17
      val PR35A = C20
      val PR35B = D19
      val PR35C = D20
      val VREF1_2 = D20
      val PR35D = E19
      val PR38A = E20
      val PR38B = F19
      val PR38C = F20
      val PR38D = G20
      val PR41A = G19
      val GR_PCLK2_1 = G19
      val PR41B = H20
      val PR41C = J18
      val GR_PCLK2_0 = J18
      val PR41D = K18
      val PR44A = J19
      val PCLKT2_1 = J19
      val PR44B = K19
      val PCLKC2_1 = K19
      val PR44C = J20
      val PCLKT2_0 = J20
      val PR44D = K20
      val PCLKC2_0 = K20
    end byName
  end Bank2
  val bank2 = new Bank2

  class Bank3 extends Bank:
    object pins:
      val L20 = Pin("PR47A/PCLKT3_1")
      val M20 = Pin("PR47B/PCLKC3_1")
      val L19 = Pin("PR47C/PCLKT3_0")
      val M19 = Pin("PR47D/PCLKC3_0")
      val L16 = Pin("PR50A/GR_PCLK3_0")
      val L17 = Pin("PR50B")
      val L18 = Pin("PR50C/GR_PCLK3_1")
      val M18 = Pin("PR50D")
      val N16 = Pin("PR53A")
      val M17 = Pin("PR53B")
      val N18 = Pin("PR53C")
      val P17 = Pin("PR53D")
      val N17 = Pin("PR56A")
      val P16 = Pin("PR56B/VREF1_3")
      val R16 = Pin("PR56C")
      val R17 = Pin("PR56D")
      val T16 = Pin("PR77A")
      val N19 = Pin("PR83A")
      val N20 = Pin("PR83B")
      val P19 = Pin("PR83C")
      val P18 = Pin("PR83D")
      val P20 = Pin("PR86A")
      val R20 = Pin("PR86B")
      val T20 = Pin("PR86C")
      val U20 = Pin("PR86D")
      val T19 = Pin("PR89A")
      val R18 = Pin("PR89B")
      val U19 = Pin("PR89C")
      val T18 = Pin("PR89D")
      val U18 = Pin("PR92A")
      val U17 = Pin("PR92B")
      val U16 = Pin("PR92C/LRC_GPLL0T_IN")
      val T17 = Pin("PR92D/LRC_GPLL0C_IN")
    end pins
    pins
    object byName:
      import pins.*
      val PR47A = L20
      val PCLKT3_1 = L20
      val PR47B = M20
      val PCLKC3_1 = M20
      val PR47C = L19
      val PCLKT3_0 = L19
      val PR47D = M19
      val PCLKC3_0 = M19
      val PR50A = L16
      val GR_PCLK3_0 = L16
      val PR50B = L17
      val PR50C = L18
      val GR_PCLK3_1 = L18
      val PR50D = M18
      val PR53A = N16
      val PR53B = M17
      val PR53C = N18
      val PR53D = P17
      val PR56A = N17
      val PR56B = P16
      val VREF1_3 = P16
      val PR56C = R16
      val PR56D = R17
      val PR77A = T16
      val PR83A = N19
      val PR83B = N20
      val PR83C = P19
      val PR83D = P18
      val PR86A = P20
      val PR86B = R20
      val PR86C = T20
      val PR86D = U20
      val PR89A = T19
      val PR89B = R18
      val PR89C = U19
      val PR89D = T18
      val PR92A = U18
      val PR92B = U17
      val PR92C = U16
      val LRC_GPLL0T_IN = U16
      val PR92D = T17
      val LRC_GPLL0C_IN = T17
    end byName
  end Bank3
  val bank3 = new Bank3

  class Bank6 extends Bank:
    object pins:
      val G2 = Pin("PL47A/PCLKT6_1")
      val F1 = Pin("PL47B/PCLKC6_1")
      val H2 = Pin("PL47C/PCLKT6_0")
      val G1 = Pin("PL47D/PCLKC6_0")
      val J4 = Pin("PL50A/GR_PCLK6_0")
      val J5 = Pin("PL50B")
      val J3 = Pin("PL50C/GR_PCLK6_1")
      val K3 = Pin("PL50D")
      val K2 = Pin("PL53A")
      val J1 = Pin("PL53B")
      val H1 = Pin("PL53C")
      val K1 = Pin("PL53D")
      val K4 = Pin("PL56A")
      val K5 = Pin("PL56B/VREF1_6")
      val L4 = Pin("PL56C")
      val L5 = Pin("PL56D")
      val M5 = Pin("PL77A")
      val M4 = Pin("PL83A")
      val N5 = Pin("PL83B")
      val N4 = Pin("PL83C")
      val P5 = Pin("PL83D")
      val N3 = Pin("PL86A")
      val M3 = Pin("PL86B")
      val L3 = Pin("PL86C")
      val L2 = Pin("PL86D")
      val N2 = Pin("PL89A")
      val M1 = Pin("PL89B")
      val L1 = Pin("PL89C")
      val N1 = Pin("PL89D")
      val P1 = Pin("PL92A")
      val P2 = Pin("PL92B")
      val P3 = Pin("PL92C/LLC_GPLL0T_IN")
      val P4 = Pin("PL92D/LLC_GPLL0C_IN")
    end pins
    pins
    object byName:
      import pins.*
      val PL47A = G2
      val PCLKT6_1 = G2
      val PL47B = F1
      val PCLKC6_1 = F1
      val PL47C = H2
      val PCLKT6_0 = H2
      val PL47D = G1
      val PCLKC6_0 = G1
      val PL50A = J4
      val GR_PCLK6_0 = J4
      val PL50B = J5
      val PL50C = J3
      val GR_PCLK6_1 = J3
      val PL50D = K3
      val PL53A = K2
      val PL53B = J1
      val PL53C = H1
      val PL53D = K1
      val PL56A = K4
      val PL56B = K5
      val VREF1_6 = K5
      val PL56C = L4
      val PL56D = L5
      val PL77A = M5
      val PL83A = M4
      val PL83B = N5
      val PL83C = N4
      val PL83D = P5
      val PL86A = N3
      val PL86B = M3
      val PL86C = L3
      val PL86D = L2
      val PL89A = N2
      val PL89B = M1
      val PL89C = L1
      val PL89D = N1
      val PL92A = P1
      val PL92B = P2
      val PL92C = P3
      val LLC_GPLL0T_IN = P3
      val PL92D = P4
      val LLC_GPLL0C_IN = P4
    end byName
  end Bank6
  val bank6 = new Bank6

  class Bank7 extends Bank:
    object pins:
      val A4 = Pin("PL11A/ULC_GPLL0T_IN")
      val A5 = Pin("PL11B/ULC_GPLL0C_IN")
      val B5 = Pin("PL11C")
      val C5 = Pin("PL11D")
      val C4 = Pin("PL14A")
      val B4 = Pin("PL14B")
      val A3 = Pin("PL14C")
      val B3 = Pin("PL14D")
      val E4 = Pin("PL17A")
      val D5 = Pin("PL17B")
      val C3 = Pin("PL17C")
      val D3 = Pin("PL17D")
      val F4 = Pin("PL20A")
      val E3 = Pin("PL20B")
      val E5 = Pin("PL20C")
      val F5 = Pin("PL20D")
      val A2 = Pin("PL35A")
      val B1 = Pin("PL35B")
      val B2 = Pin("PL35C/VREF1_7")
      val C2 = Pin("PL35D")
      val C1 = Pin("PL38A")
      val D1 = Pin("PL38B")
      val D2 = Pin("PL38C")
      val E1 = Pin("PL38D")
      val H4 = Pin("PL41A/GR_PCLK7_1")
      val G5 = Pin("PL41B")
      val H5 = Pin("PL41C/GR_PCLK7_0")
      val H3 = Pin("PL41D")
      val G3 = Pin("PL44A/PCLKT7_1")
      val F3 = Pin("PL44B/PCLKC7_1")
      val F2 = Pin("PL44C/PCLKT7_0")
      val E2 = Pin("PL44D/PCLKC7_0")
    end pins
    pins
    object byName:
      import pins.*
      val PL11A = A4
      val ULC_GPLL0T_IN = A4
      val PL11B = A5
      val ULC_GPLL0C_IN = A5
      val PL11C = B5
      val PL11D = C5
      val PL14A = C4
      val PL14B = B4
      val PL14C = A3
      val PL14D = B3
      val PL17A = E4
      val PL17B = D5
      val PL17C = C3
      val PL17D = D3
      val PL20A = F4
      val PL20B = E3
      val PL20C = E5
      val PL20D = F5
      val PL35A = A2
      val PL35B = B1
      val PL35C = B2
      val VREF1_7 = B2
      val PL35D = C2
      val PL38A = C1
      val PL38B = D1
      val PL38C = D2
      val PL38D = E1
      val PL41A = H4
      val GR_PCLK7_1 = H4
      val PL41B = G5
      val PL41C = H5
      val GR_PCLK7_0 = H5
      val PL41D = H3
      val PL44A = G3
      val PCLKT7_1 = G3
      val PL44B = F3
      val PCLKC7_1 = F3
      val PL44C = F2
      val PCLKT7_0 = F2
      val PL44D = E2
      val PCLKC7_0 = E2
    end byName
  end Bank7
  val bank7 = new Bank7

  class Bank8 extends Bank:
    object pins:
      val U3 = Pin("CCLK/MCLK/SCK")
      val U4 = Pin("CFG_0")
      val T4 = Pin("CFG_1")
      val R4 = Pin("CFG_2")
      val Y3 = Pin("DONE")
      val V3 = Pin("INITN")
      val V2 = Pin("PB11A/D1/MISO/IO1")
      val W2 = Pin("PB11B/D0/MOSI/IO0")
      val T2 = Pin("PB13A/SN/CSN")
      val U2 = Pin("PB13B/CS1N")
      val R2 = Pin("PB15A/HOLDN/DI/BUSY/CSSPIN/CEN")
      val R3 = Pin("PB15B/DOUT/CSON")
      val T3 = Pin("PB18A/WRITEN")
      val R1 = Pin("PB4A/D7/IO7")
      val T1 = Pin("PB4B/D6/IO6")
      val U1 = Pin("PB6A/D5/MISO2/IO5")
      val V1 = Pin("PB6B/D4/MOSI2/IO4")
      val W1 = Pin("PB9A/D3/IO3")
      val Y2 = Pin("PB9B/D2/IO2")
      val W3 = Pin("PROGRAMN")
    end pins
    pins
    object byName:
      import pins.*
      val CCLK = U3
      val MCLK = U3
      val SCK = U3
      val CFG_0 = U4
      val CFG_1 = T4
      val CFG_2 = R4
      val DONE = Y3
      val INITN = V3
      val PB11A = V2
      val D1 = V2
      val MISO = V2
      val IO1 = V2
      val PB11B = W2
      val D0 = W2
      val MOSI = W2
      val IO0 = W2
      val PB13A = T2
      val SN = T2
      val CSN = T2
      val PB13B = U2
      val CS1N = U2
      val PB15A = R2
      val HOLDN = R2
      val DI = R2
      val BUSY = R2
      val CSSPIN = R2
      val CEN = R2
      val PB15B = R3
      val DOUT = R3
      val CSON = R3
      val PB18A = T3
      val WRITEN = T3
      val PB4A = R1
      val D7 = R1
      val IO7 = R1
      val PB4B = T1
      val D6 = T1
      val IO6 = T1
      val PB6A = U1
      val D5 = U1
      val MISO2 = U1
      val IO5 = U1
      val PB6B = V1
      val D4 = V1
      val MOSI2 = V1
      val IO4 = V1
      val PB9A = W1
      val D3 = W1
      val IO3 = W1
      val PB9B = Y2
      val D2 = Y2
      val IO2 = Y2
      val PROGRAMN = W3
    end byName
  end Bank8
  val bank8 = new Bank8

  object ios:
    export bank0.pins.*
    export bank1.pins.*
    export bank2.pins.*
    export bank3.pins.*
    export bank6.pins.*
    export bank7.pins.*
    export bank8.pins.*
    object byName:
      export bank0.byName.*
      export bank1.byName.*
      export bank2.byName.*
      export bank3.byName.*
      export bank6.byName.*
      export bank7.byName.*
      export bank8.byName.*
    end byName
  end ios
end BG381

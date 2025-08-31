package dfhdl.platforms.devices.alteraintel.packages
import dfhdl.platforms.devices.alteraintel.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

trait F484 extends dfhdl.platforms.devices.Package:
  final lazy val packageName: String = "F484"

  class Bank1A extends Bank:
    object pins:
      val F5 = Pin("DIFFIO_RX_L1n/ADC1IN1")
      val E4 = Pin("DIFFIO_RX_L2n/ADC2IN1")
      val F4 = Pin("DIFFIO_RX_L1p/ADC1IN2")
      val E3 = Pin("DIFFIO_RX_L2p/ADC2IN8")
      val J8 = Pin("DIFFIO_RX_L3n/ADC1IN3")
      val G4 = Pin("DIFFIO_RX_L4n/ADC2IN3")
      val J9 = Pin("DIFFIO_RX_L3p/ADC1IN4")
      val F3 = Pin("DIFFIO_RX_L4p/ADC2IN4")
      val J4 = Pin("DIFFIO_RX_L5n/ADC1IN5")
      val H4 = Pin("DIFFIO_RX_L6n/ADC2IN5")
      val H3 = Pin("DIFFIO_RX_L5p/ADC1IN6")
      val G3 = Pin("DIFFIO_RX_L6p/ADC2IN6")
      val K5 = Pin("DIFFIO_RX_L7n/ADC1IN7")
      val K4 = Pin("DIFFIO_RX_L8n/ADC2IN7")
      val K6 = Pin("DIFFIO_RX_L7p/ADC1IN8")
      val J3 = Pin("DIFFIO_RX_L8p/ADC2IN2")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_L1n = F5
      val ADC1IN1       = F5
      val DIFFIO_RX_L2n = E4
      val ADC2IN1       = E4
      val DIFFIO_RX_L1p = F4
      val ADC1IN2       = F4
      val DIFFIO_RX_L2p = E3
      val ADC2IN8       = E3
      val DIFFIO_RX_L3n = J8
      val ADC1IN3       = J8
      val DIFFIO_RX_L4n = G4
      val ADC2IN3       = G4
      val DIFFIO_RX_L3p = J9
      val ADC1IN4       = J9
      val DIFFIO_RX_L4p = F3
      val ADC2IN4       = F3
      val DIFFIO_RX_L5n = J4
      val ADC1IN5       = J4
      val DIFFIO_RX_L6n = H4
      val ADC2IN5       = H4
      val DIFFIO_RX_L5p = H3
      val ADC1IN6       = H3
      val DIFFIO_RX_L6p = G3
      val ADC2IN6       = G3
      val DIFFIO_RX_L7n = K5
      val ADC1IN7       = K5
      val DIFFIO_RX_L8n = K4
      val ADC2IN7       = K4
      val DIFFIO_RX_L7p = K6
      val ADC1IN8       = K6
      val DIFFIO_RX_L8p = J3
      val ADC2IN2       = J3
    end byName
  end Bank1A
  val bank1A = new Bank1A

  class Bank1B extends Bank:
    object pins:
      val K8 = Pin("DIFFIO_RX_L15n")
      val D3 = Pin("DIFFIO_RX_L16n")
      val D2 = Pin("DIFFIO_RX_L16p")
      val C1 = Pin("VREFB1N0")
      val D1 = Pin("IO_BANK1B")
      val K2 = Pin("DIFFIO_RX_L19n")
      val L2 = Pin("DIFFIO_RX_L19p")
      val L8 = Pin("DIFFIO_RX_L20n")
      val E1 = Pin("DIFFIO_RX_L21n")
      val L9 = Pin("DIFFIO_RX_L20p")
      val F2 = Pin("DIFFIO_RX_L21p")
      val H1 = Pin("DIFFIO_RX_L22n")
      val G1 = Pin("DIFFIO_RX_L23n")
      val J1 = Pin("DIFFIO_RX_L22p")
      val F1 = Pin("DIFFIO_RX_L23p")
      val M4 = Pin("DIFFIO_RX_L24n")
      val K1 = Pin("DIFFIO_RX_L25n")
      val M3 = Pin("DIFFIO_RX_L24p")
      val L1 = Pin("DIFFIO_RX_L25p")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_L15n = K8
      val DIFFIO_RX_L16n = D3
      val DIFFIO_RX_L16p = D2
      val VREFB1N0       = C1
      val IO_BANK1B      = D1
      val DIFFIO_RX_L19n = K2
      val DIFFIO_RX_L19p = L2
      val DIFFIO_RX_L20n = L8
      val DIFFIO_RX_L21n = E1
      val DIFFIO_RX_L20p = L9
      val DIFFIO_RX_L21p = F2
      val DIFFIO_RX_L22n = H1
      val DIFFIO_RX_L23n = G1
      val DIFFIO_RX_L22p = J1
      val DIFFIO_RX_L23p = F1
      val DIFFIO_RX_L24n = M4
      val DIFFIO_RX_L25n = K1
      val DIFFIO_RX_L24p = M3
      val DIFFIO_RX_L25p = L1
    end byName
  end Bank1B
  val bank1B = new Bank1B

  class Bank2 extends Bank:
    object pins:
      val N4 = Pin("DIFFIO_RX_L28n/CLK0n")
      val P4 = Pin("DIFFIO_RX_L29n")
      val N5 = Pin("DIFFIO_RX_L28p/CLK0p")
      val P5 = Pin("DIFFIO_RX_L29p")
      val M8 = Pin("DIFFIO_RX_L36n/CLK1n")
      val N3 = Pin("DIFFIO_RX_L37n")
      val M9 = Pin("DIFFIO_RX_L36p/CLK1p")
      val N2 = Pin("DIFFIO_RX_L37p")
      val P3 = Pin("DIFFIO_RX_L38n/DPCLK0")
      val M2 = Pin("VREFB2N0")
      val R3 = Pin("DIFFIO_RX_L38p/DPCLK1")
      val M1 = Pin("IO_BANK2")
      val R4 = Pin("DIFFIO_RX_L39n")
      val T1 = Pin("DIFFIO_RX_L40n")
      val R5 = Pin("DIFFIO_RX_L39p")
      val T2 = Pin("DIFFIO_RX_L40p")
      val N8 = Pin("DIFFIO_RX_L41n")
      val P1 = Pin("DIFFIO_RX_L42n")
      val N9 = Pin("DIFFIO_RX_L41p")
      val N1 = Pin("DIFFIO_RX_L42p")
      val T3 = Pin("DIFFIO_RX_L43n")
      val U1 = Pin("DIFFIO_RX_L44n")
      val U2 = Pin("DIFFIO_RX_L43p")
      val V1 = Pin("DIFFIO_RX_L44p")
      val U4 = Pin("DIFFIO_RX_L45n")
      val U3 = Pin("DIFFIO_RX_L46n")
      val U5 = Pin("DIFFIO_RX_L45p")
      val V3 = Pin("DIFFIO_RX_L46p")
      val P8 = Pin("DIFFIO_RX_L47n")
      val W1 = Pin("DIFFIO_RX_L48n")
      val R7 = Pin("DIFFIO_RX_L47p")
      val W2 = Pin("DIFFIO_RX_L48p")
      val T5 = Pin("DIFFIO_RX_L59n/PLL_L_CLKOUTn")
      val R1 = Pin("DIFFIO_RX_L60n")
      val T6 = Pin("DIFFIO_RX_L59p/PLL_L_CLKOUTp")
      val R2 = Pin("DIFFIO_RX_L60p")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_L28n = N4
      val CLK0n          = N4
      val DIFFIO_RX_L29n = P4
      val DIFFIO_RX_L28p = N5
      val CLK0p          = N5
      val DIFFIO_RX_L29p = P5
      val DIFFIO_RX_L36n = M8
      val CLK1n          = M8
      val DIFFIO_RX_L37n = N3
      val DIFFIO_RX_L36p = M9
      val CLK1p          = M9
      val DIFFIO_RX_L37p = N2
      val DIFFIO_RX_L38n = P3
      val DPCLK0         = P3
      val VREFB2N0       = M2
      val DIFFIO_RX_L38p = R3
      val DPCLK1         = R3
      val IO_BANK2       = M1
      val DIFFIO_RX_L39n = R4
      val DIFFIO_RX_L40n = T1
      val DIFFIO_RX_L39p = R5
      val DIFFIO_RX_L40p = T2
      val DIFFIO_RX_L41n = N8
      val DIFFIO_RX_L42n = P1
      val DIFFIO_RX_L41p = N9
      val DIFFIO_RX_L42p = N1
      val DIFFIO_RX_L43n = T3
      val DIFFIO_RX_L44n = U1
      val DIFFIO_RX_L43p = U2
      val DIFFIO_RX_L44p = V1
      val DIFFIO_RX_L45n = U4
      val DIFFIO_RX_L46n = U3
      val DIFFIO_RX_L45p = U5
      val DIFFIO_RX_L46p = V3
      val DIFFIO_RX_L47n = P8
      val DIFFIO_RX_L48n = W1
      val DIFFIO_RX_L47p = R7
      val DIFFIO_RX_L48p = W2
      val DIFFIO_RX_L59n = T5
      val PLL_L_CLKOUTn  = T5
      val DIFFIO_RX_L60n = R1
      val DIFFIO_RX_L59p = T6
      val PLL_L_CLKOUTp  = T6
      val DIFFIO_RX_L60p = R2
    end byName
  end Bank2
  val bank2 = new Bank2

  class Bank3 extends Bank:
    object pins:
      val W5   = Pin("DIFFIO_TX_RX_B1n")
      val V4   = Pin("DIFFIO_RX_B2n")
      val W6   = Pin("DIFFIO_TX_RX_B1p")
      val V5   = Pin("DIFFIO_RX_B2p")
      val U6   = Pin("DIFFIO_TX_RX_B3n")
      val Y1   = Pin("DIFFIO_RX_B4n")
      val U7   = Pin("DIFFIO_TX_RX_B3p")
      val Y2   = Pin("DIFFIO_RX_B4p")
      val W4   = Pin("DIFFIO_TX_RX_B5n")
      val AA1  = Pin("DIFFIO_RX_B6n")
      val W3   = Pin("DIFFIO_TX_RX_B5p")
      val AA2  = Pin("DIFFIO_RX_B6p")
      val V7   = Pin("DIFFIO_TX_RX_B7n")
      val Y5   = Pin("DIFFIO_RX_B8n")
      val V8   = Pin("DIFFIO_TX_RX_B7p")
      val Y6   = Pin("DIFFIO_RX_B8p")
      val R9   = Pin("DIFFIO_TX_RX_B9n")
      val Y7   = Pin("DIFFIO_RX_B10n")
      val P9   = Pin("DIFFIO_TX_RX_B9p")
      val Y8   = Pin("DIFFIO_RX_B10p")
      val W9   = Pin("DIFFIO_TX_RX_B11n")
      val AB2  = Pin("DIFFIO_RX_B12n")
      val W10  = Pin("DIFFIO_TX_RX_B11p")
      val AB3  = Pin("DIFFIO_RX_B12p")
      val W7   = Pin("DIFFIO_TX_RX_B13n")
      val Y3   = Pin("DIFFIO_RX_B14n")
      val W8   = Pin("DIFFIO_TX_RX_B13p")
      val Y4   = Pin("DIFFIO_RX_B14p")
      val R10  = Pin("DIFFIO_TX_RX_B15n")
      val AA3  = Pin("VREFB3N0")
      val P10  = Pin("DIFFIO_TX_RX_B15p")
      val AB4  = Pin("IO_BANK3")
      val AA6  = Pin("DIFFIO_TX_RX_B16n")
      val AA5  = Pin("DIFFIO_RX_B17n")
      val AA7  = Pin("DIFFIO_TX_RX_B16p")
      val AB5  = Pin("DIFFIO_RX_B17p")
      val V9   = Pin("DIFFIO_TX_RX_B18n/CLK6n")
      val AB6  = Pin("DIFFIO_RX_B19n")
      val V10  = Pin("DIFFIO_TX_RX_B18p/CLK6p")
      val AB7  = Pin("DIFFIO_RX_B19p")
      val R11  = Pin("DIFFIO_TX_RX_B20n/CLK7n")
      val AA8  = Pin("DIFFIO_RX_B21n")
      val P11  = Pin("DIFFIO_TX_RX_B20p/CLK7p")
      val AB8  = Pin("DIFFIO_RX_B21p")
      val Y10  = Pin("DIFFIO_TX_RX_B22n")
      val AA9  = Pin("DIFFIO_RX_B23n")
      val AA10 = Pin("DIFFIO_TX_RX_B22p")
      val AB9  = Pin("DIFFIO_RX_B23p")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_TX_RX_B1n  = W5
      val DIFFIO_RX_B2n     = V4
      val DIFFIO_TX_RX_B1p  = W6
      val DIFFIO_RX_B2p     = V5
      val DIFFIO_TX_RX_B3n  = U6
      val DIFFIO_RX_B4n     = Y1
      val DIFFIO_TX_RX_B3p  = U7
      val DIFFIO_RX_B4p     = Y2
      val DIFFIO_TX_RX_B5n  = W4
      val DIFFIO_RX_B6n     = AA1
      val DIFFIO_TX_RX_B5p  = W3
      val DIFFIO_RX_B6p     = AA2
      val DIFFIO_TX_RX_B7n  = V7
      val DIFFIO_RX_B8n     = Y5
      val DIFFIO_TX_RX_B7p  = V8
      val DIFFIO_RX_B8p     = Y6
      val DIFFIO_TX_RX_B9n  = R9
      val DIFFIO_RX_B10n    = Y7
      val DIFFIO_TX_RX_B9p  = P9
      val DIFFIO_RX_B10p    = Y8
      val DIFFIO_TX_RX_B11n = W9
      val DIFFIO_RX_B12n    = AB2
      val DIFFIO_TX_RX_B11p = W10
      val DIFFIO_RX_B12p    = AB3
      val DIFFIO_TX_RX_B13n = W7
      val DIFFIO_RX_B14n    = Y3
      val DIFFIO_TX_RX_B13p = W8
      val DIFFIO_RX_B14p    = Y4
      val DIFFIO_TX_RX_B15n = R10
      val VREFB3N0          = AA3
      val DIFFIO_TX_RX_B15p = P10
      val IO_BANK3          = AB4
      val DIFFIO_TX_RX_B16n = AA6
      val DIFFIO_RX_B17n    = AA5
      val DIFFIO_TX_RX_B16p = AA7
      val DIFFIO_RX_B17p    = AB5
      val DIFFIO_TX_RX_B18n = V9
      val CLK6n             = V9
      val DIFFIO_RX_B19n    = AB6
      val DIFFIO_TX_RX_B18p = V10
      val CLK6p             = V10
      val DIFFIO_RX_B19p    = AB7
      val DIFFIO_TX_RX_B20n = R11
      val CLK7n             = R11
      val DIFFIO_RX_B21n    = AA8
      val DIFFIO_TX_RX_B20p = P11
      val CLK7p             = P11
      val DIFFIO_RX_B21p    = AB8
      val DIFFIO_TX_RX_B22n = Y10
      val DIFFIO_RX_B23n    = AA9
      val DIFFIO_TX_RX_B22p = AA10
      val DIFFIO_RX_B23p    = AB9
    end byName
  end Bank3
  val bank3 = new Bank3

  class Bank4 extends Bank:
    object pins:
      val V11  = Pin("DIFFIO_TX_RX_B24n")
      val W11  = Pin("DIFFIO_RX_B25n")
      val V12  = Pin("DIFFIO_TX_RX_B24p")
      val Y11  = Pin("DIFFIO_RX_B25p")
      val R12  = Pin("DIFFIO_TX_RX_B26n")
      val AB10 = Pin("DIFFIO_RX_B27n")
      val P12  = Pin("DIFFIO_TX_RX_B26p")
      val AB11 = Pin("DIFFIO_RX_B27p")
      val AA11 = Pin("DIFFIO_TX_RX_B28n")
      val AB12 = Pin("DIFFIO_RX_B29n")
      val AA12 = Pin("DIFFIO_TX_RX_B28p")
      val AB13 = Pin("DIFFIO_RX_B29p")
      val V13  = Pin("DIFFIO_TX_RX_B34n")
      val W12  = Pin("DIFFIO_RX_B35n")
      val W14  = Pin("DIFFIO_TX_RX_B34p")
      val W13  = Pin("DIFFIO_RX_B35p")
      val R13  = Pin("DIFFIO_TX_RX_B36n")
      val AA13 = Pin("VREFB4N0")
      val P13  = Pin("DIFFIO_TX_RX_B36p")
      val AB14 = Pin("IO_BANK4")
      val Y13  = Pin("DIFFIO_TX_RX_B37n")
      val AA14 = Pin("DIFFIO_RX_B38n")
      val Y14  = Pin("DIFFIO_TX_RX_B37p")
      val AB15 = Pin("DIFFIO_RX_B38p")
      val V14  = Pin("DIFFIO_TX_RX_B39n")
      val AA15 = Pin("DIFFIO_RX_B40n")
      val W15  = Pin("DIFFIO_TX_RX_B39p")
      val Y16  = Pin("DIFFIO_RX_B40p")
      val U15  = Pin("DIFFIO_TX_RX_B41n")
      val AB16 = Pin("DIFFIO_RX_B42n")
      val V16  = Pin("DIFFIO_TX_RX_B41p")
      val AA16 = Pin("DIFFIO_RX_B42p")
      val AA17 = Pin("DIFFIO_TX_RX_B43n")
      val AB19 = Pin("DIFFIO_RX_B44n")
      val Y17  = Pin("DIFFIO_TX_RX_B43p")
      val AB20 = Pin("DIFFIO_RX_B44p")
      val V15  = Pin("DIFFIO_TX_RX_B45n")
      val AA19 = Pin("DIFFIO_RX_B46n")
      val W16  = Pin("DIFFIO_TX_RX_B45p")
      val Y18  = Pin("DIFFIO_RX_B46p")
      val Y19  = Pin("DIFFIO_TX_RX_B49n")
      val AB21 = Pin("DIFFIO_RX_B50n")
      val W18  = Pin("DIFFIO_TX_RX_B49p")
      val AA20 = Pin("DIFFIO_RX_B50p")
      val W17  = Pin("DIFFIO_TX_RX_B57n/PLL_B_CLKOUTn")
      val AB17 = Pin("DIFFIO_RX_B58n")
      val V17  = Pin("DIFFIO_TX_RX_B57p/PLL_B_CLKOUTp")
      val AB18 = Pin("DIFFIO_RX_B58p")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_TX_RX_B24n = V11
      val DIFFIO_RX_B25n    = W11
      val DIFFIO_TX_RX_B24p = V12
      val DIFFIO_RX_B25p    = Y11
      val DIFFIO_TX_RX_B26n = R12
      val DIFFIO_RX_B27n    = AB10
      val DIFFIO_TX_RX_B26p = P12
      val DIFFIO_RX_B27p    = AB11
      val DIFFIO_TX_RX_B28n = AA11
      val DIFFIO_RX_B29n    = AB12
      val DIFFIO_TX_RX_B28p = AA12
      val DIFFIO_RX_B29p    = AB13
      val DIFFIO_TX_RX_B34n = V13
      val DIFFIO_RX_B35n    = W12
      val DIFFIO_TX_RX_B34p = W14
      val DIFFIO_RX_B35p    = W13
      val DIFFIO_TX_RX_B36n = R13
      val VREFB4N0          = AA13
      val DIFFIO_TX_RX_B36p = P13
      val IO_BANK4          = AB14
      val DIFFIO_TX_RX_B37n = Y13
      val DIFFIO_RX_B38n    = AA14
      val DIFFIO_TX_RX_B37p = Y14
      val DIFFIO_RX_B38p    = AB15
      val DIFFIO_TX_RX_B39n = V14
      val DIFFIO_RX_B40n    = AA15
      val DIFFIO_TX_RX_B39p = W15
      val DIFFIO_RX_B40p    = Y16
      val DIFFIO_TX_RX_B41n = U15
      val DIFFIO_RX_B42n    = AB16
      val DIFFIO_TX_RX_B41p = V16
      val DIFFIO_RX_B42p    = AA16
      val DIFFIO_TX_RX_B43n = AA17
      val DIFFIO_RX_B44n    = AB19
      val DIFFIO_TX_RX_B43p = Y17
      val DIFFIO_RX_B44p    = AB20
      val DIFFIO_TX_RX_B45n = V15
      val DIFFIO_RX_B46n    = AA19
      val DIFFIO_TX_RX_B45p = W16
      val DIFFIO_RX_B46p    = Y18
      val DIFFIO_TX_RX_B49n = Y19
      val DIFFIO_RX_B50n    = AB21
      val DIFFIO_TX_RX_B49p = W18
      val DIFFIO_RX_B50p    = AA20
      val DIFFIO_TX_RX_B57n = W17
      val PLL_B_CLKOUTn     = W17
      val DIFFIO_RX_B58n    = AB17
      val DIFFIO_TX_RX_B57p = V17
      val PLL_B_CLKOUTp     = V17
      val DIFFIO_RX_B58p    = AB18
    end byName
  end Bank4
  val bank4 = new Bank4

  class Bank5 extends Bank:
    object pins:
      val U18  = Pin("DIFFIO_RX_R1p/RUP")
      val AA21 = Pin("DIFFIO_RX_R2p")
      val U17  = Pin("DIFFIO_RX_R1n/RDN")
      val AA22 = Pin("DIFFIO_RX_R2n")
      val V18  = Pin("DIFFIO_RX_R19p")
      val Y22  = Pin("DIFFIO_RX_R20p")
      val U19  = Pin("DIFFIO_RX_R19n")
      val W22  = Pin("DIFFIO_RX_R20n")
      val W19  = Pin("DIFFIO_RX_R21p")
      val Y20  = Pin("DIFFIO_RX_R22p")
      val W20  = Pin("DIFFIO_RX_R21n")
      val Y21  = Pin("DIFFIO_RX_R22n")
      val V20  = Pin("DIFFIO_RX_R23p")
      val V21  = Pin("DIFFIO_RX_R24p")
      val U20  = Pin("DIFFIO_RX_R23n")
      val V22  = Pin("DIFFIO_RX_R24n")
      val R15  = Pin("DIFFIO_RX_R25p")
      val T21  = Pin("DIFFIO_RX_R26p")
      val R14  = Pin("DIFFIO_RX_R25n")
      val T22  = Pin("DIFFIO_RX_R26n")
      val T19  = Pin("DIFFIO_RX_R27p")
      val T20  = Pin("DIFFIO_RX_R28p")
      val T18  = Pin("DIFFIO_RX_R27n")
      val R20  = Pin("DIFFIO_RX_R28n")
      val U21  = Pin("DIFFIO_RX_R29p")
      val R22  = Pin("IO_BANK5")
      val U22  = Pin("DIFFIO_RX_R29n")
      val P22  = Pin("VREFB5N0")
      val P15  = Pin("DIFFIO_RX_R30p")
      val P21  = Pin("DIFFIO_RX_R31p")
      val P14  = Pin("DIFFIO_RX_R30n")
      val N22  = Pin("DIFFIO_RX_R31n")
      val R18  = Pin("DIFFIO_RX_R32p")
      val P19  = Pin("DIFFIO_RX_R33p")
      val P18  = Pin("DIFFIO_RX_R32n")
      val P20  = Pin("DIFFIO_RX_R33n")
      val M21  = Pin("DIFFIO_RX_R34p")
      val N21  = Pin("DIFFIO_RX_R35p")
      val L22  = Pin("DIFFIO_RX_R34n")
      val M22  = Pin("DIFFIO_RX_R35n")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_R1p  = U18
      val RUP            = U18
      val DIFFIO_RX_R2p  = AA21
      val DIFFIO_RX_R1n  = U17
      val RDN            = U17
      val DIFFIO_RX_R2n  = AA22
      val DIFFIO_RX_R19p = V18
      val DIFFIO_RX_R20p = Y22
      val DIFFIO_RX_R19n = U19
      val DIFFIO_RX_R20n = W22
      val DIFFIO_RX_R21p = W19
      val DIFFIO_RX_R22p = Y20
      val DIFFIO_RX_R21n = W20
      val DIFFIO_RX_R22n = Y21
      val DIFFIO_RX_R23p = V20
      val DIFFIO_RX_R24p = V21
      val DIFFIO_RX_R23n = U20
      val DIFFIO_RX_R24n = V22
      val DIFFIO_RX_R25p = R15
      val DIFFIO_RX_R26p = T21
      val DIFFIO_RX_R25n = R14
      val DIFFIO_RX_R26n = T22
      val DIFFIO_RX_R27p = T19
      val DIFFIO_RX_R28p = T20
      val DIFFIO_RX_R27n = T18
      val DIFFIO_RX_R28n = R20
      val DIFFIO_RX_R29p = U21
      val IO_BANK5       = R22
      val DIFFIO_RX_R29n = U22
      val VREFB5N0       = P22
      val DIFFIO_RX_R30p = P15
      val DIFFIO_RX_R31p = P21
      val DIFFIO_RX_R30n = P14
      val DIFFIO_RX_R31n = N22
      val DIFFIO_RX_R32p = R18
      val DIFFIO_RX_R33p = P19
      val DIFFIO_RX_R32n = P18
      val DIFFIO_RX_R33n = P20
      val DIFFIO_RX_R34p = M21
      val DIFFIO_RX_R35p = N21
      val DIFFIO_RX_R34n = L22
      val DIFFIO_RX_R35n = M22
    end byName
  end Bank5
  val bank5 = new Bank5

  class Bank6 extends Bank:
    object pins:
      val N14 = Pin("DIFFIO_RX_R38p/CLK2p")
      val H22 = Pin("DIFFIO_RX_R39p")
      val N15 = Pin("DIFFIO_RX_R38n/CLK2n")
      val H21 = Pin("DIFFIO_RX_R39n")
      val K22 = Pin("DIFFIO_RX_R40p/CLK3p")
      val J22 = Pin("DIFFIO_RX_R41p")
      val K21 = Pin("DIFFIO_RX_R40n/CLK3n")
      val J21 = Pin("DIFFIO_RX_R41n")
      val G20 = Pin("DIFFIO_RX_R42p")
      val G22 = Pin("DIFFIO_RX_R43p")
      val G19 = Pin("DIFFIO_RX_R42n")
      val F22 = Pin("DIFFIO_RX_R43n")
      val M15 = Pin("DIFFIO_RX_R44p")
      val E22 = Pin("DIFFIO_RX_R45p")
      val M14 = Pin("DIFFIO_RX_R44n")
      val E21 = Pin("DIFFIO_RX_R45n")
      val N18 = Pin("DIFFIO_RX_R46p")
      val M20 = Pin("DIFFIO_RX_R47p")
      val N19 = Pin("DIFFIO_RX_R46n")
      val N20 = Pin("DIFFIO_RX_R47n")
      val F21 = Pin("DIFFIO_RX_R48p")
      val D22 = Pin("DIFFIO_RX_R49p")
      val F20 = Pin("DIFFIO_RX_R48n")
      val C22 = Pin("DIFFIO_RX_R49n")
      val L14 = Pin("DIFFIO_RX_R50p/DPCLK3")
      val D21 = Pin("VREFB6N0")
      val L15 = Pin("DIFFIO_RX_R50n/DPCLK2")
      val C21 = Pin("IO_BANK6")
      val M18 = Pin("DIFFIO_RX_R51p")
      val L19 = Pin("DIFFIO_RX_R52p")
      val L18 = Pin("DIFFIO_RX_R51n")
      val L20 = Pin("DIFFIO_RX_R52n")
      val E19 = Pin("DIFFIO_RX_R53p")
      val F19 = Pin("DIFFIO_RX_R54p")
      val F18 = Pin("DIFFIO_RX_R53n")
      val E20 = Pin("DIFFIO_RX_R54n")
      val K14 = Pin("DIFFIO_RX_R55p")
      val C20 = Pin("DIFFIO_RX_R56p")
      val K15 = Pin("DIFFIO_RX_R55n")
      val D19 = Pin("DIFFIO_RX_R56n")
      val K18 = Pin("DIFFIO_RX_R57p")
      val K19 = Pin("DIFFIO_RX_R58p")
      val J18 = Pin("DIFFIO_RX_R57n")
      val K20 = Pin("DIFFIO_RX_R58n")
      val F17 = Pin("DIFFIO_RX_R59p")
      val B22 = Pin("DIFFIO_RX_R60p")
      val E17 = Pin("DIFFIO_RX_R59n")
      val B21 = Pin("DIFFIO_RX_R60n")
      val J14 = Pin("DIFFIO_RX_R61p")
      val B20 = Pin("DIFFIO_RX_R62p")
      val J15 = Pin("DIFFIO_RX_R61n")
      val A21 = Pin("DIFFIO_RX_R62n")
      val H19 = Pin("DIFFIO_RX_R63p")
      val J20 = Pin("DIFFIO_RX_R64p")
      val H18 = Pin("DIFFIO_RX_R63n")
      val H20 = Pin("DIFFIO_RX_R64n")
      val H17 = Pin("DIFFIO_RX_R69p/PLL_R_CLKOUTp")
      val D18 = Pin("DIFFIO_RX_R70p")
      val G17 = Pin("DIFFIO_RX_R69n/PLL_R_CLKOUTn")
      val E18 = Pin("DIFFIO_RX_R70n")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_R38p = N14
      val CLK2p          = N14
      val DIFFIO_RX_R39p = H22
      val DIFFIO_RX_R38n = N15
      val CLK2n          = N15
      val DIFFIO_RX_R39n = H21
      val DIFFIO_RX_R40p = K22
      val CLK3p          = K22
      val DIFFIO_RX_R41p = J22
      val DIFFIO_RX_R40n = K21
      val CLK3n          = K21
      val DIFFIO_RX_R41n = J21
      val DIFFIO_RX_R42p = G20
      val DIFFIO_RX_R43p = G22
      val DIFFIO_RX_R42n = G19
      val DIFFIO_RX_R43n = F22
      val DIFFIO_RX_R44p = M15
      val DIFFIO_RX_R45p = E22
      val DIFFIO_RX_R44n = M14
      val DIFFIO_RX_R45n = E21
      val DIFFIO_RX_R46p = N18
      val DIFFIO_RX_R47p = M20
      val DIFFIO_RX_R46n = N19
      val DIFFIO_RX_R47n = N20
      val DIFFIO_RX_R48p = F21
      val DIFFIO_RX_R49p = D22
      val DIFFIO_RX_R48n = F20
      val DIFFIO_RX_R49n = C22
      val DIFFIO_RX_R50p = L14
      val DPCLK3         = L14
      val VREFB6N0       = D21
      val DIFFIO_RX_R50n = L15
      val DPCLK2         = L15
      val IO_BANK6       = C21
      val DIFFIO_RX_R51p = M18
      val DIFFIO_RX_R52p = L19
      val DIFFIO_RX_R51n = L18
      val DIFFIO_RX_R52n = L20
      val DIFFIO_RX_R53p = E19
      val DIFFIO_RX_R54p = F19
      val DIFFIO_RX_R53n = F18
      val DIFFIO_RX_R54n = E20
      val DIFFIO_RX_R55p = K14
      val DIFFIO_RX_R56p = C20
      val DIFFIO_RX_R55n = K15
      val DIFFIO_RX_R56n = D19
      val DIFFIO_RX_R57p = K18
      val DIFFIO_RX_R58p = K19
      val DIFFIO_RX_R57n = J18
      val DIFFIO_RX_R58n = K20
      val DIFFIO_RX_R59p = F17
      val DIFFIO_RX_R60p = B22
      val DIFFIO_RX_R59n = E17
      val DIFFIO_RX_R60n = B21
      val DIFFIO_RX_R61p = J14
      val DIFFIO_RX_R62p = B20
      val DIFFIO_RX_R61n = J15
      val DIFFIO_RX_R62n = A21
      val DIFFIO_RX_R63p = H19
      val DIFFIO_RX_R64p = J20
      val DIFFIO_RX_R63n = H18
      val DIFFIO_RX_R64n = H20
      val DIFFIO_RX_R69p = H17
      val PLL_R_CLKOUTp  = H17
      val DIFFIO_RX_R70p = D18
      val DIFFIO_RX_R69n = G17
      val PLL_R_CLKOUTn  = G17
      val DIFFIO_RX_R70n = E18
    end byName
  end Bank6
  val bank6 = new Bank6

  class Bank7 extends Bank:
    object pins:
      val E16 = Pin("DIFFIO_RX_T1p")
      val D17 = Pin("DIFFIO_RX_T2p")
      val E15 = Pin("DIFFIO_RX_T1n")
      val C17 = Pin("DIFFIO_RX_T2n")
      val F16 = Pin("DIFFIO_RX_T5p")
      val C19 = Pin("DIFFIO_RX_T6p")
      val F15 = Pin("DIFFIO_RX_T5n")
      val B19 = Pin("DIFFIO_RX_T6n")
      val C18 = Pin("DIFFIO_RX_T7p")
      val A20 = Pin("DIFFIO_RX_T8p")
      val B17 = Pin("DIFFIO_RX_T7n")
      val A19 = Pin("DIFFIO_RX_T8n")
      val D15 = Pin("DIFFIO_RX_T9p")
      val A18 = Pin("DIFFIO_RX_T10p")
      val E14 = Pin("DIFFIO_RX_T9n")
      val A17 = Pin("DIFFIO_RX_T10n")
      val C16 = Pin("DIFFIO_RX_T15p")
      val B16 = Pin("DIFFIO_RX_T16p")
      val C15 = Pin("DIFFIO_RX_T15n")
      val A16 = Pin("DIFFIO_RX_T16n")
      val H14 = Pin("DIFFIO_RX_T17p")
      val A15 = Pin("IO_BANK7")
      val J13 = Pin("DIFFIO_RX_T17n")
      val B15 = Pin("VREFB7N0")
      val C14 = Pin("DIFFIO_RX_T18p")
      val A14 = Pin("DIFFIO_RX_T19p")
      val C13 = Pin("DIFFIO_RX_T18n")
      val B14 = Pin("DIFFIO_RX_T19n")
      val D14 = Pin("DIFFIO_RX_T20p")
      val E12 = Pin("DIFFIO_RX_T21p")
      val E13 = Pin("DIFFIO_RX_T20n")
      val D13 = Pin("DIFFIO_RX_T21n")
      val H13 = Pin("DIFFIO_RX_T22p")
      val A13 = Pin("DIFFIO_RX_T23p")
      val J12 = Pin("DIFFIO_RX_T22n")
      val A12 = Pin("DIFFIO_RX_T23n")
      val C12 = Pin("DIFFIO_RX_T24p")
      val A11 = Pin("DIFFIO_RX_T25p")
      val D12 = Pin("DIFFIO_RX_T24n")
      val A10 = Pin("DIFFIO_RX_T25n")
      val C11 = Pin("DIFFIO_RX_T26p")
      val B12 = Pin("DIFFIO_RX_T27p")
      val C10 = Pin("DIFFIO_RX_T26n")
      val B11 = Pin("DIFFIO_RX_T27n")
      val H12 = Pin("DIFFIO_RX_T28p")
      val A7  = Pin("DIFFIO_RX_T29p")
      val J11 = Pin("DIFFIO_RX_T28n")
      val A8  = Pin("DIFFIO_RX_T29n")
      val B10 = Pin("DIFFIO_RX_T30p")
      val A9  = Pin("DIFFIO_RX_T31p")
      val C9  = Pin("DIFFIO_RX_T30n")
      val B8  = Pin("DIFFIO_RX_T31n")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_T1p  = E16
      val DIFFIO_RX_T2p  = D17
      val DIFFIO_RX_T1n  = E15
      val DIFFIO_RX_T2n  = C17
      val DIFFIO_RX_T5p  = F16
      val DIFFIO_RX_T6p  = C19
      val DIFFIO_RX_T5n  = F15
      val DIFFIO_RX_T6n  = B19
      val DIFFIO_RX_T7p  = C18
      val DIFFIO_RX_T8p  = A20
      val DIFFIO_RX_T7n  = B17
      val DIFFIO_RX_T8n  = A19
      val DIFFIO_RX_T9p  = D15
      val DIFFIO_RX_T10p = A18
      val DIFFIO_RX_T9n  = E14
      val DIFFIO_RX_T10n = A17
      val DIFFIO_RX_T15p = C16
      val DIFFIO_RX_T16p = B16
      val DIFFIO_RX_T15n = C15
      val DIFFIO_RX_T16n = A16
      val DIFFIO_RX_T17p = H14
      val IO_BANK7       = A15
      val DIFFIO_RX_T17n = J13
      val VREFB7N0       = B15
      val DIFFIO_RX_T18p = C14
      val DIFFIO_RX_T19p = A14
      val DIFFIO_RX_T18n = C13
      val DIFFIO_RX_T19n = B14
      val DIFFIO_RX_T20p = D14
      val DIFFIO_RX_T21p = E12
      val DIFFIO_RX_T20n = E13
      val DIFFIO_RX_T21n = D13
      val DIFFIO_RX_T22p = H13
      val DIFFIO_RX_T23p = A13
      val DIFFIO_RX_T22n = J12
      val DIFFIO_RX_T23n = A12
      val DIFFIO_RX_T24p = C12
      val DIFFIO_RX_T25p = A11
      val DIFFIO_RX_T24n = D12
      val DIFFIO_RX_T25n = A10
      val DIFFIO_RX_T26p = C11
      val DIFFIO_RX_T27p = B12
      val DIFFIO_RX_T26n = C10
      val DIFFIO_RX_T27n = B11
      val DIFFIO_RX_T28p = H12
      val DIFFIO_RX_T29p = A7
      val DIFFIO_RX_T28n = J11
      val DIFFIO_RX_T29n = A8
      val DIFFIO_RX_T30p = B10
      val DIFFIO_RX_T31p = A9
      val DIFFIO_RX_T30n = C9
      val DIFFIO_RX_T31n = B8
    end byName
  end Bank7
  val bank7 = new Bank7

  class Bank8 extends Bank:
    object pins:
      val E11 = Pin("DIFFIO_RX_T38p/CLK4p")
      val C8  = Pin("DIFFIO_RX_T39p")
      val E10 = Pin("DIFFIO_RX_T38n/CLK4n")
      val C7  = Pin("DIFFIO_RX_T39n")
      val J10 = Pin("DIFFIO_RX_T40p/CLK5p")
      val B7  = Pin("DIFFIO_RX_T41p")
      val H11 = Pin("DIFFIO_RX_T40n/CLK5n")
      val A6  = Pin("DIFFIO_RX_T41n")
      val D8  = Pin("DIFFIO_RX_T42p")
      val A5  = Pin("DIFFIO_RX_T43p")
      val A4  = Pin("DIFFIO_RX_T43n")
      val C6  = Pin("IO_BANK8")
      val E9  = Pin("DIFFIO_RX_T44n")
      val D7  = Pin("VREFB8N0")
      val A2  = Pin("DIFFIO_RX_T45p")
      val A3  = Pin("DIFFIO_RX_T45n")
      val B3  = Pin("DIFFIO_RX_T46p")
      val B5  = Pin("DIFFIO_RX_T47p")
      val B4  = Pin("DIFFIO_RX_T46n")
      val C4  = Pin("DIFFIO_RX_T47n")
      val E8  = Pin("DIFFIO_RX_T48p")
      val C5  = Pin("DIFFIO_RX_T49p")
      val D5  = Pin("DIFFIO_RX_T49n")
      val B2  = Pin("DIFFIO_RX_T51p")
      val B1  = Pin("DIFFIO_RX_T51n")
      val D6  = Pin("DIFFIO_RX_T52p/PLL_T_CLKOUTp")
      val C3  = Pin("DIFFIO_RX_T53p")
      val E6  = Pin("DIFFIO_RX_T52n/PLL_T_CLKOUTn")
      val C2  = Pin("DIFFIO_RX_T53n")
    end pins
    pins
    object byName:
      import pins.*
      val DIFFIO_RX_T38p = E11
      val CLK4p          = E11
      val DIFFIO_RX_T39p = C8
      val DIFFIO_RX_T38n = E10
      val CLK4n          = E10
      val DIFFIO_RX_T39n = C7
      val DIFFIO_RX_T40p = J10
      val CLK5p          = J10
      val DIFFIO_RX_T41p = B7
      val DIFFIO_RX_T40n = H11
      val CLK5n          = H11
      val DIFFIO_RX_T41n = A6
      val DIFFIO_RX_T42p = D8
      val DIFFIO_RX_T43p = A5
      val DIFFIO_RX_T43n = A4
      val IO_BANK8       = C6
      val DIFFIO_RX_T44n = E9
      val VREFB8N0       = D7
      val DIFFIO_RX_T45p = A2
      val DIFFIO_RX_T45n = A3
      val DIFFIO_RX_T46p = B3
      val DIFFIO_RX_T47p = B5
      val DIFFIO_RX_T46n = B4
      val DIFFIO_RX_T47n = C4
      val DIFFIO_RX_T48p = E8
      val DIFFIO_RX_T49p = C5
      val DIFFIO_RX_T49n = D5
      val DIFFIO_RX_T51p = B2
      val DIFFIO_RX_T51n = B1
      val DIFFIO_RX_T52p = D6
      val PLL_T_CLKOUTp  = D6
      val DIFFIO_RX_T53p = C3
      val DIFFIO_RX_T52n = E6
      val PLL_T_CLKOUTn  = E6
      val DIFFIO_RX_T53n = C2
    end byName
  end Bank8
  val bank8 = new Bank8

  object ios:
    export bank1A.pins.*
    export bank1B.pins.*
    export bank2.pins.*
    export bank3.pins.*
    export bank4.pins.*
    export bank5.pins.*
    export bank6.pins.*
    export bank7.pins.*
    export bank8.pins.*
    object byName:
      export bank1A.byName.*
      export bank1B.byName.*
      export bank2.byName.*
      export bank3.byName.*
      export bank4.byName.*
      export bank5.byName.*
      export bank6.byName.*
      export bank7.byName.*
      export bank8.byName.*
    end byName
  end ios
end F484

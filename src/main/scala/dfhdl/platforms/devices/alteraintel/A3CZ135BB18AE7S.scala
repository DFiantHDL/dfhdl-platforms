package dfhdl.platforms.devices.alteraintel
import dfhdl.hw.constraints.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

@deviceInfo(slewRateSlowest = 2, slewRateFastest = 2)
class A3CZ135BB18AE7S extends Device(true):
  lazy val deviceName: String    = "A3CZ135B"
  lazy val packageName: String   = "B18A"
  lazy val partName: String      = s"A3CZ135BB18AE7S"
  lazy val deviceVersion: String = ""

  class Bank3A_T extends Bank:
    object pins:
      val A22 = Pin("IOB95/DIFF_IO_3A_T1n")
      val A19 = Pin("IOB94/DIFF_IO_3A_T1p")
      val B24 = Pin("IOB93/DIFF_IO_3A_T2n")
      val A24 = Pin("IOB92/DIFF_IO_3A_T2p")
      val B26 = Pin("IOB91/DIFF_IO_3A_T3n")
      val A26 = Pin("IOB90/AVST_READY/DIFF_IO_3A_T3p")
      val B27 = Pin("IOB89/DIFF_IO_3A_T4n")
      val A29 = Pin("IOB88/DIFF_IO_3A_T4p")
      val B34 = Pin("IOB87/DIFF_IO_3A_T5n")
      val A34 = Pin("IOB86/DIFF_IO_3A_T5p")
      val A31 = Pin("IOB85/DIFF_IO_3A_T6n")
      val B29 = Pin("IOB84/DIFF_IO_3A_T6p")
      val A37 = Pin("IOB83/AVST_DATA10/DIFF_IO_3A_T7n")
      val B37 = Pin("IOB82/AVST_DATA9/DIFF_IO_3A_T7p")
      val A42 = Pin("IOB81/AVST_DATA8/DIFF_IO_3A_T8n")
      val B39 = Pin("IOB80/AVST_VALID/DIFF_IO_3A_T8p")
      val A44 = Pin("IOB79/AVST_DATA7/DIFF_IO_3A_T9n")
      val B42 = Pin("IOB78/AVST_DATA6/DIFF_IO_3A_T9p")
      val A45 = Pin("IOB77/AVST_DATA5/DIFF_IO_3A_T10n")
      val B45 = Pin("IOB76/AVST_DATA4/DIFF_IO_3A_T10p")
      val B51 = Pin("IOB75/AVST_DATA3/DIFF_IO_3A_T11n")
      val B50 = Pin("IOB74/AVST_DATA2/DIFF_IO_3A_T11p")
      val A47 = Pin("IOB73/AVST_DATA1/DIFF_IO_3A_T12n")
      val B47 = Pin("IOB72/AVST_DATA0/DIFF_IO_3A_T12p")
      val F32 = Pin("IOB71/DIFF_IO_3A_T13n")
      val D32 = Pin("IOB70/DIFF_IO_3A_T13p")
      val K32 = Pin("IOB69/DIFF_IO_3A_T14n")
      val K35 = Pin("IOB68/DIFF_IO_3A_T14p")
      val H35 = Pin("IOB67/DIFF_IO_3A_T15n")
      val F35 = Pin("IOB66/DIFF_IO_3A_T15p")
      val F40 = Pin("IOB65/PLL_3A_T_CLKOUT1n/DIFF_IO_3A_T16n")
      val D40 = Pin("IOB64/PLL_3A_T_CLKOUT1p/PLL_3A_T_CLKOUT1/PLL_3A_T_FB1/DIFF_IO_3A_T16p")
      val H43 = Pin("IOB63/DIFF_IO_3A_T17n")
      val F43 = Pin("IOB62/RZQ_T_3A/DIFF_IO_3A_T17p")
      val K40 = Pin("IOB61/CLK_T_3A_1n/DIFF_IO_3A_T18n")
      val K43 = Pin("IOB60/CLK_T_3A_1p/DIFF_IO_3A_T18p")
      val G51 = Pin("IOB59/CLK_T_3A_0n/DIFF_IO_3A_T19n")
      val G52 = Pin("IOB58/CLK_T_3A_0p/DIFF_IO_3A_T19p")
      val J52 = Pin("IOB57/DIFF_IO_3A_T20n")
      val J51 = Pin("IOB56/DIFF_IO_3A_T20p")
      val M52 = Pin("IOB55/PLL_3A_T_CLKOUT0n/DIFF_IO_3A_T21n")
      val L51 = Pin("IOB54/PLL_3A_T_CLKOUT0p/PLL_3A_T_CLKOUT0/PLL_3A_T_FB0/DIFF_IO_3A_T21p")
      val N52 = Pin("IOB53/AVST_CLK/DIFF_IO_3A_T22n")
      val M51 = Pin("IOB52/AVST_DATA15/DIFF_IO_3A_T22p")
      val V52 = Pin("IOB51/AVST_DATA14/DIFF_IO_3A_T23n")
      val V51 = Pin("IOB50/AVST_DATA13/DIFF_IO_3A_T23p")
      val R52 = Pin("IOB49/AVST_DATA12/DIFF_IO_3A_T24n")
      val R51 = Pin("IOB48/AVST_DATA11/DIFF_IO_3A_T24p")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val IOB95             = A22
      val DIFF_IO_3A_T1n    = A22
      val IOB94             = A19
      val DIFF_IO_3A_T1p    = A19
      val IOB93             = B24
      val DIFF_IO_3A_T2n    = B24
      val IOB92             = A24
      val DIFF_IO_3A_T2p    = A24
      val IOB91             = B26
      val DIFF_IO_3A_T3n    = B26
      val IOB90             = A26
      val AVST_READY        = A26
      val DIFF_IO_3A_T3p    = A26
      val IOB89             = B27
      val DIFF_IO_3A_T4n    = B27
      val IOB88             = A29
      val DIFF_IO_3A_T4p    = A29
      val IOB87             = B34
      val DIFF_IO_3A_T5n    = B34
      val IOB86             = A34
      val DIFF_IO_3A_T5p    = A34
      val IOB85             = A31
      val DIFF_IO_3A_T6n    = A31
      val IOB84             = B29
      val DIFF_IO_3A_T6p    = B29
      val IOB83             = A37
      val AVST_DATA10       = A37
      val DIFF_IO_3A_T7n    = A37
      val IOB82             = B37
      val AVST_DATA9        = B37
      val DIFF_IO_3A_T7p    = B37
      val IOB81             = A42
      val AVST_DATA8        = A42
      val DIFF_IO_3A_T8n    = A42
      val IOB80             = B39
      val AVST_VALID        = B39
      val DIFF_IO_3A_T8p    = B39
      val IOB79             = A44
      val AVST_DATA7        = A44
      val DIFF_IO_3A_T9n    = A44
      val IOB78             = B42
      val AVST_DATA6        = B42
      val DIFF_IO_3A_T9p    = B42
      val IOB77             = A45
      val AVST_DATA5        = A45
      val DIFF_IO_3A_T10n   = A45
      val IOB76             = B45
      val AVST_DATA4        = B45
      val DIFF_IO_3A_T10p   = B45
      val IOB75             = B51
      val AVST_DATA3        = B51
      val DIFF_IO_3A_T11n   = B51
      val IOB74             = B50
      val AVST_DATA2        = B50
      val DIFF_IO_3A_T11p   = B50
      val IOB73             = A47
      val AVST_DATA1        = A47
      val DIFF_IO_3A_T12n   = A47
      val IOB72             = B47
      val AVST_DATA0        = B47
      val DIFF_IO_3A_T12p   = B47
      val IOB71             = F32
      val DIFF_IO_3A_T13n   = F32
      val IOB70             = D32
      val DIFF_IO_3A_T13p   = D32
      val IOB69             = K32
      val DIFF_IO_3A_T14n   = K32
      val IOB68             = K35
      val DIFF_IO_3A_T14p   = K35
      val IOB67             = H35
      val DIFF_IO_3A_T15n   = H35
      val IOB66             = F35
      val DIFF_IO_3A_T15p   = F35
      val IOB65             = F40
      val PLL_3A_T_CLKOUT1n = F40
      val DIFF_IO_3A_T16n   = F40
      val IOB64             = D40
      val PLL_3A_T_CLKOUT1p = D40
      val PLL_3A_T_CLKOUT1  = D40
      val PLL_3A_T_FB1      = D40
      val DIFF_IO_3A_T16p   = D40
      val IOB63             = H43
      val DIFF_IO_3A_T17n   = H43
      val IOB62             = F43
      val RZQ_T_3A          = F43
      val DIFF_IO_3A_T17p   = F43
      val IOB61             = K40
      val CLK_T_3A_1n       = K40
      val DIFF_IO_3A_T18n   = K40
      val IOB60             = K43
      val CLK_T_3A_1p       = K43
      val DIFF_IO_3A_T18p   = K43
      val IOB59             = G51
      val CLK_T_3A_0n       = G51
      val DIFF_IO_3A_T19n   = G51
      val IOB58             = G52
      val CLK_T_3A_0p       = G52
      val DIFF_IO_3A_T19p   = G52
      val IOB57             = J52
      val DIFF_IO_3A_T20n   = J52
      val IOB56             = J51
      val DIFF_IO_3A_T20p   = J51
      val IOB55             = M52
      val PLL_3A_T_CLKOUT0n = M52
      val DIFF_IO_3A_T21n   = M52
      val IOB54             = L51
      val PLL_3A_T_CLKOUT0p = L51
      val PLL_3A_T_CLKOUT0  = L51
      val PLL_3A_T_FB0      = L51
      val DIFF_IO_3A_T21p   = L51
      val IOB53             = N52
      val AVST_CLK          = N52
      val DIFF_IO_3A_T22n   = N52
      val IOB52             = M51
      val AVST_DATA15       = M51
      val DIFF_IO_3A_T22p   = M51
      val IOB51             = V52
      val AVST_DATA14       = V52
      val DIFF_IO_3A_T23n   = V52
      val IOB50             = V51
      val AVST_DATA13       = V51
      val DIFF_IO_3A_T23p   = V51
      val IOB49             = R52
      val AVST_DATA12       = R52
      val DIFF_IO_3A_T24n   = R52
      val IOB48             = R51
      val AVST_DATA11       = R51
      val DIFF_IO_3A_T24p   = R51
    end byName
  end Bank3A_T
  val bank3A_T = new Bank3A_T

  class Bank6A extends Bank:
    object pins:
      val BH32 = Pin("HVIO_6A_1/TXCLK1/Data_Ctrl1")
      val BK32 = Pin("HVIO_6A_2/TXCLK2/Data_Ctrl2")
      val BH26 = Pin("HVIO_6A_3/TXCLK3/Data_Ctrl3")
      val BH27 = Pin("HVIO_6A_4/TXCLK4/Data_Ctrl4")
      val BH21 = Pin("HVIO_6A_5/TXCLK5/Data_Ctrl5")
      val BK18 = Pin("HVIO_6A_6/TXCLK6/Data_Ctrl6")
      val BK26 = Pin("HVIO_6A_7/TXCLK7/Data_Ctrl7")
      val BH18 = Pin("HVIO_6A_8/TXCLK8/Data_Ctrl8")
      val BM34 = Pin("HVIO_6A_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val BN29 = Pin("HVIO_6A_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val BN34 = Pin("HVIO_6A_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val BM29 = Pin("HVIO_6A_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val BM26 = Pin("HVIO_6A_13/TXCLK13/Data_Ctrl13")
      val BM31 = Pin("HVIO_6A_14/TXCLK14/Data_Ctrl14")
      val BN27 = Pin("HVIO_6A_15/TXCLK15/Data_Ctrl15")
      val BN26 = Pin("HVIO_6A_16/TXCLK16/Data_Ctrl16")
      val BM24 = Pin("HVIO_6A_17/TXCLK17/Data_Ctrl17")
      val BN24 = Pin("HVIO_6A_18/TXCLK18/Data_Ctrl18")
      val BN19 = Pin("HVIO_6A_19/TXCLK19/Data_Ctrl19")
      val BM22 = Pin("HVIO_6A_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6A_1  = BH32
      val HVIO_6A_2  = BK32
      val HVIO_6A_3  = BH26
      val HVIO_6A_4  = BH27
      val HVIO_6A_5  = BH21
      val HVIO_6A_6  = BK18
      val HVIO_6A_7  = BK26
      val HVIO_6A_8  = BH18
      val HVIO_6A_9  = BM34
      val HVIO_6A_10 = BN29
      val HVIO_6A_11 = BN34
      val HVIO_6A_12 = BM29
      val HVIO_6A_13 = BM26
      val HVIO_6A_14 = BM31
      val HVIO_6A_15 = BN27
      val HVIO_6A_16 = BN26
      val HVIO_6A_17 = BM24
      val HVIO_6A_18 = BN24
      val HVIO_6A_19 = BN19
      val HVIO_6A_20 = BM22
    end byName
  end Bank6A
  val bank6A = new Bank6A

  class Bank6B extends Bank:
    object pins:
      val BM37 = Pin("HVIO_6B_1/TXCLK1/Data_Ctrl1")
      val BN37 = Pin("HVIO_6B_2/TXCLK2/Data_Ctrl2")
      val BN39 = Pin("HVIO_6B_3/TXCLK3/Data_Ctrl3")
      val BM44 = Pin("HVIO_6B_4/TXCLK4/Data_Ctrl4")
      val BM42 = Pin("HVIO_6B_5/TXCLK5/Data_Ctrl5")
      val BN42 = Pin("HVIO_6B_6/TXCLK6/Data_Ctrl6")
      val BM45 = Pin("HVIO_6B_7/TXCLK7/Data_Ctrl7")
      val BN45 = Pin("HVIO_6B_8/TXCLK8/Data_Ctrl8")
      val BM47 = Pin("HVIO_6B_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val BN47 = Pin("HVIO_6B_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val BM51 = Pin("HVIO_6B_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val BM50 = Pin("HVIO_6B_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val BH46 = Pin("HVIO_6B_13/TXCLK13/Data_Ctrl13")
      val BK50 = Pin("HVIO_6B_14/TXCLK14/Data_Ctrl14")
      val BH50 = Pin("HVIO_6B_15/TXCLK15/Data_Ctrl15")
      val BL51 = Pin("HVIO_6B_16/TXCLK16/Data_Ctrl16")
      val BK40 = Pin("HVIO_6B_17/TXCLK17/Data_Ctrl17")
      val BH35 = Pin("HVIO_6B_18/TXCLK18/Data_Ctrl18")
      val BH43 = Pin("HVIO_6B_19/TXCLK19/Data_Ctrl19")
      val BH40 = Pin("HVIO_6B_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6B_1  = BM37
      val HVIO_6B_2  = BN37
      val HVIO_6B_3  = BN39
      val HVIO_6B_4  = BM44
      val HVIO_6B_5  = BM42
      val HVIO_6B_6  = BN42
      val HVIO_6B_7  = BM45
      val HVIO_6B_8  = BN45
      val HVIO_6B_9  = BM47
      val HVIO_6B_10 = BN47
      val HVIO_6B_11 = BM51
      val HVIO_6B_12 = BM50
      val HVIO_6B_13 = BH46
      val HVIO_6B_14 = BK50
      val HVIO_6B_15 = BH50
      val HVIO_6B_16 = BL51
      val HVIO_6B_17 = BK40
      val HVIO_6B_18 = BH35
      val HVIO_6B_19 = BH43
      val HVIO_6B_20 = BH40
    end byName
  end Bank6B
  val bank6B = new Bank6B

  class Bank6C extends Bank:
    object pins:
      val B16 = Pin("HVIO_6C_1/TXCLK1/Data_Ctrl1")
      val A14 = Pin("HVIO_6C_2/TXCLK2/Data_Ctrl2")
      val B19 = Pin("HVIO_6C_3/TXCLK3/Data_Ctrl3")
      val B14 = Pin("HVIO_6C_4/TXCLK4/Data_Ctrl4")
      val A11 = Pin("HVIO_6C_5/TXCLK5/Data_Ctrl5")
      val A9  = Pin("HVIO_6C_6/TXCLK6/Data_Ctrl6")
      val B11 = Pin("HVIO_6C_7/TXCLK7/Data_Ctrl7")
      val B8  = Pin("HVIO_6C_8/TXCLK8/Data_Ctrl8")
      val A8  = Pin("HVIO_6C_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val B3  = Pin("HVIO_6C_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val B5  = Pin("HVIO_6C_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val C2  = Pin("HVIO_6C_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val K7  = Pin("HVIO_6C_13/TXCLK13/Data_Ctrl13")
      val F3  = Pin("HVIO_6C_14/TXCLK14/Data_Ctrl14")
      val D3  = Pin("HVIO_6C_15/TXCLK15/Data_Ctrl15")
      val U12 = Pin("HVIO_6C_16/TXCLK16/Data_Ctrl16")
      val P9  = Pin("HVIO_6C_17/TXCLK17/Data_Ctrl17")
      val U9  = Pin("HVIO_6C_18/TXCLK18/Data_Ctrl18")
      val W9  = Pin("HVIO_6C_19/TXCLK19/Data_Ctrl19")
      val W12 = Pin("HVIO_6C_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6C_1  = B16
      val HVIO_6C_2  = A14
      val HVIO_6C_3  = B19
      val HVIO_6C_4  = B14
      val HVIO_6C_5  = A11
      val HVIO_6C_6  = A9
      val HVIO_6C_7  = B11
      val HVIO_6C_8  = B8
      val HVIO_6C_9  = A8
      val HVIO_6C_10 = B3
      val HVIO_6C_11 = B5
      val HVIO_6C_12 = C2
      val HVIO_6C_13 = K7
      val HVIO_6C_14 = F3
      val HVIO_6C_15 = D3
      val HVIO_6C_16 = U12
      val HVIO_6C_17 = P9
      val HVIO_6C_18 = U9
      val HVIO_6C_19 = W9
      val HVIO_6C_20 = W12
    end byName
  end Bank6C
  val bank6C = new Bank6C

  class Bank6D extends Bank:
    object pins:
      val F7  = Pin("HVIO_6D_1/TXCLK1/Data_Ctrl1")
      val H7  = Pin("HVIO_6D_2/TXCLK2/Data_Ctrl2")
      val F13 = Pin("HVIO_6D_3/TXCLK3/Data_Ctrl3")
      val F10 = Pin("HVIO_6D_4/TXCLK4/Data_Ctrl4")
      val H13 = Pin("HVIO_6D_5/TXCLK5/Data_Ctrl5")
      val K21 = Pin("HVIO_6D_6/TXCLK6/Data_Ctrl6")
      val K13 = Pin("HVIO_6D_7/TXCLK7/Data_Ctrl7")
      val K10 = Pin("HVIO_6D_8/TXCLK8/Data_Ctrl8")
      val D18 = Pin("HVIO_6D_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val D10 = Pin("HVIO_6D_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val F18 = Pin("HVIO_6D_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val F21 = Pin("HVIO_6D_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val K18 = Pin("HVIO_6D_13/TXCLK13/Data_Ctrl13")
      val H21 = Pin("HVIO_6D_14/TXCLK14/Data_Ctrl14")
      val F27 = Pin("HVIO_6D_15/TXCLK15/Data_Ctrl15")
      val D26 = Pin("HVIO_6D_16/TXCLK16/Data_Ctrl16")
      val H27 = Pin("HVIO_6D_17/TXCLK17/Data_Ctrl17")
      val F26 = Pin("HVIO_6D_18/TXCLK18/Data_Ctrl18")
      val K26 = Pin("HVIO_6D_19/TXCLK19/Data_Ctrl19")
      val K27 = Pin("HVIO_6D_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6D_1  = F7
      val HVIO_6D_2  = H7
      val HVIO_6D_3  = F13
      val HVIO_6D_4  = F10
      val HVIO_6D_5  = H13
      val HVIO_6D_6  = K21
      val HVIO_6D_7  = K13
      val HVIO_6D_8  = K10
      val HVIO_6D_9  = D18
      val HVIO_6D_10 = D10
      val HVIO_6D_11 = F18
      val HVIO_6D_12 = F21
      val HVIO_6D_13 = K18
      val HVIO_6D_14 = H21
      val HVIO_6D_15 = F27
      val HVIO_6D_16 = D26
      val HVIO_6D_17 = H27
      val HVIO_6D_18 = F26
      val HVIO_6D_19 = K26
      val HVIO_6D_20 = K27
    end byName
  end Bank6D
  val bank6D = new Bank6D

  class Bank6E extends Bank:
    object pins:
      val BL2  = Pin("HVIO_6E_1/TXCLK1/Data_Ctrl1")
      val AP9  = Pin("HVIO_6E_2/TXCLK2/Data_Ctrl2")
      val BH13 = Pin("HVIO_6E_3/TXCLK3/Data_Ctrl3")
      val AT12 = Pin("HVIO_6E_4/TXCLK4/Data_Ctrl4")
      val BK7  = Pin("HVIO_6E_5/TXCLK5/Data_Ctrl5")
      val AW12 = Pin("HVIO_6E_6/TXCLK6/Data_Ctrl6")
      val BH7  = Pin("HVIO_6E_7/TXCLK7/Data_Ctrl7")
      val BB9  = Pin("HVIO_6E_8/TXCLK8/Data_Ctrl8")
      val AU4  = Pin("HVIO_6E_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val AT9  = Pin("HVIO_6E_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val AU6  = Pin("HVIO_6E_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val AY6  = Pin("HVIO_6E_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val BH3  = Pin("HVIO_6E_13/TXCLK13/Data_Ctrl13")
      val BB12 = Pin("HVIO_6E_14/TXCLK14/Data_Ctrl14")
      val BF9  = Pin("HVIO_6E_15/TXCLK15/Data_Ctrl15")
      val BF12 = Pin("HVIO_6E_16/TXCLK16/Data_Ctrl16")
      val BM3  = Pin("HVIO_6E_17/TXCLK17/Data_Ctrl17")
      val BM2  = Pin("HVIO_6E_18/TXCLK18/Data_Ctrl18")
      val BK10 = Pin("HVIO_6E_19/TXCLK19/Data_Ctrl19")
      val BH10 = Pin("HVIO_6E_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6E_1  = BL2
      val HVIO_6E_2  = AP9
      val HVIO_6E_3  = BH13
      val HVIO_6E_4  = AT12
      val HVIO_6E_5  = BK7
      val HVIO_6E_6  = AW12
      val HVIO_6E_7  = BH7
      val HVIO_6E_8  = BB9
      val HVIO_6E_9  = AU4
      val HVIO_6E_10 = AT9
      val HVIO_6E_11 = AU6
      val HVIO_6E_12 = AY6
      val HVIO_6E_13 = BH3
      val HVIO_6E_14 = BB12
      val HVIO_6E_15 = BF9
      val HVIO_6E_16 = BF12
      val HVIO_6E_17 = BM3
      val HVIO_6E_18 = BM2
      val HVIO_6E_19 = BK10
      val HVIO_6E_20 = BH10
    end byName
  end Bank6E
  val bank6E = new Bank6E

  class Bank6F extends Bank:
    object pins:
      val BN16 = Pin("HVIO_6F_1/TXCLK1/Data_Ctrl1")
      val BM19 = Pin("HVIO_6F_2/TXCLK2/Data_Ctrl2")
      val BM14 = Pin("HVIO_6F_3/TXCLK3/Data_Ctrl3")
      val BN14 = Pin("HVIO_6F_4/TXCLK4/Data_Ctrl4")
      val BN11 = Pin("HVIO_6F_5/TXCLK5/Data_Ctrl5")
      val BM11 = Pin("HVIO_6F_6/TXCLK6/Data_Ctrl6")
      val BN8  = Pin("HVIO_6F_7/TXCLK7/Data_Ctrl7")
      val BM8  = Pin("HVIO_6F_8/TXCLK8/Data_Ctrl8")
      val BN5  = Pin("HVIO_6F_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val BM9  = Pin("HVIO_6F_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val BJ2  = Pin("HVIO_6F_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val BJ1  = Pin("HVIO_6F_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val BG1  = Pin("HVIO_6F_13/TXCLK13/Data_Ctrl13")
      val BG2  = Pin("HVIO_6F_14/TXCLK14/Data_Ctrl14")
      val BC1  = Pin("HVIO_6F_15/TXCLK15/Data_Ctrl15")
      val BC2  = Pin("HVIO_6F_16/TXCLK16/Data_Ctrl16")
      val BE4  = Pin("HVIO_6F_17/TXCLK17/Data_Ctrl17")
      val BA2  = Pin("HVIO_6F_18/TXCLK18/Data_Ctrl18")
      val BD1  = Pin("HVIO_6F_19/TXCLK19/Data_Ctrl19")
      val BE6  = Pin("HVIO_6F_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6F_1  = BN16
      val HVIO_6F_2  = BM19
      val HVIO_6F_3  = BM14
      val HVIO_6F_4  = BN14
      val HVIO_6F_5  = BN11
      val HVIO_6F_6  = BM11
      val HVIO_6F_7  = BN8
      val HVIO_6F_8  = BM8
      val HVIO_6F_9  = BN5
      val HVIO_6F_10 = BM9
      val HVIO_6F_11 = BJ2
      val HVIO_6F_12 = BJ1
      val HVIO_6F_13 = BG1
      val HVIO_6F_14 = BG2
      val HVIO_6F_15 = BC1
      val HVIO_6F_16 = BC2
      val HVIO_6F_17 = BE4
      val HVIO_6F_18 = BA2
      val HVIO_6F_19 = BD1
      val HVIO_6F_20 = BE6
    end byName
  end Bank6F
  val bank6F = new Bank6F

  class Bank6G extends Bank:
    object pins:
      val AA6  = Pin("HVIO_6G_1/TXCLK1/Data_Ctrl1")
      val AE12 = Pin("HVIO_6G_2/TXCLK2/Data_Ctrl2")
      val AA4  = Pin("HVIO_6G_3/TXCLK3/Data_Ctrl3")
      val AB9  = Pin("HVIO_6G_4/TXCLK4/Data_Ctrl4")
      val AH12 = Pin("HVIO_6G_5/TXCLK5/Data_Ctrl5")
      val P6   = Pin("HVIO_6G_6/TXCLK6/Data_Ctrl6")
      val AD6  = Pin("HVIO_6G_7/TXCLK7/Data_Ctrl7")
      val P4   = Pin("HVIO_6G_8/TXCLK8/Data_Ctrl8")
      val AH9  = Pin("HVIO_6G_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val AK2  = Pin("HVIO_6G_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val AL12 = Pin("HVIO_6G_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val AK1  = Pin("HVIO_6G_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val AR1  = Pin("HVIO_6G_13/TXCLK13/Data_Ctrl13")
      val AJ4  = Pin("HVIO_6G_14/TXCLK14/Data_Ctrl14")
      val AJ6  = Pin("HVIO_6G_15/TXCLK15/Data_Ctrl15")
      val AR2  = Pin("HVIO_6G_16/TXCLK16/Data_Ctrl16")
      val AV1  = Pin("HVIO_6G_17/TXCLK17/Data_Ctrl17")
      val AN1  = Pin("HVIO_6G_18/TXCLK18/Data_Ctrl18")
      val AV2  = Pin("HVIO_6G_19/TXCLK19/Data_Ctrl19")
      val AL9  = Pin("HVIO_6G_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6G_1  = AA6
      val HVIO_6G_2  = AE12
      val HVIO_6G_3  = AA4
      val HVIO_6G_4  = AB9
      val HVIO_6G_5  = AH12
      val HVIO_6G_6  = P6
      val HVIO_6G_7  = AD6
      val HVIO_6G_8  = P4
      val HVIO_6G_9  = AH9
      val HVIO_6G_10 = AK2
      val HVIO_6G_11 = AL12
      val HVIO_6G_12 = AK1
      val HVIO_6G_13 = AR1
      val HVIO_6G_14 = AJ4
      val HVIO_6G_15 = AJ6
      val HVIO_6G_16 = AR2
      val HVIO_6G_17 = AV1
      val HVIO_6G_18 = AN1
      val HVIO_6G_19 = AV2
      val HVIO_6G_20 = AL9
    end byName
  end Bank6G
  val bank6G = new Bank6G

  class Bank6H extends Bank:
    object pins:
      val AG2 = Pin("HVIO_6H_1/TXCLK1/Data_Ctrl1")
      val AM6 = Pin("HVIO_6H_2/TXCLK2/Data_Ctrl2")
      val AF1 = Pin("HVIO_6H_3/TXCLK3/Data_Ctrl3")
      val AF2 = Pin("HVIO_6H_4/TXCLK4/Data_Ctrl4")
      val AC2 = Pin("HVIO_6H_5/TXCLK5/Data_Ctrl5")
      val AC1 = Pin("HVIO_6H_6/TXCLK6/Data_Ctrl6")
      val V2  = Pin("HVIO_6H_7/TXCLK7/Data_Ctrl7")
      val V1  = Pin("HVIO_6H_8/TXCLK8/Data_Ctrl8")
      val R2  = Pin("HVIO_6H_9/PLLREFCLK1/TXCLK9/RXCLK1/Data_Ctrl9")
      val Y1  = Pin("HVIO_6H_10/PLLREFCLK2/TXCLK10/RXCLK2/Data_Ctrl10")
      val N1  = Pin("HVIO_6H_11/SOURCE_SYNC_CLK1/TXCLK11/RXCLK3/Data_Ctrl11")
      val N2  = Pin("HVIO_6H_12/SOURCE_SYNC_CLK2/TXCLK12/RXCLK4/Data_Ctrl12")
      val M2  = Pin("HVIO_6H_13/TXCLK13/Data_Ctrl13")
      val M1  = Pin("HVIO_6H_14/TXCLK14/Data_Ctrl14")
      val T6  = Pin("HVIO_6H_15/TXCLK15/Data_Ctrl15")
      val L1  = Pin("HVIO_6H_16/TXCLK16/Data_Ctrl16")
      val J2  = Pin("HVIO_6H_17/TXCLK17/Data_Ctrl17")
      val J1  = Pin("HVIO_6H_18/TXCLK18/Data_Ctrl18")
      val E2  = Pin("HVIO_6H_19/TXCLK19/Data_Ctrl19")
      val K3  = Pin("HVIO_6H_20/TXCLK20/Data_Ctrl20")
    end pins
    pins // touch to force execution
    object byName:
      import pins.*
      val HVIO_6H_1  = AG2
      val HVIO_6H_2  = AM6
      val HVIO_6H_3  = AF1
      val HVIO_6H_4  = AF2
      val HVIO_6H_5  = AC2
      val HVIO_6H_6  = AC1
      val HVIO_6H_7  = V2
      val HVIO_6H_8  = V1
      val HVIO_6H_9  = R2
      val HVIO_6H_10 = Y1
      val HVIO_6H_11 = N1
      val HVIO_6H_12 = N2
      val HVIO_6H_13 = M2
      val HVIO_6H_14 = M1
      val HVIO_6H_15 = T6
      val HVIO_6H_16 = L1
      val HVIO_6H_17 = J2
      val HVIO_6H_18 = J1
      val HVIO_6H_19 = E2
      val HVIO_6H_20 = K3
    end byName
  end Bank6H
  val bank6H = new Bank6H

  object ios:
    export bank3A_T.pins.*
    export bank6A.pins.*
    export bank6B.pins.*
    export bank6C.pins.*
    export bank6D.pins.*
    export bank6E.pins.*
    export bank6F.pins.*
    export bank6G.pins.*
    export bank6H.pins.*
    object byName:
      export bank3A_T.byName.*
      export bank6A.byName.*
      export bank6B.byName.*
      export bank6C.byName.*
      export bank6D.byName.*
      export bank6E.byName.*
      export bank6F.byName.*
      export bank6G.byName.*
      export bank6H.byName.*
    end byName
  end ios
end A3CZ135BB18AE7S

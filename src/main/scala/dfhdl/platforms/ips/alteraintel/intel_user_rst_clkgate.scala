package dfhdl.platforms.ips.alteraintel
import dfhdl.*

class intel_user_rst_clkgate(
    val outputType: String <> CONST,
    val version: String <> CONST = ""
) extends EDBlackBox.QsysIP:
  val ninit_done = Bit <> OUT

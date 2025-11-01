package dfhdl.platforms.ips.alteraintel
import dfhdl.*
import intel_user_rst_clkgate.*
import scala.annotation.targetName

class intel_user_rst_clkgate(
    outputType: OutputType,
    version: String <> CONST = ""
) extends intel_user_rst_clkgate_internal(outputType = outputType.toString, version = version)

object intel_user_rst_clkgate:
  @inline def getGlobalClkEna: Bit <> DFRET =
    class glbl_rst
        extends intel_user_rst_clkgate(outputType = OutputType.ResetInterface, version = "")
    val glbl_rst_inst = glbl_rst()
    !glbl_rst_inst.ninit_done

  enum OutputType derives CanEqual:
    case ResetInterface, ConduitInterface
    override def toString: String = this match
      case ResetInterface   => "Reset Interface"
      case ConduitInterface => "Conduit Interface"

  @targetName("intel_user_rst_clkgate")
  protected class intel_user_rst_clkgate_internal(
      val outputType: String <> CONST,
      val version: String <> CONST = ""
  ) extends EDBlackBox.QsysIP:
    val ninit_done = Bit <> OUT
end intel_user_rst_clkgate

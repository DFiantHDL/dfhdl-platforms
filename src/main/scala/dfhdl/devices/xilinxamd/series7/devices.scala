package dfhdl.platforms.devices.xilinxamd.series7
import dfhdl.hw.constraints.*

class xc7a100tcsg324(
    val speedGrade: String
) extends Device, packages.CSG324:
  lazy val deviceName: String = "xc7a100t"

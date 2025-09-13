package dfhdl.platforms.devices.alteraintel
import dfhdl.hw.constraints.io

@io(missingPullDownSupport = true)
class `10M50DAF484C6GES` extends Device(false), packages.F484:
  lazy val deviceName: String = "MAX10DA"
  lazy val partName: String = "10M50DAF484C6GES"
  lazy val deviceVersion: String = ""

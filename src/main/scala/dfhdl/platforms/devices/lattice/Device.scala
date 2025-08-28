package dfhdl.platforms.devices.lattice
import dfhdl.hw.constraints.*

trait Device extends dfhdl.platforms.devices.Device:
  lazy val speed: String
  lazy val grade: String
  final lazy val vendor: deviceID.Vendor = deviceID.Vendor.Lattice
  final lazy val partName: String = s"$deviceName-$speed$packageName$grade"
  final lazy val deviceVersion: String = ""

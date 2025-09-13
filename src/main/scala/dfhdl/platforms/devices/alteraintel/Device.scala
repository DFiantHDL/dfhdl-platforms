package dfhdl.platforms.devices.alteraintel
import dfhdl.hw.constraints.*

abstract class Device(pro: Boolean) extends dfhdl.platforms.devices.Device:
  final lazy val vendor: deviceID.Vendor = deviceID.Vendor.AlteraIntel(pro)

package dfhdl.platforms.devices.alteraintel
import dfhdl.hw.constraints.*

trait Device extends dfhdl.platforms.devices.Device:
  final lazy val vendor: deviceID.Vendor = deviceID.Vendor.AlteraIntel

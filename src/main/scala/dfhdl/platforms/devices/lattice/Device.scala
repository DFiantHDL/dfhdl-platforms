package dfhdl.platforms.devices.lattice
import dfhdl.hw.constraints.*

trait Device extends dfhdl.platforms.devices.Device:
  final lazy val vendor: deviceID.Vendor = deviceID.Vendor.Lattice

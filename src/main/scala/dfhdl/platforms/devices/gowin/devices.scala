package dfhdl.platforms.devices.gowin

class GW5A_LV25MG121(val speedGrade: String, _deviceVersion: String)
    extends Device, packages.MG121N:
  lazy val deviceName: String = "GW5A-25A"
  lazy val partName: String = s"GW5A-LV25${packageName}$speedGrade"
  lazy val deviceVersion: String = _deviceVersion

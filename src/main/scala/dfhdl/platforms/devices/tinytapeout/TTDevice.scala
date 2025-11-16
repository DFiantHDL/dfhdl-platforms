package dfhdl.platforms.devices.tinytapeout
import dfhdl.hw.constraints.*
import dfhdl.*
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class TTDevice(val shuttle: String) extends dfhdl.platforms.devices.Device:
  final lazy val vendor: deviceID.Vendor = deviceID.Vendor.TinyTapeout
  final lazy val deviceName: String      = "TinyTapeout"
  final lazy val partName: String        = shuttle
  final lazy val deviceVersion: String   = ""
  final lazy val packageName: String     = "QFN64"

  object ios:
    val clk   = Pin(IN)
    val rst_n = Pin(IN)
    val uio0  = Pin(INOUT)
    val uio1  = Pin(INOUT)
    val uio2  = Pin(INOUT)
    val uio3  = Pin(INOUT)
    val uio4  = Pin(INOUT)
    val uio5  = Pin(INOUT)
    val uio6  = Pin(INOUT)
    val uio7  = Pin(INOUT)
    val uout0 = Pin(OUT)
    val uout1 = Pin(OUT)
    val uout2 = Pin(OUT)
    val uout3 = Pin(OUT)
    val uout4 = Pin(OUT)
    val uout5 = Pin(OUT)
    val uout6 = Pin(OUT)
    val uout7 = Pin(OUT)
    val uin0  = Pin(IN)
    val uin1  = Pin(IN)
    val uin2  = Pin(IN)
    val uin3  = Pin(IN)
    val uin4  = Pin(IN)
    val uin5  = Pin(IN)
    val uin6  = Pin(IN)
    val uin7  = Pin(IN)
  end ios
  ios // touch to force execution
end TTDevice

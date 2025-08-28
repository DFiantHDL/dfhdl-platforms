package dfhdl.platforms.devices.xilinxamd.series7
import Pin.*

class Pin(val name: String, val memory: Memory)(using bankOwner: Bank)
    extends dfhdl.platforms.devices.Pin

object Pin:
  sealed trait NA
  case object NA extends NA
  type Memory = NA | Int
  enum IOType:
    case HP, HR, CONFIG

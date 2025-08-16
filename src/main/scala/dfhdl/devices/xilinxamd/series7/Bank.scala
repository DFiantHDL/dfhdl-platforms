package dfhdl.platforms.devices.xilinxamd.series7
import Pin.IOType

abstract class Bank(val ioType: IOType) extends dfhdl.platforms.devices.Bank:
  type This <: Bank

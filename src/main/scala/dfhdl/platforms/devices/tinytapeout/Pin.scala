package dfhdl.platforms.devices.tinytapeout
import dfhdl.compiler.ir.constraints.IO
import dfhdl.core.ModifierAny

class Pin(modifier: ModifierAny) extends dfhdl.platforms.resources.IO:
  injectConstraint(IO(loc = id, dir = modifier.asIR.dir))

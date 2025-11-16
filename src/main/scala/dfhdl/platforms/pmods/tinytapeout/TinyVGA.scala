package dfhdl.platforms.pmods.tinytapeout
import dfhdl.platforms.resources.*
import dfhdl.platforms.pmods.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class TinyVGA extends PmodBoard:
  protected val J1       = PmodConn.Male()
  protected val pmodConn = J1

  @io(standard = io.Standard.LVCMOS)
  val vga = VGA(bitsPerColor = 2)
  J1.P(1)  <> vga.R(1)
  J1.P(2)  <> vga.G(1)
  J1.P(3)  <> vga.B(1)
  J1.P(4)  <> vga.VS
  J1.P(7)  <> vga.R(0)
  J1.P(8)  <> vga.G(0)
  J1.P(9)  <> vga.B(0)
  J1.P(10) <> vga.HS
end TinyVGA

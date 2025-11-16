package dfhdl.platforms.pmods.tinytapeout
import dfhdl.platforms.resources.*
import dfhdl.platforms.pmods.*
import dfhdl.hw.constraints.io
// scalafmt: { align.tokens = [{code = "<>"}, {code = "="}, {code = "->"}]}

class VGAClockPMOD extends PmodTripleBoard:
  protected val J1             = PmodConn.Male()
  protected val J2             = PmodConn.Male()
  protected val J3             = PmodConn.Male()
  protected val pmodTripleConn = PmodTripleConn.Male(J3, J2, J1)

  @io(standard = io.Standard.LVCMOS)
  val btn_hrs, btn_min, btn_sec = Button()
  J1.P(3) <> btn_sec
  J1.P(2) <> btn_min
  J1.P(1) <> btn_hrs

  @io(standard = io.Standard.LVCMOS)
  val vga = VGA(bitsPerColor = 2)
  J3.P(10) <> vga.R(1)
  J3.P(9)  <> vga.R(0)
  J3.P(8)  <> vga.G(1)
  J3.P(7)  <> vga.G(0)
  J3.P(4)  <> vga.B(1)
  J3.P(3)  <> vga.B(0)
  J3.P(2)  <> vga.VS
  J3.P(1)  <> vga.HS
end VGAClockPMOD

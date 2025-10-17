import dfhdl.*
import dfhdl.platforms.resources.*

class PlatformSpec extends DFSpec:
  test("Basys3 Seven Seg Display Connection Expected Error") {
    val disp_com = Bits(4) <> OUT
    val disp_A = Bit <> OUT
    val devBoard = dfhdl.platforms.devboards.digilent.Basys3()
    assertCompileError(
      """|Missing implicit expected active state for toggle resource `dfhdl.platforms.resources.SevenSegDisplay.Select`.
         |To fix this, add:
         |  `given ExpectedActiveState[dfhdl.platforms.resources.SevenSegDisplay.Select] = dfhdl.platforms.resources.SevenSegDisplay.Select.EXPECTED_ACTIVE_STATE`""".stripMargin
    )(
      """disp_com <> devBoard.sevenSegDisplay.SELECT"""
    )
    locally:
      given ExpectedActiveState[SevenSegDisplay.Select] = SevenSegDisplay.Select.Enabled
      disp_com <> devBoard.sevenSegDisplay.SELECT
  }
end PlatformSpec

package dfhdl.platforms.tinytapeout.tt_vga_clock
import dfhdl.*

@top class Digit(
    val DIGIT_INDEX_FILE: String = "tt_vga_clock/digit_index.hex",
    val COL_INDEX_FILE: String = "tt_vga_clock/col_index.hex",
    val COLOR_INDEX_FILE: String = "tt_vga_clock/color.bin",
    val COLOR_BITS: Int = 6,
    val FONT_W: Int <> CONST = 4,
    val FONT_H: Int <> CONST = 5,
    val NUM_BLOCKS: Int <> CONST = 32
) extends RTDesign:
  val COL_INDEX_W = clog2(FONT_W)
  val x_block = UInt(6) <> IN

  /** the number to display: [0->9] */
  val number = UInt.to(9) <> IN

  /** shift through the colours */
  val color_offset = UInt(4) <> IN
  val digit_index = UInt(6) <> OUT.REG
  val color = UInt(COLOR_BITS) <> OUT.REG
  val col_index = UInt(COL_INDEX_W) <> OUT.REG

  val digit_index_mem = UInt(6) X 12 <> VAR initFile DIGIT_INDEX_FILE
  val col_index_mem = UInt(COL_INDEX_W) X NUM_BLOCKS <> VAR initFile COL_INDEX_FILE
  val color_index_mem = UInt(COLOR_BITS) X 8 <> VAR initFile COLOR_INDEX_FILE

  val char = x_block.bits(5, 2).uint
  digit_index.din := digit_index_mem(number)
  col_index.din := col_index_mem((x_block min (NUM_BLOCKS - 1)).truncate)
  color.din := color_index_mem((char + color_offset).truncate)
end Digit

package dfhdl.platforms.tinytapeout.tt_vga_clock
import dfhdl.*

/** Button pulse generator.
  * @param MAX_COUNT
  *   max wait before issue next pulse
  * @param DEC_COUNT
  *   every pulse, decrement comparitor by this amount
  * @param MIN_COUNT
  *   until reaches this wait time
  */
@top class ButtonPulse(
    val MAX_COUNT: Int <> CONST = 8,
    val DEC_COUNT: Int <> CONST = 2,
    val MIN_COUNT: Int <> CONST = 1
) extends RTDesign:
  val clk_en = Bit <> IN
  val button = Bit <> IN
  val pulse = Bit <> OUT

  val comp = UInt.until(MAX_COUNT) <> VAR.REG init (MAX_COUNT - 1)
  val count = UInt.until(MAX_COUNT) <> VAR.REG init 0

  if (clk_en)
    if (button)
      count.din := count + 1;

    // if button is held, increase pulse rate by reducing comp
    if (count == 0 && comp > (MIN_COUNT + DEC_COUNT))
      comp.din := comp - DEC_COUNT;

    // reset counter
    if (count == comp)
      count.din := 0;

    // if button is released, set count and comp to default
    if (!button)
      count.din := 0;
      comp.din := MAX_COUNT - 1;
    end if
  end if
  pulse <> (clk_en && button && count == 0)
end ButtonPulse

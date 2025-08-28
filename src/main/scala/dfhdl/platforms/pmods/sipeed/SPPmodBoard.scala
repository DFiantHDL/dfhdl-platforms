package dfhdl.platforms.pmods.sipeed
import dfhdl.platforms.Board
import dfhdl.platforms.resources.*
import Resource.CanConnect

trait SPPmodBoard extends Board, Resource:
  protected val spPmodConn: SPPmodConn.Male
object SPPmodBoard:
  given [B <: SPPmodBoard, R <: Resource](
      using CanConnect[SPPmodConn.Male, R]
  ): CanConnect[B, R] = (b, r) => b.spPmodConn <> r

trait SPPmodDualBoard extends Board, Resource:
  protected val spPmodDualConn: SPPmodDualConn.Male
object SPPmodDualBoard:
  given [B <: SPPmodDualBoard, R <: Resource](
      using CanConnect[SPPmodDualConn.Male, R]
  ): CanConnect[B, R] = (b, r) => b.spPmodDualConn <> r

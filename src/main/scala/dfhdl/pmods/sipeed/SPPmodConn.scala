package dfhdl.platforms.pmods.sipeed
import dfhdl.platforms.resources.*
import Resource.CanConnect
import dfhdl.platforms.pmods.PmodConn
import dfhdl.platforms.pmods.PmodDualConn

object SPPmodConn extends Connector.Companion(12):
  private def standardPmodPinToSPPmodPin(i: Int): Int =
    11 - 2 * ((i - 1) % 6) + (i - 1) / 6
  given spPmodMaleToPmodFemale[M <: Male, F <: PmodConn.Female]: CanConnect[M, F] =
    (spMale, female) =>
      for (i <- 1 to 12)
        spMale.P(standardPmodPinToSPPmodPin(i)) <> female.P(i)
  given pmodMaleToSPPmodFemale[M <: PmodConn.Male, F <: Female]: CanConnect[M, F] =
    (male, spFemale) =>
      for (i <- 1 to 12)
        male.P(i) <> spFemale.P(standardPmodPinToSPPmodPin(i))

object SPPmodDualConn:
  class Male(val pm1: SPPmodConn.Male, val pm2: SPPmodConn.Male) extends ResourceDeps:
    lazy val upstreamDeps: List[Resource] = List(pm1, pm2)
  class Female(val pm1: SPPmodConn.Female, val pm2: SPPmodConn.Female) extends ResourceDeps:
    lazy val upstreamDeps: List[Resource] = List(pm1, pm2)

  given [M <: Male, F <: Female]: CanConnect[M, F] = (m, f) =>
    m.connectFrom(f)
    f.connectFrom(m)

  given pmodDualMaleToSPPmodDualFemale[M <: PmodDualConn.Male, F <: Female](using
      cc: CanConnect[PmodConn.Male, SPPmodConn.Female]
  ): CanConnect[M, F] = (dualM, spDualF) =>
    cc.connect(dualM.pm1, spDualF.pm1)
    cc.connect(dualM.pm2, spDualF.pm2)

  given spPmodDualFemaleToPmodDualMale[M <: Male, F <: PmodDualConn.Female](using
      cc: CanConnect[SPPmodConn.Male, PmodConn.Female]
  ): CanConnect[M, F] = (spDualM, dualF) =>
    cc.connect(spDualM.pm1, dualF.pm1)
    cc.connect(spDualM.pm2, dualF.pm2)
end SPPmodDualConn

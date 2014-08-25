package test_design_pattern_comportement;

public class Medecin extends Personnage 
{

public Medecin()
{
	this.soin = PremierSoin();
}

public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep)
{
	super (esprit, soin, dep);
}
	
}

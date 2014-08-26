package test_design_pattern_comportement;

public class Medecin extends Personnage 
{

	public Medecin()
	{
		this.soin = PremierSoin ();
		
		/*
		 
		 Toute petite erreur ici. PremierSoin est une classe. Tu cherches a mettre dans
		 this.soin une nouvelle instance de PremierSoin. Que manque t'il ?
		 Reponse plus bas ...
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 Spoiler :
		 
		 "new" :)
		 
		 */
	}
	
	public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep)
	{
		super (esprit, soin, dep);
	}
	
}

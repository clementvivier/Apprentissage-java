package test_design_pattern;

public class Medecin extends Personnage {

	public void combattre()
	{	if(this.armes.equals("Pistolet"))
		System.out.println("Attaque au Pistolet");
	else System.out.println("Vive le Scalpel");
	}
	
				public void soigner()
				{	if (this.sacDesoin.equals("petit sac"))
					System.out.println("Je peux recoudre des blessures");
				else 
			System.out.println("Je soigne les blessures");
		}
	

}

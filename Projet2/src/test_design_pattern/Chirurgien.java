package test_design_pattern;

public class Chirurgien extends Personnage {

	//public void combattre(){
		//System.out.println("Je ne combats PAS");
	//}

	//public void seDeplacer(){
		//System.out.println("Je me déplace à pieds");
	//}
	public void soigner ()
	{ if (this.sacDesoin.equals("Grand sac"))
		System.out.println("Je fais des opérations merveilleuses");
	
	else System.out.println("Je fais ce que je peux");
	
	}
}

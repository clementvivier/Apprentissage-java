package test_design_pattern;

public class Chirurgien extends Personnage {

	//public void combattre(){
		//System.out.println("Je ne combats PAS");
	//}

	//public void seDeplacer(){
		//System.out.println("Je me d�place � pieds");
	//}
	public void soigner ()
	{ if (this.sacDesoin.equals("Grand sac"))
		System.out.println("Je fais des op�rations merveilleuses");
	
	else System.out.println("Je fais ce que je peux");
	
	}
}

package test_design_pattern;

public class Sniper extends Personnage {

	//public void seDeplacer(){
		//System.out.println("Je me d�place � pieds");
	//}

	public void combattre()
	{		if (this.armes.equals("fusil � pompe"))
				System.out.println("Attaque au fusil � pompe !");
	else System.out.println("Je me sers de mon fusil � lunette");
	}
}

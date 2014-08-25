package test_design_pattern;

public class Sniper extends Personnage {

	//public void seDeplacer(){
		//System.out.println("Je me déplace à pieds");
	//}

	public void combattre()
	{		if (this.armes.equals("fusil à pompe"))
				System.out.println("Attaque au fusil à pompe !");
	else System.out.println("Je me sers de mon fusil à lunette");
	}
}

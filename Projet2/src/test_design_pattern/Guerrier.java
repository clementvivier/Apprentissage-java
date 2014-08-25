package test_design_pattern;

public class Guerrier extends Personnage {

public void combattre()
{		if (this.armes.equals ("Pistolet"))
	System.out.println("Attaque au Pistolet");

else if (this.armes.equals("fusil de sniper"))
		System.out.println("Attaque au fusil Sniper");

else 
	System.out.println("Attaque au couteau");

}
}

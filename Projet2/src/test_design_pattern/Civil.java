package test_design_pattern;

public class Civil extends Personnage {
//**on a d�finit la methode combattre et se d�placer dans la classe Personnage, 
	//**pas besoin de red�finir pour le civil qui ne combat pas et se d�place � pieds
	
	
public void combattre()
{ if (this.armes.equals("couteau"))
	System.out.println("Attaque au couteau");
else 
	System.out.println("Je ne combats PAS");

}
}

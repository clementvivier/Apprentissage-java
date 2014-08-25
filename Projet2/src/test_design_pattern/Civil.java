package test_design_pattern;

public class Civil extends Personnage {
//**on a définit la methode combattre et se déplacer dans la classe Personnage, 
	//**pas besoin de redéfinir pour le civil qui ne combat pas et se déplace à pieds
	
	
public void combattre()
{ if (this.armes.equals("couteau"))
	System.out.println("Attaque au couteau");
else 
	System.out.println("Je ne combats PAS");

}
}

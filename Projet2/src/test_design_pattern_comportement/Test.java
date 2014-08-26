package test_design_pattern_comportement;
//probl�mes dans la classe de test avec la variable i.
//j'ai ��galement des soucis dans la classe Personnage et Medecin 
public class Test {

	public static void main(String[] args)
	{
		Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};
		
		
		//ici j'avais fait l'erreur de mettre un ";" � la fin de la d�claration de condition,
		// la cons�quence est qu'il fallait que je demande quel "i" je voulais afficher avec un
		// int i = 0 1 ou 2 
		
		for(int i = 0; i < tPers.length; i++)
		{
			System.out.println("\nInstance de "+tPers[i].getClass().getName());
			System.out.println("-------------------------");
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();
		}
	}
}

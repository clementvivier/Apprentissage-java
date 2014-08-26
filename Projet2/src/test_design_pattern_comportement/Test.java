package test_design_pattern_comportement;

public class Test {

	public static void main(String[] args)
	{
		Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};
		
		for(int i = 0; i < tPers.length; i++); // <- Tu as mis un ";" ici ! (commentaire plus bas)
		{
			System.out.println("\nInstance de "+tPers[i].getClass().getName());
			System.out.println("-------------------------");
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();
		}
		
		
		/*
		 
		 Tu vas sans doute te demander pourquoi est ce que le point virgule affecte i.
		 Je te laisse y reflechir un peu, j'y repond plus bas ...
		 
		 -
		 
		 -
		 
		 -
		 
		 -
		 
		 -
		 
		 -
		 
		 -
		 
		 Spoiler :
		 
		 En definissant la variable i dans le for, elle devient locale au for.
		 Dans un for normalement construit, de la forme
		 
		 for (int  i = 0 ; i < 10 ; i++)
		 {
		 	// Code
		 }
		 
		 Tu peux utiliser le i a l'interrieur des accolades. En revanche, si tu cherches
		 a l'utiliser apres, tu n'es plus dans le for, donc le i n'est plus definit.
		 En mettant un ; a la fin de la ligne du for, tu fermes le for, et donc sur les lignes
		 suivantes, le i n'existe plus.
		 
		 */
	}
}

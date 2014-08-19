package chpt13;

public class Loup extends Canin {
// je ne sais pas à sert de déclarer plublic la classe ici alors qu'on a dit public class Loup extends Canin.

	
// j'ai revu que c'était un constructeur, perdu sur l'utilité du constructeur	
	public Loup()
	{	System.out.println("Création de Loup");
	}	//ici j'ai testé avec un texte à présenter, ce dernier ne sort pas.
	
	public Loup(String couleur, int poids)
	{	this.couleur = couleur;
		this.poids = poids;
	}
		
		void crier()
		{	System.out.println("Je hurle à la lune");
		
	}

}

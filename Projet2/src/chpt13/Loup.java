package chpt13;

public class Loup extends Canin {
// je ne sais pas � sert de d�clarer plublic la classe ici alors qu'on a dit public class Loup extends Canin.

	
// j'ai revu que c'�tait un constructeur, perdu sur l'utilit� du constructeur	
	public Loup()
	{	System.out.println("Cr�ation de Loup");
	}	//ici j'ai test� avec un texte � pr�senter, ce dernier ne sort pas.
	
	public Loup(String couleur, int poids)
	{	this.couleur = couleur;
		this.poids = poids;
	}
		
		void crier()
		{	System.out.println("Je hurle � la lune");
		
	}

}

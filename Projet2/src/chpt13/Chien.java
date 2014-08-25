package chpt13;

public class Chien extends Canin implements Rintintin {
// permet ici d'utiliser l'interface Rintintin quand on fait appel � la classe Chien
	public Chien ()
	{}
	
	public Chien(String couleur, int poids)
	{	this.couleur = couleur;
		this.poids = poids;
			}

	void crier()
	{	System.out.println("J'aboie sans raison");
}
	//comme l'interface Rintintin est impl�ment�e par la classe Chien, on peut d�finir les m�thodes
	// de l'interface dans la classe d'impl�mentation, la classe Chien.
	public void faireCalin()
	{	System.out.println("Je te fais un GROS CALIN");
	
	}
	
	public void faireLechouille()
	{	System.out.println("je fais de grosses Lechouilles");
		}
	public void faireLebeau()
	{	System.out.println("Je fais le beau");
		}
}
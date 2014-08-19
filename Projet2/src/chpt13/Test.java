package chpt13;

public class Test {

	
	
	public static void main(String[] args) {
		
		//Instanciation des objets Loup, Chien et Tigre ?
		Loup l = new Loup ("Gris bleut�", 20);
		Chien c = new Chien ("Noir tachet�", 40);
		Tigre t = new Tigre ("Ray� or", 65);
		
		//appel des m�thodes boire () et manger () provenant de la class Animal et d�finies dans cette classe
		l.boire();
		l.manger();
		//appel des m�thodes contenues dans la classe Canin
		l.deplacement();
		l.crier();
		//appel de la m�thode toString() cntenue dans la classe Animal.
		// on met l.methode() pour dire pour quel ?objet? on l'utilise ?
				System.out.println(l.toString()+"kg\n");
		c.boire();
		c.manger();
		c.crier();
		c.deplacement();
				System.out.println(c.toString()+"kg\n");
				
		System.out.println("------------------------------------");
		//m�thodes de l'interface
		c.faireCalin();
		c.faireLebeau();
		c.faireLechouille();
		
		System.out.println("-------------------------------------");
		//test du polymorphisme
		Rintintin r = new Chien();
		System.out.println("Je suis un bon Chien");
		r.faireCalin();
		r.faireLebeau();
		r.faireLechouille();
}
}
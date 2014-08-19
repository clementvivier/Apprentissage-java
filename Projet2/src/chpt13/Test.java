package chpt13;

public class Test {

	
	
	public static void main(String[] args) {
		
		//Instanciation des objets Loup, Chien et Tigre ?
		Loup l = new Loup ("Gris bleuté", 20);
		Chien c = new Chien ("Noir tacheté", 40);
		Tigre t = new Tigre ("Rayé or", 65);
		
		//appel des méthodes boire () et manger () provenant de la class Animal et définies dans cette classe
		l.boire();
		l.manger();
		//appel des méthodes contenues dans la classe Canin
		l.deplacement();
		l.crier();
		//appel de la méthode toString() cntenue dans la classe Animal.
		// on met l.methode() pour dire pour quel ?objet? on l'utilise ?
				System.out.println(l.toString()+"kg\n");
		c.boire();
		c.manger();
		c.crier();
		c.deplacement();
				System.out.println(c.toString()+"kg\n");
				
		System.out.println("------------------------------------");
		//méthodes de l'interface
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
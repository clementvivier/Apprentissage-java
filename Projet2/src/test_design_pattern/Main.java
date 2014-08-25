package test_design_pattern;

public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
Personnage [] tPers = {new Guerrier(), new Medecin(), new Civil(), new Chirurgien(), new Sniper()};
String [] tArmes = {"pistolet", "pistolet", "couteau", "fusil à pompe","couteau"};


for (int i = 0; i < tPers.length; i++)
		{		System.out.println("\nInstance de "+tPers[i].getClass().getName());
	System.out.println("------------------------------");
	tPers[i].combattre();
	tPers[i].setArmes(tArmes[i]);
	//tPers[i].combattre();
	tPers[i].seDeplacer();
	tPers[i].soigner();
}
	
		}

}

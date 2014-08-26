package test_design_pattern;

public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
Personnage [] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};
String [] tArmes = {"fusil de sniper","grand sac","couteau","fusil à pompe","Grand sac"};


for (int i = 0; i < tPers.length; i++)
		{		System.out.println("\nInstance de "+tPers[i].getClass().getName());
	System.out.println("------------------------------");
	
	
	tPers[i].setArmes(tArmes[i]);tPers[i].soigner();tPers[i].combattre();
	tPers[i].combattre();
	tPers[i].seDeplacer();
}
	
		}

}


// Pour que ce code fonctionne, j'ai du le mettre dans une classe à part. sinon, le ";" à la fin de tab5 int était marqué en erreur

public class Villetableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//************POLYMORPHISME***************//
		
			//définition d'un tableau de villes null
			Ville[] tableau = new Ville[6];
			
			//définition d'un tablau de noms de Villes et un autre de nbre d'hab
			
			String [] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
			int [] tab5 = {123456, 78456, 654987, 75832165, 1594, 213};
			
			//les 3 premieres villes sont des villes, les 3 suivantes des capitales
			for(int i = 0; i<6 ; i++)
			{	if (i<3)
				{	Ville V = new Ville(tab[i], tab5[i], "France");
					tableau[i] = V;
			}
			else 
			{	Capitale C = new Capitale(tab[i], tab5[i], "France", "la Tour Eiffel");
					tableau[i] = C;
			}
			}
			//description du tableau
			for(Ville v : tableau)
			{	System.out.println(v.decrisToi()+"\n");
			
			}
	}

}


public class Sdz1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	//initialisation des Villes
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 123456789, "France");
		Ville v2 = new Ville("Rio", 321654, "Brésil");
		
	//impression des caractéristiques des villes
		System.out.println("\n v = "+v.getNom()+" ville de "+v.getNbreHabitants()+ " habitants se situant en " +v.getNomPays());
		System.out.println("\n v1 ="+v1.getNom()+" ville de "+v1.getNbreHabitants()+ " habitants se situant en " +v1.getNomPays());
		System.out.println("\n v2 ="+v2.getNom()+" ville de "+v2.getNbreHabitants()+ " habitants se situant en " +v2.getNomPays());
	
		//nous interchangeons les villes v1 et v2 par l'intermédiaire d'un autre objet Ville
	
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		// impression des nouvelles données
		System.out.println("v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" habitants se situant en "+v1.getNomPays());
		System.out.println("v2 ="+v2.getNom()+" ville de "+v2.getNbreHabitants()+ " habitants se situant en " +v2.getNomPays());
	
		
		// changement de nom en se servant des mutateurs
	
		v1.setNom("hongKong");
	v2.setNom("Djibouti");
	//impression des changements après utilisation des setters
	System.out.println("v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" habitants se situant en "+v1.getNomPays());
	System.out.println("v2 ="+v2.getNom()+" ville de "+v2.getNbreHabitants()+ " habitants se situant en " +v2.getNomPays());
	}
}

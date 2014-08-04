import java.util.*;
public class recherchetableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char tableauCaracteres[]= {'a','b','c','d','e','f','g'};
int i = 0;
char reponse = ' ', carac = ' ';
Scanner sc = new Scanner(System.in);

do{//boucle principale
	do{//boucle permettant de forcer l'utilisateur à saisir une lettre contenue dans le tableau
		
		System.out.println("Veuillez saisir une lettre");
		i = 0;
		carac = sc.nextLine().charAt(0);
		// pour rechercher dans le tableau
		
		while (i < tableauCaracteres.length && carac != tableauCaracteres[i])
			i++;
		
		// si i < tableauCaracteres.length soit 7, la lettre est dans le tableau
		
		if (i < tableauCaracteres.length)
			System.out.println("la lettre " +carac+ " est bien dans le tableau");
		else
			System.out.println("la lettre " +carac+ " ne se trouve pas dans le tableau");
		
	}while(i >= tableauCaracteres.length);
	
	do{
		System.out.println(" Souhaitez-vous réessayer ? (O/N)");
		reponse = sc.nextLine().charAt(0);
	}while(reponse != 'O' && reponse != 'N');
}while(reponse == 'O');

System.out.println("Au revoir");
		
}


	}



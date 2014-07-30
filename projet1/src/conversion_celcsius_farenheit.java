import java.util.*;
public class conversion_celcsius_farenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

// initialisation des variables

double aConvertir, converti=0;
char reponse = ' ', mode = ' ';

System.out.println("CONVERTISSEUR DE TEMPERATURE CELSIUS FAHRENHEIT");
System.out.println("..............................................");

do { //tant que la réponse = O // boucle principale
	do {
		mode = ' ';
		System.out.println("Choisissez le mode de conversion :");
		System.out.println("1 - Convertisseur Celsius / Farenheit");
		System.out.println("2 - Convertisseur Farenheit / Celsius");
		
		mode = sc.nextLine().charAt(0);
		
		if (mode != '1' && mode != '2')
			System.out.println("Veuillez saisir 1 ou 2 pour choisir le mode");
	}while (mode != '1' && mode != '2');
		
		//saisie de la température à convertir
		
		System.out.println("Température à convertir : ");
		aConvertir = sc.nextDouble();
		//penser à vider la ligne lue
		sc.nextLine();
		
		//selon le mode, on calcule différemment la conversion
		
		if (mode == '1'){
			converti = ((9.0/5.)*aConvertir)+32.0;
			System.out.println(aConvertir+ " C correspond à ");
			System.out.println(arrondi(converti,2)+ " F.");
		}
		else {
			converti = ((aConvertir - 32)*5)/9;
			System.out.println(aConvertir+ " F correspond à ");
			System.out.println(arrondi(converti,2) + " C.");
		}
		// on demande à l'utilisateur s'il veut convertir de nouveau
		
		do {
			System.out.println("Souhaitez-vous recommencer une conversion ?(O/N)");
			reponse = sc.nextLine().charAt(0);
			
		}while(reponse != 'O' && reponse != 'N');
				}while (reponse == 'O');
	System.out.println("Au revoir");
	
}
	


 public static double arrondi(double A, int B) {
	 return (double)( (int)(A * Math.pow(10,B) + .5))/ Math.pow(10, B);
 }
}


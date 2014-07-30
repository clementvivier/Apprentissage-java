import java.util.*;
public class conversion2emeessai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

double aConvertir, converti=0;
char reponse = ' ', mode = ' ';
// boucle de base si mode = O
System.out.println("PROGRAMME DE CONVERSION CELCIUS / FAHRENHEIT");
System.out.println("--------------------------------------------");

do{
	do{
	mode = ' ';
	System.out.println("Choisissez le mode de conversion");
	System.out.println("1 - Celcius vers Fahrenheit");
	System.out.println("2 - Fahrenheit vers Celcius");
	mode = sc.nextLine().charAt(0);
	
	if (mode != '1' && mode != '2')
	System.out.println("Veuillez saisir 1 ou 2");
	}while (mode != '1' && mode != '2');
	//fin première boucle
	
	
	System.out.println("Donnez la température à convertir");
	aConvertir = sc.nextDouble(); //on choppe la température
			sc.nextLine(); // on vide le scanner
	
	if (mode == '1'){
		converti = (((9*aConvertir)/5)+32);
		System.out.println(+aConvertir+ " Celcius correspond à " +converti+ " F");
	}
	else {
		converti = (((aConvertir-32)*5)/9);
		System.out.println(+aConvertir+ " Fahrenheit correspond à " +converti+ " C");
	}
		do{ 
			System.out.println("Voulez-vous recommencer ? (O/N)");
			reponse = sc.nextLine().charAt(0);
		}while(reponse !='O' && reponse != 'N');
	}while(reponse == 'O');
	
	System.out.println("Au revoir");
}
}


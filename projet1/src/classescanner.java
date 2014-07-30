import java.util.Scanner;
import java.util.*;


public class classescanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O')
	{
		
		System.out.println("Donnez un prénom : ");
	
		prenom = sc.nextLine();
		
		System.out.println("Bonjour " +prenom+", comment ça va ?");
		reponse = ' ';
		while (reponse != 'O' && reponse != 'N')
		{
		System.out.println("Voulez-vous réessayer (O/N) ?");
		reponse = sc.nextLine().charAt(0);
		
	}
	}
			System.out.println("Au revoir dans ce cas");
	}
}

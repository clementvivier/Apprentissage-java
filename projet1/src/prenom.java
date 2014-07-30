
import java.util.Scanner;
public class prenom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prenom = new String();
		char reponse = ' ';
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Donnez un prénom");
			prenom = sc.nextLine();
			System.out.println("Bonjour " +prenom+ " vous allez bien ?");
			
			do { 
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}while (reponse != 'O' && reponse != 'N');
		}while (reponse == 'O');
			System.out.println ("Dans ce cas au revoir");
		}
	}

		






public class methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chaine = new String("COUCOU TOUT LE MONDE"), chaine2 = new String();
new String();
chaine2 = chaine.toLowerCase();
System.out.println(chaine2);

// passage en majuscules
String chaine1 = new String ("coucou coucou"), chaine3 = new String();
chaine3 = chaine1.toUpperCase();
System.out.println(chaine3);

// test de la longueur de la chaine
String chaine4 = new String("pierreyvesvivier");
int longueur = 0;
longueur = chaine4.length();
System.out.println(longueur);

// test d'une égalité
String str1 = new String ("coucou"), str2 = new String ("coucou");
if (str1.equals(str2))
System.out.println("les deux chaines sont identiques");
else
	System.out.println("les deux chaines sont différentes");

//extraction d'un caractère
String nbre = new String("123456789");
char carac = nbre.charAt(6);
System.out.println(carac);

//exploration d'une chaine de caractère
String chne = new String("la paix niche"), chne2 = new String();

chne2 = chne.substring(3,13);
System.out.println(chne2);

	}
}
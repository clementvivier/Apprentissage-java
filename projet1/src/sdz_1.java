
public class sdz_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//essai avec plusieurs tableaux
String[] tab = {"toto", "\ntata", "\ntiti", "\ntete"};
String[] tab1 = {"\nbobo", "\nbaba", "\nbibi", "\nbebe"};
parcourirTableau(tab);
parcourirTableau(tab1);

	}
	
	static void parcourirTableau(String[] tabBis)
	{
		for(String str : tabBis)
			System.out.print(str);
	}
}

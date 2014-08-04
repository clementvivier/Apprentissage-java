
public class sdz2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] tab = {"toto", "\ntata", "\ntiti", "\ntete", "\n1", "\n2"};
parcourirTableau(tab);

}

static void parcourirTableau(String[] tab)
{
	for(String str : tab)
	System.out.print(str);
}
static void parcourirTableau(int[] tab)

{
	for(int str : tab)
		System.out.print(str);
	}

}

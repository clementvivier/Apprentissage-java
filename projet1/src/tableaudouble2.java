
public class tableaudouble2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tab[][] = {{"toto","tutu","titi","tata"},{"1","3","5","7","9"}};
int j =0, i = 0;

for (String sousTab[] : tab)
{
	i = 0;
			for (String str : sousTab)
			{
				System.out.println("la valeur de la nouvelle boucle est : "+str);
				System.out.println("la valeur du tableau à l'indice ["+j+"]["+i+"] est : "+tab[i][j]);
				j++;
			}
			i++;
}}}


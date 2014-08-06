

public class Ville 

{
	
//stocke le nom de la ville, du pays puis du nbre d'hab
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;
	public static int nbreInstances;
	private static int nbreInstancesBis;
	
	//constructeur par d�faut
	public Ville()
	{
		System.out.println("Cr�ation d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	//constructeur avec param�tres
	//param�tre commence par "p" ici on retrouve l'ordre utilis� dans le main : nom, chiffre, pays
	public Ville(String pNom, int pNbre, String pPays)
	{
		System.out.println("Cr�ation d'une ville avec des param�tres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	//***********ACCESSEURS*********
	//Retourne le nom de la ville
	public String getNom()
	{
		return nomVille;
	}
	//retourne le nom du pays
	public String getNomPays()
	{
		return nomPays;
	}
	//retourne le nombre d'habitants
	public int getNbreHabitants()
	{
		return nbreHabitants;
	}
	//cr�ation de l'acc�s � la cat�gorie (fonction du nombre d'habitants)
	public char getCategorie()
	{
		return categorie;
	}
	//retourne le nombre d'instances (private donc il faut un getter)
	public static int getNombreInstancesBis()
	{
		return nbreInstancesBis;
	}
	
	
	
	//*********MUTATEURS**********
	
	//d�finit le nom de la ville
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}
	//d�finit le nom du pays
	public void setNomPays(String pPays)
	{
		nomPays = pPays;
	}
	//d�finit le nombre d'habitants
	public void setNbreHabitants(int pNbre)
	{
		nbreHabitants = pNbre;
		this.setCategorie();
	}
	//d�finit la cat�gorie de la ville ==> utilisation de "set"
	private void setCategorie()
	{
		int bornesSuperieures[]= {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[]= {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		int i=0;
		while(i<bornesSuperieures.length && this.nbreHabitants >= bornesSuperieures[i])
			i++;
		this.categorie = categories[i];
	}
	//retourne la description de la ville
	public String decrisToi()
	{
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "
	+this.nbreHabitants+ "habitant(s) => elle est donc de cat�gorie : "+this.categorie;
	}
	
	//retourne une chaine de carqctere selon le r�sultat de la comparaison
	public String comparer(Ville v1)
	{		String str = new String();
		
		if(v1.getNbreHabitants()>this.nbreHabitants)
			str = v1.getNom()+" est une ville plus peupl�e que "+this.nomVille;
		else
			str = this.nomVille+" est une ville plus peupl�e que "+v1.getNom();
		
		return str;
	}
	
	
	}
	
	
	




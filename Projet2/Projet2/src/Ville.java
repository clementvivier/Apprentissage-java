

public class Ville {
	
	
//stocke le nom de la ville, du pays puis du nbre d'hab
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;
	
	//constructeur par défaut
	public Ville()
	{
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
	}
	
	//constructeur avec paramètres
	//paramètre commence par "p"
	public Ville(String pNom, int pNbre, String pPays)
	{
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
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
	
	public char getCategorie()
	{
		return categorie;
	}
	//*********MUTATEURS**********
	
	//définit le nom de la ville
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}
	//définit le nom du pays
	public void setNomPays(String pPays)
	{
		nomPays = pPays;
	}
	//définit le nombre d'habitants
	public void setNbreHabitants(int pNbre)
	{
		nbreHabitants = pNbre;
		this.setCategorie();
	}
	//définit la catégorie de la ville
	private void setCategorie(){
		int bornesSuperieures[]= {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[]= {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		int i=0;
		while(i<bornesSuperieures.length && this.nbreHabitants >= bornesSuperieures[i])
			i++;
		this.categorie = categories[i];
	}
	//retourne la description de la ville
	public String decrisToi(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "
	+this.nbreHabitants+ "habitant(s) => elle est donc de catégorie : "+this.categorie;
	}
	
	//retourne une chaine de carqctere selon le résultat de la comparaison
	public String comparer(Ville v1){
		String str = new String();
		
		if(v1.getNbreHabitants()>this.nbreHabitants)
			str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
		else
			str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();
		
		return str;
	}
	
	}
	




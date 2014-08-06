
public class Capitale extends Ville {

		// Capitale est une classe héritée, elle peut donc faire appel aux variables de la mère dans les constructeurs 
	// via "super."
	
	private String monument;
	
	// constructeur par défaut (comme ligne 16 dans Ville)
	public Capitale()
	{	super();
	monument = "sacré-coeur";
	}
	
	// constructeur d'initialisation de capitale
	public Capitale(String nom, int hab, String pays, String monument)
	{	super(nom, hab, pays);
	this.monument = monument;		
	}
	
	//description d'une capitale
	// return String retourne la descrition de 
	public String decrisToi()
	{	String str = super.decrisToi()+"\n \t ==>"+ this.monument+" est un monument";
	System.out.println("invocation de super.decrisToi()");
	
	return str;
	}
	
	//retourne le nom du monument
	public String getMonument()
	{	return monument;
		}
	
	//définit le nom du monument
	public void setMonument()
	{	this.monument = monument;
		}
}


public class Capitale extends Ville {

		// Capitale est une classe h�rit�e, elle peut donc faire appel aux variables de la m�re dans les constructeurs 
	// via "super."
	
	private String monument;
	
	// constructeur par d�faut (comme ligne 16 dans Ville)
	public Capitale()
	{	super();
	monument = "sacr�-coeur";
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
	
	//d�finit le nom du monument
	public void setMonument()
	{	this.monument = monument;
		}
}

package test_design_pattern_comportement;


public abstract class Personnage 
{
	
// les instances de comportement
	
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Soin soin = new AucunSoin();
	protected Deplacement deplacement = new Marcher();
	
// Constructeur par defaut
	
	public Personnage() 
	{}
	
// Constructeur avec param�tres 
	public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement)
	{		this.espritCombatif = espritCombatif;
			this.soin = soin;
			this.deplacement = deplacement;	
	}
	
	//m�thode de d�placement du personnage
	public void seDeplacer()
	{
		//on utilise les objets de d�placement de fa�on polymorphe
		deplacement.deplacer();
	}
	
	//m�thode de combat du personnage
	public void combattre()
	{ 
		espritCombatif.combattre();
		}
	//m�thode de soin
	public void soigner()
	{
		soin.soigne();
	}
	
	
	/*
	 
	 
	 Les trois bugs ici sont de meme nature. Tu fais appel dans dans les interfaces
	 EspritCombatif, Soin et Deplacement a des fonctions qui n'y sont pas definies.
	 
	 
	 */
	

	
	
	//red�finit le comportement au combat
	public void setEspritCombatif(EspritCombatif espritCombatif)
	{	this.espritCombatif = espritCombatif;
		}
	
	//red�finit le comportement de "Soin"
	public void setSoin(Soin soin)
	{	this.soin = soin;
		}
	
	//red�finit le comportement de d�placement
	public void setDeplacement(Deplacement deplacement)
	{
		this.deplacement = deplacement;
	}
	
	
	
	
	
}

	
	
	
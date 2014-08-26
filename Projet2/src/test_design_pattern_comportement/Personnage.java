package test_design_pattern_comportement;
import test_design_pattern_comportement.*;



public abstract class Personnage 
{
	
// les instances de comportement
	
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Soin soin = new AucunSoin();
	protected Deplacement deplacement = new Marcher();
	
// Constructeur par defaut
	
	public Personnage() 
	{}
	
// Constructeur avec paramètres 
	public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement)
	{		this.espritCombatif = espritCombatif;
			this.soin = soin;
			this.deplacement = deplacement;	
	}
	
	//méthode de déplacement du personnage
	public void seDeplacer()
	{
		//on utilise les objets de déplacement de façon polymorphe
		deplacement.deplacer();
	}
	
	//méthode de combat du personnage
	public void combattre()
	{ 
		espritCombatif.combat();
		}
	//méthode de soin
	public void soigner()
	{
		soin.soigne();
	}
	
	//redéfinit le comportement au combat
	public void setEspritCombatif(EspritCombatif espritCombatif)
	{	this.espritCombatif = espritCombatif;
		}
	
	//redéfinit le comportement de "Soin"
	public void setSoin(Soin soin)
	{	this.soin = soin;
		}
	
	//redéfinit le comportement de déplacement
	public void setDeplacement(Deplacement deplacement)
	{
		this.deplacement = deplacement;
	}
	
	
	
	
	
}

	
	
	
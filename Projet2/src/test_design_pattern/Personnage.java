package test_design_pattern;

public abstract class Personnage 
{
	protected String armes = "", chaussure = "", sacDesoin = "";
	
	public void seDeplacer()
	{		System.out.println("Je me déplace à pieds");
	}

	public void combattre()
	{		System.out.println("Je ne combats PAS");
	}
	
	public void soigner()
	{		System.out.println("Je ne soigne PAS");
	}
	
	protected void setArmes(String armes)
	{		this.armes = armes;
	}
	
	protected void setChaussure(String chaussure)
	{		this.chaussure = chaussure;
	}
	
	protected void setSacdesoin(String sacDesoin)
	{		this.sacDesoin = sacDesoin;
	}
	
}


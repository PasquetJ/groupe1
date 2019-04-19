package um3.projettransversal;

public class TailleListeCouleur extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TailleListeCouleur(int tailleParLeJoueur, int tailleDeLaListe)
	{
		System.out.println("Nombre incorrect de couleur !");
	}

	@Override
	public String toString() {
		return "TailleListeCouleur []";
	}
	
	
}

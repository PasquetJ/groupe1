package um3.projettransversal;
import java.util.ArrayList;
import java.util.Random;

public class Repetition
{
	public static ArrayList<SuiteCouleur> suiteTable(int taille)
	{
		ArrayList<SuiteCouleur> tab = new ArrayList<SuiteCouleur>();
		Random rand = new Random();
		int z = rand.nextInt(taille-1)+1;
		SuiteCouleur rep = SuiteCouleur.getAleaCouleur();
		tab.add(rep);
		for(int i=1; i<taille; i++)
		{
			tab.add(SuiteCouleur.getAleaCouleur());
			if(i==z)
			{
				tab.add(rep);
			}
		}
		return tab;
	}
}

//Rajouter une methode qui prend des valeurs d'une liste et add dans un arraylist'
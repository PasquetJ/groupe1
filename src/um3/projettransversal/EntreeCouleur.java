package um3.projettransversal;

import java.util.ArrayList;

public class EntreeCouleur
{
    public static ArrayList<SuiteCouleur> entreeCouleur(String Couleurs)
    {
        String[] partie = Couleurs.split("-");
        ArrayList<String> couleursJoueursString = new ArrayList<String>();

        for(int i = 0; i < partie.length; i++)
        {
            couleursJoueursString.add(partie[i]);
        }
        
        ArrayList<SuiteCouleur> couleursJoueursSuiteCouleur = new ArrayList<SuiteCouleur>();
        
		for(int i = 0; i < couleursJoueursString.size(); i++)
		{
			SuiteCouleur couleur = SuiteCouleur.valueOf(couleursJoueursString.get(i));
			couleursJoueursSuiteCouleur.add(couleur);
		}
        return couleursJoueursSuiteCouleur;
    }
}

package um3.projettransversal;

import java.util.ArrayList;

public class EntreeCouleur
{
    public static ArrayList<SuiteCouleur> entreeCouleur(String Couleurs, int NombreCouleurs) throws TailleListeCouleur
    {
        String[] couleurs = Couleurs.split("-");
        ArrayList<String> couleursJoueursString = new ArrayList<String>();
        ArrayList<SuiteCouleur> couleursJoueursSuiteCouleur = new ArrayList<SuiteCouleur>();
        
 /*       if(couleursJoueursString.size() != NombreCouleurs)
        {
        	throw new TailleListeCouleur();
        }
        else
        {*/
        	
            for(int i = 0; i < couleurs.length; i++)
               {
                   couleursJoueursString.add(couleurs[i]);
               }
               
       		   for(int i = 0; i < couleursJoueursString.size(); i++)
       		   {
       			SuiteCouleur couleur = SuiteCouleur.valueOf(couleursJoueursString.get(i));
       			couleursJoueursSuiteCouleur.add(couleur);
       		   }
       /* }*/
        
		return couleursJoueursSuiteCouleur;
    }
}

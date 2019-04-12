package um3.projettransversal;

import java.util.ArrayList;

public class Reponse {
	public Reponse()
	{

	}
	
	//////////////////////////////////////////////////////////////////////////////////
	//Method pour connaitre le nombre de bonne réponses a la mauvaise ou bonne place//
	//////////////////////////////////////////////////////////////////////////////////
	
	public static int[] Trouve(ArrayList<SuiteCouleur> couleursServeur, ArrayList<SuiteCouleur> couleursJoueur)
	{
		
		//recréation des variables pour ne pas modifier les listes de départ
		ArrayList<SuiteCouleur> listeRecherche = couleursServeur;
		ArrayList<SuiteCouleur> listeDeviner = couleursJoueur;
		
		//initialisation des valeurs pour les bonnes couleurs a la mauvaise place et a la bonne place
		int BonneCouleurBonnePlace = 0;
		int BonneCouleurMauvaisPlace = 0;
		
		int i = 0; //variable pour la recherche de bonne réponse bonne place
		int a = 0; //variable pour la recherche de bonne réponse mauvaise place
		
		
		if ( listeRecherche.equals(listeDeviner)) //condition victoire
		{
			BonneCouleurBonnePlace = couleursServeur.size() ;
			BonneCouleurMauvaisPlace = 0 ;
			
		}
		else //si pas gagné
		{
			while (i < listeRecherche.size()) //recherche bonne place
			{
				if ( listeRecherche.get(i) == listeDeviner.get(i) ) // si liste1[i] == liste2[i]
				{
					listeRecherche.remove(i);						// suppression des nombres
					listeDeviner.remove(i);
					BonneCouleurBonnePlace ++;						// on ajoute 1 au compteur
				}
				else 												// si liste1[i] != liste2[i]
					i++;											// i+1
			}
			
			
			while (listeDeviner.size() > 0) //On compare liste2[0] a tous les autres elements de liste1
			{
				if (listeDeviner.get(0) == listeRecherche.get(a)) //si ils sont égaux alors on suprime le liste2[0] et l'élément lui coorespondant de liste1
				{
					BonneCouleurMauvaisPlace ++;
					listeDeviner.remove(0);
					listeRecherche.remove(a);
					a = 0;
				}
				else if(a == listeRecherche.size() - 1) //Si on a parcourue toute la liste1 sans trouver d'elements egaux alors on surime liste2[0] et "a" repasse a 0
				{
					listeDeviner.remove(0);
					a = 0;
				}
				else //Si aucune des autre condiitons sont remplit alors on avance dans liste1
					a+=1;
			}
			
		}
		int[] listeTrouve = new int[2];
		listeTrouve[0] = BonneCouleurBonnePlace;
		listeTrouve[1] = BonneCouleurMauvaisPlace;
		
		return listeTrouve;
	}	
}

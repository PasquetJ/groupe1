package um3.projettransversal;
import java.util.*;
public class Repetition {
	
/*	public ArrayList<SuiteCouleur> repet(int taille){
		ArrayList<SuiteCouleur> choix = new ArrayList<SuiteCouleur>();
		SuiteCouleur rep = SuiteCouleur.getAleaCouleur();
		int max = taille;
		int min = 0;
		int range = max - min +1;
		for(int i=0; i<taille; i++) {
			if(choix.indexOf()) {
				
			}
		}
		
		return choix;
	}
*/
	public SuiteCouleur[] dansTableau(int taille) {
		SuiteCouleur tab [] = new SuiteCouleur[taille];
		SuiteCouleur rep = SuiteCouleur.getAleaCouleur();
		int max = taille;
		int min = 0;
		int range = max - min +1;
		for(int i = 0; i<taille-1; i++) {
			if(i==range) {
				tab[i]=rep;
			} else {
				tab[i]=SuiteCouleur.getAleaCouleur();
			}
		}
		tab[taille+1]=SuiteCouleur.getAleaCouleur();
		return tab;
	}
	
}

//Rajouter une methode qui prend des valeurs d'une liste et add dans un arraylist'
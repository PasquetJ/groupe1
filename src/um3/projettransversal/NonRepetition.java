package um3.projettransversal;

import java.util.*;

public class NonRepetition {
	public static SuiteCouleur PasDeRep(int taille) {
		switch(taille) {
		case 0:
			return SuiteCouleur.rouge;
		case 1:
			return SuiteCouleur.bleu;
		case 2:
			return SuiteCouleur.jaune;
		case 3:
			return SuiteCouleur.noir;
		case 4:
			return SuiteCouleur.blanc;
		case 5:
			return SuiteCouleur.gris;
		case 6:
			return SuiteCouleur.vert;
		case 7:
			return SuiteCouleur.orange;
		case 8:
			return SuiteCouleur.violet;

		}
		return null;
	}
	
	public static ArrayList<SuiteCouleur> Repet(int taille){
		ArrayList<Integer> tabb = new ArrayList<Integer>();
		for(int z = 0; z<taille; z++) {
			tabb.add(z);
		}
		ArrayList<SuiteCouleur> tab2 = new ArrayList<SuiteCouleur>();
		int min = 0;
		int max = taille;
		
		int j = 0;
		while(j<taille) {
			int range = min + (int)(Math.random()*((max - min)+1)-1);
			tab2.add(PasDeRep(tabb.get(range)));
			tabb.remove(range);
			max=max-1;
			j++;
			range = 0;
		}
		return tab2;
	}
}

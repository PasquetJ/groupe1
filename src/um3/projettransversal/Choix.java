package um3.projettransversal;

import java.util.*;




public class Choix {

	private ArrayList choix_du_serveur= new ArrayList<>();

	public ArrayList getChoix_du_serveur() {
		return choix_du_serveur;
	}

	public void setChoix_du_serveur(ArrayList choix_du_serveur) {
		this.choix_du_serveur = choix_du_serveur;
	}

	@Override
	public String toString() {
		return "Choix [choix_du_serveur=" + choix_du_serveur + "]";
	}

	public void ajout(ChoixJoueur.Couleur red) {
		choix_du_serveur.add(red);
		
	}
	
	

    
    
}

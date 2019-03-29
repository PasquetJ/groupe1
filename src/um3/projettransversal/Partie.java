package um3.projettransversal;

import java.io.Serializable;
import java.util.Scanner;

public class Partie implements Serializable
{

	private static final long serialVersionUID = 1L;
	public String nom;
	public String repetition;
	public int nombreCouleurs;
	public String couleursJoueurs;
	
	
	public Partie(String nom, String repetition, int nombreCouleurs, String couleursJoueurs) {

		this.nom = nom;
		this.repetition = repetition;
		this.nombreCouleurs = nombreCouleurs;
		this.couleursJoueurs = couleursJoueurs;
	}
	
	public Partie() {
		// TODO Auto-generated constructor stub
	}

	public void getPartie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom ?");
	    nom = sc.next();
	    System.out.println("Répétition ?");
	    repetition = sc.next();
	    System.out.println("Nombres de couleurs ?");
		nombreCouleurs = sc.nextInt();
		System.out.println("Les couleurs ? (Devrons avoir une majuscule et mettre un tiret entre chaque couleurs)");
		couleursJoueurs = sc.next();
	}
	
	
	@Override
	public String toString() {
		return "Partie [nom joueur = " + nom + ", repetition = " + repetition + ", nombre de couleurs = " + nombreCouleurs
				+ ", couleurs du joueur = " + couleursJoueurs + "]";
	}


	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
	}
	public final String getRepetition() {
		return repetition;
	}
	public final void setRepetition(String repetition) {
		this.repetition = repetition;
	}
	public final int getNombreCouleurs() {
		return nombreCouleurs;
	}
	public final void setNombreCouleurs(int nombreCouleurs) {
		this.nombreCouleurs = nombreCouleurs;
	}
	public final String getCouleursJoueurs() {
		return couleursJoueurs;
	}
	public final void setCouleursJoueurs(String couleursJoueurs) {
		this.couleursJoueurs = couleursJoueurs;
	}
	
	
}

package um3.projettransversal;

import java.io.Serializable;
import java.util.Scanner;

public class Partie implements Serializable
{

	private static final long serialVersionUID = 1L;
	public String nom;
	public int nombreCouleurs;
	public String couleursJoueurs;
	public String nonRepetition;

	public Partie(String nom, int nombreCouleurs, String couleursJoueurs, String nonRepetition) {

		this.nom = nom;
		this.nombreCouleurs = nombreCouleurs;
		this.couleursJoueurs = couleursJoueurs;
		this.nonRepetition = nonRepetition;
	}
	
	public Partie() {
		// TODO Auto-generated constructor stub
	}

	public void getPartie() throws TailleListeCouleur {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom ?");
	    nom = sc.next();
	    System.out.println("Nombres de couleurs ?");
		nombreCouleurs = sc.nextInt();
		System.out.println("Répétition des couleurs à trouver ? (oui/non)");
		nonRepetition = sc.next();
		
		System.out.println("Les couleurs ? (tout en minuscule et mettre un tiret entre chaque couleurs)");
		couleursJoueurs = sc.next();
		
		String[] couleurs1 = couleursJoueurs.split("-");
		int nombresCouleurs1 = couleurs1.length;
		
		String[] couleurs2 = couleursJoueurs.split("");
		int nombresCouleurs2 = couleurs2.length;
		
		if (nombresCouleurs1 != getNombreCouleurs())
		{
			throw new TailleListeCouleur(nombresCouleurs1, getNombreCouleurs());
		}
		
		if (nombresCouleurs2 != getNombreCouleurs())
		{
			throw new TailleListeCouleur(nombresCouleurs2, getNombreCouleurs());
		}
	}
	
	public void getPartieCouleurs() throws TailleListeCouleur {
		Scanner sc = new Scanner(System.in);
		System.out.println("Les couleurs ? (tout en minuscule et mettre un tiret entre chaque couleurs)");
		couleursJoueurs = sc.next();
		
		String[] couleurs1 = couleursJoueurs.split("-");
		int nombresCouleurs1 = couleurs1.length;
		
		String[] couleurs2 = couleursJoueurs.split("");
		int nombresCouleurs2 = couleurs2.length;
		
		if (nombresCouleurs1 != getNombreCouleurs())
		{
			throw new TailleListeCouleur(nombresCouleurs1, getNombreCouleurs());
		}
		
		if (nombresCouleurs2 != getNombreCouleurs())
		{
			throw new TailleListeCouleur(nombresCouleurs2, getNombreCouleurs());
		}

	}
	
	
	@Override
	public String toString() {
		return "nom joueur = " + nom + ", nombre de couleurs = " + nombreCouleurs
				+ ", couleurs du joueur = " + couleursJoueurs + "répétition = " + nonRepetition;
	}


	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
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
	public String getNonRepetition() {
		return nonRepetition;
	}

	public void setNonRepetition(String nonRepetition) {
		this.nonRepetition = nonRepetition;
	}
	
}

package um3.projettransversal;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Scanner;

public class Partie implements Serializable
{

	private static final long serialVersionUID = 1L;
	public String nom;
	public int nombreCouleurs;
	public String couleursJoueurs;
	
	public Partie(String nom, int nombreCouleurs, String couleursJoueurs) {

		this.nom = nom;
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
	    System.out.println("Nombres de couleurs ?");
		nombreCouleurs = sc.nextInt();
		System.out.println("Les couleurs ? (tout en minuscule et mettre un tiret entre chaque couleurs)");
		couleursJoueurs = sc.next();
	}
	
	public void getPartieCouleurs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Les couleurs ? (tout en minuscule et mettre un tiret entre chaque couleurs)");
		couleursJoueurs = sc.next();
	}
	
	
	@Override
	public String toString() {
		return "Partie [nom joueur = " + nom + ", nombre de couleurs = " + nombreCouleurs
				+ ", couleurs du joueur = " + couleursJoueurs + "]";
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
	
}

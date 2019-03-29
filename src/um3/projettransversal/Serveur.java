package um3.projettransversal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Serveur
{
	
	public static void main(String[] zero)
	{
		
		ServerSocket socketserver ;
		Socket socketduserveur;
		try
		
		{
		
			socketserver = new ServerSocket(2019);
			System.out.println("Le serveur est � l'�coute du port " + socketserver.getLocalPort());
			socketduserveur = socketserver.accept(); 
		    System.out.println("Un joueur s'est connect�");//si un joueur est connect�
		    
//Accueil du joueur		    

//D�roulement de la partie
			Partie partie = null;
			ObjectInputStream in = new ObjectInputStream(socketduserveur.getInputStream());
			
			try {
				partie = (Partie) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(partie);
			
			System.out.println("Le joueur connect� : " + partie.getNom());//si un joueur est connect�
			System.out.println("Les couleurs sont : " + EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs()));
			
			ArrayList<SuiteCouleur> couleursDuServeur = new ArrayList<SuiteCouleur>();
			
			if(partie.getRepetition() != "non") {
				System.out.println("coucou");
				for(int i = 0; i < partie.nombreCouleurs; i++) {
					couleursDuServeur.add(SuiteCouleur.getAleaCouleur());
				}
			}
			
			System.out.println("Couleurs du Serveur : " + couleursDuServeur);
			
			int[] rep = Reponse.Trouve(couleursDuServeur, EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs()));
		    System.out.println("R�ponse : " + rep);
			
			socketduserveur.close();
		    socketserver.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

package um3.projettransversal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Serveur
{
	
	public static void main(String[] zero) throws TailleListeCouleur
	{
		
		ServerSocket socketserver ;
		Socket socketduserveur;
		try
		
		{
		
			socketserver = new ServerSocket(2019);
			System.out.println("Le serveur est à l'écoute du port " + socketserver.getLocalPort());
			socketduserveur = socketserver.accept(); 
		    System.out.println("Un joueur s'est connecté");//si un joueur est connecté
		    
//Accueil du joueur		    

//Déroulement de la partie
			Partie partie = null;
			ObjectInputStream in = new ObjectInputStream(socketduserveur.getInputStream());
			
			try
			{
				partie = (Partie) in.readObject();
				
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(partie);
			
			System.out.println("Le joueur connecté : " + partie.getNom());//si un joueur est connecté
			System.out.println("Les couleurs sont : " + EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs(), partie.getNombreCouleurs()));
			
			ArrayList<SuiteCouleur> couleursDuServeur = new ArrayList<SuiteCouleur>();
			

			for(int i = 0; i < partie.nombreCouleurs; i++)
			{
				couleursDuServeur.add(SuiteCouleur.getAleaCouleur());
			}
			
			System.out.println("Couleurs du Serveur : " + couleursDuServeur);
			
		    ObjectOutputStream out = new ObjectOutputStream(socketduserveur.getOutputStream());
		    out.writeObject(couleursDuServeur);
			
			socketduserveur.close();
		    socketserver.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "test []";
	}
}

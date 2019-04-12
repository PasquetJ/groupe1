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
			Partie partieJoueur = null;
			ObjectInputStream in = new ObjectInputStream(socketduserveur.getInputStream());
			
			try
			{
				partieJoueur = (Partie) in.readObject();
				
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(partieJoueur);
			
			System.out.println("Le joueur connecté : " + partieJoueur.getNom());//si un joueur est connecté
			System.out.println("Les couleurs sont : " + EntreeCouleur.entreeCouleur(partieJoueur.getCouleursJoueurs(), partieJoueur.getNombreCouleurs()));
			
			ArrayList<SuiteCouleur> couleursDuServeur = new ArrayList<SuiteCouleur>();
			
			if(partieJoueur.getNonRepetition().equals("oui")) {
				for(int i = 0; i < partieJoueur.getNombreCouleurs(); i++)
				{
					couleursDuServeur.add(SuiteCouleur.getAleaCouleur());
				}
			}
			else
			{
				couleursDuServeur = NonRepetition.Repet(partieJoueur.getNombreCouleurs());
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

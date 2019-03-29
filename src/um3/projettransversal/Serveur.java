package um3.projettransversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Serveur
{
	
	public static void main(String[] zero)
	{
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;
		BufferedReader in;
		PrintWriter out;
		
		try
		{
		
			socketserver = new ServerSocket(2019);
			System.out.println("Le serveur est � l'�coute du port " + socketserver.getLocalPort());
			socketduserveur = socketserver.accept(); 
		    System.out.println("Un joueur s'est connect�");//si un joueur est connect�
//Accueil du joueur		    
			out = new PrintWriter(socketduserveur.getOutputStream());
		    out.println("Bienvenue joueur !\nVous allez d�buter une partie de Mastermind. Pr�t(e) ? (oui/non)");
		    out.flush();
//R�cup�re la r�ponse du joueur s'il veux jouer		

//Lancement de la partie ou pas
//D�roulement de la partie			
				out.println("D�but de la partie ! Vous devrez trouvez la bonne combinaison pour gagner.");
				out.flush();
				out.println("Petite pr�cision les couleurs devront avoir leur initial en majuscule et les coleurs s�par�s par un tiret. Combien de couleurs ?");
				out.flush();
			    ObjectInputStream in2 = new ObjectInputStream(socketduserveur.getInputStream());
			    try {
					Partie partie = (Partie) in2.readObject();
					System.out.println(partie);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    
/*			    
Retour demande r�p�ttion	 
				out.println("Vous voulez une r�p�tition ?");
				out.flush();
				String reponseRepetition = in.readLine();
			    System.out.println("R�ponse joueur : " + reponseRepetition);
			    
			    List<SuiteCouleur> couleursServeur = new ArrayList<SuiteCouleur>();
			    if(reponseRepetition == "oui")
			    {
			    	
			    	Repetition.suiteTable(tailleCombi);
			    }

			    
Demande couleurs joueurs    
			    out.println("Vos couleurs :");
			    out.flush();
			    String couleursJoueur = in.readLine();
			    EntreeCouleur.entreeCouleur(couleursJoueur);
			    
			    System.out.println("Couleurs du joueur : " + EntreeCouleur.entreeCouleur(couleursJoueur));

*/			
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
		return "Couleur : ";
	}
}

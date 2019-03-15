package um3.projettransversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			System.out.println("Le serveur est à l'écoute du port "+socketserver.getLocalPort());
			socketduserveur = socketserver.accept(); 
		    System.out.println("Un joueur s'est connecté");//si un joueur est connecté
//Accueil du joueur		    
			out = new PrintWriter(socketduserveur.getOutputStream());
		    out.println("Bienvenue joueur !\nVous allez débuter une partie de Mastermind. Prêt(e) ? (oui/non)");
		    out.flush();
//Récupère la réponse du joueur s'il veux jouer		    
		    in = new BufferedReader (new InputStreamReader (socketduserveur.getInputStream()));
		    String message = in.readLine();
		    System.out.println("Réponse joueur : " + message);

//Lancement de la partie ou pas
			if(message != "non")
			{
				
//Déroulement de la partie
				
				List<SuiteCouleur> combinaison = new ArrayList<SuiteCouleur>();

				
				out.println("Début de la partie ! Vous devrez trouvez la bonne combinaison pour gagner. Petite précision les couleurs devront avoir leur initial en majuscule et les coleurs séparés par un tiret. Combien de couleurs ?");
				out.flush();
				int message1 = in.read() - 48;
			    System.out.println("Réponse joueur : " + message1);
			    
//Retour demande répéttion	    
			    
			    List<SuiteCouleur> couleursServeur = new ArrayList<SuiteCouleur>();
			    
			    for(int i = 0; i < message1; i++) {
			    	couleursServeur.add(SuiteCouleur.getAleaCouleur());
			    }
			    System.out.println(couleursServeur);
//Demande couleurs joueurs    
			    out.println("Quelles couleurs voulez vous ?");
			    out.flush();
			    String message3 = in.readLine();
			    
			    List<Serveur> couleursJoueur = new ArrayList<Serveur>();
			}
			/*else {
				out.println("Une autre fois alors !");
				out.flush();
			}
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

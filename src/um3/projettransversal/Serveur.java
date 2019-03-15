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
			System.out.println("Le serveur est � l'�coute du port "+socketserver.getLocalPort());
			socketduserveur = socketserver.accept(); 
		    System.out.println("Un joueur s'est connect�");//si un joueur est connect�
//Accueil du joueur		    
			out = new PrintWriter(socketduserveur.getOutputStream());
		    out.println("Bienvenue joueur !\nVous allez d�buter une partie de Mastermind. Pr�t(e) ? (oui/non)");
		    out.flush();
//R�cup�re la r�ponse du joueur s'il veux jouer		    
		    in = new BufferedReader (new InputStreamReader (socketduserveur.getInputStream()));
		    String message = in.readLine();
		    System.out.println("R�ponse joueur : " + message);

//Lancement de la partie ou pas
			if(message != "non")
			{
				
//D�roulement de la partie
				
				List<SuiteCouleur> combinaison = new ArrayList<SuiteCouleur>();

				
				out.println("D�but de la partie ! Vous devrez trouvez la bonne combinaison pour gagner. Petite pr�cision les couleurs devront avoir leur initial en majuscule et les coleurs s�par�s par un tiret. Combien de couleurs ?");
				out.flush();
				int message1 = in.read() - 48;
			    System.out.println("R�ponse joueur : " + message1);
			    
//Retour demande r�p�ttion	    
			    
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

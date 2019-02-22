package um3.projettransversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	
	public static void main(String[] zero) {
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;
		BufferedReader in;
		PrintWriter out;
		
		try {
		
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
			if(message != "non") {
//Déroulement de la partie
				String code = "Rouge-Bleu-Vert-Jaune";
				out.println("Début de la partie ! Il y a 4 couleurs entre le Bleu, le Jaune, le Vert et le Rouge.\nVous devrez trouvez la bonne combinaison pour gagner. Petite précision les couleurs devront avoir leur initiale en majuscule et les coleurs séparés par un tiret.");
				out.flush();
				String message1 = in.readLine();
			    System.out.println("Réponse joueur : " + message1);
			    
			    if(message1 == code) {
			    	out.println("Juste");
					out.flush();
			    }
			    else {
			    	out.println("Faux");
					out.flush();
			    }
			}
			else {
				out.println("Une autre fois alors !");
				out.flush();
			}
			
			            
		    socketduserveur.close();
		    socketserver.close();
		    
		        
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

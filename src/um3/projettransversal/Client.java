
package um3.projettransversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	
	public static void main(String[] zero) {
		
		Socket socket;
		BufferedReader in;
		PrintWriter out;

		try {
//Connexion serveur
			socket = new Socket(InetAddress.getLocalHost(), 2019);	
		    System.out.println("Demande de connexion");
		    
/*Message de bienvenue du serveur
		    in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		    String bienvenue = in.readLine();
		    System.out.println(bienvenue);
		    
Demende si le joueur est prêt
		    String pret = in.readLine();
		    System.out.println(pret);
		    
Saisie du joueur s'il est prêt ou non et envoie au serveur
		    Scanner sc = new Scanner(System.in);
		    String debut = sc.next();
		    out = new PrintWriter(socket.getOutputStream());
		  
		    out.println(debut);
		    out.flush();

		Message retour suite à la réponse du joueur, explications
		    String expliquation = in.readLine();
		    System.out.println(expliquation);
		    String expliquation1 = in.readLine();
		    System.out.println(expliquation1);
*/		    
//Début partie, saisie du nombre de couleur
		    
		    ObjectOutputStream out2 = new ObjectOutputStream(socket.getOutputStream());
			Partie partie = new Partie();
			partie.getPartie();
			out2.writeObject(partie);
		    
		    socket.close();
		       
		}
		catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

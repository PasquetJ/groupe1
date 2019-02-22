
package um3.projettransversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		    
//Message de bienvenue du serveur
		    in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		    String message_distant = in.readLine();
		    System.out.println(message_distant);
		    
//Demende si le joueur est prêt
		    String message_distant1 = in.readLine();
		    System.out.println(message_distant1);
		    
//Saisie du joueur s'il est prêt ou non et envoie au serveur
		    Scanner sc = new Scanner(System.in);
		    String message = sc.next();
		    out = new PrintWriter(socket.getOutputStream());
		    out.println(message);
		    out.flush();
		    
//Message retour suite à la réponse du joueur
		    String message_distant2 = in.readLine();
		    System.out.println(message_distant2);
		    
//Début partie
		    String message1 = sc.next();
		    out = new PrintWriter(socket.getOutputStream());
		    out.println(message1);
		    out.flush();
//Message retour suite à la réponse du joueur
		    String message_distant3 = in.readLine();
		    System.out.println(message_distant3);
		    
		    
		    sc.close(); 
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

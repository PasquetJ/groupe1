
package um3.projettransversal;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	
	public static void main(String[] zero) {
		
		Socket socket;

		try {
//Connexion serveur
			socket = new Socket(InetAddress.getLocalHost(), 2019);	
		    System.out.println("Demande de connexion");
		    
		    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			Partie partie = new Partie();
			partie.getPartie();
			out.writeObject(partie);
		    
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

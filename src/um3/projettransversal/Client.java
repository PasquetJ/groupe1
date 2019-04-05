
package um3.projettransversal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


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
		    
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			ArrayList<SuiteCouleur> couleursServeur = new ArrayList<SuiteCouleur>();
			try {
				couleursServeur = (ArrayList<SuiteCouleur>) in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArrayList<Integer> Diff = Reponse.Trouve(couleursServeur, EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs()));
			System.out.println("Couleurs bien placées : " + Diff.get(0) + "\nCouleurs mal placées : " + Diff.get(1));
			
			while(Diff.get(0) < partie.getNombreCouleurs())
			{
				partie.getPartieCouleurs();
				Diff = Reponse.Trouve(couleursServeur, EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs()));
				System.out.println("Couleurs bien placées : " + Diff.get(0) + "\nCouleurs mal placées : " + Diff.get(1));
			}
			
			
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

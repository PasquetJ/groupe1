
package um3.projettransversal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class Client
{
	
	public static void main(String[] zero) throws TailleListeCouleur
	{
		
		Socket socket;

		try
		{
//Connexion serveur
			socket = new Socket(InetAddress.getLocalHost(), 2019);
		    
		    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			Partie partie = new Partie();
			partie.getPartie();

			out.writeObject(partie);
		    
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			ArrayList<SuiteCouleur> couleursServeur = new ArrayList<SuiteCouleur>();
			try
			{
				couleursServeur = (ArrayList<SuiteCouleur>) in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int[] Diff = new int[2];
			int tentative = 10;
			int tentativeJoueur = 1;
			
			Diff = Reponse.Trouve((ArrayList<SuiteCouleur>)couleursServeur.clone(), EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs(), partie.getNombreCouleurs()));
			System.out.println("Couleurs bien placées : " + Diff[0] + "\nCouleurs mal placées : " + Diff[1] + "\nTentatives : " + tentativeJoueur);
			
			while(Diff[0] != couleursServeur.size() && tentativeJoueur != tentative)
			{
				tentativeJoueur++;
				partie.getPartieCouleurs();
				Diff = Reponse.Trouve((ArrayList<SuiteCouleur>)couleursServeur.clone(), EntreeCouleur.entreeCouleur(partie.getCouleursJoueurs(), partie.getNombreCouleurs()));
				System.out.println("Couleurs bien placées : " + Diff[0] + "\nCouleurs mal placées : " + Diff[1] + "\nTentatives : " + tentativeJoueur);
				
			}

			if(Diff[0] == couleursServeur.size())
			{
				System.out.println("Gagné !");
			}
			if(tentativeJoueur == tentative) {
				System.out.println("Perdu !");
			}
			
		    socket.close();
		}
		catch (UnknownHostException e)
		{
			
			e.printStackTrace();
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
}

package um3.projettransversal;

import java.util.*;

public class ChoixJoueur {
    public enum Couleur 
    {
        Rouge,
        Vert,
        Bleu;
        public static Couleur getAleaColor() 
        {
            Random alea = new Random();
            return values()[alea.nextInt(values().length)];
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisir difficulte:");
		int Diff = sc.nextInt();
		Choix game1 = new Choix();
		
		for(int i = 0; i<Diff; i++)
		{
			game1.ajout(Couleur.getAleaColor());
		}
		System.out.println(game1);
		
		
		

	}

}


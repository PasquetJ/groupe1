package um3.projettransversal;

import java.util.Random;

public enum SuiteCouleur {
	Rouge,
	Bleu,
	Vert, 
	Jaune, 
	Orange,
	Blanc,
	Rose,
	Gris;
	
    public static SuiteCouleur getAleaCouleur() 
    {
        Random alea = new Random();
        return values()[alea.nextInt(values().length)];
    }
}

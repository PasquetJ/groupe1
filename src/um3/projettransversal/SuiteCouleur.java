package um3.projettransversal;

import java.util.Random;

public enum SuiteCouleur {
	rouge,
	bleu,
	jaune, 
	noir,
	blanc,
	gris,
	vert,
	orange,
	violet;
	
    public static SuiteCouleur getAleaCouleur() 
    {
        Random alea = new Random();
        return values()[alea.nextInt(values().length)];
    }
    
    
    
}

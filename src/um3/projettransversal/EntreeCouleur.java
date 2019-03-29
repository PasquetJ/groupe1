package um3.projettransversal;

import java.util.ArrayList;

public class EntreeCouleur
{
    public static ArrayList<String> entreeCouleur(String Couleur)
    {
        String[] partie = Couleur.split("-");
        ArrayList<String> tab = new ArrayList<String>();
        for(int i=0;i<partie.length; i++)
        {
            tab.add(partie[i]);
        }
        return tab;
    }
    

}

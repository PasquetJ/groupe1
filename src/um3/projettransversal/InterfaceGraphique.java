package um3.projettransversal;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGraphique extends JFrame
{
	  public static void main(String[] args)
	  {
		   InterfaceGraphique ig = new InterfaceGraphique();
	  } 	  

	  public InterfaceGraphique()
	  {
		  //titre
	      this.setTitle("Ma première fenêtre Java");
	      //dimension
	      this.setSize(400, 500);
	      //positionnement au centre
	      this.setLocationRelativeTo(null);
	      //ferme laen^tre quand on clique sur la croix rouge
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	      //rend visible la fenêtre
	      this.setVisible(true);
	      //empêche le redimensionnement
	      this.setResizable(false);
	      
	      //Instanciation d'un objet JPanel
	      JPanel pan = new JPanel();
	      //Définition de sa couleur de fond
	      pan.setBackground(Color.ORANGE);        
	      //On prévient notre JFrame que notre JPanel sera son content pane
	      this.setContentPane(pan);
	    }
}

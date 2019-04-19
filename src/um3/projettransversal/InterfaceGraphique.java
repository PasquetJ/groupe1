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
	      this.setTitle("Ma premi�re fen�tre Java");
	      //dimension
	      this.setSize(400, 500);
	      //positionnement au centre
	      this.setLocationRelativeTo(null);
	      //ferme laen^tre quand on clique sur la croix rouge
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	      //rend visible la fen�tre
	      this.setVisible(true);
	      //emp�che le redimensionnement
	      this.setResizable(false);
	      
	      //Instanciation d'un objet JPanel
	      JPanel pan = new JPanel();
	      //D�finition de sa couleur de fond
	      pan.setBackground(Color.ORANGE);        
	      //On pr�vient notre JFrame que notre JPanel sera son content pane
	      this.setContentPane(pan);
	    }
}

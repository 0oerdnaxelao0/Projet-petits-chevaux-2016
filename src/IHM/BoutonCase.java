package IHM;

import PetitsChevaux.Cheval;
import StandardDamier.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoutonCase extends JButton{
	
	private ImageIcon setImageBouton;
	
	public BoutonCase(ImageIcon img) {
		setImageBouton = null;
    }
	
	public void setImageBouton(ImageIcon img){
		this.setImageBouton = img;
	}
}

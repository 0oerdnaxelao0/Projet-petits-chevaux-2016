package StandardDamier;

import java.util.Arrays;

public class Plateau {
	// pLateau standard pour les jeux de damier
	
	public final static int LARGEUR = 15;
	public final static int HAUTEUR = 15;
	public int damier[][] = new int[LARGEUR][HAUTEUR];
	//image de fond
	
	public Plateau(){
		// Constructeur par défaut
	}
	
	public String toString() {
		return "Plateau [damier=" + Arrays.toString(damier) + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plateau other = (Plateau) obj;
		if (!Arrays.deepEquals(damier, other.damier))
			return false;
		return true;
	}
}

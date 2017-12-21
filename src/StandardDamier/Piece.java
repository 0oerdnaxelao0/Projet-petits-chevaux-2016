package StandardDamier;

import javax.swing.ImageIcon;

public abstract class Piece {
	
	private String couleur;
	private int x;
	private int y;
	private ImageIcon cliquable;
	private ImageIcon nonCliquable;
	
	public ImageIcon getCliquable() {
		return cliquable;
	}

	public void setCliquable(String img) {
		this.cliquable = new ImageIcon(img);
	}

	public ImageIcon getNonCliquable() {
		return nonCliquable;
	}

	public void setNonCliquable(String img) {
		this.nonCliquable = new ImageIcon(img);
	}

	public Piece(){
		// Constructeur par défaut
	}
	
	public Piece(String c){
		this.couleur = c;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void deplacer(int d); // Methode abstraite

	public String toString() {
		return "Piece [couleur=" + couleur + ", x: " + x + ", y: " + y + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Piece))
			return false;
		Piece other = (Piece) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
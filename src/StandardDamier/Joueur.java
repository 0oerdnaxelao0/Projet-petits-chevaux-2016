package StandardDamier;

public class Joueur {
	
	private String couleur;
	private int nbrPieces;
	
	public Joueur(){
		// Constructeur par défaut
	}
	
	public Joueur(String c, int n){
		setCouleur(c);
		setNbrPieces(n);
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getNbrPieces() {
		return nbrPieces;
	}
	public void setNbrPieces(int nbrPieces) {
		this.nbrPieces = nbrPieces;
	}
	
	public String toString() {
		return "Joueur [couleur=" + couleur + ", nbrPieces=" + nbrPieces + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Joueur))
			return false;
		Joueur other = (Joueur) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (nbrPieces != other.nbrPieces)
			return false;
		return true;
	}
}

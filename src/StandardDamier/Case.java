package StandardDamier;

public class Case {
	
	private int x;
	private int y;
	private boolean estVide = true;
	
	public Case(){
		// Constructeur par défaut
	}
	
	public Case(int x, int y){
		setX(x);
		setY(y);
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
	
	public boolean isEstVide() {
		return estVide;
	}
	
	public void setEstvide(boolean estVide) {
		this.estVide = estVide;
	}
	
	
	public String toString() {
		if(estVide)
			return "Coordonnees [ x: " + x + ", y: " + y + " ] la case est vide";
		else
			return "Coordonnees [ x: " + x + ", y: " + y + " ] la case est occupée";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Case other = (Case) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}

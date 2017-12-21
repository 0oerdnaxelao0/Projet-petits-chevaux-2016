package PetitsChevaux;

import StandardDamier.*;

public class JoueurData extends Joueur {
	
	private boolean humain = false;
	
	public JoueurData(String s, boolean h){
		setCouleur(s);
		setHumain(h);
	}

	public boolean isHumain() {
		return humain;
	}

	public void setHumain(boolean humain) {
		this.humain = humain;
	}

	public String toString() {
		return "JoueurData [humain=" + humain + "]";
	}
	
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if (!(obj instanceof JoueurData))
			return false;
		JoueurData other = (JoueurData) obj;
		if (humain == other.humain) {
			return true;
		}
		else 
			return false;
	}
}

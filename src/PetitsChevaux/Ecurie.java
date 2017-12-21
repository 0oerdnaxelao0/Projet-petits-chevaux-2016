package PetitsChevaux;

import StandardDamier.Case;

public class Ecurie extends Case {
	
	public static int nbrV = 0;
	public static int nbrJ = 0;
	public static int nbrB = 0;
	public static int nbrR = 0;
	
	public Ecurie(){
		setX(7);
		setY(7);
	}

	public String toString() {
		return "Ecurie [nbrV=" + nbrV + ", nbrJ=" + nbrJ + ", nbrB=" + nbrB + ", nbrR=" + nbrR + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Ecurie))
			return false;
		Ecurie other = (Ecurie) obj;
		if (nbrB != other.nbrB)
			return false;
		if (nbrJ != other.nbrJ)
			return false;
		if (nbrR != other.nbrR)
			return false;
		if (nbrV != other.nbrV)
			return false;
		return true;
	}
	
	
}

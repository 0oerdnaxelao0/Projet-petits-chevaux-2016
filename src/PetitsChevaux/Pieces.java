package PetitsChevaux;

public class Pieces {
	
	public static Cheval chevaux[] = new Cheval[16];
	
	public Pieces(){
		initChevaux();
	}
	
	private void initChevaux(){
		for(int i = 0; i < 4; i++){
			chevaux[i] = new Cheval("vert", 1, 0);
			chevaux[i].setCliquable("// Nom du fichier.png");
			chevaux[i].setNonCliquable("// Nom du fichier.png");
		}
		for(int i = 4; i < 8; i++){
			chevaux[i] = new Cheval("jaune", 15, 14);
			chevaux[i].setCliquable("// Nom du fichier.png");
			chevaux[i].setNonCliquable("// Nom du fichier.png");
		}
		for(int i = 8; i < 12; i++){
			chevaux[i] = new Cheval("bleu", 29, 28);
			chevaux[i].setCliquable("// Nom du fichier.png");
			chevaux[i].setNonCliquable("// Nom du fichier.png");
		}
		for(int i = 12; i < 16; i++){
			chevaux[i] = new Cheval("rouge", 43, 42);
			chevaux[i].setCliquable("// Nom du fichier.png");
			chevaux[i].setNonCliquable("// Nom du fichier.png");
		}
			
	}
	
	public String toString() {
		return "Pieces [ nombre de pieces = 16 ]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		return true;
	}
}
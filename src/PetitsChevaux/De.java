package PetitsChevaux;

import java.util.Random;

public class De {
	private int valeurDe;
	// Tableau d'images
	
	public De(){	
		// Constructeur par défaut
	}

	public int getValeurDe() {
		return valeurDe;
	}
	
	public void lancer(){	
		Random x = new Random();
		int t = 100;
		for (int i = 0; i < 10; i++){
			valeurDe = x.nextInt(6) + 1; // Valeur entre 1 et 6
			try{ 
				Thread.sleep(t); 
			}
			catch(Exception e){};
////////////System.out.println(valeurDe - 1); // Enlever ca et le remplacer par un tableau d'images  (Il est important de mettre le -1)
			// Afficher TabImg[valeurDe - 1]  // Affichage des images
		}
		
		for (int i = 0; i < 5; i++){
			valeurDe = x.nextInt(6) + 1; // Valeur entre 1 et 6
			try{ 
				Thread.sleep(t); 
			}
			catch(Exception e){};
			t = t + 100;
////////////System.out.println(valeurDe - 1); // Enlever ca et le remplacer par un tableau d'images (Il est important de mettre le -1)
			// Afficher TabImg[valeurDe - 1]
		}
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		De other = (De) obj;
		if (valeurDe != other.valeurDe)
			return false;
		return true;
	}

	public String toString() {
		return "Valeur du dé = " + valeurDe;
	}
}
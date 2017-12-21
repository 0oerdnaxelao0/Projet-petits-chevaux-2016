package PetitsChevaux;

import StandardDamier.*;
import javax.swing.*;
import IHM.BoutonCase;
import java.awt.*;

public class Cheval extends Piece {
	
	private int position;
	private int positionDepart;		
	private int positionArrivee;
	private boolean dansEnclos;
	private boolean dansChemin;
	private boolean dansEscalier;
	public ImageIcon img = new ImageIcon();
	
	
	// -- Méthodes standards -- //
	// ------------------------ //
	
	public Cheval(String c, int pd, int pa){
		setCouleur(c);
		initCheval();
		setPositionDepart(pd);
		setPositionArrivee(pa);
		img = getNonCliquable();
		dansEnclos = true;
		dansChemin = false;
		dansEscalier = false;
	}

	public boolean isDansEnclo() {
		return dansEnclos;
	}

	public void setDansEnclo(boolean dansEnclo) {
		this.dansEnclos = dansEnclo;
	}

	public boolean isDansChemin() {
		return dansChemin;
	}

	public void setDansChemin(boolean dansChemin) {
		this.dansChemin = dansChemin;
	}

	public boolean isDansEscalier() {
		return dansEscalier;
	}

	public void setDansEscalier(boolean dansEscalier) {
		this.dansEscalier = dansEscalier;
	}
	
	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPositionDepart() {
		return positionDepart;
	}

	public void setPositionDepart(int positionDepart) {
		this.positionDepart = positionDepart;
	}

	public int getPositionArrivee() {
		return positionArrivee;
	}

	public void setPositionArrivee(int positionArrivee) {
		this.positionArrivee = positionArrivee;
	}

	public boolean isDansEnclos() {
		return dansEnclos;
	}

	public void setDansEnclos(boolean dansEnclos) {
		this.dansEnclos = dansEnclos;
	}
	
	public String toString() {
		if(dansEnclos)
			return "Cheval " + getCouleur() + "-> dans l'enclos";
		else if(dansChemin)
			return "Cheval " + getCouleur() + "-> dans le chemin à la position : \n   > x : " + PlateauPC.chemin[position].getX() + "\n   > y : " + PlateauPC.chemin[position].getY();
		else if(dansEscalier)
			return "Cheval " + getCouleur() + "-> dans l'escalier à la position : \n   > x : " + PlateauPC.chemin[position].getX() + "\n   > y : " + PlateauPC.chemin[position].getY();
		else
			return "Cheval " + getCouleur() + "-> dans l'écurie à la positon : " + position;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cheval other = (Cheval) obj;
		if (dansChemin != other.dansChemin)
			return false;
		if (dansEnclos != other.dansEnclos)
			return false;
		if (dansEscalier != other.dansEscalier)
			return false;
		return true;
	}
	
	
	
	// -- Méthodes spécifiques -- //
	// -------------------------- //
	
	public void initCheval(){
		// Initialise les données que va utiliser ce cheval
		
		switch(getCouleur()){	// Selon sa couleur
			case "vert": {
				positionDepart = 1;
				positionArrivee = 0;
				setCliquable("// Nom du fichier.png");
				setNonCliquable("// Nom du fichier.png");
				break;
			}
			case "jaune": {
				positionDepart = 15;
				positionArrivee = 14;
				setCliquable("// Nom du fichier.png");
				setNonCliquable("// Nom du fichier.png");
				break;
			}
			case "bleu": {
				positionDepart = 29;
				positionArrivee = 28;
				setCliquable("// Nom du fichier.png");
				setNonCliquable("// Nom du fichier.png");
				break;
			}
			case "rouge": {
				positionDepart = 43;
				positionArrivee = 42;
				setCliquable("// Nom du fichier.png");
				setNonCliquable("// Nom du fichier.png");
				break;
			}
		}
	}


	public void retourEnclos(){
		// Replace le cheval dans l'enclos
		int i = 0;
		boolean place = false;
		switch(getCouleur()){
			// En fonction de la couleur, le cheval se place en dehors de l'enclos
			case "vert": {
				while(i < 4 && place == false){	// Tant que le cheval n'est pas positionné
					if(PlateauPC.enclosV[i].isEstVide()){	// Si une case de l'enclos est vide, il se positionne dessus
						this.setX(PlateauPC.enclosV[i].getX());
						this.setY(PlateauPC.enclosV[i].getY());
						place = true;
					}
					i++;
				}
				break;
			}
			case "jaune": {
				while(i < 4 && place == false){	// Tant que le cheval n'est pas positionné
					if(PlateauPC.enclosJ[i].isEstVide()){	// Si une case de l'enclos est vide, il se positionne dessus
						this.setX(PlateauPC.enclosJ[i].getX());
						this.setY(PlateauPC.enclosJ[i].getY());
						place = true;
					}
					i++;
				}
				break;
			}
			case "bleu": {
				while(i < 4 && place == false){	// Tant que le cheval n'est pas positionné
					if(PlateauPC.enclosB[i].isEstVide()){	// Si une case de l'enclos est vide, il se positionne dessus
						this.setX(PlateauPC.enclosB[i].getX());
						this.setY(PlateauPC.enclosB[i].getY());
						place = true;
					}
					i++;
				}
				break;
			}
			case "rouge": {
				while(i < 4 && place == false){	// Tant que le cheval n'est pas positionné
					if(PlateauPC.enclosR[i].isEstVide()){	// Si une case de l'enclos est vide, il se positionne dessus
						this.setX(PlateauPC.enclosR[i].getX());
						this.setY(PlateauPC.enclosR[i].getY());
						place = true;
					}
					i++;
				}
				break;
			}
		}
		this.dansChemin = false;
		this.dansEnclos = true;
	}
	
	
	public boolean chevalJouable(int d){
		// Les cas ou le cheval n'est pas jouable
		if(d != 6 && dansEnclos)
			return false;
		
		if(getX() == 7 && getY() == 7) // Si le cheval se trouve dans l'écurie
			return false;
		
		for(int i = position; i <= position + d - 1; i++){
			if(!PlateauPC.chemin[i].isEstVide())  // Si la case i n'est pas vide
				return false;
		}
		
		// Dans tous les autres cas
		setImg(getCliquable()); // Image cliquable
		return true;
	}
	

	public void deplacer(int d) {
		// Deplace la pièce courante
		// Prend en paramètre la valeur du dé

		if(chevalJouable(d)){ // Si le cheval a le droit de se déplacer
			if(dansEnclos){  // Si le cheval est dans l'enclos	
				
				if(d == 6){
					position = positionDepart; // Position de départ du cheval
					PlateauPC.chemin[position].setEstvide(false); // La case est occupée
					dansEnclos = false;	// Il n'est plus dans enclos
					dansChemin = true; 	// Il est  dans chemin
				}
			}
			
			else if(dansChemin){  // Si le cheval est dans chemin
				
				if(position == positionArrivee){  // Si le cheval est sur la dernière case
					dansChemin = false;		// N'est plus dans chemin
					dansEscalier = true;	// Est dans escalier
					PlateauPC.chemin[position].setEstvide(true);  // Le cheval quitte la case, elle devient vide
					position = d - 1;  // Le cheval se positionne dans l'escalier
				}
				
				else if((position + d > positionArrivee) || (getCouleur() == "vert" && position + d > 56)){  // Si le cheval va dépasser la dernière case
						int a;
						if(getCouleur() == "vert") // Cas particulier pour les chevaux verts, leur point d'arrivé est : 0 
							a = 56;
						else
							a = positionArrivee;
						
						PlateauPC.chemin[position].setEstvide(true);  // La case devient vide
						
						int distance = a - position;
						int retour = d - distance;
						position = position + (distance - retour); // Le cheval recule si il dépasse
						
						PlateauPC.chemin[position].setEstvide(false);  // Le cheval occupe cette case
					}
					else if(position + d < 56){ // Si la position ne dépasserait pas 55
						PlateauPC.chemin[position].setEstvide(true);  // La case devient vide
						position = position + d;  // Le cheval se déplace de d cases
						PlateauPC.chemin[position].setEstvide(false);  // La case devient occupée
					}
					else{  // Si la position dépassait 55
						PlateauPC.chemin[position].setEstvide(true);  // La case devient vide
						position = (position + d) - 56; // On revient au debut du tableau
						PlateauPC.chemin[position].setEstvide(false);  // La case devient occupée
					}
				
				for(int i = 0; i < 16; i++){
					if(Pieces.chevaux[i].position == this.position){  // Si un autre cheval se trouve à la méme position que celui-ci
						Pieces.chevaux[i].retourEnclos(); // Il retourne à l'enclos
					}
				}
			}
			
			else if(dansEscalier){  // Si le cheval est dans l'escalier
				if(position < 6)
					position = position + d;
				
				if(position >= 6){	// Si le cheval dépasse la dernière case de l'escalier
					dansEscalier = false; // Il sort de l'escalier
					// Il se positionne dans l'Ecurie
					setX(7);
					setY(7);
				}
			}
			
			recupererPosition(); // Récupération des coordonnées
			setImg(getNonCliquable()); // image normale (non cliquable)
		}
	}
	
	
	public void recupererPosition(){
		// Récupération des coordonnées
		
		if(dansChemin){
			setX(PlateauPC.chemin[position].getX());
			setY(PlateauPC.chemin[position].getY());
		}
		else if(dansEnclos){
			switch(getCouleur()){
				case "vert" : {
					setX(PlateauPC.enclosV[position].getX());
					setY(PlateauPC.enclosV[position].getY());
					break;
				}
				case "jaune" : {
					setX(PlateauPC.enclosJ[position].getX());
					setY(PlateauPC.enclosJ[position].getY());
					break;
				}
				case "bleu" : {
					setX(PlateauPC.enclosB[position].getX());
					setY(PlateauPC.enclosB[position].getY());
					break;
				}
				case "rouge" : {
					setX(PlateauPC.enclosR[position].getX());
					setY(PlateauPC.enclosR[position].getY());
					break;
				}
			}
		}
		else if(dansEscalier){
			switch(getCouleur()){
				case "vert" : {
					setX(PlateauPC.escalierV[position].getX());
					setY(PlateauPC.escalierV[position].getY());
					break;
				}
				case "jaune" : {
					setX(PlateauPC.escalierJ[position].getX());
					setY(PlateauPC.escalierJ[position].getY());
					break;
				}
				case "bleu" : {
					setX(PlateauPC.escalierB[position].getX());
					setY(PlateauPC.escalierB[position].getY());
					break;
				}
				case "rouge" : {
					setX(PlateauPC.escalierR[position].getX());
					setY(PlateauPC.escalierR[position].getY());
					break;
				}
			}
		}
		else{
			setX(7);
			setY(7);
			switch(getCouleur()){
				case "vert" : {Ecurie.nbrV++; break;}
				case "jaune" : {Ecurie.nbrJ++; break;}
				case "bleu" : {Ecurie.nbrB++; break;}
				case "rouge" : {Ecurie.nbrR++; break;}
			}
		}
	}
	
}

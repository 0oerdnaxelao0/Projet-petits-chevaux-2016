package PetitsChevaux;

import java.util.Arrays;
import StandardDamier.*;

public class PlateauPC extends Plateau{
	// Plateau Petis Cheveux
	
	public static Case chemin[] = new Case[56];
	
	public static Case escalierV[] = new Case[6];
	public static Case escalierJ[] = new Case[6];
	public static Case escalierB[] = new Case[6];
	public static Case escalierR[] = new Case[6];
	
	public static Case enclosV[] = new Case[4];
	public static Case enclosJ[] = new Case[4];
	public static Case enclosB[] = new Case[4];
	public static Case enclosR[] = new Case[4];
	
	public PlateauPC(){
		// Constructeur par défaut
		// initialisation des tableaux de coordonnés
		initChemin();
		initEscalier();
		initEnclos();
	}

	private void initChemin(){
		// Remplir le tableau chemin avec les coordonnées
		// de chaque case jouable du Plateau
		
		for(int i = 0; i < 56; i++){
			chemin[i] = new Case();
		}
		
		chemin[0].setX(7); 
		chemin[0].setY(14);
		
		for(int i = 1; i <= 7; i++){
			for(int j = 14; j >= 8; j--){
				chemin[i].setX(6); 
				chemin[i].setY(j);
				i++;
			}
		}
		
		for(int i = 8; i <= 13; i++){
			for(int j = 5; j >= 0; j--){
				chemin[i].setX(j); 
				chemin[i].setY(8);
				i++;
			}
		}
		
		chemin[14].setX(0); 
		chemin[14].setY(7);
		
		for(int i = 15; i <= 21; i++){
			for(int j = 0; j <= 6; j++){
				chemin[i].setX(j);
				chemin[i].setY(6);
				i++;
			}
		}
		
		for(int i = 22; i <= 27; i++){
			for(int j = 5; j >= 0; j--){
				chemin[i].setX(6); 
				chemin[i].setY(j);
				i++;
			}
		}
		
		chemin[28].setX(7); 
		chemin[28].setY(0);
		
		for(int i = 29; i <= 35; i++){
			for(int j = 0; j <= 6; j++){
				chemin[i].setX(8); 
				chemin[i].setY(j);
				i++;
			}
		}
		
		for(int i = 36; i <= 41; i++){
			for(int j = 9; j <= 14; j++){
				chemin[i].setX(j); 
				chemin[i].setY(6);
				i++;
			}
		}
		
		chemin[42].setX(14); 
		chemin[42].setY(7);
		
		for(int i = 43; i <= 49; i++){
			for(int j = 14; j >= 8; j--){
				chemin[i].setX(j); 
				chemin[i].setY(8);
				i++;
			}
		}
		
		for(int i = 50; i <= 55; i++){
			for(int j = 9; j <= 14; j++){
				chemin[i].setX(8); 
				chemin[i].setY(j);
				i++;
			}
		}
	}
	
	private void initEscalier(){
		// Remplire les tableaux escalier avec les coordonnées
		// de chaque case des escaliers
		
		for(int i = 0; i < 6; i++){
			escalierV[i] = new Case();
			escalierJ[i] = new Case();
			escalierR[i] = new Case();
			escalierB[i] = new Case();
		}
		
		for(int i = 0; i <= 5; i++){	// Escalier vert
			for(int j = 13; j >= 8; j--){
				escalierV[i].setX(7);
				escalierV[i].setY(j);
				i++;
			}
		}
		
		for(int i = 0; i <= 5; i++){	// Escalier jaune
			for(int j = 1; j <= 6; j++){
				escalierJ[i].setX(j);
				escalierJ[i].setY(7);
				i++;
			}
		}
		
		for(int i = 0; i <= 5; i++){	// Escalier bleu
			for(int j = 1; j <= 6; j++){
				escalierB[i].setX(7);
				escalierB[i].setY(j);
				i++;
			}
		}
		
		for(int i = 0; i <= 5; i++){	// Escalier rouge
			for(int j = 13; j >= 8; j--){
				escalierR[i].setX(j);
				escalierR[i].setY(7);
				i++;
			}
		}
	}
	
	private void initEnclos(){
		// Remplire les tableaux enclos avec les coordonnées
		// ou seront placés les chevaux au départ
		
		for(int i = 0; i < 4; i++){
			enclosV[i] = new Case();
			enclosJ[i] = new Case();
			enclosR[i] = new Case();
			enclosB[i] = new Case();
		}
		
		// enclos vert
		enclosV[0].setX(2); enclosV[0].setY(11);
		enclosV[1].setX(3); enclosV[1].setY(11);
		enclosV[2].setX(2); enclosV[2].setY(12);
		enclosV[3].setX(3); enclosV[3].setY(12);
		
		// enclos jaune
		enclosJ[0].setX(2); enclosJ[0].setY(2);
		enclosJ[3].setX(3); enclosJ[1].setY(2);
		enclosJ[2].setX(2); enclosJ[2].setY(3);
		enclosJ[3].setX(3); enclosJ[3].setY(3);
		
		// enclos bleu
		enclosB[0].setX(11); enclosB[0].setY(2);
		enclosB[3].setX(12); enclosB[1].setY(2);
		enclosB[2].setX(11); enclosB[2].setY(3);
		enclosB[3].setX(12); enclosB[3].setY(3);
		
		// enclos rouge
		enclosR[0].setX(11); enclosR[0].setY(11);
		enclosR[3].setX(12); enclosR[1].setY(11);
		enclosR[2].setX(11); enclosR[2].setY(12);
		enclosR[3].setX(12); enclosR[3].setY(12);
	}
	
	public String toString(){
		String str="le chemin a pour coordonnees: ";
		for(int i=0; i<=5;i++){
			str += "\n Case num "+ i +" [ x : "+this.chemin[i].getX()+"   -   y : "+this.chemin[i].getY()+" ]";
		}
		return str;
	}
}

package PetitsChevaux;

import IHM.*;
import StandardDamier.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Arbitre implements ActionListener, MouseListener {
	
	De D = new De();
	private int d;
	private int cheval;
	private String gagnant;
	private Pieces pieces = new Pieces();
	public static Plateau plateau = new Plateau();
	private boolean termine = false;
	private JoueurData joueurs[] = new JoueurData[4];
	
	public Arbitre(){
		// Constructeur par défaut
	}
	
	public void jeu(int nbjoueurs){
		premierTour();
		tour();
		afficherGagnant(); 
	}
	
	public void premierTour(){
		do{
			// Mettre le dé de couleur blanche si possible
			D.lancer();
			d = D.getValeurDe();
		}
		while (d > 3);

		switch(d){
			case 0 : {
				joueurs[0] = new JoueurData("vert", IHM.Accueil.humain[0]); // Faut changer le nom de Accueil
				joueurs[1] = new JoueurData("jaune", IHM.Accueil.humain[1]);
				joueurs[2] = new JoueurData("bleu", IHM.Accueil.humain[2]);
				joueurs[3] = new JoueurData("rouge", IHM.Accueil.humain[3]);
				break;
			}
			case 1 : {
				joueurs[0] = new JoueurData("jaune", IHM.Accueil.humain[1]);
				joueurs[1] = new JoueurData("bleu", IHM.Accueil.humain[2]);
				joueurs[2] = new JoueurData("rouge", IHM.Accueil.humain[3]);
				joueurs[3] = new JoueurData("vert", IHM.Accueil.humain[0]);
				break;
			}
			case 2 : {
				joueurs[0] = new JoueurData("bleu", IHM.Accueil.humain[2]);
				joueurs[1] = new JoueurData("rouge", IHM.Accueil.humain[3]);
				joueurs[2] = new JoueurData("vert", IHM.Accueil.humain[0]);
				joueurs[3] = new JoueurData("jaune", IHM.Accueil.humain[1]);
				break;
			}
			case 3 : {
				joueurs[0] = new JoueurData("rouge", IHM.Accueil.humain[3]);
				joueurs[1] = new JoueurData("vert", IHM.Accueil.humain[0]);
				joueurs[2] = new JoueurData("jaune", IHM.Accueil.humain[1]);
				joueurs[3] = new JoueurData("bleu", IHM.Accueil.humain[2]);
				break;
			}
		}
		
		System.out.println("\n Le premier joueur est le joueur " + joueurs[0].getCouleur());
	}
	
	public void tour(){
		termine = false;
		while (termine == false){
			for(int i = 0; i < 4; i++){
				do{
					System.out.println("\n -- Tour du joueur+ " + joueurs[i].getCouleur());
					D.lancer();
					d = D.getValeurDe();
					System.out.println("\n Valeur du dé : " + d);
					
					if(joueurs[i].isHumain())  // Si le joueur est un humain
						deplacerCheval(joueurs[i].getCouleur(), d); // Clique puis deplace des chevaux
				
					else{  // Si le joueur est le pc
						int c = (int)(3 * Math.random());
							switch(joueurs[i].getCouleur()){ // Selon la couleur du tour
								// Deplace un cliquable au hasard
								case "vert" : { Pieces.chevaux[c].deplacer(d); break;}
								case "jaune" : { Pieces.chevaux[c + 4].deplacer(d); break;}
								case "bleu" : { Pieces.chevaux[c + 8].deplacer(d); break;}
								case "rouge" : { Pieces.chevaux[c + 12].deplacer(d); break;}
							}
					}
				}
				while(d == 6);
			}
			termine = verifier();
		}
	}
	
	private void deplacerCheval(String s, int d){
		// Affiche les chevaux jouables
		int a = 0, b = 0;
		
		switch(s){
			case "vert" : {a = 0; b = 4; break;}
			case "jaune" : {a = 4; b = 8; break;}
			case "bleu" : {a = 8; b = 12; break;}
			case "rouge" : {a = 12; b = 16; break;}
		}
		
		for(int i = a; i < b; i++ ){
			cheval = i;
			if(Pieces.chevaux[i].chevalJouable(d)){ // Si le cheval est jouable
				plateau.addMouseListener(this); // Ajouter un observateur à son bouton
			}
		}
	}
	
	public boolean verifier(){
		if (Ecurie.nbrV == 4){
			gagnant = "vert";
			return true;
		}

		if (Ecurie.nbrJ == 4){
			gagnant = "jaune";
			return true;
		}
		
		if (Ecurie.nbrB == 4){
			gagnant = "bleu";
			return true;
		}
		
		if (Ecurie.nbrR == 4){
			gagnant = "rouge";
			return true;
		}
		
		return false;
	}
	
	public void afficherGagnant(){
		// Afficher une boite de dialogue
		// de la couleur du gagnant
	}
	
	public void actionPerformed(ActionEvent event) {
		Pieces.chevaux[cheval].deplacer(d);
	}
	
	public void mouseClicked(MouseEvent event) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
	
}
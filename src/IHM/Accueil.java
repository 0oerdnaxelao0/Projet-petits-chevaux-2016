package IHM;

import java.util.Scanner;
import PetitsChevaux.*;

public class Accueil {
	
	public static boolean humain[] = new boolean[4];
	Scanner sc = new Scanner(System.in);
	
	public Accueil(){
	}
	
	public int initialiser(){
		System.out.println("			--- Petits Chevaux ---\n\nNombre de joueurs : ");
		int nbJoueurs = sc.nextInt();
		
		for(int i = 0; i < 4; i++)
			humain[i] = false;
		for(int i = 0; i < nbJoueurs; i++)
			humain[i] = true;
		
		return nbJoueurs;
	}
	
	public void partie(int nbr)
	{
		Arbitre partie = new Arbitre();
		partie.jeu(nbr);
	}
}

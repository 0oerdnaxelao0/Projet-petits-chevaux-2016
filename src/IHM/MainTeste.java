package IHM;

import StandardDamier.*;
import PetitsChevaux.*;

public class MainTeste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plateau Plat = new Plateau();
		PlateauPC Damier = new PlateauPC();
		De D = new De();
		Accueil deb = new Accueil();
		int nbr, d;
		
		nbr = deb.initialiser();
		deb.partie(nbr);
		
		
		/*
		System.out.println("<--- DEBUT ---> \n");
		C.toString();
		System.out.println("\n<- Lancement du dé -> \n");
		d = D.lancer(); // Apres, mettre le dé à 6 !
		System.out.println("\n<- Deplacement du cheval -> \n");
		System.out.println(D.toString());
		C.deplacer(d);
		System.out.println(C.toString());
		*/
		
		
	}
}

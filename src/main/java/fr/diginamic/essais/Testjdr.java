package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.jdr.*;

public class Testjdr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Personnage p = new Personnage();
		Creature c = new Creature();

		int jeu = 1;

		do {
			System.out.println("************* Menu du jeu *************\n");
			System.out.println("1 : Creer le personnage");
			System.out.println("2 : Combattre une creature");
			System.out.println("3 : Afficher score ");
			System.out.println("4 : Sortir ");

			int commande = Integer.parseInt(sc.nextLine());

			switch (commande) {

			case 1:

				p = new Personnage();
				System.out.println("Nouveau personnage crée");

				break;

			case 2:

				if (p.getPtVie() > 0) {

					System.out.println("************* Type de Creature *************\n");
					System.out.println("1 : Loup");
					System.out.println("2 : Troll");
					System.out.println("3 : Gobelin ");

					int typeM = Integer.parseInt(sc.nextLine());

					switch (typeM) {

					case 1:

						c = new Loup();

						break;

					case 2:
						c = new Troll();

						break;

					case 3:

						c = new Gobelin();

						break;

					default:

					}
					
					do{
						
						double forceP = p.getForce() +Math.random() * (10 - 1);
						double forceC = c.getForce() +Math.random() * (10 - 1);
						
						if(forceP > forceC){
							
							c.setPtVie(c.getPtVie()-(forceP-forceC));
							
						}else{
							
							p.setPtVie(p.getPtVie()-(forceC-forceP));							
							
						}
						
						
						
						
						
						
					}while(p.getPtVie() > 0 && c.getPtVie() > 0);
					
					
					if(p.getPtVie()<0){
						
						
						System.out.println("Partie Fini votre score est "+p.getScore()+"\n");
					}else{
						
						
						p.setScore(p.getScore()+c.getScore());
						
						System.out.println("Votre score est : "+p.getScore()+"\n");
					}
					
					
					

				} else {

					System.out.println(" Votre personnage est décédé. Il a obtenu le score de " + p.getScore()+ " points. Veuillez créer un nouveau personnage\n");
				}

				break;

			case 3:

				System.out.println("Votre score est : " + p.getScore() + "\n");
				break;

			case 4:
				jeu = 0;
				break;
			default:
			}

		} while (jeu == 1);

	}
}

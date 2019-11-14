package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;
import java.util.Scanner;

public class TestBanque {

	public static void main(String[] args) {

		int choix = 0;
		Scanner sc = new Scanner(System.in);

		CompteDaoMem c = new CompteDaoMem();

		Compte c1 = new Compte(1, 225.50);
		CompteTaux c2 = new CompteTaux(2, 1500, 0.75);

		c.sauvegarder(c1);
		c.sauvegarder(c2);

		// System.out.println(c.lister()[0]);

		do {

			System.out.println(
					"***** Administration des comptes ***** \n1. Lister les comptes\n2. Ajouter un nouveau compte\n3. Ajouter une opération à un compte\n4. Supprimer un compte\n99. Sortir");

			choix = Integer.parseInt(sc.nextLine());

			switch (choix) {

			case 1:
				System.out.println("*******Liste des comptes*******\n");

				for (int i = 0; i < c.lister().length; i++) {

					if (c.lister()[i].getType() == "Taux") {

						System.out.println("Numero : " + c.lister()[i].getNum() + " – Nombre d’opérations : "
								+ c.lister()[i].tailleTab() + " – Solde: " + c.lister()[i].getSolde() + " € – Taux : "
								+ c.lister()[i].getTaux() + " %");

					} else {

						System.out.println("Numero : " + c.lister()[i].getNum() + " – Nombre d’opérations : "
								+ c.lister()[i].tailleTab() + " – Solde: " + c.lister()[i].getSolde() + " €");
					}

				}

				break;

			case 2:
				System.out.println("*******Ajout d'un nouveau compte*******\n");

				String num = "";

				do {

					System.out.println("Veuillez saisir le numéro :");
					num = sc.nextLine();

				} while (c.existe(num));

				System.out.println("Veuillez saisir le solde initial :");

				double soldeInit = Double.parseDouble(sc.nextLine());

				System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
				int type = Integer.parseInt(sc.nextLine());

				switch (type) {

				case 1:

					System.out.println(Integer.parseInt(num) + "    " + soldeInit);

					Compte nc1 = new Compte(Integer.parseInt(num), soldeInit);
					c.sauvegarder(nc1);

					break;

				case 2:

					System.out.println("Veuillez saisir le taux :");
					double taux = Double.parseDouble(sc.nextLine());

					CompteTaux nc2 = new CompteTaux(Integer.parseInt(num), soldeInit, taux);
					c.sauvegarder(nc2);

					break;

				default:

				}

				break;

			case 3:
				System.out.println("*******Ajout d’une opération à un compte*******\n");

				String numAjoutOp = "";

				do {

					System.out.println("Veuillez choisir le numéro de compte concerné : ");
					numAjoutOp = sc.nextLine();
				} while (!c.existe(numAjoutOp));

				System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT):");

				String typeOp = sc.nextLine();

				System.out.println("Veuillez saisir la date :");

				String dateOp = sc.nextLine();

				System.out.println("Veuillez saisir le montant : ");

				String montant = sc.nextLine();

				switch (typeOp) {

				case "1":

					Credit opCredit = new Credit(dateOp, Double.parseDouble(montant));

					for (int i = 0; i < c.lister().length; i++) {

						if (c.lister()[i].getNum() == Integer.parseInt(numAjoutOp)) {

							c.lister()[i].ajouterOperation(opCredit);

						}

					}

					break;

				case "2":

					Debit opDebit = new Debit(dateOp, Double.parseDouble(montant));

					for (int i = 0; i < c.lister().length; i++) {

						if (c.lister()[i].getNum() == Integer.parseInt(numAjoutOp)) {

							c.lister()[i].ajouterOperation(opDebit);

						}
					}

					break;

				default:

				}

				break;

			case 4:
				System.out.println("*******Suppression d’un compte*******\n");
				
				String compteSup="";
				
				do {

					System.out.println("Veuillez choisir le numéro de compte concerné : ");
					compteSup = sc.nextLine();
				} while (!c.existe(compteSup));
				
				c.supprimer(compteSup);
				

				break;

			default:

			}

		} while (choix != 99);

		System.out.println("Aurevoir");

	}

}

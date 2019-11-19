package fr.diginamic.recensement;

import java.io.File;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Recensement r = new Recensement();

		Scanner sc = new Scanner(System.in);

		int sortir = 0;

		do {

			Menu.AffichMenu();
			System.out.println("\nVeuillez Choisir un numero : ");
			String choix = sc.nextLine();

			switch (Integer.parseInt(choix)) {

			case 1:				
				RecherchePopulationVille recherche = new RecherchePopulationVille();
				recherche.traiter(r,sc);
				break;
			case 2:
				
				RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
				recherche2.traiter(r,sc);

				break;
			case 3:
				RecherchePopulationRegion recherche3 = new RecherchePopulationRegion();
				recherche3.traiter(r,sc);

				break;
			case 4:
				RechercheRegion recherche4 = new RechercheRegion();
				recherche4.traiter(r,sc);

				break;
			case 5:
				
				RechercheDepartement recherche5 = new RechercheDepartement();
				recherche5.traiter(r,sc);

				break;
			case 6:
				RechercheVilleDep recherche6 = new RechercheVilleDep();
				recherche6.traiter(r,sc);
				
				break;
			case 7:
				RechercheVilleRegion recherche7 = new RechercheVilleRegion();
				recherche7.traiter(r,sc);
				
				break;
			case 8:
				
				RechercheVilleFrance recherche8 = new RechercheVilleFrance();
				recherche8.traiter(r,sc);

				break;
			case 9:
				sortir = 1;
				break;

			default:
			}

		} while (sortir == 0);
		
		
		System.out.println("Au revoir");

	}

}

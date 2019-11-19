package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		List<Ville> ville = recensement.getListeVille();

		String departementToFind;
		int pop = 0;

		System.out.println("Entrez un numero de departement :");
		departementToFind = scanner.nextLine();

		for (Ville v : ville) {

			if (v.getCodeD().equals(departementToFind)) {

				pop+= v.getPop(); 

			}
		}
		
		System.out.println("Le departement "+departementToFind+" a "+pop+" habitants");

	}
}

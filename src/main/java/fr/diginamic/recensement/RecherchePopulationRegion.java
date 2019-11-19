package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		List<Ville> ville = recensement.getListeVille();

		String regionToFind;
		int pop = 0;
		
		System.out.println("Entrez un nom de region :");
		regionToFind = scanner.nextLine();

		for (Ville v : ville) {

			if (v.getNomR().equals(regionToFind)) {

				pop+= v.getPop(); 

			}
		}
		
		System.out.println("La region "+regionToFind+" a "+pop+" habitants");
		
		
	}

}

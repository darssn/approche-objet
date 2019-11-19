package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVilleDep extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		List<Ville> ville = recensement.getListeVille();
		
		List<Ville> tab = new ArrayList<>();
		

		String departementToFind;
		int pop = 0;

		System.out.println("Entrez un numero de departement :");
		departementToFind = scanner.nextLine();

		for (Ville v : ville) {

			if (v.getCodeD().equals(departementToFind)) {
				
				tab.add(v);
				
			}
		}
		Collections.sort(tab, new ComparatorVilleD());
		
		for (int i = 0; i < 10; i++) {
			
			if(tab.size()>0){

			System.out.println("Departement : "+ tab.get(i).getCodeD()+" ; Commune :"+tab.get(i).getNomC() +"    "+tab.get(i).getPop()+" habitants" );

			}
		}
	

	}
		
		
	

}

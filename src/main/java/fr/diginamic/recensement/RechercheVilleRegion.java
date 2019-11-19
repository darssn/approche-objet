package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVilleRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		
		List<Ville> ville = recensement.getListeVille();
		
		List<Ville> tab = new ArrayList<>();
		

		System.out.println("Entrez un nom de region :");
		String regionToFind = scanner.nextLine();

		for (Ville v : ville) {

			if (v.getNomR().equals(regionToFind)) {
				
				tab.add(v);
				
			}
		}
		
		Collections.sort(tab,new ComparatorVilleD());
		
		for (int i = 0; i < 10; i++) {
			
			if(tab.size()>0){

			System.out.println("Region : "+ tab.get(i).getNomR()+" ; Commune :"+tab.get(i).getNomC() +"    "+tab.get(i).getPop()+" habitants" );
			
			}

		}
		
	}

}

package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{
	
	
	public RecherchePopulationVille() {
		
	}
	
	

	public void traiter(Recensement recensement, Scanner scanner) {
		
		List <Ville> ville = recensement.getListeVille();
		
		String villeToFind ;
		
		System.out.println("Entrez un nom de ville :");
		villeToFind = scanner.nextLine();
		
		
	for(Ville v : ville){
		
		if(v.getNomC().equals(villeToFind)){
			
			System.out.println(v);
			
		}
		
		
	}
		
		
		
		
		
		
	}

}

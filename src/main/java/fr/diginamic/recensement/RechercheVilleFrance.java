package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVilleFrance extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		List<Ville> ville = recensement.getListeVille();
		
		Collections.sort(ville, new ComparatorVilleD());
		
		for (int i = 0; i < 10; i++) {

			System.out.println("Region : "+ville.get(i).getNomR()+" ; Département : "+ville.get(i).getCodeD()+" ; Commune : "+ville.get(i).getNomC()+"  ; "+ville.get(i).getPop()+" habitants"  );

		}
		
		
		
	}

}

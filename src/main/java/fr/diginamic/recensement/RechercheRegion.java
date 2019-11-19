package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public  class RechercheRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		List<Ville> ville = recensement.getListeVille();
		
		HashMap<String, Integer> reg = new HashMap<>();
		
		TreeMap newVille = new TreeMap(new Comparateur(reg));

		for (int i = 0; i < ville.size(); i++){

			Ville v = ville.get(i);

			String region = v.getNomR();

			Integer pop = reg.get(region);

			if (pop == null) {
				pop = 0;
			}

			pop += v.getPop();

			reg.put(region,pop);

		}
		newVille.putAll(reg);
		
		

		Set<String> t = newVille.keySet();
		Iterator<String> iter = t.iterator();
		int count = 0;

		while (iter.hasNext() && count < 10) {

			String categorie = iter.next();
			Integer compteur = reg.get(categorie);
			
			count++;

			System.out.println("Region : " + categorie + " - Nb Habitant:" + compteur);
		}
		
	}

}

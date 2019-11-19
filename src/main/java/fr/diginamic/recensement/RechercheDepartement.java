package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class RechercheDepartement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> ville = recensement.getListeVille();
		
		HashMap<String, Integer> dep = new HashMap<>();
		
		TreeMap newVille = new TreeMap(new Comparateur(dep));

		for (int i = 0; i < ville.size(); i++){

			Ville v = ville.get(i);

			String d = v.getCodeD();

			Integer pop = dep.get(d);

			if (pop == null) {
				pop = 0;
			}

			pop += v.getPop();

			dep.put(d,pop);

		}
		newVille.putAll(dep);
		
		

		Set<String> t = newVille.keySet();
		Iterator<String> iter = t.iterator();
		int count = 0;

		while (iter.hasNext() && count < 10) {

			String categorie = iter.next();
			Integer compteur = dep.get(categorie);
			
			count++;

			System.out.println("Departement : " + categorie + " - Nb Habitant : " + compteur);
		}
		
	}
		
	

	
	
}

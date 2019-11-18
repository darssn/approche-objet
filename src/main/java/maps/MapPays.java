package maps;

import java.util.*;
import sets.Pays;

public class MapPays {

	public static void main(String[] args) {

		Map<String, Pays> map1 = new HashMap<>();

		map1.put("USA", new Pays("USA", 4, 40));
		map1.put("France", new Pays("France", 2, 50));
		map1.put("Allemagne", new Pays("Allemagne", 3, 30));
		map1.put("UK", new Pays("UK", 4, 200));
		map1.put("Italie", new Pays("Italie", 5, 50));
		map1.put("Japon", new Pays("Japon", 6, 70));
		map1.put("Chine", new Pays("Chine", 7, 30));
		map1.put("Russie", new Pays("Russie", 8, 45));
		map1.put("Inde", new Pays("Inde", 9, 48));
		
		

		Iterator<String> i = map1.keySet().iterator();
		
		
		String test = i.next();
		

		while (i.hasNext()) {

			String a = i.next();

				if(map1.get(a).getNbHab() < map1.get(test).getNbHab()){
										
					test = a;
													
				}
			
		}
		System.out.println("Le pays avec le moins d'habitant est : "+test);
		
		map1.remove(test);
		
		
		
		


		i = map1.keySet().iterator();
		
		while (i.hasNext()) {
			
			System.out.println(map1.get(i.next()).getNom());

		}

	}

}

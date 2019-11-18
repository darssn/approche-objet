package listes;

import java.util.*;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listeVille = new ArrayList<>();

		listeVille.add("Nice");
		listeVille.add("Carcassonne");
		listeVille.add("Narbonne");
		listeVille.add("Lyon");
		listeVille.add("Foix");
		listeVille.add("Pau");
		listeVille.add("Marseille");
		listeVille.add("Tarbes");

		System.out.println(listeVille);
		String maxLettre = "";

		for (String a : listeVille) {

			if (maxLettre.length() < a.length()) {

				maxLettre = a;
			}

		}

		System.out.println(maxLettre);

		for (int i = 0; i < listeVille.size(); i++) {

			listeVille.set(i, listeVille.get(i).toUpperCase());

		}

		System.out.println(listeVille);

		Iterator <String> iter = listeVille.iterator();


			while(iter.hasNext()){
				
					
				if(iter.next().charAt(0)=='N'){
			
					iter.remove();
														
				}
						

		}
			
			System.out.println(listeVille);

	}

}

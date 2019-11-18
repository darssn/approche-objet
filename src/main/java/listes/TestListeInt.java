package listes;

import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listeInt = new ArrayList<>();

		listeInt.add(-1);
		listeInt.add(5);
		listeInt.add(7);
		listeInt.add(3);
		listeInt.add(-2);
		listeInt.add(4);
		listeInt.add(8);
		listeInt.add(5);

		System.out.println(listeInt);
		System.out.println("La taille de la liste est : " + listeInt.size());

		Iterator<Integer> inter = listeInt.iterator();

		int max = listeInt.get(0);

		while (inter.hasNext()) {

			int a = inter.next();

			if (max < a) {

				max = a;
			}

		}

		System.out.println("Le max est : " + max);

		int min = 0;

		for (int i = 0; i < listeInt.size(); i++) {

			if (listeInt.get(min) > listeInt.get(i)) {

				min = i;
			}

		}

		listeInt.remove(min);

		System.out.println(listeInt);

		for (int i =0 ; i<listeInt.size();i++) {
			
			if(listeInt.get(i) < 0){
				
				listeInt.set(i,listeInt.get(i)*-1);
							
			}
			
		}
		
		System.out.println(listeInt);

	}

}

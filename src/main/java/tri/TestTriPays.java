package tri;


import java.util.*;

import sets.Pays;

public class TestTriPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pays> tab = new ArrayList<>();

		tab.add(new Pays("USA", 4, 40));
		tab.add(new Pays("France", 2, 50));
		tab.add(new Pays("Allemagne", 3, 30));
		tab.add(new Pays("UK", 4, 200));
		tab.add(new Pays("Italie", 5, 50));
		tab.add(new Pays("Japon", 6, 70));
		tab.add(new Pays("Chine", 7, 30));
		tab.add(new Pays("Russie", 8, 45));
		tab.add(new Pays("Inde", 9, 48));
		
		Collections.sort(tab, new ComparatorHabitant());
		
		
		for(Pays a : tab){
			System.out.println(a.getNom()+"  "+a.getNbHab()+" hab");
		}
		
Collections.sort(tab, new ComparatorPibHabitant());
		
		
		for(Pays a : tab){
			System.out.println(a.getNom()+"  "+a.getPib()+" €");
		}
		
		
	}
	
	
	

}

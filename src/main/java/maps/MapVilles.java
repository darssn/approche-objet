package maps;

import java.util.*;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator <Integer> cle = mapVilles.keySet().iterator();
		
		while(cle.hasNext()){
			
			System.out.println(cle.next());
			
		}
		
		Iterator <String> value = mapVilles.values().iterator();
		
		
		while(value.hasNext()){
			
			
			System.out.println(value.next());
		}
		
		System.out.println(mapVilles.size());
		

	}

}

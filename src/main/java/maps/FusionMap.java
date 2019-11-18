package maps;

import java.util.*;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Créationmap1
		HashMap<Integer, String> map1= new HashMap<Integer,String>();
		
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
			
		// Créationmap2
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5,"Bleu");
		map2.put(6, "Orange");
		
		
		
		
		Map <Integer,String> map3 = new HashMap<>();
		
		
		map3.putAll(map1);
		map3.putAll(map2);
		
		
		
		System.out.println(map3);
		
		
		
		
		
		

	}

}

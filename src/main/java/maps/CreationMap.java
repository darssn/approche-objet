package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> mapSalaires = new HashMap<>();

		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);

		System.out.println(mapSalaires.size());

	}

}

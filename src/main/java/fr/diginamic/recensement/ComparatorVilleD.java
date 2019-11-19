package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorVilleD implements Comparator <Ville>{

	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		
		
		if (v1.getPop() < v2.getPop()) {

			return 1;

		} else if (v1.getPop() > v2.getPop()) {
			return -1;
		}

		return 0;
	}

}

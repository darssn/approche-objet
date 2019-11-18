package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays p1, Pays p2) {
		// TODO Auto-generated method stub
		
		if(p1.getNbHab() > p2.getNbHab()){
			
			return 1;
			
		}else if(p1.getNbHab() < p2.getNbHab()){
			return -1;
		}
		
		return 0;
	}
	
	
	

}

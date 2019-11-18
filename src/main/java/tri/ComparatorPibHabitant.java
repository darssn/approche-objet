package tri;
import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		
			if(p1.getPib() > p2.getPib()){
			
			return 1;
			
		}else if(p1.getPib() < p2.getPib()){
			return -1;
		}
		
		
		return 0;
	}

}

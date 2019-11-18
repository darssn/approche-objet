package sets;
import java.util.*;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> tab = new HashSet<>();
		
		tab.add("USA");
		tab.add("France");
		tab.add("Allemagne");
		tab.add("UK");
		tab.add("Italie");
		tab.add("Japon");
		tab.add("Chine");
		tab.add("Russie");
		tab.add("Inde");
		
		String max="";
		
		for(String a : tab){
			
			if(max.length()<a.length()){
								
				max = a ;
			}
						
		}
		System.out.println(max);
		
		
		tab.remove(max);
		
		System.out.println(tab);
		
		
		
		
	}

}

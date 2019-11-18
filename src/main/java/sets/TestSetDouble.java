package sets;
import java.util.*;

public class TestSetDouble {

	public static void main(String[] args) {
		
		Set<Double> tab = new HashSet<>();
		
		tab.add(1.5);
		tab.add(8.25);
		tab.add(-7.32);
		tab.add(13.3);
		tab.add(-12.45);
		tab.add(48.5);
		tab.add(0.01);
		
		System.out.println(tab);
		
		
		
		System.out.println("Le max est : "+Collections.max(tab));
		
		tab.remove(Collections.min(tab));
		
		System.out.println(tab);
		

	}

}

package fr.diginamic.essais;
import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie s1 = new Salarie("a","a",1200);
		
		Pigiste p1 =new Pigiste("b","b",80,5);
		
		
		System.out.println(s1.getSalaire());
		
		
		System.out.println(p1.getSalaire());
		
		
		s1.afficherDonnees();
		p1.afficherDonnees();
		

	}

}

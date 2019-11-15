package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;


public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne c = new CalculMoyenne();
		
		c.ajout(12);
		c.ajout(20);
		c.ajout(11);
		c.ajout(14);
		c.ajout(2);
		
		
		
		System.out.println("La moyenne est "+ c.calcul());
		
		
		
		
	}

}

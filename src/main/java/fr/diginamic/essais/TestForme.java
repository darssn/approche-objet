package fr.diginamic.essais;
import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		
			AffichageForme af = new AffichageForme();
		
		
			Cercle c1 = new Cercle (3);
			
			Rectangle r1 = new Rectangle(2,4);
			
			Carre car1 = new Carre(3);
			
			af.afficher(car1);
			af.afficher(c1);
			af.afficher(r1);
			
		
		
		}

}

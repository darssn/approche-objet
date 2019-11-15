package fr.diginamic.essais;
import fr.diginamic.entities.*;
import fr.diginamic.utils.*;

public class TestCercle {

	public static void main(String[] args) {
	
		Cercle c1 = new Cercle(15);
		
		Cercle c2 = new Cercle(5);
		
		System.out.println("Le perimetre du cercle c1 est : "+c1.perimetre()+" la surface du cercle c1 est :"+c1.surface() );
		
		System.out.println("Le perimetre du cercle c2 est : "+c2.perimetre()+" la surface du cercle c2 est :"+c2.surface() );
		
		Cercle c3 = CercleFactory.creerCercle(10);
		
		System.out.println("Le perimetre du cercle c3 est : "+c3.perimetre()+" la surface du cercle c3 est :"+c3.surface() );
		
		
	}

}

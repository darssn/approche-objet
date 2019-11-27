package fr.diginamic.essais;
import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Maison m = new Maison();
		
		
		m.ajouterPiece(new Salon(20,0));
		
		m.ajouterPiece(new WC(3,0));
		
		m.ajouterPiece(new Chambre(15,1));
		m.ajouterPiece(new WC(3,1));
		m.ajouterPiece(new SalleDeBain(10,1));
		
	
		
		System.out.println(m.superficieTotal());
		
		System.out.println(m.superficieEtage(0));
		
		System.out.println(m.superficieEtage(1));
		
		m.ajouterPiece(null);
		
		m.ajouterPiece(new SalleDeBain(10,-1));
		
		System.out.println(m.superficieType("chambre"));
		
		System.out.println(m.nbType("chambre"));
		System.out.println(m.nbType("wc"));
		System.out.println(m.nbType("cuisine"));
		
	}

}

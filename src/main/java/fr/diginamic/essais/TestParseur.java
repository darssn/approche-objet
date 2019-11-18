package fr.diginamic.essais;
import fr.diginamic.parseur.*;

public class TestParseur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chaine="x+3";
				
		Expression expr = Parser.parse(chaine);
		
		
		double resultat = expr.evaluer("x",2.5);	
		System.out.println(expr.evaluer("x",2.5));	
		
		
		
	}

}

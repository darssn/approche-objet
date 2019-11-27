package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		for (Saison a : Saison.values()) {

			System.out.println(a.getNom());

		}

		String nom = "ETE";

		Saison s = Saison.valueOf(nom);
		
		
		String libelle = "hiver";
		
		
		
	System.out.println(Saison.retourne(libelle));
		
		
		

	}

}

package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		for (Saison a : Saison.values()) {

			System.out.println(a.getNom());

		}

		String nom = "ETE";

		for (Saison a : Saison.values()) {

			if (a.getNom().equalsIgnoreCase(nom)) {
				System.out.println(a.getOrdre() + "     "+a.getNom());
			}

		}
		
		String libelle = "hiver";
		
		
		
	System.out.println(Saison.retourne(libelle));
		
		
		

	}

}

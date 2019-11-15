package fr.diginamic.parseur;

public class Parser {

	public static Expression parse(String chaine) {

		String[] tab = new String[3];

		if (chaine.indexOf("+") > 0) {
					
			for (int i = 0; i < chaine.split("\\+").length; i++) {

				tab[i] = chaine.split("\\+")[i];

			}

			tab[2] = "+";

		} else if (chaine.indexOf("-") > 0) {

			for (int i = 0; i < chaine.split("-").length; i++) {

				tab[i] = chaine.split("-")[i];

			}

			tab[2] = "-";

		} else if (chaine.indexOf("/") > 0) {
			for (int i = 0; i < chaine.split("/").length; i++) {

				tab[i] = chaine.split("/")[i];

			}
			
			tab[2] = "/";
			

		} else if (chaine.indexOf("*") > 0) {

			for (int i = 0; i < chaine.split("\\*").length; i++) {

				tab[i] = chaine.split("\\*")[i];

			}

			tab[2] = "*";

			
		}
		Expression xp = new Expression(tab[0],tab[1],tab[2]);

		return xp;
	}

}

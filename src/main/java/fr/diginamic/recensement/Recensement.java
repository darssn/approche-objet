package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Recensement {

	List<Ville> listeVille;

	public Recensement(){

		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			List<Ville> v = new ArrayList<>();

			for (int i = 1; i < lignes.size(); i++) {

				String[] morceaux = lignes.get(i).split(";");

				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[3]; // voir indice 4
				String nomCommune = morceaux[5];
				String population = morceaux[6];

				int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

				v.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale));

			}
			
			this.listeVille = v ;

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public List<Ville> getListeVille() {
		return listeVille;
	}

	public void setListeVille(List<Ville> listeVille) {
		this.listeVille = listeVille;
	}

}

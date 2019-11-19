package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

import tri.ComparatorHabitant;

public class Application {

	public static void main(String[] args) {

		List<Ville> tabVille = new ArrayList<>();

		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			for (int i = 1; i < lignes.size(); i++) {

				String[] morceaux = lignes.get(i).split(";");

				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[3]; // voir indice 4
				String nomCommune = morceaux[5];
				String population = morceaux[6];

				int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

				tabVille.add(
						new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale));

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		for (Ville ville : tabVille) {

			if (ville.getNomC().equals("Montpellier")) {

				// System.out.println(ville);

			}

		}

		int popHerault = 0;

		for (Ville ville : tabVille) {

			if (ville.getCodeD().equals("34")) {

				popHerault += ville.getPop();

			}

		}
		// System.out.println("La population totale de l'Herault est " +
		// popHerault);

		Ville petite = null;

		for (Ville ville : tabVille) {

			if (ville.getCodeD().equals("34")) {

				if (petite == null) {

					petite = ville;
				} else if (petite.getPop() > ville.getPop()) {

					petite = ville;

				}

			}

		}
		// System.out.println("La plus petite ville de l'Herault est " +
		// petite.getNomC());

		List<Ville> villeD = new ArrayList<>();

		for (Ville ville : tabVille) {

			if (ville.getCodeD().equals("34")) {

				villeD.add(ville);

			}

		}

		Collections.sort(villeD, new ComparatorVilleD());

		for (int i = 0; i < 10; i++) {

			// System.out.println(villeD.get(i));
		}

		Collections.sort(villeD, new ComparatorVilleC());

		for (int i = 0; i < 10; i++) {

			// System.out.println(villeD.get(i));
		}

		int popOccitanie = 0;

		for (Ville ville : tabVille) {

			if (ville.getNomR().equals("Occitanie")) {

				popOccitanie += ville.getPop();

			}

		}

		// System.out.println("La population Totale de l'occitanie est : " +
		// popOccitanie);

		List<Ville> villeR = new ArrayList<>();

		for (Ville ville : tabVille) {

			if (ville.getNomR().equals("Occitanie")) {

				villeR.add(ville);
			}

		}

		Collections.sort(villeR, new ComparatorVilleD());

		for (int i = 0; i < 10; i++) {

			// System.out.println(villeR.get(i));

		}

		HashMap<String, Integer> dOcc = new HashMap<>();

		for (int i = 0; i < tabVille.size(); i++) {

			Ville ville = tabVille.get(i);
			if (ville.getNomR().equals("Occitanie")) {
				String codeD = ville.getCodeD();

				Integer compteur = dOcc.get(codeD);

				if (compteur == null) {
					compteur = 0;
				}

				compteur += ville.getPop();
				// On le remet dans la map avec la nouvelle valeur
				dOcc.put(codeD, compteur);
			}

		}

		Set<String> categories = dOcc.keySet();
		Iterator<String> iterateur = categories.iterator();

		String test = iterateur.next();

		while (iterateur.hasNext()) {

			String categorie = iterateur.next();
			Integer compteur = dOcc.get(categorie);

			if (dOcc.get(test) < compteur) {

				test = categorie;
			}

		}

		// System.out.println("Code Departement : "+test+" Habitants :
		// "+dOcc.get(test));

		HashMap<String, Integer> regionHab = new HashMap<>();
		TreeMap v2 = new TreeMap(new Comparateur(regionHab));

		for (int i = 0; i < tabVille.size(); i++) {

			Ville ville = tabVille.get(i);

			String nomR = ville.getNomR();

			Integer compteur = regionHab.get(nomR);

			if (compteur == null) {
				compteur = 0;
			}

			compteur += ville.getPop();

			regionHab.put(nomR, compteur);

		}

		v2.putAll(regionHab);

		Set<String> t = v2.keySet();
		Iterator<String> iter = t.iterator();
		int count = 0;

		while (iter.hasNext() && count < 10) {

			String categorie = iter.next();
			Integer compteur = regionHab.get(categorie);
			count++;

			// System.out.println("Region:" + categorie + " - Nb Habitant:" +
			// compteur);
		}
		
		
		HashMap<String, Integer> depHab = new HashMap<>();
		TreeMap v = new TreeMap(new Comparateur(depHab));

		for (int i = 0; i < tabVille.size(); i++) {

			Ville ville = tabVille.get(i);

			String codeD = ville.getCodeD();

			Integer compteur = depHab.get(codeD);

			if (compteur == null) {
				compteur = 0;
			}

			compteur += ville.getPop();

			depHab.put(codeD, compteur);

		}

		v.putAll(depHab);

		t = v.keySet();
		iter = t.iterator();
		count = 0;

		while (iter.hasNext() && count < 10) {

			String categorie = iter.next();
			Integer compteur = depHab.get(categorie);
			count++;

	/*		System.out.println("Departement : " + categorie + " - Nb Habitant :" + compteur);*/
		}
		
		HashMap<String, Integer> villeHab = new HashMap<>();
		TreeMap villeT = new TreeMap(new Comparateur(villeHab));

		for (int i = 0; i < tabVille.size(); i++) {

			Ville ville = tabVille.get(i);

			String nomC = ville.getNomC();

			Integer compteur = villeHab.get(nomC);

			if (compteur == null) {
				compteur = 0;
			}

			compteur += ville.getPop();

			villeHab.put(nomC, compteur);

		}

		villeT.putAll(villeHab);

		t = villeT.keySet();
		iter = t.iterator();
		count = 0;

		while (iter.hasNext() && count < 10) {

			String categorie = iter.next();
			Integer compteur = villeHab.get(categorie);
			count++;

			System.out.println("Ville : " + categorie + " - Nb Habitant:" + compteur);
		}
		
		
		

	}

}

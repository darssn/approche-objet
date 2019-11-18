package listes;

import java.util.*;

public class Ville {

	private String nom;
	private int nbHab;

	public Ville(String nom, int nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public String toString(){
		
		return this.getNom();
	}
	

	public static void main(String[] args) {

		List<Ville> listeVille = new ArrayList<>();

		listeVille.add(new Ville("Nice", 34300));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));

		Ville villePlus = listeVille.get(0);

		for (Ville ville : listeVille) {

			if (villePlus.getNbHab() < ville.getNbHab()) {

				villePlus = ville;

			}

		}

		System.out.println(villePlus.getNom());


		int i = 0;
		int moins = 0;
		for (Ville ville : listeVille) {

			if (listeVille.get(moins).getNbHab() > ville.getNbHab()) {

				moins = i;
				

			}
			i++;

		}
		
		listeVille.remove(moins);
		
		System.out.println(listeVille);
		
		
		for(int j= 0 ;j<listeVille.size();j++){
			
			if(listeVille.get(j).getNbHab() > 100000){
				
				
				listeVille.get(j).setNom(listeVille.get(j).getNom().toUpperCase());
				
			}
			
			
		}
		
		System.out.println(listeVille);

	}

}

package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pays {

	private String nom;
	private int nbHab;
	private double pib;

	public Pays(String nom, int nbHab, double pib) {

		this.nom = nom;
		this.nbHab = nbHab;
		this.pib = pib;
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

	public double getPib() {
		return pib;
	}

	public void setPIB(double pIB) {
		pib = pIB;
	}
	
	public String toString(){
		
		return this.getNom();
	}

	public static void main(String[] args) {

		Set<Pays> tab = new HashSet<>();

		tab.add(new Pays("USA", 4, 40));
		tab.add(new Pays("France", 2, 50));
		tab.add(new Pays("Allemagne", 3, 30));
		tab.add(new Pays("UK", 4, 200));
		tab.add(new Pays("Italie", 5, 50));
		tab.add(new Pays("Japon", 6, 70));
		tab.add(new Pays("Chine", 7, 30));
		tab.add(new Pays("Russie", 8, 45));
		tab.add(new Pays("Inde", 9, 48));

		Pays max = new Pays("", 0, 0);

		for (Pays a : tab) {

			if (max.getPib() < a.getPib()) {

				max = a;
			}

		}

		System.out.println(max.getNom());

		Pays maxPib = new Pays("", 0, 0);

		for (Pays a : tab) {

			if (maxPib.getPib() * maxPib.getNbHab() < a.getPib() * a.getNbHab()) {

				maxPib = a;
			}

		}

		System.out.println(maxPib.getNom());
		
		Iterator<Pays> iter = tab.iterator();

		Pays minPib = new Pays("",0,0);

		for (Pays a : tab) {
			
			if(minPib.getNom().equals("")){
				
				minPib = a ;
				
				
			}else if(minPib.getPib()*minPib.getNbHab() > a.getPib() * a.getNbHab()) {

				minPib = a;			
				
			}
				
		}
		
		while(iter.hasNext()){
			Pays n = iter.next();
			
			if(n.getNom().equals(minPib.getNom())){
				
		
				
				n.setNom(n.getNom().toUpperCase());
				
			}
						
		}
		
		for(Pays n : tab){
			
					
			System.out.println(n.getNom()+" Nb Habitant : "+n.getNbHab()+" PIB Total : "+n.getNbHab()*n.getPib());
		}
		
	
		
		
		
		
	}

}

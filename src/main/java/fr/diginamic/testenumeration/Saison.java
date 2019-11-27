package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS(1,"Printemps"),ETE(2,"Ete"),AUTOMNE(3,"Automne"),HIVER(4,"Hiver");
	
	private String nom;
	private int ordre;
	
	
	private Saison(int a, String nom){
		
		this.nom = nom;
		this.ordre=a ;
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getOrdre() {
		return ordre;
	}


	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	public static Saison retourne(String libelle){
		
				
		for(Saison b : Saison.values()){
			
			if (b.getNom().equalsIgnoreCase(libelle)){
				return b;
			}
		}
		
		return null ;
	
		
		
	}
	

}

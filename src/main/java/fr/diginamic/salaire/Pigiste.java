package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private int nbJTravail;
	
	private double montantJourna;
	
	
	public Pigiste(String nom, String prenom,double montant,int nbjour) {
		super(nom, prenom);
		this.montantJourna =montant;
		this.nbJTravail =nbjour;
	}

	@Override
	public double getSalaire() {
		return this.nbJTravail * this.montantJourna;
		
	}


	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

}

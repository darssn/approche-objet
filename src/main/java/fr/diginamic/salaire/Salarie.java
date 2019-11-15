package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaire;
	
	public Salarie(String nom, String prenom,double salaire) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		this.salaire = salaire;
	}


	
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaire;
		
	}



	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Salarie";
	}
	
	
}

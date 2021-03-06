package fr.diginamic.banque.entites;

abstract class Operation {
	
	private String date;
	private double montant;
	
	Operation(String date,double montant){
		
		this.date = date;
		this.montant = montant;
		
	}
	 abstract String getType();
	 
	 public double getMontant(){
		 
		 return this.montant;
	 }
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}

}

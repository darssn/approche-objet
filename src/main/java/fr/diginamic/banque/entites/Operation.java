package fr.diginamic.banque.entites;

abstract class Operation {
	
	String date;
	double montant;
	
	Operation(String date,double montant){
		
		this.date = date;
		this.montant = montant;
		
	}
	 abstract String getType();

}

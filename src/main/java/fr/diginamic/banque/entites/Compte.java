package fr.diginamic.banque.entites;

public class Compte {

	
	int num ;
	double solde;
	
	
	public Compte(int num , double solde){
		
		this.num = num;
		this.solde = solde;
		
		
	}
	
	public String toString(){
		
		return "Compte : "+this.num+" Solde : "+this.solde;
	
	}
	
	public double calculSolde(){
		
		
		return this.solde;
	}
	
	
	
}

package fr.diginamic.banque.entites;

public class Compte {

	
	int num ;
	int solde;
	
	
	public Compte(int num , int solde){
		
		this.num = num;
		this.solde = solde;
		
		
	}
	
	public String toString(){
		
		return "Compte : "+this.num+" Solde : "+this.solde;
		
		
		
		
	}
	
	
	
}

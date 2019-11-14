package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double taux ;
	
	public CompteTaux(int num,double solde,double taux){
		
		super(num,solde);
		
		this.taux = taux;
		
	}
	
	public String toString(){
		
		return super.toString() + " Taux de rémunération : "+ this.taux;
		
	}
	
	public double getTaux(){
		
		return this.taux;
	}
	
	public double calculSolde(){
		
		return ( super.calculSolde()+(super.calculSolde() * taux) / 100) ;
		
	}
	
	public String getType(){
		
		return "Taux";
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	

}

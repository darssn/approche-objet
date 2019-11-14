package fr.diginamic.banque.entites;

public class Compte {

	private int num;
	private double soldeInitial;
	private Operation[] tabOp = new Operation[0];

	public Compte(int num, double solde) {

		this.num = num;
		this.soldeInitial = solde;

	}
	public double getSoldeInitial() {
		return soldeInitial;
	}

	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

	public Operation[] getTabOp() {
		return tabOp;
	}

	public void setTabOp(Operation[] tabOp) {
		this.tabOp = tabOp;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public String toString() {

		return "Compte : " + this.num + " Solde : " + this.soldeInitial +" Nombre d'opérations : "+this.tabOp.length;

	}


	public double calculSolde() {

		return this.soldeInitial;
	}

	public void ajouterOperation(Operation ope) {

		Operation[] tabOp2 = new Operation[this.tabOp.length + 1];

	if(this.tabOp.length != 0 ){
		
		for (int i = 0; i < tabOp2.length-1; i++) {

			tabOp2[i] = this.tabOp[i];

		}

		tabOp2[this.tabOp.length] = ope;	
	}else{
		
		tabOp2[0]= ope;
		
	}
	
	

	this.tabOp = tabOp2;

	
	}

	public double getSolde() {

		double totalMontant = 0;

		for (int i = 0; i < this.tabOp.length; i++) {

			totalMontant += this.tabOp[i].getMontant();

		}

		return totalMontant + this.soldeInitial;

	}

	public double getSolde(String type) {
		
		double solde = 0;

		for (int i = 0; i < tabOp.length; i++) {
			
		//System.out.println(type + "   "+tabOp[i].getType());

			if (tabOp[i].getType() == "Credit" && type == "Credit") {
					
				solde += tabOp[i].getMontant();
			}

			if (tabOp[i].getType() == "Debit" && type=="Debit") {

				solde += tabOp[i].getMontant();
				
			}

		}
		
		return solde;

	}


}

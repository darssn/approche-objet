package fr.diginamic.operations;

public class CalculMoyenne {


	private double[] tab = new double[0];

	
	public CalculMoyenne(){
		
	}
	
	
	public void ajout(double a){
		
		double[] tabTemp = new double[this.tab.length + 1];
		
		
		if(this.tab.length == 0){
			
			tabTemp[0]= a;
			
		}else{
			
			for(int i = 0;i<this.tab.length;i++){
				
				tabTemp[i]= this.tab[i];
			}
			
			tabTemp[this.tab.length] = a;			
		}
		
		
		this.tab = tabTemp ;
	}
	
	public double calcul(){
		
		double moyenne = 0;
		
			for(int i = 0 ; i<this.tab.length;i++){
				
				moyenne += this.tab[i];
				
				
			}
		
		
		return moyenne / this.tab.length;
		
		
	}
	

	
}

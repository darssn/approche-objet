package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique{
	


	private double rayon;
	static double pi = 3.14;

	public Cercle(double rayon) {
		
		this.rayon = rayon;
	}
	
	
	@Override
	public double perimetre() {
		
			
		return 2*pi*this.getRayon();
	}

	@Override
	public double surface() {
		
		
		return pi*(this.getRayon()*this.getRayon());
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	

}

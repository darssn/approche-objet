package fr.diginamic.formes;

public class Cercle extends Forme {
	
	double rayon;
	
	public Cercle(double rayon){
		
		this.rayon =rayon;
	}

	
	@Override
	public double calculerSurface() {
		return 3.14 * (this.rayon * this.rayon);
	}

	@Override
	public double calculerPerimetre() {
		return 2 * 3.14 * this.rayon;
	}
	
	
	

}

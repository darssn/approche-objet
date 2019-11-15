package fr.diginamic.formes;

public class Rectangle extends Forme {

	double longueur;
	double largeur;
	
	public Rectangle(double longueur,double largeur){
		
		this.longueur = longueur;
		this.largeur = largeur;
		
	}
	
	@Override
	public double calculerSurface() {
		
		return this.longueur*this.largeur;
	}

	@Override
	public double calculerPerimetre() {

		return this.longueur*2 + this.largeur*2;
	}
	
	

}

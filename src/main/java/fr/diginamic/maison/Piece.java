package fr.diginamic.maison;

public abstract class Piece {

	private int etage;

	private double superficie;

	public Piece(double superficie, int etage) {

	
			this.etage = etage;
			this.superficie = superficie;
	
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public abstract String getType();

}

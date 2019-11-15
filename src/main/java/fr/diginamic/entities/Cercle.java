package fr.diginamic.entities;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {

		this.rayon = rayon;
	}

	public double perimetre() {

		return 2 * 3.14 * this.rayon;

	}

	public double surface() {

		return 3.14 * (this.rayon * this.rayon);
	}

}

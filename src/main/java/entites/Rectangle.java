package entites;

public class Rectangle implements ObjetGeometrique {

	private int longueur;
	private int largeur;

	public Rectangle(int longueur, int largeur) {

		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {

		return this.getLongueur() * 2 + this.getLargeur() * 2;
	}

	@Override
	public double surface() {

		return this.getLongueur() * this.getLargeur();
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

}

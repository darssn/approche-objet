package fr.diginamic.jdr;


public class Personnage {

	private double force;
	private double ptVie;
	private int score = 0;
	
	public Personnage(){
		
		this.force = Math.random() * ( 18 - 12 );
		
		this.ptVie = Math.random() * ( 50 - 20);
		
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	public double getPtVie() {
		return ptVie;
	}

	public void setPtVie(double ptVie) {
		this.ptVie = ptVie;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

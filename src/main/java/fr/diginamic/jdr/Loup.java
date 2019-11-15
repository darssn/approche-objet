package fr.diginamic.jdr;

public class Loup extends Creature{

	public Loup() {
		
		this.force = Math.random() * (8 - 3);
		this.ptVie = Math.random() * (10 - 5);
		this.score = 1;
	
	}

}

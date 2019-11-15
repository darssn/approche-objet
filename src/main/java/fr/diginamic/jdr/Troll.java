package fr.diginamic.jdr;

public class Troll extends Creature{

	public Troll() {
		
		this.force = Math.random() * (15 - 10);
		this.ptVie = Math.random() * (30 - 20);
		this.score = 5;
		
	}
	
	

}

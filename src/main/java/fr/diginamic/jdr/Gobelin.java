package fr.diginamic.jdr;

public class Gobelin extends Creature {

	public Gobelin() {


		this.force = Math.random() * (10 - 5);
		this.ptVie =  Math.random() * (15 - 10);
		this.score = 2;
	}
}

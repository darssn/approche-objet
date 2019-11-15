package fr.diginamic.parseur;

public class Expression {

	private String membreG;
	private String membreD;
	private String operateur;

	public Expression(String g, String d, String op) {

		this.membreG = g;
		this.membreD = d;
		this.operateur = op;

	}

	public double evaluer(String var, double valeur) {

		double resultat = 0;
		String temp;
		
		
	
		
		
		if (this.membreG.equals(var)) {

			this.membreG = Double.toString(valeur);
			
		} else if(this.membreD.equals(var)){

			this.membreD = Double.toString(valeur);
			
		}

		switch (this.operateur) {

		case "+":
			resultat =Double.parseDouble(this.membreG) + Double.parseDouble(this.membreD);
			break;

		case "-":
			resultat =Double.parseDouble(this.membreG) - Double.parseDouble(this.membreD);
			break;

		case "*":
			resultat =Double.parseDouble(this.membreG) * Double.parseDouble(this.membreD);
			break;

		case "/":
			resultat =Double.parseDouble(this.membreG) / Double.parseDouble(this.membreD);
			break;
			
			default:

		}

		return resultat;

	}

	public String getMembreG() {
		return membreG;
	}

	public void setMembreG(String membreG) {
		this.membreG = membreG;
	}

	public String getMembreD() {
		return membreD;
	}

	public void setMembreD(String membreD) {
		this.membreD = membreD;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

}

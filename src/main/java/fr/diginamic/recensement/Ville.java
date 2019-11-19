package fr.diginamic.recensement;

public class Ville {
	
	

	private String codeR;
	private String nomR;
	private String codeD;
	private String codeC;
	private String nomC;
	private int pop;
	
	public Ville(String codeR, String nomR, String codeD, String codeC, String nomC, int pop) {
		
		super();
		this.codeR = codeR;
		this.nomR = nomR;
		this.codeD = codeD;
		this.codeC = codeC;
		this.nomC = nomC;
		this.pop = pop;
		
	}
	
	
	public String toString(){
		
		return "Code region : "+this.codeR+" ; Nom region :  "+this.nomR+" ; Code departement : "+this.codeD+" ; Code commune : "+this.codeC+" ; Nom commune : "+this.nomC+" ; Population : "+this.pop ;
		
		
	}


	public String getNomR() {
		return nomR;
	}


	public void setNomR(String nomR) {
		this.nomR = nomR;
	}


	public String getNomC() {
		return nomC;
	}


	public void setNomC(String nomC) {
		this.nomC = nomC;
	}


	public String getCodeR() {
		return codeR;
	}


	public void setCodeR(String codeR) {
		this.codeR = codeR;
	}


	public String getCodeD() {
		return codeD;
	}


	public void setCodeD(String codeD) {
		this.codeD = codeD;
	}


	public String getCodeC() {
		return codeC;
	}


	public void setCodeC(String codeC) {
		this.codeC = codeC;
	}


	public int getPop() {
		return pop;
	}


	public void setPop(int pop) {
		this.pop = pop;
	}

	
	
}

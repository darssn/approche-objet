package entites;

public class AdressePostale {
	
	public int numRue;
	public String libelle;
	public int cp;
	public String ville;
	
	
	
	public AdressePostale(int numRue,String libelleRue,int codePostal,String ville){
		
		this.numRue = numRue;
		this.libelle = libelleRue;
		this.cp = codePostal;
		this.ville = ville ;
		
	
		
	}

}

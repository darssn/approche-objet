package entites;

public class Personne {

	public String nom;
	public String prenom ;
	public AdressePostale adressePostale;
	
	public Personne(String nom,String prenom){
		
		this.nom = nom ;
		this.prenom = prenom;
				
		
	}
	
	public Personne(String nom,String prenom,AdressePostale ap){
		
		
		this.nom = nom ;
		this.prenom = prenom;
		this.adressePostale= ap;
		
	}
	
	
	
}

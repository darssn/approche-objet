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
	
	public void affichNomPrenom(){
			
		System.out.println(this.nom.toUpperCase() +" "+this.prenom);
		
	}
	
	public void modifNom(String nom){
		this.nom =nom;
		
	}
	
	public void modifPrenom(String prenom){
		
		this.prenom = prenom;
		
	}
	
	public void modifAdresse(AdressePostale ap){
		
		this.adressePostale = ap ;
	}
	
	
	public String getNom(){
		
		return this.nom;
	}
	
	public String getPrenom(){
		
		return this.prenom;
	}
	
	public AdressePostale getAdress(){
		
		return this.adressePostale;
		
	}
	
	
	
}

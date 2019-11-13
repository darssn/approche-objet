package essais;
import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale aP = new AdressePostale(14,"Rue Andre Portes",34200,"Sete") ;
		
		Personne p1 = new Personne("NGUYEN","Darcy");
	
	
		p1.modifAdresse(aP);
		

	
	}

}

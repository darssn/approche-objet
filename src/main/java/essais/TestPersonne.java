package essais;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p1 = new Personne();
		p1.nom = "NGUYEN";
		p1.prenom ="Darcy";
		p1.adressePostale.numRue = 14;
		p1.adressePostale.libelle ="rue andre portes";
		p1.adressePostale.cp=34200;
		p1.adressePostale.ville="Sete";
		

		Personne p2 = new Personne();
	}

}

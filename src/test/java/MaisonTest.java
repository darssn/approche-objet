import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class MaisonTest {

	Maison m = new Maison();

	@Before
	public void ajout() throws Exception {
		
		m.ajouterPiece(new Salon(20, 0));
		m.ajouterPiece(new WC(5, 0));
		m.ajouterPiece(new Chambre(15, 1));
		m.ajouterPiece(new WC(5, 1));
		m.ajouterPiece(new SalleDeBain(15, 1));
	}

	@Test
	public void ajoutPiece() throws Exception {

		m.ajouterPiece(new Salon(20, 0));
		

	}

	@Test(expected = Exception.class)

	public void ajoutPieceNull() throws Exception {

		m.ajouterPiece(null);

	}

	@Test(expected = Exception.class)
	public void ajoutPieceNeg() throws Exception {

		Chambre c = new Chambre(-20, 0);

		m.ajouterPiece(c);

	}

	@Test
	public void total() {

		double superficie = m.superficieTotal();

		assertEquals(60.0, superficie, 0.01);

	}

	@Test
	public void superficieEtage() {

		double superficie = m.superficieEtage(1);
		assertEquals(35.0, superficie, 0.01);

	}

	@Test
	public void superficieType() {

		double superficie = m.superficieType("WC");
		assertEquals(10.0, superficie,0.01);

	}
	
	@Test
	public void nbType() {

		int nbType = m.nbType("WC");
		assertEquals(2,nbType);

	}
	
	

}

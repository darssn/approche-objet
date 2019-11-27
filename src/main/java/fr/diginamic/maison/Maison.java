package fr.diginamic.maison;

public class Maison {

	Piece[] tabPiece = new Piece[0];

	public Maison() {
	}

	public void ajouterPiece(Piece p) throws Exception {

		if (p != null && p.getEtage() >= 0 && p.getSuperficie() > 0) {
			
			Piece[] tab = new Piece[this.tabPiece.length + 1];

			if (this.tabPiece.length != 0) {

				for (int i = 0; i < tab.length - 1; i++) {

					tab[i] = this.tabPiece[i];

				}

				tab[this.tabPiece.length] = p;

			} else {

				tab[0] = p;

			}
			
			this.tabPiece = tab;

		} else {
			
			throw new Exception("Erreur");
		}

	}

	public double superficieTotal() {

		double total = 0;

		if (this.tabPiece != null) {

			for (int i = 0; i < this.tabPiece.length; i++) {

				total += tabPiece[i].getSuperficie();

			}

		}

		return total;
	}

	public double superficieEtage(int etage) {

		double total = 0;

		if (this.tabPiece != null) {

			for (int i = 0; i < this.tabPiece.length; i++) {

				if (this.tabPiece[i].getEtage() == etage) {

					total += this.tabPiece[i].getSuperficie();
				}

			}

		}

		return total;
	}

	public double superficieType(String type) {

		double superficie = 0;


			for (int i = 0; i < this.tabPiece.length; i++) {

				if(this.tabPiece[i].getType().equals(type.toLowerCase()))

				superficie += this.tabPiece[i].getSuperficie();
				
				
			}

		

		return superficie;

	}
	
	public int nbType(String type) {


		int nbtype = 0;


			for (int i = 0; i < this.tabPiece.length; i++) {

				if(this.tabPiece[i].getType().equals(type.toLowerCase()))

				nbtype++;
								
			}

		return nbtype;

	}

}

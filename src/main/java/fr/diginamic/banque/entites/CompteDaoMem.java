package fr.diginamic.banque.entites;

public class CompteDaoMem implements CompteDao {

	private Compte[] tabCompte = new Compte[0];

	@Override
	public Compte[] lister() {

		return this.tabCompte;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {

		Compte[] tabCompte2 = new Compte[this.tabCompte.length + 1];

		if (this.tabCompte.length != 0) {

			for (int i = 0; i < tabCompte2.length - 1; i++) {

				tabCompte2[i] = this.tabCompte[i];

			}

			tabCompte2[this.tabCompte.length] = nvCompte;
		} else {

			tabCompte2[0] = nvCompte;
		}

		this.tabCompte = tabCompte2;

	}

	@Override
	public boolean supprimer(String numero) {

		boolean ok = false;

		for (int i = 0; i < this.tabCompte.length; i++) {

			if (this.tabCompte[i].getNum() == Integer.parseInt(numero) && this.tabCompte.length >1) {

				Compte[] tabCompte2 = new Compte[this.tabCompte.length - 1];

				Compte[] tabCompteTemp = new Compte[this.tabCompte.length];

				for (int j = 0; j < this.tabCompte.length; j++) {

					if (this.tabCompte[j].getNum() != Integer.parseInt(numero)) {

						tabCompteTemp[j] = this.tabCompte[j];

					}

				}
				int pos = 0;
				for (int k = 0; k < this.tabCompte.length; k++) {

					switch (pos) {

					case 0:
						tabCompte2[k] = tabCompteTemp[k];

						break;
					case 1:
						tabCompte2[k - 1] = tabCompteTemp[k];

						break;

					default:

					}

					if (tabCompteTemp[k] == null) {

						pos = 1;
					}

				}
				this.tabCompte = tabCompte2;
				ok = true;

			}

		}

		return ok;

	}

	@Override
	public boolean existe(String numero) {

		boolean ok = false;

		if (this.tabCompte.length != 0) {
			for (int i = 0; i < this.tabCompte.length; i++) {

				if (tabCompte[i].getNum() == Integer.parseInt(numero)) {
					ok = true;
				}
			}
		}

		return ok;
	}

	@Override
	public Compte getCompte(String numero) {

		Compte a = null;

		if (this.tabCompte.length != 0) {
			for (int i = 0; i < this.tabCompte.length; i++) {

				if (Integer.toString(tabCompte[i].getNum()) == numero) {
					a = tabCompte[i];
				}

			}
		}
		return a;
	}

}

package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
	
		ObjetGeometrique[] tabObj = new ObjetGeometrique[2];
	
		tabObj[0] =	new Cercle(3);
		tabObj[1] = new Rectangle(2,3);
	
		for(int i = 0;i<tabObj.length;i++){
			
			
			System.out.println("Perimetre : "+tabObj[i].perimetre() + " Surface : "+tabObj[i].surface());
			
			
		}
	
	
	
	}

}

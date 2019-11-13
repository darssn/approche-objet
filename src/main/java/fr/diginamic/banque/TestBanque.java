package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;


public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte[] tab = new Compte[2];
		
		Compte c = new Compte(1,10);
		CompteTaux ct = new CompteTaux(2,10,1.1);
		
		Credit cr1 = new Credit("22 mars 1587",1000);
		Debit deb1 = new Debit("22 mars 1587",1000);
		
		
		c.ajouterOperation(cr1);
		c.ajouterOperation(deb1);
		
		
		
		//System.out.println(c.getSolde());
		System.out.println(c.getSolde("Debit"));
		
		tab[0]= c;
		tab[1] = ct;
		double totalSolde = 0;
		
		for(int i = 0 ;i<tab.length;i++){
			
			
		//	System.out.println(tab[i]);
			
			
			totalSolde += tab[i].calculSolde(); 
			
			
			
		}
		
	//	System.out.println(totalSolde);
		
	

	}

}

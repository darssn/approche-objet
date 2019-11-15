package fr.diginamic.chaines;
import  fr.diginamic.banque.entites.*;
import  entites.*;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		char premierCaractere = chaine.charAt(0);
		
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Taille chaine: " + chaine.length());	
		System.out.println("Position premier ; : "+ chaine.indexOf(";"));
		
		
		String nom = chaine.substring(0,chaine.indexOf(";"));
		System.out.println(nom);
		
		
		System.out.println(nom.toUpperCase());
		
		System.out.println(nom.toLowerCase());
		
		System.out.println(chaine.split(";"));
		
		
		for(int i=0;i<chaine.split(";").length;i++){
			
			System.out.println(chaine.split(";")[i]);
			
		}
		
		String[] tab = 	chaine.split(";") ;
		
		
		
		Personne p1 = new Personne(tab[0],tab[1]);
		p1.affichNomPrenom();

		Compte c1 = new Compte(Integer.parseInt(tab[2]),Double.parseDouble(tab[3].replace(" ","")));
		
		System.out.println(c1);
		
	
	}

	
}

package fr.diginamic.testexceptions;

public class TestRunTimeException {

	public static void main(String[] args) {
		
		try{
		
		System.out.println(Operation.diviserRunTime(4, 1));
		
		System.out.println(Operation.diviserRunTime(4, 0));
		
		}catch(Exception e){
			
			System.out.println("erreur");
			
		}

	}

}

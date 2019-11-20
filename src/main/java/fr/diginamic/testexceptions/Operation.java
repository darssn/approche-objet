package fr.diginamic.testexceptions;

public class Operation {
	
	
	
	public static double diviser(double a,double b) throws Exception{
		
		if(b==0){
			
			throw new Exception("On se ne peux pas diviser par 0");
			
		}
		
		
		return a/b;
		
		
	}
	
	
	public static double diviserRunTime(double a , double b){
		
		if(b==0){
			
			throw new RuntimeException("On se ne peux pas diviser par 0");
			
		}
		
		
		return a/b;
		
	}

}

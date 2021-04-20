package Ammortamento;

public class Francese extends Ammortamento {
	
	public static void main (String [] args) {
		
		ammortamentoFrancese();
	     
	}

	static void ammortamentoFrancese () {
		 

	    	System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t\t %-10s\t", "0 ", "0.0", "0.0", "0.0", Math.round(debito*100)/100.0);
	    	
			
	    	System.out.println();
	    	
	    	System.out.println("");
	            
			 for (int t = 1; t < numeroAnni + 1; t++)
				
		{
			
	 			  
				double a = Math.pow(1 + TASSO_DI_INTERESSE, -(numeroAnni));      
				 
				double rata = debito / ((1-a)/TASSO_DI_INTERESSE);
		
				double quotaInteressi = decrDebitoResiduo * TASSO_DI_INTERESSE;
				
				double quotaCapitale = rata - quotaInteressi;
				
				decrDebitoResiduo -= quotaCapitale;
	
				
				System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t\t %-10s\t", t, Math.round(rata*100)/100.0, Math.round(quotaCapitale*100)/100.0, Math.round(quotaInteressi*100)/100.0, Math.round(decrDebitoResiduo*100)/100.0);
			
				System.out.println("\n");

			 }
			 	 
		 }
}
	

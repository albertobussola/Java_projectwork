package Ammortamento;


public class Italiano extends Ammortamento { 
	
	public static void main (String [] args) {
		
		ammortamentoItaliano();
	     
	}

     static void ammortamentoItaliano () {
    	
    	
    	System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t\t %-10s\t", "0 ", "0.0", "0.0", "0.0", Math.round(debito*100)/100.0);
    	
		
    	System.out.println();
    	
    	System.out.println("");
            
		 for (int t = 1; t < numeroAnni + 1; t++)
			
	{
		

			double quotaCapitale = debito / numeroAnni;

			double quotaInteressi = decrDebitoResiduo * TASSO_DI_INTERESSE;

			decrDebitoResiduo -= quotaCapitale;
	   	    
			double rata = quotaCapitale + quotaInteressi;

			
			System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t\t %-10s\t", t, Math.round(rata*100)/100.0, Math.round(quotaCapitale*100)/100.0, Math.round(quotaInteressi*100)/100.0, Math.round(decrDebitoResiduo*100)/100.0);
	
			System.out.println("\n");

		 }
		 	 
	 }
}
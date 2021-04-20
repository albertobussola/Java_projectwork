package Ammortamento;


public class Tedesco extends Ammortamento {

    public static void main (String [] args) {
		
		ammortamentoTedesco();
	     
	}
	
	 static void ammortamentoTedesco () {
		 
		 
		   double quotaInteressi0 = decrDebitoResiduo * TASSO_DI_INTERESSE;

				System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t\t %-10s\t", "0 ", quotaInteressi0, "0.0", quotaInteressi0, Math.round(debito*100)/100.0);
		    	
				
		    	System.out.println();
		    	
		    	System.out.println("");
		            
				
		    	for (int t = 1; t < numeroAnni + 1; t++)   
					
			{
			 
					double quotaCapitale = debito / numeroAnni;

					decrDebitoResiduo -= quotaCapitale;
					
					double quotaInteressi = decrDebitoResiduo * TASSO_DI_INTERESSE;
		
					double rata = quotaCapitale + quotaInteressi;
	
					
					System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t\t %-10s\t", t, Math.round(rata*100)/100.0, Math.round(quotaCapitale*100)/100.0, Math.round(quotaInteressi*100)/100.0, Math.round(decrDebitoResiduo*100)/100.0);
					
					System.out.println("\n");

				 }
				 	 
			 }
	}
	
	
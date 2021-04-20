package Ammortamento;

import java.util.Scanner;

public class Ammortamento {
	
		
	final static double TASSO_DI_INTERESSE = 0.025;  

	static double decrDebitoResiduo;
	
	static int debito = (int) (decrDebitoResiduo = 600_000);
	static int numeroAnni = 5;  


	public static void main(String args[]) {
		
		  
		  Scanner scanner = new Scanner(System.in);
			String input;
			
			System.out.println("Scegliere uno dei seguenti tipi di ammortamento: - Francese, - Tedesco, - Italiano.");
			
			input = scanner.next();
			scanner.close();
			
			System.out.println();
			 	
	 	 	System.out.printf("%-10s\t %-10s\t %-10s\t\t %-10s\t %-10s\t", "anno", "Rata", "Quota Capitale", "Quota Interesse", "Debito Residuo");
	 	 	
	 	 	System.out.println();
	 	 	
	 	 	System.out.println("------------------------------------------------------------------------------------------------");

			
			switch(input) {
			
			case "Francese":
				Francese frankreich = new Francese();
				frankreich.ammortamentoFrancese();
			break;
				
			case "Tedesco":
				Tedesco deutschland = new Tedesco();
				deutschland.ammortamentoTedesco();
			break;
				
			case "Italiano":
				Italiano italien = new Italiano();
				italien.ammortamentoItaliano();
			break;
				
			default:
				System.out.println("\n");
				System.out.println("Error: tipo di ammortamento selezionato errato"); 
					  			
			}
	  }
}
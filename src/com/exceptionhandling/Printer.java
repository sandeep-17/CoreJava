package com.exceptionhandling;

public class Printer {

	void printPapers(int noOfPapersPrinting) throws PaperUnavailableException{
		PrinterUtil util = new PrinterUtil();
		util.checkPaperAvailability(noOfPapersPrinting);
		/*try {
			util.checkPaperAvailability(noOfPapersPrinting);
		}catch(PaperUnavailableException e){
			util.papersAvailable = 80;
			System.out.println("PaperUnavailableException is Handled");
		}catch(Exception e){
			System.out.println("General exceptions are handled");
		}*/
		
		System.out.println("Printing Papers");
	}
	
	void printColoredPapers() {
		
	}
	
	void loadPapers() {
		
	}
	
	void scanACopy(){
		
	}
}


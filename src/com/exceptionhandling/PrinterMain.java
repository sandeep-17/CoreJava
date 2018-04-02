package com.exceptionhandling;

public class PrinterMain {

	public static void main(String[] args){
		
		Printer prnt = new Printer();
		try {
			prnt.printPapers(20);
			//System.out.println("Closing Printer...");
		}catch(PaperUnavailableException e){
			PrinterUtil util = new PrinterUtil();
			util.papersAvailable = 80;
			System.out.println("PaperUnavailableException is Handled");
			//System.out.println("Closing Printer...");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("General exceptions are handled");
		}finally {
			System.out.println("Closing Printer...");
		}
		//prnt.printPapers(20);

	}

}

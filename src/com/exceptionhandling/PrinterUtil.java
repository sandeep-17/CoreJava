package com.exceptionhandling;

public class PrinterUtil {

	int papersAvailable = 18;
	
	void checkPaperAvailability(int papersNeeded) throws PaperUnavailableException {
		if(papersNeeded<=papersAvailable) {
			System.out.println("Good to go");
		}else {
			throw new PaperUnavailableException(papersNeeded-papersAvailable);
		}
	}
	
	void checkCartridge() {
		
	}
	
	void checkTheAccess() {
		
	}
}

package com.exceptionhandling;

public class PaperUnavailableException extends Exception {

	public PaperUnavailableException(int paperShort) {
		
		System.out.println("Paper unavialable exception thrown duo to short of "+paperShort);
	}
}

package com.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		String teststr = null;

		if(teststr!=null && teststr.equals("Sandeep")) {
			System.out.println("Yes not null and equal");
		}else {
			System.out.println("not equal");
		}
	}

}

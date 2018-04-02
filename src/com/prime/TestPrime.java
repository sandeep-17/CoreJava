package com.prime;

class TestPrime{
	 
	public static void main(String args[]) {
		System.out.println("printing first time");
		TestPrime prime = new TestPrime();
		prime.findPrimeOrNot(24);	
	}

	void findPrimeOrNot(int number){
		//System.out.println("yes prime");
		int remainder = 0;
		for(int i=1;i<=number;i++) {
			
			if(number%i == 0) {
				
				remainder++;
			} 
		}
		if(remainder <= 2){
			System.out.println(number+" is prime");
		} else {
			System.out.println(number+" is not prime");
		}
		
	}
}
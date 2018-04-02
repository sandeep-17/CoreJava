package com.staticpackage;

import com.constructor.Post;

public /*static - cannot make class static*/ class StaticRelatedClass {
	
	static String globalVariable = "Test global";
	
	//instance var - non-static/global
	String instanceVariable = "Test instance";
	
	//obj can be static  - only global obj
	static Post post = new Post();

	public static void main(String[] args) {
		
		//cannot have static for a local variable
		//static String localVariable = "Test local";
		//instance var - non-static/local
		String localVariable = "Test local";
		
		//local obj cannot be made static 
		//static Post post1 = new Post();
	}
	
	//cannot make contructor as static
	/*static StaticRelatedClass(){
		
	}*/
	
	static void staticMethod() {
		//can access static var from static method
		System.out.println(globalVariable);
		
		//cannot access non-static var/methods from static
		//System.out.println(instanceVariable);
		
		//but you can access them using obj....
		StaticRelatedClass obj = new StaticRelatedClass();
		obj.nonStaticMethod();
		obj.instanceVariable="null";
		StaticRelatedClass.staticMethod();
		//static can be accessed using class name, no need to access using obj...
		//obj.staticMethod();
		
	}
	
	

	void nonStaticMethod() {
		//can access non-static var from non-static method
		System.out.println(instanceVariable);
		
		//can access static from non-static method
		System.out.println(globalVariable);
	}

}

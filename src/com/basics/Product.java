package com.basics;

public class Product {

		int pno;
		String pName;
		double price;
		
		void createProduct() {
			pno = 10001;
			pName= "Mobile";
			price = 43000;
		}
		
		void updatePrice() {
			price = price + 10000;
		}
		
		void printProduct() {
			System.out.println(pno);
			System.out.println(pName);
			System.out.println(price);
			
		}

}

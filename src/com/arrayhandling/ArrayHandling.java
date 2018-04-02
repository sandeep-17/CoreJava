package com.arrayhandling;

import com.constructor.Post;

public class ArrayHandling {
	
	public static void main(String[] args) {
		
		int[] numbersArray = new int[5];
		numbersArray[0] = 101;
		numbersArray[1] = 102;
		System.out.println(numbersArray);
		
		for(int i=0;i<numbersArray.length;i++) {
			System.out.println(numbersArray[i]);
		}
		
		Post[] post = new Post[3];
		post[0] = new Post("sandy", 312, true);
		post[1] = new Post("reddy", 212, true);
		post[2] = new Post("arugula", 412, true);
		
		for(int i=0;i<post.length;i++) {
			System.out.println(post[i].getPostedType());
			System.out.println(post[i].getLikesCount());
			System.out.println(post[i].isCanShare());
		}
	}

}

package com.collections;

import java.util.HashSet;
import java.util.Set;

import com.constructor.Post;

public class CollectionsSet {

	public static void main(String[] args) {
		
		Set<Post> postSet = new HashSet<Post>();
		postSet.add(new Post("Sandy",100,true));
		postSet.add(new Post("reddy",150,false));
		postSet.add(new Post("arugula",170,true));
		postSet.add(new Post("Sandy",400,false)); //how to identify duplicate here -- implemented few overridden methods in Post
		System.out.println("post: "+postSet);//override toString in Post class
		
		Set<String> postSet1 = new HashSet<String>();//TreeSet<String>, LinkedHashSet<String>
		postSet1.add("sandy");
		postSet1.add("reddy");
		postSet1.add("sandy");//will not through any exception just it will skip this
		postSet1.add("arugula");
		System.out.println(postSet1);

		//we dont have methods to manipulate on index for set
		//for iteration we can use for-each
		for(String names:postSet1) {
			System.out.println(names);
		}
	}

}

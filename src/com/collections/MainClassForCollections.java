package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainClassForCollections {

	public static void main(String[] args) {
		
		List namesList = new ArrayList();
		
		//list maintains the insertion order
		//can have duplicate values
		namesList.add("sandeep");//add will insert
		namesList.add("arugula");
		namesList.add("vannel");
		namesList.add("nizamabad");
		namesList.add("sandeep");
		namesList.add(3, "balkonda");
		
		//you can add nxt element - size is not fixed because this is obj not array
		namesList.add(6, "balkonda");
		namesList.set(1, "reddy");// set will replace
		//IndeoxOutOfBoundException
		//namesList.add(20, "balkonda");
		System.out.println(namesList);
		
		Object[] namesArray = new Object[namesList.size()];
		namesList.toArray(namesArray );
		
		//loop
		for(int i=0;i<namesList.size();i++) {
			System.out.println(namesList.get(i));
		}
		//for-each
		for(Object names:namesArray) {
			System.out.println(names);
		}
		
		Collections.sort(namesList);
		System.out.println(namesList);
		
		Collections.reverse(namesList);
		System.out.println(namesList);
		
		//using iterator
		Iterator namesAfterIterator = namesList.iterator();
		while(namesAfterIterator.hasNext()) {
			System.out.println(namesAfterIterator.next());
		}
		
		//using listIterator - only for List
		System.out.println("listiterator::::::Forward");
		ListIterator namesListIterator = namesList.listIterator();
		while(namesListIterator.hasNext()) {
			System.out.println(namesListIterator.next());
		}
		
		//using listIterator - only for List
		System.out.println("listiterator::::::Backward");
		ListIterator namesListIteratorBack = namesList.listIterator(namesList.size());
		while(namesListIteratorBack.hasPrevious()) {
			System.out.println(namesListIteratorBack.previous());
		}
		
	}

}

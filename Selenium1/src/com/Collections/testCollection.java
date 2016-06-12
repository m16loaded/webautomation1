package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class testCollection {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();//generic list,only for String
		//This is an example of polymorphism.List is an interface and ArrayList is a class
		list.add("bobo");
		list.add("jojo");
		list.add("momo");
	//	List<String>list=new Arrays.asList("bobo","jojo","momo"); //can also be done like this
		
        System.out.println(list.get(1));
	/*	for(String x:list){
			System.out.println(x);
			
		}*/
		for(Iterator<String>iterator=list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
			
		}
		
		List g= Arrays.asList("a","b","c");
		System.out.println(g.contains("a")||g.contains("b")); //OR example
		
	}
}

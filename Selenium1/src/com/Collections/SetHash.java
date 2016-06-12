package com.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetHash {

	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("bobo");
		set.add("jojo");
		set.add("momo");
		set.add("jojo"); //this will not be added because HashSet only adds distinct values.
	
        for(String x:set){
        	System.out.println(x);
        }

	}

}

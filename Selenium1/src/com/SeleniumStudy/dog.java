package com.SeleniumStudy;

import com.JavaTest.Animal_interface;

public class dog implements Animal_interface {

	private String name;
	private static int legcount=4;
	
	public dog(String name){
		this.name=name;
		
	}
	public String getName(){
		return name;
	}
	public static int getlegount(){
		return legcount;
		
	}
	public void talk(){ //triangle represent implementation of interface
		System.out.println("dog barks");
	}
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        

	}

//}

package com.JavaTest;

public class ChildClass extends BaseClass {
	public void sum(int i,int j){
		System.out.println("in child class");//override
		  System.out.println(i+j);
	}
	String[] str={"a","b","c"};
	public void printString(){
		for (String x:str){
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
		//ChildClass bobo=new ChildClass();
		BaseClass bobo=new ChildClass();//Assign to the superclass(BaseClass)
		bobo.sum(5, 6);
		((ChildClass)bobo).printString(); //converting BaseClass to ChildClass AND using the method
		
	}
		
	}
	



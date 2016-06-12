package com.SeleniumStudy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test  //will run all the methods(but the BeforeMethod will run before every method)
public class TestNGTest {
	@BeforeMethod    //will be printed before every method 
	public void before(){
		System.out.println("before");
	}
   @Test //runs individual methods
	public void print1() {
		System.out.println("Print 1");
	}
	@Test //runs individual methods
	public void print2() {
		System.out.println("Print 2");
	}
}

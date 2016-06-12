package com.SeleniumStudy;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
@Test
public class ListExample extends SelTestCase2 {

	@Test
	public void testCol(){
		List<String> cont= Arrays.asList("Настройки");
		
		List<String> actual=new ArrayList<String>();
		
		driver.get("https://www.google.co.il/?gws_rd=cr&ei=FnZiUuObN6WT0AXg8oCQDw");
		//java.util.List<WebElement> list=driver.findElements(By.tagName(".fbl,.fblf"));
		//java.util.List<WebElement> list=driver.findElements(By.tagName("a"));
		java.util.List<WebElement> list=driver.findElements(By.cssSelector(".fbl,.fblf"));
		for (WebElement x:list){
			System.out.println(x.getText());
			actual.add(x.getText());
		}
		assert actual.containsAll(cont);
	}
}

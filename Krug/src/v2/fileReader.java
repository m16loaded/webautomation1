package v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class fileReader {

	public static void main(String[] args) throws FileNotFoundException {
		//File file = new File("D:/JavaProjects/names1.txt");
		Boolean b=true;
		String name="Юлия Юля";
		String content;
		File file=new File("D:/JavaProjects/names1.txt");
		//Scanner scanner = new Scanner("D:/JavaProjects/names1.txt");
		try{
		 Scanner scanner = null;
		scanner=new Scanner((Readable) new BufferedReader(new FileReader("D:/JavaProjects/names1.txt")));
		//scanner.useDelimiter("");
		StringBuffer stringBuffer = new StringBuffer();
		//content = FileUtils.readFileToString(file, "UTF-8");
		content = FileUtils.readFileToString(file, "CP1251"); //CP1251 encoding type
		if(content.contains(name)){
			System.out.println("Yes");
		}
		//System.out.println(content);
	//while (scanner.hasNextLine()) {
		while (scanner.hasNextLine()) {
		//	System.out.println("start scan");
		    String nextToken = scanner.next();
		   // content = FileUtils.readFileToString(file);
		//    content= FileUtils.readFileToString(new File("D:/JavaProjects/names1.txt"));
		    
		    
		   // stringBuffer.append(nextToken);
		   // i++;
	//	    System.out.println(i);
		    //if (nextToken.equalsIgnoreCase("Bobo")){
		//    if (nextToken.equalsIgnoreCase("Tatiana Shevchenko")){
		    nextToken.toString().trim();
		    name.trim();
		    
		 //   if (nextToken.equalsIgnoreCase(name)){	
		   // if (stringBuffer.toString().equals("Мария")){
		    if (name.equalsIgnoreCase(nextToken)){	
		        b=false;
		    	System.out.println("this user is in the file");
		    	break;
		    }
		}
		//scan();
	}
		catch(Exception error)
		{
			System.out.println(error);
		}
	}		
	
	public static void scan(){

	}
}

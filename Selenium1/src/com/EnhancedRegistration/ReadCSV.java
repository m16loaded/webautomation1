package com.EnhancedRegistration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.testng.annotations.DataProvider;

public class ReadCSV {
	//@DataProvider(name = "regCSVdata") 
	//public static void main(String[] args) throws IOException {  
	public static Object[][] getCSV() throws IOException {
		int i=0; 
		File file = new File("D:/JavaProjects/regCSV.csv"); 
		BufferedReader bufrder = new BufferedReader(new FileReader(file)); 
        String line = null; 
        
        List reglist = new ArrayList();
		while((line = bufrder.readLine()) != null) { 
            StringTokenizer st = new StringTokenizer(line,","); 
            while(st.hasMoreTokens()){
            	reglist.add(st.nextToken());
            	i++;
            }
            
	}
		//System.out.println(reglist);
		Object[][] data1 = new Object[i][1]; 
        for(int j=0; j<data1.length; j++) { 
                for(int k=0; k<data1[j].length; k++) { 
                        data1[j][k] = reglist.get(j); 
                       // Reporter.log((String) data1[j][k]);
                        System.out.println(data1[j][k].toString());  
                } 
	
	}
        bufrder.close(); 
        return(data1);  
}
}

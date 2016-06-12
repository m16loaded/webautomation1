package com.Collections;


import java.security.KeyStore.Entry;
import java.util.HashMap;




public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*      HashMap hm=new HashMap();
       hm.put(10, "bobo");
       hm.put(20, "jobo");
       hm.put(30, "mobo");
       for(Object x:hm.keySet()){   //gets the key(numbers in this case
    	   System.out.println(hm.get(x));//prints values based on the key 
    	   
       }
       for(Map.Entry entry:hm.entrySet()){
    	   System.out.println(entry.getKey());
    	   
    	   
    	   
       }*/
       HashMap<Integer, String> testMap = new HashMap<Integer, String>();
       testMap.put(10, "a");
       testMap.put(20, "b");
       testMap.put(30, "c");
       testMap.put(40, "d");
       for (java.util.Map.Entry<Integer, String> entry : testMap.entrySet()) {
           Integer key=entry.getKey();
           String value=entry.getValue();
           System.out.println(key+value);
       }
	}
}



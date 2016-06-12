package HashMap;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		//this is a NON generic HashMap
		HashMap hm=new HashMap();
		//HashMap<String,Integer>hm=new HashMap<>();  //a GENERIC HashMap
		hm.put("bobo",20 );
		hm.put("jojo",30 );
		hm.put("xoxo",40);
		System.out.println(hm.get("jojo"));
		

	}

}

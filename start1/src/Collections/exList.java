package Collections;

import java.util.ArrayList;
import java.util.List;

public class exList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList arr=new ArrayList();
		
		//NON generic list(anything can be added to it)
  List arr=new ArrayList();
  //a GENERIC LIST looks like this:
  //List<String> arr=new ArrayList<String>();  //other datatypes will not be available for this list
  
  //List arr=new ArrayList();  //LIST is superclass of arraylist
  arr.add("zero");
  arr.add("one");
  arr.add(2);
  arr.add(true);
  for(Object temp:arr){   //refers to array list as to an object
	  System.out.println(temp);
  }
  //arr.remove(2);    //will remove value from index 2
  //arr.remove("one")  //it will search for the specific value and will remove it
	arr.add(0,"start");  //will add "start" to index 0 and will push "zero" one index up
	
	System.out.println(arr);
	}

}

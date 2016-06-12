package DataHiding;

import constractors.SmallBox;

public class DataHidingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHiding1 b=new DataHiding1();
		 b.setLength(4);
		 b.setWeidth(5);
         b.calcArea();
         //System.out.println(b.length); // cannot be done coz length is private(hidden)
         System.out.println(b.getLength()); //a way to bypass the private variable
    
	}
}

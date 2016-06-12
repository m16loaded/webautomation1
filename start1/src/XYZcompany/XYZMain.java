package XYZcompany;

import java.lang.reflect.Array;

public class XYZMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		XYZSales alex=new XYZSales("Alex Rod",6);  //creating new objects
		XYZSales linda=new XYZSales("Linda Berry",7);
		XYZSales john=new XYZSales("John Doe",3);
		XYZSales[] arr = new XYZSales[4];
		
		
		System.out.println(alex.CalcSales()+linda.CalcSales()+john.CalcSales());
		XYZ_IT sara=new XYZ_IT("Sara Time",7);//creating new objects
		XYZ_IT james=new XYZ_IT("James Doe",4);
		System.out.println(sara.CalcSales()+james.CalcSales());
/*		for (int i=0;i<arr.length;i++){
			arr[i]=
			System.out.println(i);
		}*/
		
	}
	

}

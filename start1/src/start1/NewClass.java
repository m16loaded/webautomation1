package start1;

import java.util.Arrays;
public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="bobo";
		String f="2323";
		String y="jojo"	;
		int z=2;
		int n=3;	
		System.out.println(x.substring(0,2));
		int g=Integer.parseInt(f);
		System.out.println(g);
		int[] a = {0, 2, 4, 1, 3};
		 for (int i = 0; i < a.length; i++){
		      a[i] = a[(a[i] + 3) % a.length];
		 }
		      System.out.println(Arrays.toString(a));
		  for(int b:a){
			  System.out.print(b);
		  }
		      
/*System.out.println(x+" "+y);
System.out.println();
Object arr[]=new Object[4];
for(int i=0;i<4;i++){
	System.out.println(i);
	arr[i]=z+n;
	
}
System.out.println(Arrays.asList(arr));
if(Arrays.asList(arr).contains(4)){
	System.out.println("YEA");
	System.out.println(Arrays.toString(arr));
}*/
	}

}

package start1;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fac(5));
		}
	
	public static int Fac(int num1){
		
		int total=num1;
		if(num1>1){		
		for(int i=0;i<num1;i++){
			num1--;
			total=total*num1;
			;
		}
		}
		return total;

}
}
package start1;

public class functions {
	public static void main(String[] args) {
	System.out.println("test!");
	Testing();
	int x=RNG(100);
	System.out.println(x);
	long temp=(long)Math.floor(Math.random()*10 +1);
	System.out.println(temp);
	}
	public static void Testing(){
		System.out.println("test");
		
	}
	public static int RNG(int n){
		double d=Math.floor(Math.random()*n);
				return (int) d;
	}
	}


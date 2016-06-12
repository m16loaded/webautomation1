package DataHiding;

public class DataHiding1 {
	private int length;   //
	 private int  weidth;
	 
	public int getWeidth() {
		return weidth;
	}
	public void setWeidth(int weidth) {
		this.weidth = weidth;
	}
	public void setLength(int length){ //Verification for the length arg
		 if(length>=2&&length<=4){
			 this.length=length;
			 
		 }
		 else{
			 this.length=0;
			 System.out.println("not in range");
		 }
	 }
	public int getLength(){   //a way to bypass the private variable
		return length;
	}
/*DataHiding1(){                 //CONSTRACTOR
	this.length=5;
	this.weidth=6;
	System.out.println("Fired");
}
DataHiding1(int length,int weidth){
	this.length=length;
	this.weidth=weidth;
	System.out.println("Fired2");
}*/
public void calcArea(){
	System.out.println(length*weidth);
}
}

package constractors;

public class SmallBox {
	int length;
	int weidth;
SmallBox(){                 //CONSTRACTOR
	this.length=5;
	this.weidth=6;
	System.out.println("Fired");
}
SmallBox(int length,int weidth){
	this.length=length;
	this.weidth=weidth;
	System.out.println("Fired2");
}
void calcArea(){
	System.out.println(length*weidth);
}
}

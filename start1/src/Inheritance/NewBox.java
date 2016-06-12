package Inheritance;

public class NewBox extends Box {  //is used to be called a SubClass(inheritence)

	
	public void CalcVolume(int length,int weidth,int hight){
		System.out.println("Volume:"+(length*weidth*hight));
	}
	public void CalcArea(int length,int weidth){ //OVERRIDING the method in superclass
		System.out.println("Area"+(length/weidth));
	}
}

package Overloading;

public class Box {
void calcArea(int length){
	System.out.println(length*length);
	
}
void calcArea(double length){
	System.out.println(length*length);
}
void calcArea(int length,int weidth){
	System.out.println(length*weidth);
}
}

package Abstract;

public class SquareContainer extends Container{
	
	public double calcBaseArea(int length){
		double area=length*length;
		System.out.println("Area:"+ area);
		return area;
	}
   
}

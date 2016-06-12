package Abstract;

public class CircleContainer extends Container{

	
	public double calcBaseArea(int length) {//overrides the calcBaseArea from a SUPERCLASS container,that has the method as an abstract
		double area=Math.PI * (length/2)*(length/2);
		System.out.println("Area:"+ area);
		return area;
	}

}

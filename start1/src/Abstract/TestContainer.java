package Abstract;

public class TestContainer {

	public static void main(String[] args) {
		CircleContainer c=new CircleContainer();
		//Container c=new CircleContainer();    //super class var=new subclass object
		c.CalcVolume(10, 5);
        SquareContainer s=new SquareContainer();
      //Container c=new SquareContainer();     //super class var=new subclass object
        //if declared that way object can be reused like this:
        //c=new SquareContainer();
       // c.CalcVolume(10, 5);
        s.CalcVolume(10, 5);
	}

}

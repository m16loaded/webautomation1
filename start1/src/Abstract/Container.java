package Abstract;
       //!!!
public abstract class Container {

	public void CalcVolume(int length,int hight){
		double volume=calcBaseArea(length) * hight;
		System.out.println("volume:"+volume);
	}
	public abstract double calcBaseArea(int length); //in this case used as a LINK
		   //!!!
	
}

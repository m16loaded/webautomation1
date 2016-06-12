package SuperKey;

public class SubBox extends Box {  //inheritence
	public void calcVolume(int length,int weidth,int hight){
		double volume=super.calcArea(length, weidth)*hight;//super allows us to use data and methods from the superclass
		System.out.println("volume:"+volume);
	}

}

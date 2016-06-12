package Inheritance;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Box bobo=new Box();
       NewBox jojo=new NewBox();
       bobo.CalcArea(3, 4);
       jojo.CalcArea(5, 6);  //calls the new class that inherited Box's CalcArea method
       jojo.CalcVolume(5,6,7);
	}

}

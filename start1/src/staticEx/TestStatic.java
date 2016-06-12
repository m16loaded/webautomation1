package staticEx;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    exStatic obj1=new exStatic();
    
    obj1.StaticMethod();
    obj1.StaticMethod();
    exStatic.StaticMethod();//Class name can be used to call a static method directly,without an object
    //exStatic.NonStaticMethod(); //cannot reference to a non static method this way
    obj1.NonStaticMethod();
    obj1.NonStaticMethod();
    System.out.println("---------");
    
    exStatic obj2=new exStatic();
    
    obj2.StaticMethod();
    obj2.StaticMethod();
    
    obj2.NonStaticMethod();
    obj2.NonStaticMethod();
    
	}

}

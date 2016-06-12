package staticEx;
//static is one per class.not one per object
public class exStatic {
  //static data
	static int StaticVar;
	//not static data
	int NonStaticVar;
	
	//static method
	static public void StaticMethod(){
		System.out.println("static var:"+StaticVar);
		StaticVar++;
	}
	public void NonStaticMethod(){
		System.out.println("nonstatic var:"+NonStaticVar);
		NonStaticVar++;
	}
	static{    //will be fired BEFORE the constructor,but will only fire once! 
		System.out.println("static block of code");
	}
	exStatic(){  //constructor will be fire AFTER static block of code
		System.out.println("constructor");
	}
}

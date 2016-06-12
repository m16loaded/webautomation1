package FinalKeyword;

public class ExFinal1 {
	//public final class ExFinal1 { 
	
	
	
/*//*Final keyword can be applied to data,method classes.
	*Final DATA is a constant-cannot be changed
	*Final METHODS cannot be overridden
	*Final CLASSES cannot be SUBCLASSED*/
	
	final double pi=3.14;
	
	public void methodA(){
		//pi=4;     //will give an error because pi is FINAL
		System.out.println(pi);
	}
	/*final public void methodA(){
		//pi=4;    
		System.out.println(pi);
}*/
}
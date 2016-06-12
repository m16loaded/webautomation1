package ErrorHhandling;

public class ExException {

	public static void main(String[] args) {
		int a[]=new int[3];
		int b=10;
		int c=0;
		try{
		a[1]=10;
		c=b/c;    
		System.out.println(c);  //will throw Exception in thread "main" java.lang.ArithmeticException: / by zero
		}
		/*catch(IndexOutOfBoundsException e){
			System.out.println("Exeption occured"+e); //will just print the exception
			//there are a lot of options to do with the exception in "e"
			e.printStackTrace(); //will print the source of the exception
		}
		catch(ArithmeticException e){
			System.out.println("Exeption occured"+e);
		}*/
		catch(IndexOutOfBoundsException|ArithmeticException e){ //possible to catch that way since java 7
			System.out.println("error :" +e);
			e.printStackTrace();//will point to the source of the problem
			
		}
		catch(Exception e){//catching other exceptions if there are any
			System.out.println("Exeption occured"+e);
		}
		finally{//mostly used to close connections like files or databases.
			System.out.println("this will always run even is there is an exception");
		}
		
	}

}

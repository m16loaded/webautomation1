package ErrorHhandling.ThrowThrows;

public class ProgA {              //!!
public int devideNums(int a,int b)throws Exception{//must be before we use throw
	int c=0;
	try{
	c=a/b;
	}
	catch(Exception e){
		System.out.println(e);
		 //!!  
		throw new Exception("check ur numbers");//throws the exception back to the caller
	}
	return c;
	
}
}

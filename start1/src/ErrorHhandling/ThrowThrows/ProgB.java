package ErrorHhandling.ThrowThrows;

public class ProgB {

	public static void main(String[] args) {
		ProgA obj=new ProgA();
		try{
		System.out.println(obj.devideNums(10, 0));//in order to work must be under TRY

	}
		catch(Exception b){//catches the exception thrown from ProgA
			System.out.println("ProgB"+b.getMessage());//getMessage basically displays the exception that was thrown back
		}
			
		}

}

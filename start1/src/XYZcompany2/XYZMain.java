package XYZcompany2;

public class XYZMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee gogo=new Employee("gogo bad",6);
      Employee momo=new Employee("momo nice",7);
      Employee jojo=new Employee("jojo sweet",3);
      Employee xoxo=new Employee("xoxo dad",7);
      Employee toto=new Employee("toto smart",4);
      
      Department Sales=new Department("Sales");
      Department IT=new Department("IT");
      
      Sales.AddEmp(gogo);
      Sales.AddEmp(momo);
      Sales.AddEmp(jojo);
      
      IT.AddEmp(xoxo);
      IT.AddEmp(toto);
      
      Sales.Dispay();
      IT.Dispay();
      
	}

}

package XYZcompany3;

public class Employee /*extends Object*/ {//extends object class by default even if not visible
private String empName;                   //..Object class has a toString() method(invisible)

public String getEmpName() {
	return empName;
}

private int grade;

  public int getGrade() {
	return grade;
}

public Employee(String empName,int grade){  //constractor
	  this.empName=empName;
	  this.grade=grade;
	  
  }
public String /*getEmpInfo()*/toString(){  //POLYMORPHIZM:overriding
	return empName +" "+ grade;     ////toString() overrides the default toString() that is the method of Object(that the class inherits from) 
	                                //
}
}

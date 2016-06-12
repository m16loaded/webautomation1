package XYZcompany2;

public class Employee {
private String empName;

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
}

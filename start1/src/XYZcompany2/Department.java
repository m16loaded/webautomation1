package XYZcompany2;

public class Department {
private String deptName;
private int budget;
// int[] bobo=new int[5];
Employee[] emp=new Employee[5];
int count=0;
	
 public Department(String deptName){  //constractor
	 this.deptName=deptName;
	 this.budget=50;
	 
	 
 }
 public void AddEmp(Employee obj){  //obj is just a var name.
	 emp[count]=obj;
	 count++;
	 if(obj.getGrade()>=5){
		 this.budget=this.budget+150;
	 }
	 else if(obj.getGrade()<5){
		 this.budget=this.budget+100;
	 }
 }
 
 public void Dispay(){
	String temp=this.deptName+" " + this.budget;
	System.out.println(temp);
	for(Employee x:emp){    
		if(x!=null){    //to remove the error that is caused by null values in array
		System.out.println("Employee:"+x.getEmpName() +" "+ x.getGrade());
	}
 }
}
}

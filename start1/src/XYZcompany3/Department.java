package XYZcompany3;

import java.util.ArrayList;
import java.util.List;

public class Department {
private String deptName;
private int budget;
// int[] bobo=new int[5];
//Employee[] emp=new Employee[5];
private List<Employee>emp=new ArrayList<>();
int count=0;
	
 public Department(String deptName){  //constractor
	 this.deptName=deptName;
	 this.budget=50;
	 
	 
 }
 public void AddEmp(Employee obj){  //obj is just a var name.
	// emp[count]=obj;
	 emp.add(obj);
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
		//if(x!=null){    //to remove the error that is caused by null values in array
		System.out.println("Employee:"+x.getEmpName() +" "+ x.getGrade()+x/*.getEmpInfo()*//*toString()*/);
//	} //we don't even need to use x.toString() it is called by default when simply calling x
 }    //when the object is called in any way the toString()method(that belongs to Object) will be called by default.
}     //so basically we don't need to call it,we can just use x and it will automatically call toString()
      //that is overridden in this case.
}

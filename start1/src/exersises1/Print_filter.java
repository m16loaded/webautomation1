package exersises1;

public class Print_filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="Hello World";
    System.out.println(a.substring(6).toLowerCase());
    Employee Bobo=new Employee();
    Bobo.salary=5;   //Employee1
    Bobo.bonus=6;    //Employee1
    Bobo.calc();     //Employee1
    
    Employee Jojo=new Employee(); //Employee1
    Jojo.salary=4;        //Employee1
    Jojo.bonus=3;          //Employee1
    
    double total1=Bobo.calc();   //Employee1
    double total2=Jojo.calc();  //Employee1
    
    Employee2 momo=new Employee2();
    momo.salary2=10;     //Employee2
    momo.bonus2=20;      //Employee2
    
    System.out.println(total1+total2);
    double total3=momo.calc(3,4);
    
    System.out.println(total3);
	}

}

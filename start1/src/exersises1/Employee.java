package exersises1;

public class Employee {
   double salary;
   double bonus;
   double total;
   double calc(){
	   total=salary+bonus;
	   System.out.println(total);
	   return total;
   }
}

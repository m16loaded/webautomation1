package exersises1;

public class Employee2 {
   double salary2;
   double bonus2;
   double tot;
   double calc(int salary2,int bonus2){
	   tot=salary2+bonus2;                  //takes the passe arguments
	   //tot=this.salary2 + this.bonus2;    //will take the init values that were declared in the MAIN class
	   System.out.println(tot);
	   return tot;
   }
}

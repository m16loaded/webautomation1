package XYZcompany;

public class XYZSales {
	
	
	


private String name;
private int grade;
int budget=50;

XYZSales(String name,int grade){ //Contractor
	this.name=name;
	this.grade=grade;
}
public int CalcSales(){
	if(this.grade>=5){
		budget=budget+150;
	}
	else if(this.grade<5){
		budget=budget +100;
	}
	return budget;
	}


}

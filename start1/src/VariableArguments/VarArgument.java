package VariableArguments;

public class VarArgument {

	public static void main(String[] args) {
		
VarArgument.addNums("bobo", 20,2,3,4,5,6,7,8); //static can be called using a ClassName.MethodName()
	}                                          //without declaring an object

	
	public static void addNums(String b,int ...a){//lets 1 string and as many integers as we want
		int sum=0;
		for(int x:a){//refers to "a" as to an array that can be looped through
			sum=sum+x;
		}
		System.out.println(sum);
	}
}

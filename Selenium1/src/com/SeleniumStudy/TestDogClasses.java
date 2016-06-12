package com.SeleniumStudy;

import com.JavaTest.Animal_interface;

public class TestDogClasses {
	public void talkNow(Animal_interface x){// x can be anything we want,it's just a variable.In this case x gets the Dog object that is assigned to Animal_interface
		x.talk();//will call the talk() method to the assigned to Animal_interface animal
	}                           //also called DYNAMIC BINDING

	public static void main(String[] args) {
		System.out.println(dog.getlegount());//we can do it without an object being created.
		                                     //we are calling the "dog"class directly,and calling it's STATIC method.
		                                     //a STATIC method belongs to the CLASS 
		
		//dog Dog =new dog("Tommy");
		Animal_interface Dog = new dog("Tommy");//creating an object Dog but assigning it to a class(which is an interface)
		//System.out.println(Dog.getName());
        //Dog.talk();
        TestDogClasses TestClass=new TestDogClasses();//a default non argument constructor provided by java 
        TestClass.talkNow(Dog);//here is the BINDING
        Animal_interface Cat=new cat();//we can't give it a name coz we don't have a constructor for cat yet
        TestClass.talkNow(Cat);
        
        
	}

}

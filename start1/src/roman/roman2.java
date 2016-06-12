package roman;

import java.util.Vector;

public class roman2 {

	//public static void main(String[] args) {
		
		//String x=getRoman(5);
		
		

	//}
	public  String getRoman(int number) {

	    String riman[] = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    StringBuilder result = new StringBuilder();
	    int i = 0;
	    while (number > 0 || arab.length == (i - 1)) {
	        while ((number - arab[i]) >= 0) {
	            number -= arab[i];
	            result.append(riman[i]);
	        }
	        i++;
	    }
	    return result.toString();
	}
	String convert(int i){

	    String ones = "";
	    String tens = "";
	    String hundreds = "";
	    String thousands = "";
	    String result ;

	    boolean error = false;

	    Vector v = new Vector();

	    //assign passed integer to temporary value temp
	    int temp=i;

	    //flags an error if number is greater than 3999
	    if (temp >=4000) {
	       error = true;
	    }

	    /*loops while temp can no more be divided by 10.
	        Lets say i = 3254, then temp is also 3254 at line 14.

	                           3254 
	          3254/10 = 25    /   \ 3254%10 = 4
	                         /     \
	    now temp = 25       325     4  - here 4 is added to the vector v's 0th index.
	                        / \
	    now temp = 32     32   5  - here 5 is added to the vector v's 1st index.
	                     /  \
	    now temp = 3    3    2  - here 2 is added to the vector v's 2nd index, and loop exits
	                   / \        since temp/10 = 0
	                  0   3  - here 3 is not added to the vector v's 3rd index as loop exits when
	                            temp/10 = 0.


	    */
	    while (temp/10 != 0) {
	        if (temp / 10 != 0 && temp <4000) {
	            v.add(temp%10);
	            temp = temp / 10;
	        }else {     
	            break;
	        }
	    }

	    //therefore you have to add temp one last time to the vector
	    v.add(temp);

	    //as in the example now you have 4,5,2,3 respectively in v's 0,1,2,3 indices.


	    for (int j = 0; j < v.size(); j++) {

	        //you see that v's 0th index has number of ones. So make them roman ones here.
	        if (j==0) {
	            switch (v.get(0).toString()){
	                case "0" : ones = ""; break;
	                case "1" : ones = "I"; break;
	                case "2" : ones = "II"; break;
	                case "3" : ones = "III"; break;
	                case "4" : ones = "IV"; break;
	                case "5" : ones = "V"; break;
	                case "6" : ones = "VI"; break;
	                case "7" : ones = "VII"; break;
	                case "8" : ones = "VIII"; break;
	                case "9" : ones = "IX"; break;
	            }


	            //in the second iteration of the loop (when j==1) 
	            //index 1 of v is checked. Now you understand that v's 1st index
	            //has the tens
	        } else if (j == 1) {
	            switch (v.get(1).toString()){
	                case "0" : tens = ""; break;
	                case "1" : tens = "X"; break;
	                case "2" : tens = "XX"; break;
	                case "3" : tens = "XXX"; break;
	                case "4" : tens = "XL"; break;
	                case "5" : tens = "L"; break;
	                case "6" : tens = "LX"; break;
	                case "7" : tens = "LXX"; break;
	                case "8" : tens = "LXXX"; break;
	                case "9" : tens = "XC"; break;
	            }
	        } else if(j == 2){  //and hundreds
	            switch (v.get(2).toString()){
	                case "0" : hundreds = ""; break;
	                case "1" : hundreds = "C"; break;
	                case "2" : hundreds = "CC"; break;
	                case "3" : hundreds = "CCC"; break;
	                case "4" : hundreds = "CD"; break;
	                case "5" : hundreds = "D"; break;
	                case "6" : hundreds = "DC"; break;
	                case "7" : hundreds = "DCC"; break;
	                case "8" : hundreds = "DCCC"; break;
	                case "9" : hundreds = "CM"; break;
	            }
	        }   else if(j == 3){ //and finally thousands.
	            switch (v.get(3).toString()){           
	                case "0" : thousands = ""; break;
	                case "1" : thousands = "M"; break;
	                case "2" : thousands = "MM"; break;
	                case "3" : thousands = "MMM"; break;

	            }
	        } 
	    }



	    if (error) {
	       result = "Error!";
	    }else{
	        result = thousands + hundreds + tens + ones;
	    }

	    return result;

	}

}

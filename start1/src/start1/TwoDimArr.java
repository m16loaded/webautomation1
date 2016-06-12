package start1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArr {
	static int i;
	static int j;
	static boolean con=false;
	static int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(RNG(3,4));
	}
	public static String RNG(int num1,int num2){
int ar[][]=new int [num1][num2];

int a=0;
int b = 0;

double temp=Math.floor(Math.random()*10 +1);
int temp1=(int)temp;
     while(i!=num1&&j!=num2){
    	 con=false;
	    for(  i=0;i<num1-1;i++){
	    	  if(con==true){
		        	break;
		        }
	          	for( j=0;j<num2-1;j++){
				
					if(ar[i][j]==temp1){
						
						con=true;
						
						break;
						
						
					}
					
				}
	    }
				
			
	    if(con==false){
	    	System.out.println(i);
			System.out.println(j);
			ar[i][j]=temp1;
			i++;
			j++;
			
				
			}
     }
     
	    return (Arrays.deepToString(ar)); //IMPORTANT
	}
	}



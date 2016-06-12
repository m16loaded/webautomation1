package start1;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class complexRNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fun(10));
		
    	
    
	}
	public static java.util.List<ArrayList<Integer>> Fun (int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= num; i++){
			list.add(i);
		}
		Collections.shuffle(list);
		
		return Arrays.asList(list);
	}
    
}

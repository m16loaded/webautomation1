package exersises1;

public class exrecise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nums[]={"10","20","30"};
int total=0;
Integer[] nums1=new Integer[nums.length];
for(int i=0;i<nums.length;i++){
nums1[i]=Integer.parseInt(nums[i]);   //important!
System.out.println(nums1[i]);
total=total+nums1[i];
	}
System.out.println(total);
}
}
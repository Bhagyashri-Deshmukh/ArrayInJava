package array;

public class SingleDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr [];
		intArr = new int[5];		
		System.out.println("Length of int array is : "+intArr.length);
		
		System.out.println("\n================================================================");
		
		int intArr1[]=new int[] {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println("Length of array 1 is : "+intArr1.length);
		
		System.out.println("\n================================================================");
		
		String stringArr[];
		stringArr = new String[2];
		System.out.println("Length of String Array is : "+stringArr.length);
		stringArr[0]= "abc";
		stringArr[1]= "xyz";
		
		System.out.println("\n================================================================");
		
		for(int i=0;i<stringArr.length;i++) {
			System.out.println("Element at index "+i+" is "+stringArr[i]);
		}
	}

}

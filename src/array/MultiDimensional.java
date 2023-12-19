package array;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][3];
		
		System.out.println("Number of Rows:"+arr.length);

		System.out.println("Number of Columns:"+arr[0].length);
		
		System.out.println("\n================================================================");
		
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length+1;j++) {
				System.out.print(arr1[i][j] + " ");
				System.out.println();
			}
		}
	}

}

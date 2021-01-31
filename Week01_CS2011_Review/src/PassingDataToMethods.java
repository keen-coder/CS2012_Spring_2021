import java.util.Scanner;






public class PassingDataToMethods {
	
	//byte short int long
	//float double
	//boolean
	//char
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		double x = 34.2;
		System.out.println(x);
		changeValue(x);
		
		System.out.println(x);
		
		int[] arr1 = {1, 5, 322, 7, 8, 5};
		
		printArr(arr1);
		
		changeArr(arr1);
		System.out.println();
		printArr(arr1);
		
	}
	
	public static void changeArr(int[] arr2) {
		arr2[2] = 100000;
		
		//arr2 = new int[]{1, 2, 3, 4, 5};
	}
	
	
	public static void changeValue(double x) {
		x = 100.65;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
}

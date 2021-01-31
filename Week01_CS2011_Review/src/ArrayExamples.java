import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayExamples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter  an integer: ");
		int x = input.next();
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		int[][] table = new int[4][5];
		
		randomData(table);
		
		printTable(table);
		
		System.out.println();
		
		int sum = sumTable(table);
		
		
		
		
		
		
//		System.out.println();
//		int[] row1 = table[1];
//		
//		row1[3] = 1000;
//		
//		for (int i = 0 ; i < row1.length ; i++) {
//			System.out.print(row1[i] + " ");
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		printTable(table);
		
		
		
//		int[] arr1 = new int[5];
//		
//		arr1[0] = 10;
//		arr1[1] = 7;
//		arr1[2] = 59;
//		arr1[3] = 100;
//		arr1[4] = 42;
//		
//		printArr(arr1);
	}
	
	public static int sumTable(int[][] arr) {
		int sum = 0;
		
		for (int row = 0 ; row < arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length ; col++) {
				sum += arr[row][col];
			}
		}
		
		return sum;
		
	}
	
	
	
	
	public static void printTable(int[][] arr) {
		
		for (int row = 0 ; row < arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length ; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void randomData(int[][] table) {
		Random r = new Random();
		
		for(int row = 0 ; row < table.length ; row++) {
			for (int col = 0 ; col < table[row].length ; col++) {
				table[row][col] = r.nextInt(100);
			}
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	

}

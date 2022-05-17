package questions;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifferenceBetweenElementsofArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scanner.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Enter "+length+" elements");
		
		for (int i = 0; i <length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		scanner.close();
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int difference = arr[arr.length-1] - arr[0];
		System.out.println("Difference between the greatest element and smallest element is: " + difference);
	}
}

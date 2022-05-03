package day000_Homeworks;

import java.util.Arrays;

public class C09 {

	public static void main(String[] args) {
		
		
		int [] arr = {1,2,3,4,56,57,5,8};
		enByukYkiSayi(arr);

	}

	private static void enByukYkiSayi(int[] arr) {
		
		
		Arrays.sort(arr);
		
		
		System.out.println("en buyuk sayi : " + arr[arr.length-1]);
		System.out.println("en buyuk sayi : " + arr[arr.length-2]);
	}

}

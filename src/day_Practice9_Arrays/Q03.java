package day_Practice9_Arrays;

import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
		 //bir int Array elemanlarinin iþaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
		
		int[] arr = {1, 2, -3, 4, -5, -6};
		System.out.println("for each cozumu");
		
		
		for (int w : arr) {
			w *=-1;
			System.out.println(w + ", ");
		}
		
		System.out.println("method for cozumu : "+Arrays.toString(sayininTersi(arr)));
	}

	private static int[] sayininTersi(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= -1;
		}
		return arr;
	}

}

package day000_Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class C21 {

	public static void main(String[] args) {
		/*Q11
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.
		kullanicinin girdigi bir array'in en buyuk elemani ile 
		en kucuk elemaninin  farkini bulan bir method create ediniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("arrayin uzunlugunu giriniz");
		int lenght=scan.nextInt();
		int [] array=new int[lenght];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("lutfen array ekleyiniz "+ (i+1)+ ". eleman");
		}
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("en buyuk elemani ile en kucuk elemanin farki " + (array[array.length-1]-array[0]));
		scan.close();
	}

}

package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {
	
	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz =");
		int sayi = scan.nextInt();
		
		// System.out.println("sayinin mutlak degeri= " + Math.abs(sayi)); // easy way
		
		if (sayi<0) {
			sayi*=(-1);
			
		}
		System.out.println("Girdigniz sayinin mutlak degeri = " + sayi);
		
		scan.close();
	}
}

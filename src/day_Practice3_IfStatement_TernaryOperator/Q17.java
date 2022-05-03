package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// artik yil sorusu
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir yil giriniz : ");
		int year = scan.nextInt();
		System.out.println ("   ***   if cözumu   ***   ");
		if (year %100 == 0 && year %400 == 0) {
			System.out.println("girdiginiz" + year + " yili artik yil");
		} else if (year%100 !=0 && year % 4 == 0) {
			System.out.println("Girdiginiz" + year + "yili artik yil");
		} else {
			System.out.println("Girdiginiz" + year + " yili artik yil degildir");
		}
		System.out.println ("   ***   ternary cözumu   ***   ");
		
		String result = year%100 == 0 ? year %400 == 0 ? "Artik yil " : "Artik yil degil"
						: year %4 == 0 ? "Artik yil" : "Artik yil degil";
		System.out.println(result);
		
		scan.close();
	}

}

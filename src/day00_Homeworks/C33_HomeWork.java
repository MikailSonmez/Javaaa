package day00_Homeworks;

import java.util.Scanner;

public class C33_HomeWork {

	public static void main(String[] args) {
		// Find Leap Year
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%4==0 && yil%100==0 && yil%400==0) {
			System.out.println("artik yil");
		} else {
			System.out.println("artik yil degildir");
		}
		scan.close();

	}

}

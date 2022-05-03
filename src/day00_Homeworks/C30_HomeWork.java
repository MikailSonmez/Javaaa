package day00_Homeworks;

import java.util.Scanner;

public class C30_HomeWork {

	public static void main(String[] args) {
		
		// Question: Check whether an alphabet is Vowel or Consonant
				// a e i o u
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf giriniz");
		String harf=scan.next();
		
		switch (harf) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("sesli harf");
			break;
		default:
			System.out.println("sessiz harf");
			break;
		}
		scan.close();
	}

}

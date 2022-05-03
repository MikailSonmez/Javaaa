package day000_Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class C17 {
	
	public static void main(String[] args) {
		/*
		 Ask user to enter 2 Strings
		 If the characters and the numbers of characters of the Strings are same then print "Anagram"
		 otherwise, print "Not Anagram" on the console
		 Ignore cases
		 For example : "Mary" and "army" and "RAMY" are Anagrams
		 Kullanicidan ve karakter sayilari ayniysa "Anagram" yazdirin, aksi taktirde konsolda "Anagram Degil" yazdirin
		 Ornek : "Pide" ve "EDIP" anagram ifadelerdir..
		 */
		
				Scanner scan = new Scanner(System.in);
			System.out.println("1. kelimeyi giriniz");
			String str=scan.nextLine().toLowerCase();
			System.out.println("1. kelimeyi giriniz");
			
				@SuppressWarnings("unused")
				String str2=scan.nextLine().toLowerCase();
			String arr1 []=str.split("");
			String arr2 []=str.split("");
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println(str+" anagram bir ifadedir");
			} else {
				System.out.println(str+" anagram bir ifade degildir");
			}
			scan.close();

	}
}

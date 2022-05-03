package day000_Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class C18 {

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
		System.out.println("2 adet kelime giriniz, 1 kelimeyi girdikten sonra enter tusuna basiniz");
		String first = scan.nextLine().toLowerCase(), second = scan.nextLine().toLowerCase();
		
		System.out.println(anagram(first, second) ? "Anagram bir ifadedir" : "Anagram degildir");
		scan.close();
	}

	private static boolean anagram(String str1, String str2) {
		
		String[] first = str1.split("");
		Arrays.sort(first);
		String[] second= str2.split("");
		Arrays.sort(second);
		return Arrays.equals(first, second);
	}

}

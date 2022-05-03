package day000_Homeworks;

import java.util.Scanner;

public class C22 {

	public static void main(String[] args) {
		/*Q12
		Create a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .
		Kulanicinin girdigi bir  String'in PALINDROME olup olmadigini kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunusu da ayni olan cümle
		ornek : Ey edip Adana da pide ye,  Trab nicin bart */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("String bir ifade giriniz");
		String str=scan.nextLine();
		
		isPalindrome(str);
		System.out.println(isPalindrome(str));
		scan.close();

	}

	private static boolean isPalindrome(String str) {
		
		StringBuilder sb=new StringBuilder(str);
		String str2= sb.reverse().toString();
		boolean kontrol=false;
		
		if (str.equals(str2)) {
			kontrol=true;
		}
		return kontrol;
		
	
	}

}

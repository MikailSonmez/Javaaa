package questions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to check if its palindrome or not");
		String str = scanner.nextLine().replace(" ", "");
		
		isPalindrome(str);
		
		scanner.close();
	}
	
	public static void isPalindrome(String str) {
		
		String revStr = "";
		
		for (int i =str.length()-1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}
	}

}

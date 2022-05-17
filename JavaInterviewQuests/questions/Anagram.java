package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two String please");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
		isAnagram(s1, s2);
		
		scanner.close();
	}
	
	public static void isAnagram(String s1, String s2) {
		
		String a1[]=s1.toLowerCase().split("");
		Arrays.sort(a1);
		String a2[]=s1.toLowerCase().split("");
		Arrays.sort(a2);
		
		if (s1.length() != s2.length()) {
			System.out.println("These String are not Anagram");
		}else if(s1.isEmpty() || s1.isEmpty()){
			System.out.println("These String are not Anagram");
		}else if (Arrays.equals(a1, a2)) {
			System.out.println("These String are Anagram");
		} else {
			System.out.println("These String are not Anagram");
		}
	}
}

package day_Practice6_MethodCreation;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		 /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.
        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("cumle giriniz : ");
		String str = scan.nextLine();
		
		System.out.println(reverseString(str));
		
		
		scan.close();
	}

	private static String reverseString(String str) {
		
		String str2 = str.trim();
		
		String strTers = "";
		
		for (int i = str2.length() -1; i >=0; i--) {
			strTers +=str2.charAt(i);
		}
		return strTers;
	}
	
	/*
	String[] arr =  str.trim().replaceAll("\\s+"," ").split("");
	        String strTers = "";
	        for (int i = arr.length-1; i >= 0; i--) {
	            strTers += arr[i];
	        }
	        return strTers;
	    }
	}
	 */

}


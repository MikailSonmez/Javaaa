package day00_Homeworks;

import java.util.Scanner;

public class C34_HomeWork {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("bir karakter giriniz");
		String str=scan.next();
		
		String alfabe="abcdefghijklmnoprstuvyzxqABCDEFGHJKLMNOPRSTUYVZXQ";
			
		if (alfabe.contains(str)) {
			System.out.println("alfabeden bir karakter girdiniz");
		} else {
			System.out.println("alfabeden bir karakter girmediniz");
		}
		scan.close();

	}

}

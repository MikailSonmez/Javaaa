package day00_Homeworks;

import java.util.Scanner;

public class C10_HomeWork {

	public static void main(String[] args) {
		// Sayfa 94
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen SDET harflerinden birini yazin");
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		switch (harf) {
		case 'S':
			System.out.println("Software");
			break;
		case 'D':
			System.out.println("Developer");
			break;
		case 'E':
			System.out.println("Engineer");
			break;
		case 'T':
			System.out.println("In Testing");
			break;
		default:
			System.out.println("Lutfen gecerli bir harf girin");
		}
		scan.close();
	}

}

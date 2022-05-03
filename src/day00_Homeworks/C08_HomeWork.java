package day00_Homeworks;

import java.util.Scanner;

public class C08_HomeWork {

	public static void main(String[] args) {
		// sayfa 89
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin : ");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>=0 ? "sayi pozitif" : sayi*sayi);
		
		
	
		
		scan.close();
	}

}

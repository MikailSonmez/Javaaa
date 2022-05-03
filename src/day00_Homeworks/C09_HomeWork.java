package day00_Homeworks;

import java.util.Scanner;

public class C09_HomeWork {

	public static void main(String[] args) {
		// sayfa 90
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir harf girin");
		
		int harf=5;
		
		String sonuc = (harf<10) ? "Rakam" : 
			(harf<100) ? "iki basamakli sayi" : "uc basmakli veya daha buyuk sayi";
		
		System.out.println(sonuc);
		scan.close();
	}

}

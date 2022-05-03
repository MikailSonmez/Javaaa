package day08_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {

	public static void main(String[] args) {
		// Soru 8) Kullanicidan maas icin bir teklif isteyin
		//			ve asagidaki deerlere gore cevap yazdirin.
		//			teklif 80.000'in uzerinde ise "Kabul ediyorum",
		//			60- 80.000 arasinda ise "Konusabiliriz",
		//			60.00'nin altinda ise "Maalesef Kabul edemem" yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Maas icin bir teklif giriniz");
		int teklif =scan.nextInt();
		
		if (teklif>=80000) {
			System.out.println("Kabul ediyorum");
		} else if(teklif>=60000){
			System.out.println("Konusabiliriz");
		} else {
			System.out.println("Maalesef Kabul edemem");
		}
		scan.close();

	}

}

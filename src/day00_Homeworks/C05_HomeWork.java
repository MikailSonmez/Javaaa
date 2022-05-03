package day00_Homeworks;

import java.util.Scanner;

public class C05_HomeWork {

	public static void main(String[] args) {
		// sayfa 78
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen maas teklifi verin");
		
		double sayi=scan.nextDouble();
		int num= (int) sayi;
		
		if (num>80000) {
			System.out.println("Kabul ediyorum");
		} else if(num>60000){
			System.out.println("Konusabiliriz");
		} else {
			System.out.println("Malesef kabul edemem");
		}
		scan.close();
	}

}

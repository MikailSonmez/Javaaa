package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 /*
        Kullanýcýdan vize ve final notlarýný alýnýz.
        Kullanýcýn istediði oranlarda vize ve final yüzdeleri not ile not ortalamasýný hesaplayýp
        not ortalamasýný yazdýrýp 50 ve büyük ise "Tebrikler dersi baþarý ile geçtiniz..." küçük ise
        "Malesef dersten kaldýnýz..." yazdýrýnýz
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vize Notunuz: ");
		int vize = scan.nextInt();
		
		System.out.println("Final Notunuz: ");
		int fin = scan.nextInt();
		
		System.out.println("Vize yuzdesi kactir? ");
		
		double vizeYuzde = scan.nextDouble();
		
		System.out.println("Final yuzdesi kactir? ");
		double finYuzde = scan.nextDouble();
		
		if (!((finYuzde + vizeYuzde) == 100)) {
			System.out.println("final ve vize yuzdesi 100'e esit olmak zorundadir, lutfen bastan giriniz");
			return;
		}
		
		double notOrt = (double) (vize* vizeYuzde / 100) + (double) (fin * finYuzde / 100);
		
		System.out.println("Ortamalaniz hesaplaniyor............");
		System.out.println("Not ortalamaniz: " + notOrt);

		
		if (notOrt >= 50) {
			System.out.println("Tebrikler dersi basari ile gectiniz...");
		} else {
			System.out.println("Malesef dersten kaldiniz...");
			
			scan.close();
		}
	}

}

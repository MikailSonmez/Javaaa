package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner isleminde String icin 2 method vardir
		// scan.nex() dedigimizde sadece 1 kelime alir (ilk spcae'e kadar)
		// eger kullanicidan daha fazla kelima gelme ihtimali varsa
		// scan.nextLine() kullanmaliyiz
		
		// kullanicidan isim ve soymini ayri ayri isteyip
				// girilen ismi asagidaki gibi yazdiririniz
				
				// girilen isim : Mikail Sonmez
				
				Scanner scan= new Scanner(System.in);
				
				System.out.println("Lutfen isiminizi giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println("Lutfen soyisminizi yaziniz...");
				
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim : " + isim + " " + soyisim );
				
				scan.close();
	}

}

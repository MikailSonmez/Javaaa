package day00_Homeworks;

import java.util.Scanner;

public class C14_HomeWork {

	public static void main(String[] args) {
		// sayfa 123
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isim ve soy isminizi yazin");
		
		String isim=scan.next();
		String soyisim=scan.next();
		
		if (isim.length()>soyisim.length()) {
			System.out.println(isim);
		} else if (soyisim.length()>isim.length()){
			System.out.println(soyisim);
		} else {
			System.out.println("Isim ve soy isminiz ayni uzunlukta");
		}
		scan.close();
	}

}

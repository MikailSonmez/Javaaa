package day00_Homeworks;

import java.util.Scanner;

public class C12_HomeWork {

	public static void main(String[] args) {
		// sayfa 108
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kotrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		
		int ilkIndex=cumle.indexOf(kelime);
		int sonIndex=cumle.lastIndexOf(kelime);
		
		if (ilkIndex==(-1)) {
			System.out.println("girilen kelime cumlede kullanilmamis");
		} else if(ilkIndex==sonIndex){
			System.out.println(" girilen kelime cumlede 1 kere kullanilmis");
		} else {
			System.out.println("girilen kelime cumle 1'den fazla kullanilmis");
	  }
		scan.close();

	}

}

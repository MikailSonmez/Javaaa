package day12_IndexOf;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime isteyin,
		// kelimenin cumledeki kullamina bakarak asagidaki 3 cumleden uygun olani yazdirin
		// girilen kelime cumlede kullanilmamis
		// girilen kelime cumlede 1 kere kullanilmis
		// girilen kelime cumle 1'den fazla kullanilmis
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kotrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			System.out.println("Girilen kuelime cumlede kullanilmamis");
		} else if (cumle.indexOf(kelime, index+1)<0){
			
			System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
		} else	{
			System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
		}
		scan.close();
		

	}

}

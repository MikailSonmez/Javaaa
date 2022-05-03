package day00_Homeworks;

import java.util.Scanner;

public class C11_HomeWork {

	public static void main(String[] args) {
		// sayfa 106
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle yazin");
		String cumle=scan.nextLine();
		System.out.println("Lutfen bir kelime yazin");
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

package day00_Homeworks;

import java.util.Scanner;

public class C18_HomeWork {

	public static void main(String[] args) {
		// sayfa 143
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 10 'den kucuk bir tam sayi yazin");
		
		int sayi=scan.nextInt();
		
		System.out.print(sayi + "!=");
		int faktoryel=1;
		
		for (int i = sayi; i>0; i--) {
			faktoryel*=i;
			System.out.print(i +"*");
		}
		System.out.print(" = " +faktoryel);
		
		scan.close();
		
	}
	
}



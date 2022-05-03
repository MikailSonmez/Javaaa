package day17_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Interview quest kullanicidan 10'dan kucuk bir tamsayi isteyin ve
		// girilen sayinin faktoryel'in bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("faktoryel hesaplamak icin 10'dan kucuk bir tam sayi girin...");
		int sayi = scan.nextInt();
		
		System.out.print(sayi + "!=");
		int faktoryel=1;
		
		for (int i = sayi; i > 0; i--) {
			faktoryel*=i;
			System.out.print(i +"*");
			
		}
		System.out.print(" = " +faktoryel);
		
		scan.close();
	}

}

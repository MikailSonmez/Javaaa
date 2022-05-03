package day17_ForLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// kullanicidan bir String isteyin ve Stringi tersine ceviren
		// bir method yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen terseten yazdirmak icin bir yazi girin...");
		String str= scan.nextLine();
		
		
		System.out.println(tersineCevir(str));
		scan.close();
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			tersStr+=str.substring(i, i+1);
		}
		
		
		return tersStr;
		
	
		
	}

}

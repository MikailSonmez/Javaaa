package day00_Homeworks;

import java.util.Scanner;

public class C15_HomeWork {

	public static void main(String[] args) {
		// sayfa 123
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime girin");
		
		String kelime=scan.next();
		
		if (kelime.length()==4) {
			System.out.println(kelime.substring(0,4));
		} else {
			System.out.println("Kelime 4 harften fazla veya az");
		}
		
		scan.close();
	}

}

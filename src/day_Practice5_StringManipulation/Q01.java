package day_Practice5_StringManipulation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		 // Kullan�c�dan alaca��n� bir stringde bo�luk karakterinin olup olmad���n� kontrol ediniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz = "); // Java ogren
		String text = scan.nextLine();
		
		boolean boslukVarMi = text.contains(" ");
		System.out.println("bolukVarMi = " + boslukVarMi); // boslukVarMi = true
		
		// kulanicidan alacagini bir string bos olup olmadigini kontrol ediniz
		boolean bosMu = text.isEmpty();
		System.out.println("bosMu = " + bosMu); // bosMu = false
		scan.close();
	}

}

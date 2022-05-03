package day_Practice2_Scanner;

import java.util.Scanner;

public class Q08 {
	
	
	public static void main(String[] args) {
		/*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

		
		Scanner scan = new Scanner(System.in);
		
		int vize1;
		int vize2;
		int finalnot;
		
		System.out.println("Vize1 : ");
		vize1 = scan.nextInt();
		
		System.out.println("Vize2 : ");
		vize2 = scan.nextInt();
		
		System.out.println("Final : ");
		finalnot = scan.nextInt();
		
		
		double sonuc = ((vize1 + vize2) / 2) * 0.3 + (finalnot * 0.7);
		System.out.println("ders notunuz : " + sonuc);
		
		scan.close();
	}
}

package day000_Homeworks;

import java.util.Scanner;

public class C24 {

	public static void main(String[] args) {
		/*
		Q15
		Ask user to enter the number of lines of a half pyramid.
		Type a program to create the half pyramid.
		For exampleif the number of lines is 5, the pyramid will be  like;
		*
		* *
		* * *
		* * * *
		* * * * *
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int array []=new int[scan.nextInt()];
		for (int satir = 1; satir <= array.length; satir++) {
				for (int sutun = 1; sutun <= satir; sutun++) { // kacinci satir ise o kadar donen dongu
					System.out.print("*"); // print yapilirsa alt alta yazar
				}
				System.out.println(); // bir alt satira indiriyor
		}
		scan.close();

	}

}

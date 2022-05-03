package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Günün sorusu: if statement
	      katsayýlarý verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
	        ax^2 + bx + c;
	        Çözüm adýmlarý
	        kullanýcýdan a,b,c yi okutun.
	        Delta = bb - 4ac
	        Delta > 0 => 2 tane kök vardýr x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
	        Delta = 0 => 1 tane kök vardýr x = -b/2a
	        Delta < 0 ise kök yoktur.
	   */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("denklemin a,b ve c katsayilarini giriniz: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		double delta = b*b - 4 * a * c;
		if (delta>0) {
			double x1 = (-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
		} else if (delta == 0){
			double x = -b / (2*a);
			System.out.println("Girdiginiz denklemin 1 tane koku vardir/nx= " + x);
		} else {
			System.out.println("Girdiginiz denklemin koku yoktur");
		}
		scan.close();
	}
}

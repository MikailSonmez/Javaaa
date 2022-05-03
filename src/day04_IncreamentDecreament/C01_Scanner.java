package day04_IncreamentDecreament;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan yaricap isteyip cemberin cevreni ve dairenin alaninin hesaplayip yazdirin
		// ve dairenin alaninin hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen cemberin yaricapini giriniz");
		
		double yaricap=scan.nextDouble();
		
		double cevre= 2*3.14*yaricap;
		
		double alan= 3.14*yaricap*yaricap;
		
		// cemberin cevresi : 25.7
		// dairenin alani : 26.31
		
		System.out.println("cemberin cevresi : " + cevre);
		System.out.println("dairenin alani : " + alan);
		
		
		scan.close();
	}

}

package day00_Homeworks;

import java.util.Scanner;

public class C07_HomeWork {

	public static void main(String[] args) {
		// sayfa 83 soru 9
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yil girin");
		
		int num=scan.nextInt();
		
		
		if (num%4==0 && !((num%100)==0)) {
			System.out.println("Girdiginiz yil artik yildir");
		} else if((num%4==0 && num%100==0) || num%400==0){
			System.out.println("Girdiginiz yil artik yildir");
		} else
			System.out.println("Girdiginiz yil artik yil degildir");
		scan.close();

	}

}

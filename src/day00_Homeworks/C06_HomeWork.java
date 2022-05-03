package day00_Homeworks;

import java.util.Scanner;

public class C06_HomeWork {
			
	
	public static void main(String[] args) {
		// sayfa 84 soru 10
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yil girin");
		
		int num=scan.nextInt();
		
		if (num%100==0) {
			if (num%400==0)
			System.out.println("Girdiginiz yil artik yildir");
			else {
			System.out.println("Girdiginiz yil artik yil degildir");
			}
		} else if(num%4==0){
			System.out.println("Girdiginiz yil artik yildir");
		} else {
			System.out.println("Girdiginiz yil artik yil degildir");
		}
		scan.close();

	}




}

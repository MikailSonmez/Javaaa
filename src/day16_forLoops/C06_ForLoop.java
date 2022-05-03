package day16_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen
		// sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 100'den kucuk bir tamsayi girin");
		
		double num=scan.nextDouble();
		int sayi=(int) num;
		
		if (num>100) {
			System.out.println("Lutfen 100'den kucuk sayi girin");
		} else if (sayi!=num){
			System.out.println("lutfen tam sayi giriniz");
		} else {
			
			for (int i = 1; i <=num; i++) {
				
				if (i%3==0 || i%5==0) {
					System.out.print(i + " ");
					
				}
				
				
			}
		scan.close();
		}
		

	}

}

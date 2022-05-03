package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		 /*
        Girilen pozitif bir sayýnýn tam kare olup olmadýðýný bulunuz,
        tamkare ise true  deðilse false yazdýrýnýz.
         Not: sqrt gibi fonksiyonlarý  kullanmayýn.
         Example 1:
         Input: 16
         Output: true
         Not: bu sayý tamkare çünkü 4*4 = 16
         Example 2:
         Input: 25
         Output: true
         Note: bu sayý tamkare çünkü 5*5=25
         Example 3:
         Input: 14
         Output: false
      */
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayý giriniz");
        int sayi = scanner.nextInt();

        int count = 0;
        boolean a = false;
        
        while (count * count <= sayi) {
			if (count*count==sayi) {
				System.out.println("true");
				a = true;
			}
			 count++;
		}
       
        if (a== false) System.out.println("false");
        
        scanner.close();
		
	}

}

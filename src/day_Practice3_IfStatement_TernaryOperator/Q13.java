package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
			
		 /*  Problem Tanýmý
        Kullanýcýdan üç adet sayý alarak bu sayýlarýn
        bir dik üçgenin kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
        (Yardým: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor
        baðlantýsýndan yararlanabilirsiniz)
        Örnek Ekran Çýktýsý
        birinci kenarý giriniz: 2
        ikinci kenarý giriniz 15
        üçüncü kenarý giriniz: 7
        Bu bir dik üçgen deðildir.
        Bu bir dik üçgendir
     */
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Birinci sayiyi giriniz: ");
		a = scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz: ");
		b = scan.nextInt();
		
		System.out.println("Ucuncu sayiyi giriniz: ");
		c = scan.nextInt();
		
		if ((a*a) + (b*b) == c*c) {
			System.out.println("Bu bir dik ucgendir");
		} else if ((a*a) + (c*c) == b*b){
			System.out.println("Bu bir dik ucgendir");
		} else if ((c*c) + (b*b) == b*b) {
			System.out.println("Bu bir dik ucgendir");
		} else {
			System.out.println("bu bir dik ucgen degildir");
		}
		scan.close();
	}
}

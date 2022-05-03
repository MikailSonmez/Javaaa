package day09_NestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		// 	Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		//			Kullanicidan bir sifre girmesini isteyin
		//			Eger ilk harf buyuk harf ise 
		//			"A" olup olmadigini kontrol edin. 
		// 			Ilk Harf A ise "Gecerli Sifre"
		//			degilse "Gecersiz sifre" yazdirin
		//			Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin
		//			Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {	//buyuk harfleri secmis olur
			if (ilkKarakter=='A') {
				System.out.println("Gecerli sifre");
			} else { 
				System.out.println("Gecersiz sifre");
			}
			
		} else if(ilkKarakter>='a' && ilkKarakter<='z'){ // kucuk harfleri secer
			if (ilkKarakter== 'z') {
				System.out.println("Gecerli Sifre");
			} else {
				System.out.println("Gecersiz sifre");
				
			}
		}else { // geriye kalan tum karakterler
			System.out.println("Gecerli sifre olmasi icin harf ilke baslayiniz");
		}
		scan.close();
	}

}

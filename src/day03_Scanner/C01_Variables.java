package day03_Scanner;

public class C01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1-asdas
		 * 2-asd
		 * 3-asd
		 */
		String ismim= "Mikai Sonmez";
		
		System.out.println(ismim);
		
		char ilkHarf='S';
		
		boolean anlasildiMi = true;
		
		String isminiz = "Ali" ;
		String soyisminiz = "Tuskan" ;
		System.out.println(ilkHarf);
		System.out.println(anlasildiMi);
		
		// isminiz : Mikail
		
		System.out.println("isminiz : "+isminiz);
		// soyisminiz : : Sonmez
		
		System.out.println("soyisminiz : " + soyisminiz);
		
		int a=10;
		short b=20;
		
		System.out.println(a+b); // 30
		
		int sayi=25;
		char karakter='a';
		// char degiskenleri matematiksel degeri ascii degerine gore isleme girer
		// 'a' ascii degeri 97
		System.out.println(sayi + karakter); // 122
	}

}

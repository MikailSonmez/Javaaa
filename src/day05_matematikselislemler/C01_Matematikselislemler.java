package day05_matematikselislemler;

public class C01_Matematikselislemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(4*(2+5)/2); // 14
		
		
		System.out.println(4*(2+5)/3); // 9   28/3 = 9.333 dur ama int
									   // oldugu icin 9 cikar
		// virgullu yazdirmak istersek
		
		double sonuc=4*(2+5)/3 ;
		// variable	  // deger(value)
		// once degeri bulur sonra atama yapti
		
		System.out.println(sonuc); // 9.0
		
		sonuc= (double)(4*(2+5)/3) ;
		
		System.out.println(sonuc); // 9.0
		
		sonuc=(double)4*(2+5)/3 ;
		
		System.out.println(sonuc); // 9.333333333333334
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2); // 5/2= 2
		
		System.out.println(sayi1/sayi3); // 5/2= 2.5
		
		System.out.println(sayi1+sayi3/sayi2); // 5+2/2= 6.0
		
		
		
		
		
	}

}

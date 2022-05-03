package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1- sayi1=15 sayi=20
		 * sayi=20 sayi2=15 yapin
		 * 3. bir variable olmadan degistirin, (SWAP) olmadan yapin
		 */
		int sayi1=15;
		int sayi2=20;
		
		System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		// sayilarin farkindan istifade ederiz
		// ilk adin sayilarin farkini assign ediyorum
		
		sayi1= sayi1-sayi2;
		
		// ikinci adim fark ile sayi2'yi toplayip
		// sayi2  ye assign ediyorum
		
		sayi2=sayi1+sayi2;
		
		// ucuncu adim olarak sayi1'e sayi2 - fark atiyorum
		
		sayi1=sayi2-sayi1;
		
		System.out.println("sonucta sayi1=" + sayi1 + " ve sayi 2 =" + sayi2);
	}

}

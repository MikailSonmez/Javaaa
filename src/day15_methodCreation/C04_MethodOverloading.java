package day15_methodCreation;

public class C04_MethodOverloading {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java'da ayni isimde birden fazla method olur mu?
		// cevap evet
		
		// ayni isimden birden fazla method olursa java hangisini calistiracagina 
		// nasil karar verir?
		// cevap: isim ayni olan methodlarda oncelikle parametre sayisina bakar
		// sonra da parametre sayisi ile arguman sayisi esit  olanlardan
		// arguman data turleri ile parametre data turleri arasinda uyuma bakar
		// tamamen uyusan varsa onu kullanir
		// tamamen uyusan yoksa kapsayan var mi bakar ve onu kullanir
		// birden fazla secenek oldugunda java her zaman en optimum olani tercih eder
		
		int sayi1=4;
		int sayi2=5;
		int sayi3=10;
		int sayi4=20;
		topla(2,4);
		
		

	}

	@SuppressWarnings("unused")
	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
		
	}
	
	@SuppressWarnings("unused")
	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		
	}
	
	private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami : " + (sayi1+sayi2));
		
	}
	@SuppressWarnings("unused")
	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayinin toplami id: " + (sayi1+sayi2));
		
	}
	@SuppressWarnings("unused")
	private static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayinin toplami di: " + (sayi1+sayi2));
		
	}
	@SuppressWarnings("unused")
	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayinin toplami dd: " + (sayi1+sayi2));
		
	}
	




}

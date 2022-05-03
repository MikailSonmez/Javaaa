package day04_IncreamentDecreament;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		
		
		// eger buyuk data turundeki bir veriyi kucuk yapicaksak
		// variable'a atamak istersek java bnunu otomatik olarak yapmaz
		
		int sayi1=34;
		
		short sayi2= (short) sayi1;
		// esitligin sagi ile solundaki evri turleri farkli oldugundan java mismatch hatasi verir
		// hatayi gidermek icin buyuk data turundeki deger'in onune manule onayimizi gosteren
		// (short) yazilir
		
		System.out.println("sayi2 : " + sayi2);
		
		byte sayi3= (byte) sayi2;
		
		System.out.println("sayi3 : " + sayi3);
		// deger byte'in sinirlarindan buuyk oldugu icin ajva int 300'u kendi yontemine gore
		// byte' donusturur ve bu arada bizim sayimiz degisir
		
		double sayi4= 87.3;
		
		int sayi5= (int) sayi4;
		
		System.out.println("sayi5 : " + sayi5);
		
		// deger virgullu oldugundan ve int'da ondalik kisim olmadigindan java ondalik kismi keser
		// dolayisiyla data kaybi olursur
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6 / sayi7);
		
		double sayi8=4;
		double sayi9=17;
		
		System.out.println(sayi6 / sayi8); // 6,75 islem yapilan sayilardan double daha genis
		// oldugu icin double olarak yazdirir
		
		System.out.println(sayi9/sayi7); //4,25 olarak double sekilde verir, genis olan baz alinir
		

	}
}

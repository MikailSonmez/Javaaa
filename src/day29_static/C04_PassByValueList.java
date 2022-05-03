package day29_static;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		// sonra list elemanlarini degistir method'u yazip orada
		// list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main method'a dondukten sonra yneiden list'i yazdiralim
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		// Java'da list ve Array gibi objeler icin de pass By Value gecerlidir
		// Yani farkli bir method'da array veya list'e yeni deger atamasi yaparsaniz
		// orjinal array veya list degismez
		// List'te ve array'de Java icindeki harfleri degistirmemize  izin verir
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Method'a donunce list : " + harfler);
		// Main Method'a donunce list : [D, B, C]
		
		
		listDegistir(harfler); // method'da yeni deegr atadigim harfler listesi degismedi
		System.out.println("List'e yeni list atadiktan sonra Main Method'a donunce list : " + harfler);
		// List'e yeni list atadiktan sonra Main Method'a donunce list : [D, B, C]

	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		System.out.println("List'e yeni deger atayinca : " + harfler);
		// List'e yeni deger atayinca : []
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Method'da degistirgimiz list " + harfler);
		// Method'da degistirgimiz list [D, B, C]

	}

}

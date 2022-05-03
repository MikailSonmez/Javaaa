package day33_StringBuilder;

public class C03_Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		// sb'da equals method'u String'deki mantikla calismas, == mantigi ile calisir
		
		 	// System.out.println(sb1.compareTo(sb2)); // 0 // bende hata verdi sorunlu
		
		// Ilk harflerden baslayarak bire bir sb'lari karsilastirir
		// eger tum karakterler ayni ise sonuc olarak 0 doner
		// farkli karakter bulursa ilk yazilan sb, ikinci yazilandan kac char onde onu doner
		
		// eger iki sb'in esit olup olmadigini anlamak istersek
		// if (sb1.compareTo(sb2)==0) ile bakabiliriz
		
		String str = "Java";
		
			// System.out.println(sb1==str); // == sb ile Strin'i karsilastiramayiz
		System.out.println(sb1.equals(str)); // false
		 	// System.out.println(sb1.compareTo(str)); // compare String icin kullanilamaz
		
			// System.out.println(sb1=="Java");
		System.out.println(sb1.equals("Java")); // false
			// System.out.println(sb1.compareTo("Java"));
		
	}

}

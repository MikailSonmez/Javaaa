package day10_ternary_SwitchCase;

public class C06_Nested_Ternary {

	public static void main(String[] args) {
		// kullanicidan bir harf isteyin
		// kucuk harf ise consola "Kucuk Harf",
		// buyuk harfse consola "Buyuk Harf"
		// yoksa "girdiginiz karakter harf degil" yazdirin
		
		char krk='X';
		
		// String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (// sart yanlis ise sonuc);
		String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (
						krk>='A' && krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil";
		
		System.out.println(sonuc);
		
		
	}

}

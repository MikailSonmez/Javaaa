package day13_stringManipulations;

public class C05_ReplaceFirst {

	public static void main(String[] args) {
		// 
		
		String cumle="Java cok         zevkli";
		
		cumle=cumle.replaceAll("\\s+", " ");
		
		System.out.println(cumle); // Java cok zevkli
		
		
		System.out.println(cumle.replaceAll("[a-z]", "")); //J kucuk harfleri yok etti
		
		System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ******
		System.out.println(cumle.replaceAll("\\s", "*")); // Java*cok*zevkli
		
		
		String str= "Java'da rakamlar 1234567890"; // ilkini degistirir
				System.out.println(str.replaceFirst("a", "*"));	// J*va'da rakamlar 1234567890
				System.out.println(str.replaceFirst("lar", "*")); // Java'da rakam* 1234567890
				System.out.println(str.replaceFirst("\\s", "*")); // Java'da*rakamlar 1234567890
				System.out.println(str.replaceFirst("\\D", "*")); // *ava'da rakamlar 1234567890
				System.out.println(str.replaceFirst("\\d", "*"));	// Java'da rakamlar *234567890
	}

}

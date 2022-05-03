package day13_stringManipulations;

public class C06_substring {

	public static void main(String[] args) {
		
		// substring() Index kullanarak verilen String'in istenen parcasini almamizi saglar
		// parametre olarak 1 sayi girilirse, girilen index'den String'in sonuna kadar bulumu
		// parametre olarak 2 sayi girilirse, girilen 1.sayidaki indexden (inclusive)
		// baslayip, 2.sayiya kadar (exclusive) karakteri bize verir
		String str="Java OOP konsepti kullanir";
		
		System.out.println(str.substring(0)); //  Java OOP konsepti kullanir
		
		System.out.println(str.substring(10)); // onsepti kullanir
		
		System.out.println(str.substring(26)); // hiclik verir
		
		System.out.println(str.substring(29)); // hatali verir
	}

}

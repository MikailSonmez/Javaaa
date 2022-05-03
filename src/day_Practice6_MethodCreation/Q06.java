package day_Practice6_MethodCreation;

public class Q06 {

	public static void main(String[] args) {
		/*
        Problem tan�m� :
        Bir String i�indeki t�m karakterleri en fazla bir kez yazd�ran parametreli bir method yaz�n�z.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
		
		birKereYazdir("javacilar coook afilli arkadaslar");

	}

	private static void birKereYazdir(String str) {
		
		String sonuc = ""; // string default degeri "" atadik cunku isleme etki etmemeli
			for (int i = 0; i < str.length(); i++) {
				if (!sonuc.contains(str.substring(i, i +1))) { // sonuc metni str'nin
					
					sonuc += str.substring(i, i+1);
				}
			}
		
			System.out.println(sonuc);
	}

}

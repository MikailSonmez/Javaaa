package day_Practice6_MethodCreation;

public class Q05 {

	public static void main(String[] args) {
		 /*
        Problem tanýmý :
        Bir String içinde kaç kelime olduðunu yazdýran bir method yazýnýz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
		
		int sonuc = 0;
		
		sonuc=cumle("javaci arkadaslar zehir gibi masallah en kisa zamanda cok bin $'li is bulurlar");
		System.out.println("girilen String kelime sayisi : " + sonuc);
	}

	private static int cumle(String str) {
		int count = 0;
		
		char space = ' '; // bu satiri tanimlamak yerine if sartini ==' ' seklinde de tanimlayabilirdik
		
		for (int a = 0; a < str.length(); a++) {
			if (str.charAt(a) == space) {
				count ++;
			}
		}
		return count+1; // niye count+1 cunku for icinde a<str.lenght'e kadar ama esit degil 1 eksik verir
		
		
		

		
		//
// 	   String[] words=str.split(" ");
//
//
//
// 	   return words.length;
	}

}

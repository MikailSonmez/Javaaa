package day_Practice5_StringManipulation;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		 /*
 *Kullan�c�dan ald���n�z  Ad�, Soyad� ve kredi kart� numaralar�n� a�a��daki gibi �zel forma d�n��t�r�n
 * Kredi kart� numaras�n� kontrol edin, yoksa 16 haneden k���k olursa   "Ge�ersiz kredi kart� numaras�" yazd�r�n.
         * input : John White 1234234534561478
   output: Ad : J*** Soyad :W**** kartNo:***********1478 (Ad�n ba� harfleri ve soyad� b�y�k olmal�d�r)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz :");
		String isim = scan.next();
		System.out.println("Lutfen bir soyisim giriniz :");
		String soyisim = scan.next();
		System.out.println("Lutfen kart numaranizi giriniz :");
		String kartno=scan.next();
		
		if (kartno.length()==16) {
			isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
			soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
			kartno="**** **** ****" + kartno.substring(kartno.length()-4);
		} else {
			System.out.println("Lutfen 16 haneli kart numarasi giriniz :");
		}
		
		System.out.println(isim + " " + soyisim + " " + kartno);
		
		scan.close();
	}

}

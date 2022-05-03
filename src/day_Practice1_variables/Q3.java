package day_Practice1_variables;

public class Q3 {

	public static void main(String[] args) {
		// verilen 12345 sayýsýnýn rakamlarýný yukarýdan aþaðýya doðru yazdýrýnýz
        // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//		            5

		int sayi=12345;
		int birler= sayi%10; // birler basamagi sayinin 10 a bolumunden kalanidir.-->5
		int onlar=(sayi/10)%10;
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onBinler=(sayi/10000);
		
		/*
	    System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		 */

        // consolda alt satira yazdýrmak için "\n"  komutu kullanýlýr.
		
		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
	}

}

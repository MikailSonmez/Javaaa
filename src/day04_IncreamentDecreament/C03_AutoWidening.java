package day04_IncreamentDecreament;

public class C03_AutoWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte sayi1=44;
		
		short sayi2= sayi1;
		// itiraz yok cunku atama yapilan variable turu (short)
		// atanan degerin veri turunden (byte) buyuk oldugundan sorun olmaz
		
		System.out.println("sayi: " + sayi2);
		
		
		int sayi3= 55;
		
		double sayi4= sayi3;
		
		System.out.println("sayi4 : " + sayi4);
		// auto widening
		// atanan degerin data turu, deger atanan variable'in data turunden kucukse
		// bu isleme auto widening denir
		 
		
		
	}

}

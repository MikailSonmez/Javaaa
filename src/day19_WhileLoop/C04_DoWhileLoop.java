package day19_WhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		
		int i=0;
		
		while (i<5) {
			System.out.print(i + " "); // 0 1 2 3 4 bir kere fazla calisir while loop
			i++;
		}
		// while loop once kontrol eder sonra kodu calistirir
		// loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
		// bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir
		
		int a=0;
		do {
			System.out.println(a+ " "); 
			a++;
		} while (a<5);
		
		// do-while loop ise once islemi yapar ve sonra sarti kontrol eder
		// ozellikle kullanicidan deger almalarda do-while loop tercih edilir
		
	}

}

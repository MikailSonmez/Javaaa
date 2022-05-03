package day33_StringBuilder;

public class C07_Yarisma {

	public static void main(String[] args) {
		// soru: For loop ile 1000 defa bir islem yapalim
		// oncesinde ve sonrasinda zamani kontrol edip
		// StringBuilder ve String class'larinin performanslarini karsilastiralim
		
		// IPUCU: long Timesb = System.nanoTime(); kullanalim
		
		@SuppressWarnings("unused")
		String str= "Merhaba";
		StringBuilder sb = new StringBuilder("Merhaba");
		sb.trimToSize(); // capacity'i length boyunuta indirir
		
		long time1=System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			str+=" ";
		}
		
		long time2=System.nanoTime();
		
		long stringSure=time2-time1;
		
		long time3=System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			sb.append(" ");
		}
		
		long time4=System.nanoTime();
		
		long sbSure=time4-time3;
		
		if (sbSure>stringSure) {
			System.out.println("String daha hizli"); // 
		} else {
			System.out.println("StringBuilder daha hizli"); // StringBuilder daha hizli
		}
		
		System.out.println(stringSure/sbSure); // 31
		System.out.println("String sure : " + stringSure); // String sure : 2622900
		System.out.println("sb sure : " + sbSure); // sb sure : 82500

	}

}

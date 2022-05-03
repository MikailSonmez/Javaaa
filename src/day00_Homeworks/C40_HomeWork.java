package day00_Homeworks;

public class C40_HomeWork {
	
		public static void main(String[] args) {
			// kac basamakli oldugunu saydirma
			// 1234 4
			// 123 = 3
			
			long sayi=1212334566;
			int count=0;
			while (sayi!=0) {
				sayi/=10;
				count++;
			}
			
			System.out.println(count);
	}
}

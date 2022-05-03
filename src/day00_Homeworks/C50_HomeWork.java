package day00_Homeworks;

public class C50_HomeWork {
	
	
		public static void main(String[] args) {
			
			// 153 = 1*1*1 5*5*5 3*3*3 = 1 + 125 + 27 = 153
			
			
			int numara=153;
			int sayi;
			int toplam=0;
			int sonBasamak;
			sayi=numara;
			
			while (sayi!=0) {
				sonBasamak=sayi%10;
				toplam=toplam+sonBasamak*sonBasamak*sonBasamak;
				sayi/=10;
			}
			
			if (numara==toplam) {
				System.out.println("armstrong sayidir");
			} else {
				System.out.println("armstrong sayi degildir");
			}
		}
}

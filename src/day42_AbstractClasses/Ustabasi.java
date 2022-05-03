package day42_AbstractClasses;

public class Ustabasi extends Isci{
	/*
	public void statu() {
		System.out.println("Bu classdaki tum personel ustabasidir. imza Ustabasi");
	}
	
	public void maas() {
		System.out.println("Ustabaslari aylik 10000 tl maas alir. imza Ustabasi");
	}
	
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir. imza Ustabasi");
	}
	*/
	// Obje olusturdugumuzda en alttaki class parent class'lardaki method'lari
	// override edince, class'dan olusturulan objeler en dogru ve spesifik ozelliklere kavustu
	
	// Ama klasik parent-child iliskisinde tum method'lari override etme mecburiyeti yoktur

	// Java parent class'lardaki tum method'lari override etmek mecburiyeti kazandirma icin
	// abstract class yapisini olusturmustur
	
	// yani bir class'i abstract olarak tanimlarsaniz child class'lar tum method'lari override
	// etmek zorunda kalir
	
	// Dolayisiyla abstract yaptigimiz parent class'lar sadece kalip gorevi yapacaklar
	
	public static void main(String[] args) {
		
		Ustabasi ust1= new Ustabasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();

	}
	

}

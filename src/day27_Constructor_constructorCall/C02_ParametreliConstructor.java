package day27_Constructor_constructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// java'nin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		// Istersek parametreli constructor olusturup
		// daha obje olusurken istedigim ozellikleri atlayabilirim
		
		@SuppressWarnings("unused")
		Car1 car1= new Car1(50000, "Vectra", "Beyaz", 2015, true);
				// int km, String mode, String renk, String yil,boolean satilikMi
				// bunlar yazilmaz, ozellik yazilir kirmizi cizgi otomatik ekleme gelir
		
		Car1 car2 = new Car1(35000); // int km
		
				System.out.println(car2.km); // 35000
				
		Car1 car3=new Car1();
		System.out.println(car3.km); // 0
		
		Car1 car4=new Car1(1000);
		System.out.println(car4.km); // 1000
		
		// yil ve km'yi parametre olarak girebilecegim bir constructor
		// daha olusturabilir miyim ?
		
		Car1 car5=new Car1(2020,5000);
		System.out.println(car5.yil + " " + car5.km + " " + car5.model); // 2020 5000 null

	}

}

package day28_ConstructorCall;

public class C02 {
	
	int x=5;
	static int y=10;
	
	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		
		C02 obje1= new C02();
		System.out.println("obje 1 icin x : " + obje1.x + " obje1 icin y : " + y);
		// obje 1 icin x : 5 obje1 icin y : 10
		
		obje1.x++;
		y++;
		// staticlerin basindaki obje1'i silebiliriz
		// ayni class icinde iken static variable'lara ulasmak icin obje'ye ihtiyac yoktur
		// kullanirsak Java CTE vermez fakat "static variable'a static yoldan ulas" diye bizi uyarir
		
		System.out.println("obje 1 icin x : " + obje1.x + " obje1 icin y : " + y);
		// obje 1 icin x : 6 obje1 icin y : 11
		
		C02 obje2= new C02();
		System.out.println("obje 1 icin x : " + obje2.x + " obje1 icin y : " + y);
		// obje 1 icin x : 5 obje1 icin y : 11
		// yeni objede instance variable eski halini(5) oldu static variable(11)
		// artmis hali olan 11 oldu
		
		obje2.x++;
		y++;
		System.out.println("obje 1 icin x : " + obje2.x + " obje1 icin y : " + y);
		// obje 1 icin x : 6 obje1 icin y : 12
		
		System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in"
				+ " x : " + obje1.x + " y : " + y);
		// obje 2 olusturulduktan ve islemden sonra obje1'in x : 6 y : 12
		// staticler degisikligi class'a gore instance objeye gore degisir
		
		
		C02 obje3= new C02();
		
		obje3.x=20;
		y=40;
		
		System.out.println("obje3'den sonra obje1'in x :" + obje1.x); //6
		System.out.println("obje3'den sonra obje1'in x :" + obje2.x); //6
		System.out.println("obje3'den sonra obje1'in x :" + obje3.x); //20
		
		System.out.println("obje3'den sonra obje1'in y :" + y); //40
		System.out.println("obje3'den sonra obje1'in y :" + y); //40
		System.out.println("obje3'den sonra obje1'in y :" + y); //40


	}

}

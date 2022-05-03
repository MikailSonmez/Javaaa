package day04_IncreamentDecreament;

public class C06_PreIncreamentPostIncreament {

		public static void main(String[] args) {
			
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		// artirma
		System.out.println(sayi); // 13
		// yazdirma
		System.out.println(sayi++); // bu satirda iki islem var //13
									// bir artirma , bir de yazdirma
		// once yazdirdigi sonra artirdigi icin 14 oldu
		System.out.println(sayi); // 14
		
		// once artirmak sonra yazdirmak isterseniz ++sayi
		// once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(++sayi); // 15
		
	}
}

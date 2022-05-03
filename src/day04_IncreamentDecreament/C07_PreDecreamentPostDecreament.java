package day04_IncreamentDecreament;

public class C07_PreDecreamentPostDecreament {

	public static void main(String[] args) {
	
		int sayi=10;
		
		sayi--;
		
		System.out.println(sayi); // 9
		
		int a=sayi--;
		// once yazdirdi sonra azaltti
		System.out.println(a); // yazdirdigi 9
		System.out.println(sayi); // azaltilani yazdirdi 8
		
		System.out.println(--a); //8
		// once azaltti sonra yazdirdi
	}

}

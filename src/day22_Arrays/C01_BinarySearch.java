package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[] = {"Hacer", "aynagul", "Emine", "Murat", "Kutlu"};
		
		// isimler array'inde Murat ismi var mi ?
		
		// array'de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler);
		// arrayss class'i ile sort yaptigimizda array'imiz kalici olarak degisir
		System.out.println(Arrays.toString(isimler)); // [Aynagul, Emine, Hacer, Kutlu, Murat] 
		// sort method'u elementleri natural order'a gore siralanir, ilk harfin aski degerine gore
		
		isimler[4]="Ainagul";
		System.out.println(Arrays.toString(isimler));
		// sort yapinca sona basa
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); // 4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); // -5 
					// murattan sonra olurdu -5 te yani
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); // -6
					// en sonra olurdu
		System.out.println(Arrays.binarySearch(isimler, "Kurtsat")); // -4
					// kutludan sonra olurdu

	}

}

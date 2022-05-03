package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verilen bir array'dan istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=5;
		
		// arra'de yeni eleman ekleyemeyiz veya var olan elemanlari silemeyiz
		// cunku array'in declare edilen uzunlugu degismez
		
		// bu soruda istenen elementi sildigimizde geriye kac element kaliyor bulmamiz lazim
		// silinecek sayi adedini bulalim
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
			
		}
		System.out.println(sayac);
		int yeniArrayUzunluk=arr.length-sayac;
		// artik yeni array'i olusturabiliriz
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		// simdi eski array deki elemanleri birer birer alip
		// silinecek elemana esit olmayanlari yeni array'e atamaliyiz
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != silinecekEleman) {
				
				yeniArr[index]=arr[i];
				index++;
			}
			System.out.println(Arrays.toString(yeniArr));
		}
		
	}

}

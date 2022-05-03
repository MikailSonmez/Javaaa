package day000_Homeworks;

import java.util.Scanner;

public class C14 {
	
	
	public static void main(String[] args) {
		// bak bu soruya sonra
		/*
		Q5  Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, decreasing constantly after the maximum value
		Not Mauntain Array--> [5, 2, 7, 1, 4] 
		Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Aralarinda bosluk birakarak arr elemanlarini girin :");
		String eleman = scan.nextLine();
		String arr[] = eleman.split(" ");
		int arr1[] = new int[arr.length];
		MauntainArray(arr1);
		boolean kontrol1=true;
		boolean kontrol2=true;
		for (int i = 0; i < MauntainArray(arr1); i++) {
			if (arr1[i]>=arr1[i+1]) {
				kontrol1=false;
				break;
			}
		}
		for (int i = MauntainArray(arr1); i < arr1.length-1; i++) {
			if (arr1[i]>=arr1[i-1]) {
				kontrol2=false;
				break;
			}
		}
		if (kontrol1==false || kontrol2==false) {
			System.out.println("girdiginiz sayilar mauntain array degildir");
		} else {
			System.out.println("girdiginiz sayilar mauntain array'dir");
		}
		scan.close();
		
	}

		private static int MauntainArray(int[] arr1) {
			int max=Integer.MIN_VALUE;
			int maximumArr=0;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i]>=max) {
					arr1[i]=max;
					maximumArr=i;
				
				}
			}
			return maximumArr;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

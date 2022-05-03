package day_Practice9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("arrayinizin boyutunu giriniz :");
		int arrBoyutu = scan.nextInt();
		
		int arr [] = new int [arrBoyutu];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin "+(i+1) +". elemanini giriniz :");
			arr [i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("girdiginiz arrayin max - min eleman degeri : " + (arr[arrBoyutu - 1] - arr[0]));
		
		scan.close();
	}

}

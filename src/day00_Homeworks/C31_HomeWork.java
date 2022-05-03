package day00_Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C31_HomeWork {

	public static void main(String[] args) {
		
		// Question largest and smallest numbers finding
		
		/*
		int x=500;
		int y=250;
		int z=125;
		
		if (x>y && x>z) {
			System.out.println("en buyuk sayi x");
		} else if(y>z && y<x){
			System.out.println("ortanca sayi");
		}else {
			System.out.println("en kucuk sayi z");
			*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5 tane sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		int sayi5=scan.nextInt();
		
		List <Integer> liste=new ArrayList<>(Arrays.asList(sayi1,sayi2,sayi3,sayi4,sayi5));
		Collections.sort(liste);
		System.out.println(liste);
		scan.close();
	}

}



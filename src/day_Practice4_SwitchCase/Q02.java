package day_Practice4_SwitchCase;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// 2- Girilen 3 basamaklý bir sayýyý yazý ile yazdýrýnýz

			
		Scanner oku = new Scanner(System.in);
        System.out.print("3 basamaklý sayý giriniz = ");
        int sayi = oku.nextInt();
        
        
        int yuzlerBasamagi = sayi / 100;
        int onlarBasamagi = (sayi / 10) % 10;
        int birlerBasamagi = sayi % 10;
        
        switch (yuzlerBasamagi) {
        case 1:
            System.out.println("yuz");
            break;
        case 2:
            System.out.println("iki yuz");
            break;
        case 3:
            System.out.println("üç yuz");
            break;
        case 4:
            System.out.println("dört yuz");
            break;
        case 5:
            System.out.println("beþ yuz");
            break;
        case 6:
            System.out.println("altý yuz");
            break;
        case 7:
            System.out.println("yedi yuz");
            break;
        case 8:
            System.out.println("sekiz yuz");
            break;
        case 9:
            System.out.println("dokuz yuz");
            break;

		default:
			break;
		}

        switch (onlarBasamagi) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kýrk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmýþ");
                break;
            case 7:
                System.out.println("yetmiþ");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
        }

        switch (birlerBasamagi) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beþ");
                break;
            case 6:
                System.out.println("altý");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }
        oku.close();
	}

}

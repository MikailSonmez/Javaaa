package day08_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseHomework {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir Gun ismi yaziniz");
		
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("pazartesi")) {
			System.out.println("Girdiginiz Gun= " + gun +" Kisatmasi" + " Par");
		}
		else if (gun.equals("sali")) {
			System.out.println("Girdigini Gun= " + gun + " Kisatmasi" + " Sal");
		} 
		else if (gun.equals("carsamba")) {
			System.out.println("Girdigini Gun=" + gun +" Kisatmasi" + " Car");
		}
		else if (gun.equals("persembe")) {
			System.out.println("Girdigini Gun=" + gun +" Kisatmasi" + " Per");
		}
		else if (gun.equals("cuma")) {
			System.out.println("Girdigini Gun=" + gun +" Kisatmasi" + " Cum");
		}
		else if (gun.equals("tilek")) {
			System.out.println("Girdigini Gun=" + gun +" Kisatmasi" + "Cumaa");
		}
		else if (gun.equals("pazar")) {
			System.out.println("Girdigini Gun=" + gun +" Kisatmasi" + " Par");
		}
		 else {
			 System.out.println("Lutfen Gun ismini giriniz veya Turkce karakter kullanmadan gun ismini giriniz");
		}

		scan.close();
	}

}

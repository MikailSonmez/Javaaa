package day_Practice13_StringBuilder;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir metin giriniz");
		String metin = scan.nextLine();
		StringBuilder sB = new StringBuilder(metin);
		// StringBuilder  sB=new StringBuilder(scan.nextLine();
        //sB.append(metin);
		
		String tersMetin = sB.reverse().toString();
		
		if (tersMetin.equalsIgnoreCase(metin)) {
			System.out.println("girilen metin polindrome ifadedir : " + tersMetin);
		} else System.out.println("girilen metin polindrome ifade degildir :" + tersMetin);
		
		scan.close();
	}

}

package day_Practice15_InterviewQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q08A {

	public static void main(String[] args) {
		/*
        Ask user to enter  2 Srtrings.
        If the characters and the numbers of characters of the Strings are same then print "Anagram"
        otherwise, print "Not Anagram" on the console.
        Ignore cases
        For example : "Mary" and "army" and "RAMY" are Anagrams
        Kullan�c�dan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
        karakterleri ve karakter say�lar� ayn�ysa "Anagram" yazd�r�n,   aksi takdirde konsolda "Anagram De�il" yazd�r�n.
        Ornek : "Pide" ve"ED�P" anagram ifadelerdir..
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("1.Word : ");
        String str1 = scan.next().toLowerCase(); // harflerin tamami kucuk

        System.out.print("2.Word : ");
        String str2 = scan.next().toLowerCase();
        
        String arr1[] = str1.toLowerCase().split("");
        String arr2[] = str2.toLowerCase().split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2))
            System.out.println(str1+" is Anagram");
        else System.out.println(str1+"  is Not Anagram");
        
        scan.close();

	}

}

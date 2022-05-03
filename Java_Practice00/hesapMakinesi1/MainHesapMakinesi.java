package hesapMakinesi1;

import java.util.Scanner;

public class MainHesapMakinesi {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen 1. sayýyý giriniz : ");

    double sayi1 = scan.nextDouble();

    System.out.print("Lütfen 2. sayýyý giriniz : ");

    double sayi2 = scan.nextDouble();

    HesapMakinesi hsp = new HesapMakinesi(sayi1, sayi2);

    System.out.println("Sayýlarýn toplamý : "+hsp.topla());

    System.out.println("Sayýlarýn farký : "+hsp.cikar());

    System.out.println("Sayýlarýn çarpimi : "+hsp.carp());

    System.out.println("Sayýlarýn bölümü : "+hsp.bol());

  }
}
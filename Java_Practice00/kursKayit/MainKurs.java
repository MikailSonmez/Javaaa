package kursKayit;

import java.time.LocalDate;

public class MainKurs {

  @SuppressWarnings("static-access")
public static void main(String[] args) {
    Kurslar kurs1 = new Kurslar(
      "Boyama Kursu",
      LocalDate.of(2021, 9, 1),
      25,
      60
    );
    Kurslar kurs2 = new Kurslar(
      "El ��i Kursu",
      LocalDate.of(2021, 10, 1),
      15,
      35
    );

    System.out.println(Ogrenciler.okulAdi);
    Ogrenciler ogr1 = new Ogrenciler(1, "Salih", 25);
    Ogrenciler ogr2 = new Ogrenciler(1, "Ya�mur", 23);
    KursKayit kayit1 = new KursKayit(ogr1, kurs1, LocalDate.now());
    kayit1.kayitYaz();
    System.out.println("Kay�t say�s� : " + KursKayit.kayitSayisi);
    System.out.println(ogr2.adi + "'nin Okul ad� : " + ogr1.okulAdi);
    Ogrenciler.okulAdi = "Fatih Vatan Lisesi";
    @SuppressWarnings("unused")
	KursKayit kayit2 = new KursKayit(ogr2, kurs2, LocalDate.now());

    System.out.println(ogr1.adi + "'nin Okul ad� : " + ogr1.okulAdi);
    System.out.println(
      "�uanda kursa kay�tl� ��renci say�s� : " + KursKayit.kayitSayisi
    );
    kayit1.kayitSil(kayit1.ogrenci);
    System.out.println("Kay�t say�s� : " + KursKayit.kayitSayisi);
  }
}
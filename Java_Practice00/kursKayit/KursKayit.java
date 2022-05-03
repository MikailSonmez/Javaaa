package kursKayit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KursKayit {

  Ogrenciler ogrenci;
  Kurslar kurs;
  LocalDate kayitZamani;
  public static int kayitSayisi = 0;

  public KursKayit() {}

  public KursKayit(Ogrenciler ogrenci, Kurslar kurs, LocalDate kayitZamani) {
    this.ogrenci = ogrenci;
    this.kurs = kurs;
    this.kayitZamani = kayitZamani;
    kayitSayisi++;
  }

  public void kayitYaz() {
    System.out.println(
      "Kaydiniz ba�ar� ile al�nm��t�r " +
      ogrenci.adi +
      " \nKursunuz " +
      kurs.baslamaZamani +
      " tarihinde ba�layacakt�r. Kursun ba�lamas�na" +
      kurs.baslamaZamani.until(kayitZamani, ChronoUnit.DAYS) +
      " g�n var. Kursun biti� tarihi : " +
      kurs.baslamaZamani.plusDays(kurs.KursSure)
    );
  }

  public void kayitSil(Ogrenciler ogr) {
    kayitSayisi--;

    System.out.println(ogr.adi + " kayd� silinmi�tir");
  }
}
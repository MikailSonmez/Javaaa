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
      "Kaydiniz baþarý ile alýnmýþtýr " +
      ogrenci.adi +
      " \nKursunuz " +
      kurs.baslamaZamani +
      " tarihinde baþlayacaktýr. Kursun baþlamasýna" +
      kurs.baslamaZamani.until(kayitZamani, ChronoUnit.DAYS) +
      " gün var. Kursun bitiþ tarihi : " +
      kurs.baslamaZamani.plusDays(kurs.KursSure)
    );
  }

  public void kayitSil(Ogrenciler ogr) {
    kayitSayisi--;

    System.out.println(ogr.adi + " kaydý silinmiþtir");
  }
}
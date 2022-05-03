package varmisinyokmusun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunaGIris {
	/*
	 * "Var Mýsýn Yok Musun ?" oyunu oluþturalým.
	 * 
	 * Oyunun mantýðý : 10 tane kutu vardýr, ve her kutunun içinde para miktarýný gösteren bir sayý vardýr.
	 * Oyunu oynayan kiþinin sahip olduðu bir kutu vardýr.
	 * Kalan 9 kutuyu sýrasýyla açtýrýr ve her 3 kutu açtýðýnda, yarýþmanýn sahibi tarafýndan teklifte bulunulur.
	 * Oyuncu isterse teklifi kabul eder, isterse de oyuna devam edip kendi kutusundaki miktarý kazanabilir.
	 * 
	 * Örnek : 10 kutunun içinde rastgele olarak dizilmiþ þu þekilde miktarlar olsun.
	 * 
	 * 1. Kutu : 1 TL
	 * 2. Kutu : 10 TL
	 * 3. Kutu : 500 TL
	 * 4. Kutu : 1000 TL
	 * 5. Kutu : 5000 TL
	 * 6. Kutu : 10000 TL
	 * 7. Kutu : 50000 TL
	 * 8. Kutu : 100000 TL
	 * 9. Kutu : 250000 TL
	 * 10. Kutu : 500000 TL
	 * 
	 * 
	 * Bizim kutumuz 8. kutu olsun.
	 * 
	 * Biz her seferinde kalan 9 kutudan birisini seçip açtýracaðýz, her üç kutu açtýktan sonra 
	 * yapýmcýdan teklif alacaðýz. Diyelim ki ilk 3 kutu açýldýktan sonra yapýmcý bize 10.000 TL teklif etti,
	 * istersek bunu kabul edeceðiz, istemezsek devam edeceðiz.
	 * 
	 * Son kutu kalana kadar devam edebiliyoruz.
	 * 
	 * 
	 * 1. Adým : Önce 10 farklý para miktarýný tutmak için List<Integer> paraListesi  
	 * 			adýnda ArrayList oluþturalým ve miktarlarý ekleyelim.
	 * 				
	 * 2. Adým : 10 Tane kutu oluþturalým ve her kutunun içine rastgele bir miktar atayalým.
	 * 			 Bu miktarlarý paraListesi adlý arrayList'imizden alalým.
	 * 			 Bunun için Kutu isimli bir class oluþturalým.
	 * 			 içerisine kutuNumarasi ve paraMiktari diye iki tane integer oluþturalým.
	 * 			 
	 *
	 * 			 ayrýca paraMiktarýný ve kutuNumarasini almak için 
	 * 			 "getter" methodlarýmýzý oluþturalým.
	 * 
	 * 			 constructor ile de ayrýca bu iki deðiþkenin verilerini, obje oluþtururken ekleyebilelim.
	 * 
	 * 3. Adým : Kutularý ekleyebilmek, ve kutular üzerinde iþlemler yapabilmek için Kutular classý oluþturulým
	 * 			 Oluþturduðumuz tüm Kutu nesnelerini Kutular a ekleyelim.
	 * 			 Bunun için Kutular class'ý içerisinde çeþitli methodlar oluþturalým.
	 * 			 Ayrýca yapýmcinin teklifini de bu class içerisinden alalým.
	 * 
	 * 			 public void kutuEkle(Kutu kutu)
	 * 			 kalanKutuSayisiniAl() 
	 * 			 kutulardakiToplamParaMiktari()
	 * 			 secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
	 * 			 public String acilmamisKutulariGoster()
	 * 			 public void kutuActir(int kutuNumarasi)
	 * 			 public int yapimcininTeklifAl(Kutular kutular , int kendiParaMiktarim)
	 * 	
	 * 5. Adým : Oyunu baþlatalým, kullanýcýdan seçmek istediði kutu numarasýný alalým.
	 * 
	 * 6. Adým : Yapimci adýnda bir tane class class oluþturalým.
	 * 			 Yapýmcý classýndan bir tane nesne üretelim ve her 3 kutu açýldýðnda
	 * 			 kendisinin içerisindeki teklifVer() methodu ile teklif alalým.
	 * 
	 */
	static List<Integer> paraListesi = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kutuNumaram , kutumdakiParaMiktari;
	static Kutular kutular = new Kutular();
	public static void main(String[] args) {
		paraListesi.add(1);         
		paraListesi.add(10);        
		paraListesi.add(500);
		paraListesi.add(1000);
		paraListesi.add(5000);
		paraListesi.add(10000);   
		paraListesi.add(50000);
		paraListesi.add(100000);
		paraListesi.add(250000);
		paraListesi.add(500000);
		Collections.shuffle(paraListesi);
		kutulariOlustur();
		System.out.println("     OYUNUMUZA HOÞGELDÝNÝZ     ");
		System.out.println("Lütfen Kutunuzu Seçiniz : ");
		kutuNumaram = scan.nextInt();     // 2
		kutumdakiParaMiktari = paraListesi.get(kutuNumaram-1);
		System.out.println("Kutu Numaranýz : " + kutuNumaram);
		//System.out.println("Kutunuzdaki Para : " + kutumdakiParaMiktari);
		kutular.kendiKutumuKaldir(kutuNumaram);
		kutuSecmeActirma();
	}
	private static void kutuSecmeActirma() {
		System.out.println("\nKalan Kutular : " + kutular.acilmamisKutulariGoster());
		System.out.println("\nHangi kutuyu açtýrmak istiyorsunuz ? : ");
		int secim = scan.nextInt();
		kutular.kutuActir(secim);
		if(kutular.kalanKutuSayisiniAl() == 7 
				|| kutular.kalanKutuSayisiniAl() == 4 
				|| kutular.kalanKutuSayisiniAl() == 1) {
			System.out.println("Teklif :" + kutular.teklifAl());
			System.out.println("*****Kabul Ediyor musun******\n1-Evet\n2-Hayýr");
			int kabul = scan.nextInt();
			if(kabul == 1) {
				System.out.println("Oyun Bitti. Kazandýðýn Para : " + kutular.teklifAl());
				System.out.println("Kutunda da " + kutumdakiParaMiktari + " TL vardý.");
			}else {
				kutuSecmeActirma();
			}
		}else {
			if(kutular.kalanKutuSayisiniAl() > 0 ) {
				kutuSecmeActirma();
			}else {
				System.out.println("Oyun Bitti !\nKutundaki Para : "+ kutumdakiParaMiktari);
			}
		}
	}
	private static void kutulariOlustur() {
		for(int i = 0 ; i < 10 ; i++) {
			Kutu kutu = new Kutu();
			kutu.setKutuNumarasi(i + 1); /// 1 2 3 4 5 6 7 8 9 10
			kutu.setKutudakiParaMiktari(paraListesi.get(i));
			// Oluþturduðumuz kutu nesnelerini kutular classýn içindeki arrayliste ekledik.
			kutular.kutuEkle(kutu);
			//System.out.println("Kutu No : " + ( i + 1 ) + " Para Miktarý : " + paraListesi.get(i));
		}
	}
}
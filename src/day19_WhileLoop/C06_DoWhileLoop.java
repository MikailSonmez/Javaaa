package day19_WhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir sifre girmesini isteyin
		 * girilen sifreyi asagidaki sartlara gore kontrol edin
		 * ve sifredeki hatalari yazdirin
		 * kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
		 * ve gecerli sifre girdiginde "sifreniz kabul edilmistir" yazdirin
		 * -sifre kucuk harf icermelidir
		 * -sifre buyuk harf icermelidir
		 * -sifre ozel karakter icermelidir
		 * -sifre en az 8 karakter olmalidir
		 */
		Scanner scan=new Scanner (System.in);
		String sifre="";
		boolean khk=false;
		boolean bhk=false;
		boolean okk=false;
		boolean uk=false;
		do {
			System.out.println("Lutfen bir sifre giriniz");
			 sifre = scan.nextLine();
			
			khk=kucukHarfKontrol(sifre);
			bhk=buyukHarfKontrol(sifre);
			okk=ozelKarakterKontrol(sifre);
			uk=uzuklukKontrolu(sifre);
			
		} while(!khk || !bhk || !okk || !uk);
		System.out.println("sifreniz basarili bir sekilde olusturuldu");
		scan.close();
	}

	private static boolean uzuklukKontrolu(String sifre) {
		boolean uk=false;
		if(sifre.length()>=8) {
			uk=true;
		} else {
			System.out.println("sifreniz en az 8 karakter olmalidir");
		}
		return uk;
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean okk=false;
		String harfler="!@#$%^&*()_+=-?><,./";
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i, i+1))) {
				okk=true;
				break; // break kullanmamizin sebebi : soruda 1 tane kucuk harf olmasi yeterli
					   // biz kucuk harfi bulduktan sonra kodu durdurmazsak 
						// sonradan karsimiza cikacak Buyuk harflar bizi yaniltir
			}
		}
		// bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa khk=false
		if (!okk) {
			System.out.println("sifreniz ez az bir ozel karakter harf icermelidir");
		}
		
		
		return okk;
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIKLMNOPRSTUVYZQWX";
				for (int i = 0; i < sifre.length(); i++) {
					
					if (harfler.contains(sifre.substring(i, i+1))) {
						bhk=true;
						break; // break kullanmamizin sebebi : soruda 1 tane kucuk harf olmasi yeterli
							   // biz kucuk harfi bulduktan sonra kodu durdurmazsak 
								// sonradan karsimiza cikacak Buyuk harflar bizi yaniltir
					}
				}
				// bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa khk=false
				if (!bhk) {
					System.out.println("sifreniz ez az bir buyuk harf icermelidir");
				}
				
		return bhk;
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk=false;
		
		String harfler="abcdefghijklmnoprstuvyzqwx";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i, i+1))) {
				khk=true;
				break; // break kullanmamizin sebebi : soruda 1 tane kucuk harf olmasi yeterli
					   // biz kucuk harfi bulduktan sonra kodu durdurmazsak 
						// sonradan karsimiza cikacak Buyuk harflar bizi yaniltir
			}
		}
		// bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa khk=false
		if (!khk) {
			System.out.println("sifreniz ez az bir kucuk harf icermelidir");
		}
		
		
		return khk;
		
	}

}

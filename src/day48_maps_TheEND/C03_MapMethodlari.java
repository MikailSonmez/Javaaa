package day48_maps_TheEND;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		
		Map<Integer, String> ornek= MapOlustur.myMap();
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110)); // false
		System.out.println(ornek.containsValue("java")); // false
		System.out.println(ornek.containsValue("Mustafa, Kan, JAVA")); // true
		
		Set<Entry<Integer,String>> entrySet=ornek.entrySet(); // herbir eleman entry 101=Ali, Can, java
		
		int sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(sayac+".entry : " + each);
			/*  1.entry : 101=Ali, Can, java
				2.entry : 102=Veli, Yan, java
				3.entry : 103=Ali, Yan, C#
				4.entry : 104=Mustafa, Kan, JAVA
				5.entry : 105=Ridvan, Tan, C#
				6.entry : 106=Kutlu, San, JaVa	
			 */
			sayac++;
		}
		
		System.out.println(ornek.getOrDefault(110, "Girilen key map'de yok")); // Girilen key map'de yok
		System.out.println(ornek.getOrDefault(103, "Girilen key map'de yok")); // Ali, Yan, C#
		
		ornek.putIfAbsent(103, "Celil, Han, Java"); // eklemeyecek // 103 yoksa ekliyecekti
		ornek.putIfAbsent(110, "Fikri, Yan, Qa"); // ekleyecek
		
			int sayac1=1;
		
			for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(sayac1+".entry : " + each);
			/*  1.entry : 101=Ali, Can, java
				2.entry : 102=Veli, Yan, java
				3.entry : 103=Ali, Yan, C#
				4.entry : 104=Mustafa, Kan, JAVA
				5.entry : 105=Ridvan, Tan, C#
				6.entry : 106=Kutlu, San, JaVa	
				7.entry : 110=Fikri, Yan, Qa
			 */
			sayac1++;
		}
		
		String maptenString= ornek.toString();
		System.out.println(maptenString); // string verdi artik string olarak kullanilabilir ama effektif degil map kullaniyoz sonucta
		
		
	}
	
}

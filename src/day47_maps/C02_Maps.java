package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// icice map olusturacaksak en icerdekinden baslamaniz tavsiye olunur
		
		Map<String,String> ogr1Map=new HashMap<>();
		ogr1Map.put("isim", "Veli");
		ogr1Map.put("soyisim", "Yan");
		ogr1Map.put("brans", "QA");
		
		Map<String,String> ogr2Map=new HashMap<>();
		ogr2Map.put("isim", "Ali");
		ogr2Map.put("soyisim", "Yan");
		ogr2Map.put("brans", "C#");
		
		Map<String,String> ogr3Map=new HashMap<>();
		ogr3Map.put("isim", "Ayse");
		ogr3Map.put("soyisim", "Can");
		ogr3Map.put("brans", "QA");
		
		Map<String,String> ogr3Map1=new HashMap<>();
		ogr3Map1.put("isim", "Ayse");
		ogr3Map1.put("soyisim", "Can");
		ogr3Map1.put("brans", "QA");
		
		Map<String,String> ogr4Map=new HashMap<>();
		ogr4Map.put("isim", "Ali");
		ogr4Map.put("soyisim", "Can");
		ogr4Map.put("brans", "J.dev");
		
		System.out.println("1. ogreci : " + ogr1Map);
		System.out.println("2. ogreci : " + ogr2Map);
		System.out.println("3. ogreci : " + ogr3Map);
		System.out.println("4. ogreci : " + ogr4Map);
		
		Map<Integer, Map<String,String>> sinifMap=new HashMap<>();
		
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap);
		/*
		 {101={soyisim=Yan, brans=QA, isim=Veli}, 
		 102={soyisim=Yan, brans=C#, isim=Ali}, 
		 103={soyisim=Can, brans=QA, isim=Ayse}, 
		 104={soyisim=Can, brans=J.dev, isim=Ali}}
		 */
	}
}

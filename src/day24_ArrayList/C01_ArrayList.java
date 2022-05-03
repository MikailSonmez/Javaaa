package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// list olusturalim
		
		List <String> isimList=new ArrayList<>();
		
		
		List <String> isimList2=new ArrayList<String>();
		// bazen esitligin sag tarafindaki elmas icine data turu yazilmazsa sorun cikabiliyor
		// ama genelde sorun cikmaz, biz de list olustrurken sag tarafta data turu yazmayiz
		
		// List <String> isimList3= new List<>();
		//esitligin sag tarafinda List<>() yazamayiz
		
		List <Integer> sayilar = new ArrayList<>();
		// list data turu olarak primitive'leri kabul etmez
		
		List <Boolean> cevaplar=new ArrayList<>();
	}

}

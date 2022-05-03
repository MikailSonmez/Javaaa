package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		
		List<Integer> ll = new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); // [5,7]
		
		ll.add(9); // Data turunu List sectigimiz icin sadece List Interface'indaki methodlari kullanabiliriz
		// LinkedList class'inda override ettigimiz icin
		// List interface olasina ragmen List method'larini kullanabildik
		
		Queue <Integer> ll2 = new LinkedList<>();
		
		ll2.add(5);
		ll2.add(7);
		
		System.out.println(ll2); // Data turu Queue secilince Queue interface'inden gelen method'lari kullanabildik
		// [5, 7]

		Deque <Integer> ll3 = new LinkedList<>();
		
		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20); // 
		System.out.println(ll3); // [5, 7, 20]

		
		
	}

}

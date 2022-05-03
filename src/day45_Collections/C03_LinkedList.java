package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(11); // [5,7]

		ll.element();
		
		ll.peek();
		
		System.out.println(ll.peek()); // silmeden ilk elemani bana getirir // 5
		System.out.println(ll.peekFirst()); // silmeden ilk elemani bana getirir // 5
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		System.out.println(ll2.peekFirst()); // null deque
		System.out.println(ll.peek()); // null queue
		
		System.out.println(ll.element()); // 5
		// System.out.println(ll2.element()); // java.util.NoSuchElementException
		
		System.out.println(ll.poll()); // 5
		System.out.println(ll); //  [7]
		
		System.out.println(ll.poll()); // 7
		System.out.println(ll); // []
		
		System.out.println(ll.poll()); // poll
		
		System.out.println(ll.hashCode()); // 1 java'nin verdigi hash code'u doner
		
		ll2.add(7);
		
		System.out.println(ll2.hashCode()); // 38
		
		System.out.println(ll2.offer(10)); // hem ekler hem true doner //true
		
		System.out.println(ll2); // [7, 10] // ekledi
		
		ll2.push(2); // addFirst() ile ayni
		
		 
		
	}

}

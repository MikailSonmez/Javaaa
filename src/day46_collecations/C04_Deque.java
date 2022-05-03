package day46_collecations;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		Deque <String>   ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli); // [Yildiz, Ali]
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli); // Dequ'den gelen ozellik // [Yildiz, Ali, Emine]
		
		
		System.out.println(ciftBasli.pop()); // Yildiz
		
		System.out.println(ciftBasli); //[Ali, Emine]
		
		ciftBasli.push("Seyfullah");
		
		System.out.println(ciftBasli); // [Seyfullah, Ali, Emine]

	}

}

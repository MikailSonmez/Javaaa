package questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemovetheDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter list elements, to stop entrance press '*' ");
		
		List<String> list = new ArrayList<>();
		
		String str = "";
		
		while (!str.equals("*")) {
			str = scanner.next();
			if (!str.equals("*")) {
				list.add(str);
			}
		}
		System.out.println(list);
		
		Set<String> listSet = new HashSet<>(list);
		
		System.out.println(listSet);
		
		scanner.close();
	}

}

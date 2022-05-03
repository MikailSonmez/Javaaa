package day30_ImmutableMutable;

import java.util.ArrayList;

public class C05_HomeWork {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> values = new ArrayList<>();
		
		values.add(4);
		values.add(4);
		values.set(1, 6);
		values.remove(0);
		for (Integer v : values) {
			System.out.println(v);
		}
			// 6 verdi dogru yaptik Elhamdulillah
	}

}

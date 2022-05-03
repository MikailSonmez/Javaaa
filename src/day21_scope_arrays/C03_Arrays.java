package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// soru 1 elemanlari "Ali", "Veli", "Ayse" ve "Fatma" olan bir array olusturun
		
		
		String arr[]=new String[4];
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";
		
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"};
		
		// soru 2: soru 1 deki elemeanlardan
		// "Ali" yerine "Can", "Ayse" yerine "Gul" atayin
		
		arr2[0]="Can";
		arr2[2]="Gul";
		
		System.out.println(arr2[1]);
		
		// son elementi yazdirin
		System.out.println(arr[arr.length-1]); // String'deki lenght() idi, burada sadece lenght
		
		System.out.println(arr.length); // calistirinca sorun verir
	}

}

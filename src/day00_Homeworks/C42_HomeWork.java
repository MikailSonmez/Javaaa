package day00_Homeworks;

public class C42_HomeWork {

	public static void main(String[] args) {
		
		String str="ReverseString";
		String rev="";
		
		for (int i = str.length()-1; i <= 0; i++) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

}

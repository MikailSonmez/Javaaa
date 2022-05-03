package day00_Homeworks;

public class C48_HomeWork {

	public static void main(String[] args) {
		
		
		int num=121;
		int reverse=0;
		int anotherNumber=num;
		
		while (num!=0) {
			int x=num%10;
			reverse=reverse*10+x;
			num/=10;
		}
		if (anotherNumber==reverse) {
			System.out.println("palindromdur");
		} else {
			System.out.println("palindrom degil");
		}
	}

}

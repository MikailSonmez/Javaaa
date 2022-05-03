package day36_inheritance;




class Derived{
	public Derived(String temp) {
		System.out.println("Derived Class : " + temp);
	}
}





public class Test01 extends Derived{
	
	public Test01 (String temp){
		super(temp);
		System.out.println("Test Class : " + temp);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Test01 obj = new Test01("Samet");
	}
}

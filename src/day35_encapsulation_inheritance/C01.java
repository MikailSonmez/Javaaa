package day35_encapsulation_inheritance;

public class C01 {

		private double not=49.9;
		
		public void setNot(double not) {
			this.not = not;
		}


		private boolean gecerMi=false;
		
		public boolean isGecerMi() {
		
			if (not>=50) {
				gecerMi=true;
			}
		return gecerMi;
			
			
		}
		
		
}

package day_Practice14_Encapsulation;

public class Araba {
	
	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	public Araba(){ // parametresiz cons

	}
	
	//getter setter methodlarý...sað týk--> Generate-->Getter and Setter...
	public String getMode() {
		return model;
	}
	
	 public void setModel(String model) {
	        this.model = model;
	    }

	    public String getRenk() {
	        return renk;
	    }

	    public void setRenk(String renk) {
	        this.renk = renk;
	    }

	    public int getMotor() {
	        return motor;
	    }
	    
	 public void setMotor(int motor) {
		 if (motor>100) {
			this.motor = motor;
			System.out.println("Agam tekerine tas degmesin :");
		} else System.out.println("agam eglenir 100 altinda beygir gucu olmaz :( ");

	 }
	  public int getYil() {
	        return yil;
	    }

	    public void setYil(int yil) {
	    	
	    	if (yil<0) {
				this.yil = (-1)*yil;
				System.out.println(" negatif yil giremezsiniz");
			} else this.yil = yil;

	    }
	    public Araba(String model, String renk, int motor, int yil) {//p'li cons.
	        // this.model = model;
	        // this.renk = renk;
	        // this.motor = motor;
	        // this.yil = yil;-->üretilen obj nin yýl deðeri buradan alýrsa sete girmeden düzenlenmeden alýnýr
	        // this.beygir = beygir;
	        //cons obj parametrelerini hatalý üretmesin diye field yani dðerleri encapsule ederek get set metodlarýnda gönderilmeli
	        // yoksa yýl volvoda hatalý -2020 girilir
	    	setModel(model);
	    	setRenk(renk);
	    	setMotor(motor); //üretilen obj nin motor deðeri set metodundan almalý
	    	setYil(yil); //üretilen obj nin yýl deðeri set metodundan almalý.yil verisi setYil metoduna parametre yapýlarak
            // bu verinin setYil metodu tarafýndan iþlenmesi saðlandý
	    	
	    }
}

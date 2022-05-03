package day_Practice14_Encapsulation;

public class Araba {
	
	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	public Araba(){ // parametresiz cons

	}
	
	//getter setter methodlar�...sa� t�k--> Generate-->Getter and Setter...
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
	        // this.yil = yil;-->�retilen obj nin y�l de�eri buradan al�rsa sete girmeden d�zenlenmeden al�n�r
	        // this.beygir = beygir;
	        //cons obj parametrelerini hatal� �retmesin diye field yani d�erleri encapsule ederek get set metodlar�nda g�nderilmeli
	        // yoksa y�l volvoda hatal� -2020 girilir
	    	setModel(model);
	    	setRenk(renk);
	    	setMotor(motor); //�retilen obj nin motor de�eri set metodundan almal�
	    	setYil(yil); //�retilen obj nin y�l de�eri set metodundan almal�.yil verisi setYil metoduna parametre yap�larak
            // bu verinin setYil metodu taraf�ndan i�lenmesi sa�land�
	    	
	    }
}

package game1;

import java.util.Scanner;

public class Player {
	protected String isim,KIsim;
	protected int can,para,hasar,saglik;
	Envanter env;
	Scanner scan = new Scanner(System.in);
	
	public Player(String isim) {
		this.isim = isim;
		this.env = new Envanter();
	}
	
	public void karakterSec() {
		
		switch (karMenu()) {
		case 1:
			olstrPlayer("Samuray",5,10,100);
			
		case 2:
            olstrPlayer("Okcu", 8, 12,120);
            break;

        case 3:
            olstrPlayer("Sovalye", 7, 20,70);
            break;

        default:
            olstrPlayer("Samuray", 5, 10, 100);
            break;
    }
		System.out.println("karakter olusturuldu ! " + "\nSecilen karakter : " + getKIsim());

	}
	public int karMenu() {
		System.out.println("bir karakter seciniz!");
		System.out.println("1- samuray");
		System.out.println("2- okcu");
		System.out.println("3-sovalye");
		
		System.out.println("karakter seciminiz : ");
		int karId = scan.nextInt();
		
		while (karId < 1 || karId > 3) {
			System.out.println("lutfen gecerli bir karakter numarasi giriniz...");
			karId = scan.nextInt();
		}
		return karId;
	}
	public void olstrPlayer(String kIsim, int hasar, int saglik, int para) {
		setIsim(KIsim);
		setHasar(hasar);
		setSaglik(saglik);
		setPara(para);
		setCan(saglik);
	}
	public int getTotalHasar() {
		return this.getHasar()+this.getEnv().getHasar();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getKIsim() {
		return KIsim;
	}

	public void setKIsim(String kIsim) {
		KIsim = kIsim;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getPara() {
		return para;
	}

	public void setPara(int para) {
		this.para = para;
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		this.hasar = hasar;
	}

	public int getSaglik() {
		return saglik;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	public Envanter getEnv() {
		return env;
	}

	public void setEnv(Envanter env) {
		this.env = env;
	}
	
}


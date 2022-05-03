package game1;

public class Evim extends NormalLok{
	Evim(Player player){
		super(player,"burasi kurtarilmis bolge !");
	}
	
	public boolean getLocation() {
		player.setSaglik(player.can);
		System.out.println("Iyilestiniz turp gibisiniz masallah !");
		System.out.println("Guvenlik evinizde dinlenebilirsiniz ama maceraya devam etmenizi oneririz lakin yatmaya gelmediniz !...");
		
		return true;
	}
}

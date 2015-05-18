package dp.factory;

public class Nvwa {
	public static void main(String[] args){
		AbstractHumanFactory lu = new HumanFactory();
		System.out.println("create white");
		Human whiteHuman = lu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("create black");
		Human blackHuman = lu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("create yellow");
		Human yellowHuman = lu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}

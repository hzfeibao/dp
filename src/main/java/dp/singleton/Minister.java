package dp.singleton;

public class Minister {
	
	public static void main(String[] args){
		int ministerNum = 5;
		for(int i = 0; i < ministerNum; i++){
			Emperor emperor = Emperor.getInstance();
			System.out.print("minister " + i + " to emperor " );
			emperor.say();
		}
	}
}

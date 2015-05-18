package dp.singleton;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
	private static int maxNum = 2;
	private static  int countNum;
	private static ArrayList<String> nameList = new ArrayList<String>();
	
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	
	static{
		for(int i = 0; i < maxNum; i++){
			emperorList.add(new Emperor("emperor " + i));
		}
	}
	
	private Emperor(){
		
	}
	private Emperor(String name){
		nameList.add(name);
	}
	
	public static Emperor getInstance(){
		Random random = new Random();
		countNum = random.nextInt(maxNum);
		return emperorList.get(countNum);
	}
	
	public static void say(){
		System.out.println(nameList.get(countNum));
	}
}

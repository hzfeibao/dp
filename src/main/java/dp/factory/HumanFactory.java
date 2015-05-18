package dp.factory;

public class HumanFactory extends AbstractHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		// TODO Auto-generated method stub
		Human human = null;
		try{
			human = (Human)Class.forName(c.getName()).newInstance();
			
		}catch(Exception e){
			System.out.println("error");
		}
		return (T)human;
	}

}

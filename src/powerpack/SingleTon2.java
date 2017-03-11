package powerpack;

public class SingleTon2 {

	private SingleTon2(){}

	private static class SingleHelper{
		private static final SingleTon2 INSTANCE = new SingleTon2();
	}
	public static SingleTon2 getinstance(){
		return SingleHelper.INSTANCE;
	}

}

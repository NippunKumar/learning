package powerpack;

public class Singleton {
	private	static Singleton singleton = new Singleton();
	private Singleton(){
	}
	public static Singleton intanceSilgeton(){
		return singleton;	
	}
	public void test(){
		System.out.println("Hey...it is working");
	}
	public static void main(String[] args) {
		Singleton sg = intanceSilgeton();
		sg.test();
	}
}

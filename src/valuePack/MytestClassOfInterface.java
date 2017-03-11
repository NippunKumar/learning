package valuePack;

public class MytestClassOfInterface implements JavaInterface8,JavaInterface8b {

	public static void main(String[] args) {
		JavaInterface8 myClass = new MytestClassOfInterface();
		JavaInterface8b myClass2 = new MytestClassOfInterface();
		myClass2.Display2();
		myClass.printIt();
		myClass.Display();
		JavaInterface8b.doit();
		JavaInterface8.doit();
	}

	@Override
	public void printIt() {
		System.out.println("From my test class");
	}
	/*@Override
	public void Display() {
		System.out.println("From my test class overRiden Display method");
	}*/
	public void doit() {
		System.out.println("From my test class overRiden doit method");
	}
}
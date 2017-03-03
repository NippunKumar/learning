package valuePack;

public interface JavaInterface8 {
	abstract void printIt();
	
    public default void Display(){
		System.out.println("Hi I am In Interface 8a");
	}
    public static void doit(){
    	System.out.println("Doing It");
    }
}

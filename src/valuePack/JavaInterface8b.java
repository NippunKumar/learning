package valuePack;

public interface JavaInterface8b {
	abstract void printIt();
	
    public default String Display2(){
    	return ("Hi I am In Interface 8b");
		//System.out.println("Hi I am In Interface");
	}
    public static void doit(){
    	System.out.println("Doing It of b");
    }
}

package pkg;
import java.util.Scanner;
public class SwapNoTemp {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 1st no.");
		int input1= sc.nextInt();
		System.out.println("Enter 2nd no.");
		int input2= sc.nextInt();
		System.out.println("Value before swap");
		System.out.println("First Input ="+input1+" ");
		System.out.println("Second Input ="+input2+" ");
		input1= input1^input2;
		input2= input1^input2;
		input1= input1^input2;
		System.out.println("Value after swap");
		System.out.println("First Input ="+input1+" ");
		System.out.println("Second Input ="+input2+" ");
		
		
	}

}

package pkg;
//without using modulo or division operator
// using bit wise & if((number & 1)==0) gives even  else odd
import java.util.Scanner;

public class EvenOrOddNew {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int input = sc.nextInt();
		if((input & 1)==0){
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is Odd");
		}
	}

}

package valuePack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
	// Create Stack object
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Enter decimal number: ");
		int num = in.nextInt();
		while (num != 0) {
			int d = num % 2;
			stack.push(d);
			num /= 2;
		}
		System.out.print("\nBinary representation is:");
		while (!(stack.isEmpty())) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}

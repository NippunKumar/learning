package pkg;

import java.util.Scanner;
import java.util.regex.*;

public class DecimalToBinary {
	public static Scanner sc = new Scanner(System.in);
	public static final String decimal = "^[0-9]{1,15}$";

	public static void main(String arg[]) {
		int x;
		int temp = 0;
		char ch[];
		String binary ="";
		System.out.println("Enter the decimal");
		String input = sc.next();
		if (!(Pattern.matches(decimal, input))) {
			System.out.println("Illigal Argument");
			System.exit(0);
		}
		x = Integer.parseInt(input);
		while (true) {
			if (x == 0) {
				break;
			}
			temp = x % 2;
			binary += Integer.toString(temp);
			x = x / 2;
		}
		ch = binary.toCharArray();
		for (int i = ch.length-1; i > 0; i--) {
			System.out.print(ch[i]);
		}
	}
}

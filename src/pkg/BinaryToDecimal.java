package pkg;

import java.util.Scanner;
import java.util.regex.*;

public class BinaryToDecimal {
	public static Scanner sc = new Scanner(System.in);
	private static final String BINARY_PATTERN = "^[0-1]{1,15}$";

	public static void main(String[] args) {
		System.out.println("Enter the binary number");
		String input = sc.next();
		int decimal = 0;
		int power = 0;

		Pattern pattern = Pattern.compile(BINARY_PATTERN);
		if (!pattern.matcher(input).matches()) {
			System.out.println("illigal Argumant");
			System.exit(0);
		}
		int x = Integer.parseInt(input);
		while (true) {
			if (x == 0) {
				break;
			} else {

				int tmp = x % 10;
				decimal += tmp * Math.pow(2, power);
				x = x / 10;
				power++;

			}
		}
		System.out.println("Binary=" + x + " Decimal=" + decimal);
	}
}

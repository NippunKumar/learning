package valuePack;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String arg[]) {
		System.out.println("Enter the String");
		String inputString = sc.next();
		char ch[] = inputString.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}

}

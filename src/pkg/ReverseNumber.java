package pkg;

import java.util.Scanner;

public class ReverseNumber {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int temp;
		String reverseNum;
		System.out.println("Enter the Number");
		String input = sc.next();
		StringBuffer sb = new StringBuffer(input);
		reverseNum = sb.reverse().toString();
		int num = Integer.parseInt(reverseNum);
		System.out.println("The Reverse Number is " + num);

	}
}

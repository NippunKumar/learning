package powerpack;

import java.util.Scanner;

public class ReverseString {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String input = sc.next();
		reverse(input);
		reverseWords(input);
	}

	private static void reverse(String input) {
		String reverse;
		StringBuilder sb = new StringBuilder(input);
		reverse = sb.reverse().toString();
		System.out.println(reverse);
	}

	private static void reverseWords(String input) {
	//	String st2 = "Hi How are you";
	      String st[]  = input.split(" ");
		String result = "";
		System.out.println(st.length);
		for (int i = st.length-1;i>=0;i--) {
			result = result + st[i] + " ";
		}
		System.out.println(result.trim());
	}
}

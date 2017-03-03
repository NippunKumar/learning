package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestNo {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Length of the array");
		int input = sc.nextInt();
		List<Integer> l = new ArrayList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < input; i++) {
			l.add(sc.nextInt());
		}
		l.sort(null);
		System.out.println("The largest Number is " + l.get(input - 1));
	}

}

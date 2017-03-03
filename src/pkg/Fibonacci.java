package pkg;

import java.util.Scanner;

public class Fibonacci {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the limit point");
		int x = sc.nextInt();
		Fibonacci fb = new Fibonacci();
		fb.fibanci(0, 1,x);
	}

	public void fibanci(int n1, int n2, int x) {
		int sum = 0;
		if (n1 == 0) {
			System.out.print(n1 + "," + n2+",");
		}
		sum = n1 + n2;
		if (sum <= x) {
			System.out.print(sum+",");
			n1 = n2;
			n2 = sum;

			fibanci(n1, n2,x);

		}
	}
}

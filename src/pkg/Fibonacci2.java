package pkg;

import java.util.Scanner;

public class Fibonacci2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the limit point");
		int x = sc.nextInt();
		Fibonacci2 fibonacci2 = new Fibonacci2();
		fibonacci2.fibonaci(x);
	}
	private void fibonaci(int z) {
		int sum = 0;
		int x = 0, y = 1;
		if (z == 1) {
			System.out.println("0");
		} else if (z == 2) {
			System.out.println("0," + "1");
		} else {
			System.out.print("0," + "1"+",");			
			for (int i = 3; i <= z; i++) {
				sum = x + y;
				System.out.print(sum+",");
				x = y;
				y = sum;
			
			}
		}
	}
}

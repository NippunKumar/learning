package pkg;

import java.util.Scanner;

public class SumOfNumber {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int input = sc.nextInt();
		int temp;
		int sum=0;
		
		while(input!=0){
			temp = input%10;
			sum += temp;
			input = input/10;
		}
		System.out.println("the sum of number is "+sum);
	}
}
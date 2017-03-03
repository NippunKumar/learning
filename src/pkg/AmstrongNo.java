package pkg;

import java.util.Scanner;
import java.math.*;

public class AmstrongNo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int input = sc.nextInt();	
		int x = input;
		int temp;
		int sum = 0;
		while(input !=0){
			temp = input% 10;
			sum += temp*temp*temp;
			input= input/10;
			
		}if(sum==x){
		System.out.println("The number "+ x+" is an Amstrong Number" );
		}
		else{
		System.out.println("The number "+ x+" is Not an Amstrong Number" );
		}
	}
}

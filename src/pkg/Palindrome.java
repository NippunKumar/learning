package pkg;

import java.util.Scanner;

public class Palindrome {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String input = sc.next();	
		boolean isPalindrome = true;
		char[] c = new char[16];
		c= input.toCharArray();
		for(int i=0,  j= c.length-1; i < c.length && j>=0;i++,j--){
			if(c[i]!=c[j]){
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome){
			System.out.println("The String is Palindrome");
		}
		else{
			System.out.println("The String is not Palindrome");	
		}
		
	}
}

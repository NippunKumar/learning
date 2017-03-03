package pkg;
import java.util.Scanner;
public class PrimeNumber {
	public static  Scanner sc = new Scanner(System.in);
	public static void main(String arg[]){
		System.out.println("Enter the upper limit");
		String input = sc.next();
		boolean isDiv=false;
		int value = Integer.parseInt(input);
		for(int i=2;i<value;i++){
			isDiv=false;
			for(int j= 2;j<=i/2;j++){
				if (i%j==0){
					isDiv=true;
					break;
				}
			}	
			if(!isDiv)
			{
				System.out.println(i);
			}
		
		}
	}
}

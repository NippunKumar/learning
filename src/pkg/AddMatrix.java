package pkg;
import java.util.Scanner;
public class AddMatrix {
	int row,col;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("lease enter row and column");
		int row = sc.nextInt();
		int col= sc.nextInt();
		int a[][] = new int[row][col];
		int b[][]= new int [row][col];
		int c[][]= new int[row][col];
		System.out.println("please enter value of the 1st matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j]= sc.nextInt();
				
			}
			
		}
		System.out.println("please enter value of the 2snd matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				b[i][j]= sc.nextInt();
				
			}
			
		}
		System.out.println("the sum of matrix is");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(c[i][j]+"\t");
			
			}
			System.out.println();
		}
	}
	
	
	

}

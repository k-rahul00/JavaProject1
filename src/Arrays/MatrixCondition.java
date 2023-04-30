package Arrays;
import java.util.Scanner;
public class MatrixCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimension:");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		System.out.println("Matrix A entry:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix B entry:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
				
			}
		
		}
		int c[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		System.out.println("Matrix C:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
			sc.close();
	}

	}}

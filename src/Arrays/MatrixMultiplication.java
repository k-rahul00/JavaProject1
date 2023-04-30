package Arrays;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimension");
		int rows1=sc.nextInt();
		int cols1=sc.nextInt();
		int rows2=sc.nextInt();
		int cols2=sc.nextInt();
		if(rows2!=cols1) {
			System.out.println("Mul not possible");
			sc.close();
			return;
		}
		
		int a[][]=new int[rows1][cols1];
		int b[][]=new int[rows2][cols2];
		System.out.println("Enter Matrix A");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
				a[i][j]=sc.nextInt();			}
		}
		System.out.println("Enter Matrix B");
		
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
				b[i][j]=sc.nextInt();			}
		}
		System.out.println("Matrix c");
		
		int c[][]=new int[rows1][cols2];
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				c[i][j]=0;
				for(int k=0;k<rows2;k++) {
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
				}
		}
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.print(c[i][j]+ " ");		}
		}
		System.out.println();
		sc.close();
		
	}

}

package NestedForLoop;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int j=0;j<=n;j++) {
		for(int i=0;i<=j;i++) {
			System.out.print("* ");
			
		}
		System.out.println();
		}
		s.close();
	}

}

package NestedForLoop;

import java.util.Scanner;

public class CNPatternAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			for(int j = 1;j < i; j++)
    		{
        			System.out.print("  ");
    		}
			for(int j = 1;j < i; j++)
    		{
        			System.out.print("  ");
    		}
    		for(int j = i;j <= n;j++)
    		{
        			System.out.print("* ");
    		}
			
			
	//		for(int j = 1; j <= n - i; )
			System.out.println();
		}

	}

}

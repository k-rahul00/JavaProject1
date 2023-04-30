package Recursion1;

import java.util.Scanner;

public class factorial {
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
//		int factorial = fact(n-1);
		int output = n * fact(n-1);
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));

	}

}

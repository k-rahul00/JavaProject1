package NestedForLoop;

import java.util.Scanner;

public class MultiplicationTableTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int multiply=1;
		for(int j=1;j<=n;j++) {
		for(int i=1;i<=n;i++) {
			multiply=j*i;
			System.out.print(multiply+" ");
			
		}
		System.out.println();
      sc.close();
	}

}
}
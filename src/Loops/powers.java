package Loops;

import java.util.Scanner;

public class powers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=1;
		for(int i=1;i<b+1;i++) {
			result*=a;
		}
		System.out.println(result);
		sc.close();
	}

}

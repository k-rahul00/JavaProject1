package Loops;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(n<2) isPrime=false;
		if(isPrime) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
sc.close();
	}

}

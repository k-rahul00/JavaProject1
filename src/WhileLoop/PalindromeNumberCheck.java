package WhileLoop;

import java.util.Scanner;

public class PalindromeNumberCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int r=0;
		while(temp>0) {
			int lastdigit= temp % 10;
			r=r*10+lastdigit;
			temp /= 10;
			
		}
		if(r==n) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
		s.close();
	}
}

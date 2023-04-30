package WhileLoop;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int binary=0;
		while(temp>0) {
			   binary= temp % 2;
			System.out.print(binary);
			
			temp/=2;
		}
		s.close();
		
	}
}

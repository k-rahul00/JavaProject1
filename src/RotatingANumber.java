import java.util.Scanner;

public class RotatingANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question Statement: 
//			1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
//			2. Take as input n and k.
//			3. Print the rotated number.
//			4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//			   n = 12340056
//			   k = 3
//			   r = 05612340
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k=sc.nextInt();
		int rot=0;
		int count=0;
		int temp=n;
		while(temp!=0) {
			temp /= 10;
			count++;
		}
		if(k<0) {
			k=k+count; // this will deal with negative numbers
		}
		if(k>count) {
			k=k%count;
		}
		int div=1;
		int mul=1;
		for(int i=1;i<=count;i++) {
			if(i<=k) {
				div =div*10;
			}
			else
				mul = mul*10;
		}
		int q=n/div;
		int rem=n%div;
		rot=rem*mul +q;
		System.out.println(rot);

	}

}

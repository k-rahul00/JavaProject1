package WhileLoop;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n,sum=0;
		while(temp>0) {
			int lastdigit= temp % 10;
			temp/=10;
			sum += lastdigit;
			System.out.println(sum);
		}
		int noOfDigits= (int)Math.log10(n)+1;
		System.out.println("No. of digits:"+noOfDigits);
		s.close();
		

	}

}

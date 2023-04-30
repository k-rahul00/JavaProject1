package WhileLoop;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bNo=n;
		int decimal=0;
		int noOfDigits= (int)Math.log10(n)+1;
		for(int i=1;i<=noOfDigits;i++) {
			int lastdigit= bNo%10;
			decimal = decimal+lastdigit*((int)Math.pow(2, i));
			bNo/=10;
			
		}
		System.out.println(decimal);
		
		sc.close();

	}

}

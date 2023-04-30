package WhileLoop;
import java.util.*;
public class CheckingArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int result=0;
		while(temp>0) {
			int lastdigit= temp%10;
			result=result+ (int)Math.pow(lastdigit, 3);
			temp /= 10;
			System.out.println(result);
		}
		if(result==n) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");

	}
		sc.close();

}
}
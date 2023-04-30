import java.util.Scanner;

public class countingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	long n=sc.nextLong();
		int count=0;
		for(int i=0;i<=n;i++) {
			long temp = n%10;
			if(temp!=0) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);

	}

}

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();     // number of test cases
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int count=0;
			for(int j=2;j*j<=n;j++) {
				if(n%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
			
			
		}
		

	}

}

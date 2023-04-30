package Miscellaneous;
import java.util.*;
public class lcm {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int gcd=1;
	for(int i=1; i<=a && i<=b; i++) {
		if(a%i==0 && b%i==0) {
			gcd=i;
		}
		
	}
	System.out.println(gcd);
	int lcm= (a*b)/gcd;
	System.out.println(lcm);
	}

}

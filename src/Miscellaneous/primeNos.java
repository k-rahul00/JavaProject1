package Miscellaneous;
import java.util.*;
public class primeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,flag;
		Scanner sc=new Scanner(System.in) ;
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=a; i<=b;i++) {
			if(i==0 || i==1)
				continue;
			flag=1;
			for(int j=2;j<=i/2;++j) {
				if(i%j==0) {
					flag=0;
					break;
				
			}
			
				}
			if(flag==1) {
				System.out.println(i);
			
		}
		

	}
		
	}
}

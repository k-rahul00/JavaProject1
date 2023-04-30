package Loops;
import java.util.*;
public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(int i=0;i<100;i++) {
		//System.out.println("Hello World!");
	/*sum of 100 natural numbers:
	 	int sum=0;
		int n=100;
		for(int i=0;i<=100;i++) {
			sum +=i; 
			
}
		System.out.println(sum);
		*/
		Scanner sc=new Scanner(System.in);
		
	/*	int a=sc.nextInt();
		int b= sc.nextInt();
		int c=0;
		for (int i=1;i<=b;i++) {
			c=a*i;
			System.out.println(c);*/
		
	int n=sc.nextInt(),fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		sc.close();
		
	}
	

}

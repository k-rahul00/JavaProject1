package Miscellaneous;
import java.util.*;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%400==0|| n%100!=0) && n%4==0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
		
		sc.close();

	}

}

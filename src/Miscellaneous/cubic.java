package Miscellaneous;
import java.util.*;
public class cubic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<arr[i];j++) {
			if((j*j*j)==arr[i]) {
				count=count+1;;
			}
			
		}
		}
System.out.println(count);
	}

}

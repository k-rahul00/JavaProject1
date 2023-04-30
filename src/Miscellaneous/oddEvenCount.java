package Miscellaneous;

import java.util.Scanner;

public class oddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
        int countodd=0;
        int counteven=0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                countodd++;
                
            }
            else{
                counteven++;
               
            }
        }
        System.out.println(countodd+" "+counteven);
	}

}

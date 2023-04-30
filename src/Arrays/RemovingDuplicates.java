package Arrays;

import java.util.Scanner;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int length =arr.length;
//		length = removeDuplicates(arr, n);
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				if(count < 1) {
					System.out.println(arr[i]);
				}
			}
		}
//		for(int i = 0; i < length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		

	}
//	public static int removeDuplicates(int[] arr, int n) {
//		if (n==0 || n==1){  
//            return n;  
//        }  
//        int[] temp = new int[n];  
//        int j = 0;  
//        for (int i=0; i<n-1; i++){  
//            if (arr[i] != arr[i+1]){  
//                temp[j++] = arr[i];  
//            }  
//         }  
//      temp[j++] = arr[n-1];     
//        // Changing original array  
//        for (int i=0; i<j; i++){  
//            arr[i] = temp[i];  
//        }  
//        return j;  
//	}

}

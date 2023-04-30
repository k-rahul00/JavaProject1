package Strings;
import java.util.*;
public class ReversingAStringWordOnly {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String p= s.nextLine();
		String[] strArray= p.split(" ");
		for( String temp: strArray) {
			System.out.println(temp);
		}
		for(int i=0;i<strArray.length;i++) {
			char[] str1=strArray[i].toCharArray();
			
			for(int j=str1.length-1;j>=0;j--) {
				System.out.print(str1[j]);
			}
			System.out.print(" ");
			}
			
			
			
		}
}





package Miscellaneous;
import java.util.*;
public class stringReversalAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The Color Is Blue";
		String r="";
		for(int i=s.length(); i>0;--i) {
			r=r+s.charAt(i-1);
		}
		System.out.println(r);

	}

}

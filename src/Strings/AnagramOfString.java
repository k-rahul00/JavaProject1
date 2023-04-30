package Strings;
import java.util.*;
public class AnagramOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        boolean isAnagram=false;
        boolean[] visited= new boolean[b.length()];
        if( a.length()==b.length()) {
        	for( int i=0;i<a.length();i++) {
        		char c=a.charAt(i);
        		isAnagram=false;
        		for(int j=0;j<b.length();j++) {
        			if(b.charAt(j)==c && !visited[j]) {
        				visited[j]=true;
        				isAnagram=true;
        				break;
        			}
        		}
        		if(!isAnagram) {
        			break;
        		}
        		
        	}
        	if(isAnagram) {
        		System.out.println("Anagram");
        	}
        	else
        		System.out.println("Not Anagram");
        	sc.close();
        }
	}
}
//time complexity O(n^2)


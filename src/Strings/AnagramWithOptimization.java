package Strings;

public class AnagramWithOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isAnagram=true;
		String a="cat";
		String b="act";
		int[] al=new int[256];// As there are 256 chars
        for(char c:a.toCharArray()) {
        	int index= (int)c;
        	al[index]++;
        }
        for(char c:b.toCharArray()) {
        	int index=(int)c;
        	al[index]--;
        	
        }
        for(int i=0;i<256;i++) {
        	if(al[i]!=0) {
        		isAnagram=false;
        		break;
        		
        	}
        }
        if(isAnagram) {
        	System.out.println("Anagram");
        }
        else 
        	System.out.println("Not Anagram");
	}

}

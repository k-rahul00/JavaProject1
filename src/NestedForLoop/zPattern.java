package NestedForLoop;

public class zPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r;j++) {
				if(i==1||i==r||j==r-i) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
			
		}

}
}

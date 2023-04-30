package Miscellaneous;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,4,8,1,7,6};
		int temp=0;
		int sizer=a.length;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i]=temp;
				}
		
		
		}
		
			System.out.println(a[sizer-2]);
		

	}

}

package SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		int a[]= {-4,9,6,9,2,3,0,10};
		int n= a.length;
		
		
		for( int i=0; i<=n-1;i++) {
			int minIndex=i;
			for( int j=i;j<n; j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp= a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			
		}
		for(int e:a) {
			System.out.print(e+ " ");
		}

	}

}

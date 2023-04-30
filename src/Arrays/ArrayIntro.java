package Arrays;
import java.util.Scanner;
public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] marks= new int[5];
		int marks[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=9;i++) {
			marks[i]=sc.nextInt();
			
		}
		for(int i=0;i<=9;i++) {
			System.out.print(marks[i]);
		}
		sc.close();

	}

}

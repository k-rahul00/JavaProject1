package Arrays;
import java.util.Scanner;
public class AverageMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfStudents=sc.nextInt();
		int marks[]=new int[noOfStudents];
		for (int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
			
		}
		int averageMark=0;
		for(int i=0;i< marks.length;i++){
			averageMark += marks[i];
			
		}
		averageMark/=marks.length;
		System.out.println(averageMark);
		sc.close();
	}

}

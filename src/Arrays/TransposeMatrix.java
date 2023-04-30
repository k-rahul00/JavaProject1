package Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int len = matrix.length;
		int[][] newMat = new int[len][len];
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				newMat[j][i] = matrix[i][j];
			}
		}
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("Transposed Matrix");
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print(newMat[i][j]);
			}
			System.out.println();
		}

	}

}

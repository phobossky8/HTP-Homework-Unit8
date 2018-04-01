package by.ldy.hw8.ex1;

public class Matrix {
	private int size;
	private int[][] matrix;
	private static int count;
	
	public Matrix(int size) {
		this.size = size;
		this.matrix = new int [size][size];
		count = 0;
	}
	
	public void  printMatrix() {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println(" ");
		}
	}
	
	public void nullMatrix () {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
						
		}
	}
	
	public int matrixLength() {
		int matrLength = matrix.length;
		return matrLength;
		
	}
	
	
	public synchronized void doAction(int number) {
		if (count < matrixLength()) {
			changeMatrtix(count, count, number);
			
			//System.out.println(String.format("%o [%o][%o]", number, count, count));
			
			count++;
		}
	}

	public void changeMatrtix(int i, int j, int value) {
		matrix[i][j] = value;
	}

}

package by.ldy.hw8.ex1;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		Matrix matrixOnly = new Matrix(9);

		matrixOnly.nullMatrix();
		
		Thread th1 = new Thread(new SpecialThread(matrixOnly, 1));
		Thread th2 = new Thread(new SpecialThread(matrixOnly, 2));
		Thread th3 = new Thread(new SpecialThread(matrixOnly, 3));
		
		th1.start();
		th2.start();
		th3.start();
		
		th1.join();
		th2.join();
		th3.join();
		
		matrixOnly.printMatrix();
		
		
	}
}
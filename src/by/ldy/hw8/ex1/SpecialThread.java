package by.ldy.hw8.ex1;

public class SpecialThread implements Runnable {
	private Matrix matrix;
	private int numberOfThread;
	
	public SpecialThread(Matrix matrix, int numberOfThread) {
		this.matrix = matrix;
		this.numberOfThread = numberOfThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < matrix.matrixLength(); i++) {
			matrix.doAction(numberOfThread);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
}

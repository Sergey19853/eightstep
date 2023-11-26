package edu.training.js.task_eight;

public class Example2 {

	public static void main(String[] args) {
		
		int[][] mas=new int[2][3];
	
		ArrayMethods.initArrayWithRandom(mas, 0, 9);
		
		ArrayMethods.printArray("Матрица", mas);

	}

}

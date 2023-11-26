package edu.training.js.task_eight;

public class Example5 {

	public static void main(String[] args) {
		
		int[][] mas = new int[5][5];
		
		ArrayMethods.initArrayWithRandom(mas, 0, 10);

		ArrayMethods.printArray("Матрица 1", mas);
		
		printArrayEven("Матрица 2 с четными строками", mas);
		
	}
	
	public static void printArrayEven(String message, int[][] array) {
		
		System.out.println("--------------" + message + "--------------");
		
		for (int i = 0; i < array.length; i += 2) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d ]", array[i][j]);
			}
			System.out.println();
		}
		
	}
	
}

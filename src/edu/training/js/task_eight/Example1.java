package edu.training.js.task_eight;

import java.util.Random;

public class Example1 {



	public static void main(String[] args) {
		
		int[][] mas = new int[3][4];

		initArray(mas);
		
		ArrayMethods.printArray("Матрица", mas);
			
	}
	
	public static void initArray(int[][] mas) {
		
		int number = 0;
		Boolean unitFound = false;
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			unitFound = false;
			for (int j = 0; j < mas[i].length; j++) {
				number = rand.nextInt(2);

				if (number == 1 & unitFound == false) {
					unitFound = true;
					mas[i][j] = number;
				}else if (j == mas[i].length-1 & unitFound == false) {
					mas[i][j] = 1;
				}else {
					mas[i][j] = 0;
				}
			}
		}
	}

}

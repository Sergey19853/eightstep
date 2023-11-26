package edu.training.js.task_eight;

public class Example7 {

	public static void main(String[] args) {
		
		int[][] mas = new int[5][5];
		
		ArrayMethods.initArrayWithRandom(mas, -50, 50);
		
		ArrayMethods.printArray("Массив", mas);
		
		summa(mas);
		
	}
	
	public static void summa(int[][] mas) {
		
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j <mas[i].length; j++) {
				if(mas[i][j] < 0) {
					sum = sum - mas[i][j];
				}		
			}
		}
		System.out.println("Cумма модулей отрицательных нечетных элементов = " + sum);
	}

}

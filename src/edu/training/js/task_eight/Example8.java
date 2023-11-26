package edu.training.js.task_eight;

public class Example8 {

	public static void main(String[] args) {
		
		int[][] mas = new int[5][5];
		
		ArrayMethods.initArrayWithRandom(mas, 0, 10);
		
		ArrayMethods.printArray("Массив", mas);
		
		counter(mas);
		
	}
	
	public static void counter(int[][]ar) {
		
		int count = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <ar[i].length; j++) {
				if(ar[i][j]==7) {
					count++;
				}	
			}
		}
		System.out.println("Число 7 встречается "+ count +" раз(а)");
	}
}

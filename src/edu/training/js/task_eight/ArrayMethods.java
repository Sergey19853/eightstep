package edu.training.js.task_eight;

import java.util.Random;

public class ArrayMethods {

	public static void initArrayWithRandom(int[][] array, int rangeRandomBegin, int rangeRandomEnd) {
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(rangeRandomBegin,rangeRandomEnd);
			}
		}
		
	}
	
	public static void printArray(String message, int[][] array) {
		
		System.out.println("--------------" + message + "--------------");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d ]", array[i][j]);
			}
			System.out.println();
		}
		
	}
	
}

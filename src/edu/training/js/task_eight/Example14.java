package edu.training.js.task_eight;

public class Example14 {

    public static void main(String[] args) {
    	  
        int[][] mas = new int[6][6];

        initArray(mas);

        ArrayMethods.printArray("Квадратная матрица", mas);

    }

    public static void initArray(int[][] mas) {
    	
    	int count = 1;
    	
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
            	if (j == mas[i].length - count) {
                    mas[i][mas[i].length - count] = count;
            	}
            }
            count++;
        }
        
    }

}

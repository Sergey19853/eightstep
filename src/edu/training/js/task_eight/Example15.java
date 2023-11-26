package edu.training.js.task_eight;

public class Example15 {
	
    public static void main(String[] args) {
  	  
        int[][] mas = new int[8][8];

        initArray(mas);

        ArrayMethods.printArray("Квадратная матрица", mas);

    }

    public static void initArray(int[][] mas) {
    	
    	int count = 0;
    	
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
            	if (j == count) {
                    mas[i][count] = mas[i].length - count;
            	}
            }
            count++;
        }
        
    }

}

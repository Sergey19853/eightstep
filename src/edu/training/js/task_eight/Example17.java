package edu.training.js.task_eight;

public class Example17 {
	
    public static void main(String[] args) {
  	  
        int[][] mas = new int[9][9];

        initArray(mas);

        ArrayMethods.printArray("Квадратная матрица", mas);

    }

    public static void initArray(int[][] mas) {
    	  	
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
            	if (j == 0) {
                    mas[i][j] = 1;
            	}else if(j == mas[i].length - 1) {
            		mas[i][j] = 1;
            	}else if (i == 0 | i == mas[i].length - 1) {
            		mas[i][j] = 1;
            	}
            }
        }
        
    }

}

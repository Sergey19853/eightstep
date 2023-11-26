package edu.training.js.task_eight;

public class Example16 {
	
    public static void main(String[] args) {
    	  
        int[][] mas = new int[10][10];

        initArray(mas);

        ArrayMethods.printArray("Квадратная матрица", mas);

    }

    public static void initArray(int[][] mas) {
    	
    	int count = 0;
    	int n = 1;
    	
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
            	if (j == count) {
                    mas[i][count] = n * (n + 1);
                    n++;
            	}
            }
            count++;
        }
        
    }

}

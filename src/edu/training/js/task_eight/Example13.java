package edu.training.js.task_eight;

public class Example13 {

    public static void main(String[] args) {
  
        int[][] mas = new int[6][6];

        initArray(mas);

        ArrayMethods.printArray("Квадратная матрица", mas);

    }

    public static void initArray(int[][] mas) {
    	
        for (int i = 0; i < mas.length; i += 2) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = j + 1;
                mas[i + 1][j] = mas[i].length - j;
            }
        }
        
    }

}

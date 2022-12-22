package ru.mirea.lab41.p4;

// 4. Создать класс Матрица.

//      Класс должен иметь следующие поля:
// 1) двумерный массив вещественных чисел;
// 2) количество строк и столбцов в матрице.

//      Класс должен иметь следующие методы:
// 1) сложение с другой матрицей;
// 2) умножение на число;
// 3) вывод;


import java.util.Random;

public class Matrix {
    private int[][] matrix;
    private int rows, cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void addition(Matrix secondMatrix) {
        if (this.rows == secondMatrix.rows && this.cols == secondMatrix.cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] += secondMatrix.matrix[i][j];
                }
            }
        }
    }

    public void multBy(int x){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= x;
            }
        }
    }

    public void display() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final int ROWS = 4, COLS = 5;

        Matrix matrix1 = new Matrix(ROWS,COLS);
        Matrix matrix2 = new Matrix(ROWS,COLS);

        Random rand = new Random();

        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++)
                matrix1.matrix[i][j] = rand.nextInt(9) + 1;

        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++)
                matrix2.matrix[i][j] = rand.nextInt(9) + 1;

        System.out.println("matrix 1:");
        matrix1.display();

        System.out.println("\nmatrix 2:");
        matrix2.display();

        System.out.println("\nсложение:");
        matrix1.addition(matrix2);
        matrix1.display();

        System.out.println("\nумножение 2-ой матрицы на число 5");
        matrix2.multBy(5);
        matrix2.display();
    }
}

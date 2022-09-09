package task2.MatrixTask;

/*
Дана матрица A[n][n]. Определить количество столбцов,
в которых содержатся положительные элементы, но не содержатся нулевые элементы.
Отсортировать побочную диагональ матрицы по убыванию.
*/

import static task2.ArrayTask.Runner.createRandomArray;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    do {
      n = scanner.nextInt();
    } while(n < 0);
    int[][] matrix = new int[n][];
    for (int i = 0; i < matrix.length; i++) {
      matrix[i] = createRandomArray(n);
    }
    System.out.println("matrix");
    for (var temp: matrix){
      System.out.println(Arrays.toString(temp));
    }
    System.out.println("number of positive columns = " + numberOfPositiveColums(matrix));
    System.out.println("sort matrix");
    for (var temp: sortDiag(matrix)){
      System.out.println(Arrays.toString(temp));
    }
    for (int i = 0; i < matrix.length; i++) {
      matrix[i] = createRandomArray(n);
    }
    System.out.println("matrix2");
    for (var temp: matrix){
      System.out.println(Arrays.toString(temp));
    }
    int[] digArray = diagOut(matrix);
    System.out.println("diag array");
    System.out.println(Arrays.toString(digArray));
    Arrays.sort(digArray);
    System.out.println("sort diag array");
    System.out.println(Arrays.toString(digArray));
    diagPut(matrix,digArray);
    System.out.println("sort matrix with sort()");
    for (var temp: matrix){
      System.out.println(Arrays.toString(temp));
    }
  }

  public static int numberOfPositiveColums(int[][] matrix) {
    int number = 0;
    for (int i = 0; i < matrix.length; i++) {
      int k = 0;
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[j][i] > 0){
          k++;
        }
        if(matrix[j][i] == 0){
          k--;
        }
      }
      if(k == matrix.length){
        number++;
      }
    }
    return number;
  }

  public static int[][] sortDiag(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[matrix.length - i - 1][i] < matrix[matrix.length - j - 1][j]){
          int temp = matrix[matrix.length - i - 1][i];
          matrix[matrix.length - i - 1][i] = matrix[matrix.length - j - 1][j];
          matrix[matrix.length - j - 1][j] = temp;
        }
      }
    }
    return matrix;
  }

  public static int[] diagOut(int[][] matrix) {
    int[] diagArray = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      diagArray[i] = matrix[matrix.length - i - 1][i];
    }
    return diagArray;
  }

  public static void diagPut(int[][] matrix, int[] diagArray) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[matrix.length - i - 1][i] = diagArray[i];
    }
  }

}

package task2.ArrayTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
Дан массив A[n]. Подсчитать количество тех
элементов массива, чей знак не совпадает со
знаком предыдущего элемента (считать, что число 0 не имеет знака).
 */

public class Runner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    do {
      n = scanner.nextInt();
    } while(n < 0);
    int[] array = createRandomArray(n);
    System.out.println(Arrays.toString(array));
    System.out.println(numberOfTrue(array));
  }

  public static int[] createRandomArray(int n) {
    return IntStream.generate(() -> new Random().nextInt(100) - 50).limit(n).toArray();
  }

  public static int numberOfTrue(int[] array) {
    int number = 0;
    for (int i = 1; i < array.length; i++) {
      if(array[i] == 0){
        if(array[i - 1] != 0){
          number++;
        }
      } else {
        if(array[i - 1] * array[i] < 0){
          number++;
        }
      }
    }
    return number;
  }
}

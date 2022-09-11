package task8.ArrayThread;

import static task2.ArrayTask.Runner.numberOfTrue;

import java.util.Arrays;
import java.util.Random;

public class MyThread2 implements Runnable{
  private int arraySize;

  public MyThread2(int arraySize) {
    this.arraySize = arraySize;
  }

  @Override
  public void run() {
    System.out.println("Поток 2 начал выполнение");
    int[] array = new int[arraySize];
    Random random = new Random();
    for (int i = 0; i < arraySize; i++) {
      array[i] = random.nextInt(100);
    }
    System.out.println(Arrays.toString(array));
    System.out.println(numberOfTrue(array));
    System.out.println("Поток 2 закончил выполнение");
  }
}

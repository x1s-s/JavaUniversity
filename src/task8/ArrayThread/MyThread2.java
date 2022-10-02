package task8.ArrayThread;

import static task2.ArrayTask.Runner.createRandomArray;
import static task2.ArrayTask.Runner.numberOfTrue;

import java.util.Arrays;

public class MyThread2 implements Runnable{
  private final int arraySize;

  public MyThread2(int arraySize) {
    this.arraySize = arraySize;
  }

  @Override
  public void run() {
    System.out.println("Поток 2 начал выполнение");
    int[] array = createRandomArray(arraySize);
    System.out.println(Arrays.toString(array));
    System.out.println(numberOfTrue(array));
    System.out.println("Поток 2 закончил выполнение");
  }
}

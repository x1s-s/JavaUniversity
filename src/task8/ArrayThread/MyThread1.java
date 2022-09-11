package task8.ArrayThread;

import java.util.Arrays;
import java.util.Random;
import static task2.ArrayTask.Runner.numberOfTrue;
import static task2.ArrayTask.Runner.createRandomArray;

public class MyThread1 implements Runnable{
  private int arraySize;
  private Thread threadProc2;
  private Thread threadProc3;

  public MyThread1(int arraySize, Thread threadProc2, Thread threadProc3) {
    this.arraySize = arraySize;
    this.threadProc2 = threadProc2;
    this.threadProc3 = threadProc3;
  }

  @Override
  public void run() {
    System.out.println("Поток 1 начал выполнение");
    int[] array = createRandomArray(arraySize);
    System.out.println(Arrays.toString(array));
    System.out.println(numberOfTrue(array));
    System.out.println("Поток 1 закончил выполнение");
    threadProc2.start();
    threadProc3.start();
  }
}

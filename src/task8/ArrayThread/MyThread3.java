package task8.ArrayThread;

import static task2.ArrayTask.Runner.numberOfTrue;

import java.util.Arrays;
import java.util.Random;

public class MyThread3 implements Runnable{
  private int arraySize;
  private Thread threadProc2;

  public MyThread3(int arraySize, Thread threadProc2) {
    this.arraySize = arraySize;
    this.threadProc2 = threadProc2;
  }

  @Override
  public void run() {
    try{
      threadProc2.join();
    } catch (Exception exception){
      System.out.println(threadProc2.getName() + "is interrupted");
    }
    System.out.println("Поток 3 начал выполнение");
    int[] array = new int[arraySize];
    Random random = new Random();
    for (int i = 0; i < arraySize; i++) {
      array[i] = random.nextInt(100);
    }
    System.out.println(Arrays.toString(array));
    System.out.println(numberOfTrue(array));
    System.out.println("Поток 3 закончил выполнение");
  }
}

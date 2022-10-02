package task8.myImplimentation;

import java.util.Arrays;

import static task2.ArrayTask.Runner.createRandomArray;
import static task2.ArrayTask.Runner.numberOfTrue;

public abstract class MyRunnable implements Runnable{
    private final int size;

    public MyRunnable(int number) {
        this.size = number;
    }
    public void task() {
        int[] array = createRandomArray(size);
        System.out.println(Arrays.toString(array));
        System.out.println(numberOfTrue(array));
    }
}

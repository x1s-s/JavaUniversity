package task8.myImplimentation;

import lombok.AllArgsConstructor;

import java.util.Arrays;

import static task2.ArrayTask.Runner.createRandomArray;
import static task2.ArrayTask.Runner.numberOfTrue;
@AllArgsConstructor
public class MyRunnable implements Runnable {
    private final int size;
    private final int threadNumber;
    @Override
    public void run() {
        System.out.println("Поток " + threadNumber + " начал выполнение");
        int[] array = createRandomArray(size);
        System.out.println(Arrays.toString(array));
        System.out.println(numberOfTrue(array));
        System.out.println("Поток " + threadNumber + " закончил выполнение");
    }
}

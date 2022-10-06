package task8.parralel;

import java.util.Arrays;

import static task2.ArrayTask.Runner.createRandomArray;

public class Runner {
    public final static int SIZE = 41;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Главный поток начал выполнение");
        long time = System.nanoTime();
        new MyRunnable(createRandomArray(SIZE), "file1.txt").run();
        new MyRunnable(createRandomArray(SIZE), "file2.txt").run();
        new MyRunnable(createRandomArray(SIZE), "file3.txt").run();
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
        Thread thread1 = new Thread(new MyRunnable(createRandomArray(SIZE), "file1.txt"));
        Thread thread2 = new Thread(new MyRunnable(createRandomArray(SIZE), "file2.txt"));
        Thread thread3 = new Thread(new MyRunnable(createRandomArray(SIZE), "file3.txt"));
        time = System.nanoTime();
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
        System.out.println("Главный поток закончил выполнение");
    }
}


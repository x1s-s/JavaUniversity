package task8.parralel;

import java.util.Arrays;

import static task2.ArrayTask.Runner.createRandomArray;

public class Runner {
    public final static int SIZE = 41;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Главный поток начал выполнение");
        long time = System.nanoTime();
        new MyRunnable(createRandomArray(SIZE),createRandomArray(SIZE), createRandomArray(SIZE), "file1.txt").run();
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
        Thread thread1 = new Thread(new MyRunnable(createRandomArray(SIZE),createRandomArray(SIZE), createRandomArray(SIZE), "file1.txt"));
        time = System.nanoTime();
        Thread[] threads = new Thread[50];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyRunnable(createRandomArray(SIZE),createRandomArray(SIZE), createRandomArray(SIZE), "file" + i + ".txt"), "file" + i + ".txt");
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
        System.out.println("Главный поток закончил выполнение");
    }
}


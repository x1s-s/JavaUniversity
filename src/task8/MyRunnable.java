package task8;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyRunnable implements Runnable {
    private final int threadNumber;

    @Override
    public void run() {
        System.out.println("Поток " + threadNumber + " начал выполнение");
        try {
            Thread.sleep(threadNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + threadNumber + " закончил выполнение");
    }
}

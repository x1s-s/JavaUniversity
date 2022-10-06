package task8;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable(500));
        Thread thread2 = new Thread(new MyRunnable(2000));
        Thread thread3 = new Thread(new MyRunnable(1000));
        System.out.println("Главный поток начал выполнение");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println("Главный поток закончил выполнение");
    }
}

package task8.myImplimentation;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Главный поток начал выполнение");
        Thread thread1 = new Thread(new MyRunnable(100, 1));
        Thread thread2 = new Thread(new MyRunnable(300, 2));
        Thread thread3 = new Thread(new MyRunnable(150, 3));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println("Главный поток закончил выполнение");
    }
}


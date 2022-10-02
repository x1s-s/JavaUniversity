package task8.myImplimentation;

public class Runner {
    public static Thread thread1;
    public static Thread thread2;
    public static Thread thread3;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Главный поток начал выполнение");
        thread1 = new Thread(new MyRunnable(10) {
            @Override
            public void run() {
                System.out.println("Поток 1 начал выполнение");
                task();
                System.out.println("Поток 1 закончил выполнение");
                thread2.start();
                thread3.start();
            }
        });
        thread2 = new Thread(new MyRunnable(10) {
            @Override
            public void run(){
                System.out.println("Поток 2 начал выполнение");
                task();
                System.out.println("Поток 2 закончил выполнение");
            }
        });
        thread3 = new Thread(new MyRunnable(10) {
            @Override
            public void run(){
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Поток 3 начал выполнение");
                task();
                System.out.println("Поток 3 закончил выполнение");
            }
        });
        thread1.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Главный поток закончил выполнение");
    }
}


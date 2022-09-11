package task8.ArrayThread;

public class Runner {
  public static void main(String[] args) {
    System.out.println("Главный поток начал выполнение");
    MyThread2 myThread2 = new MyThread2(20);
    Thread thread2 = new Thread(myThread2);
    MyThread3 myThread3 = new MyThread3(13,thread2);
    Thread thread3 = new Thread(myThread3);
    MyThread1 myThread1 = new MyThread1(5,thread2,thread3);
    Thread thread1 = new Thread(myThread1);
    thread1.start();
    try{
      thread1.join();
    } catch (Exception exception){
      System.out.println(thread1.getName() + "is interrupted");
    }
    try{
      thread2.join();
    } catch (Exception exception){
      System.out.println(thread2.getName() + "is interrupted");
    }
    try{
      thread3.join();
    } catch (Exception exception){
      System.out.println(thread3.getName() + "is interrupted");
    }
    System.out.println("Главный поток закончил выполнение");
  }
}

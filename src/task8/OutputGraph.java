package task8;

public class OutputGraph {



  public static void main(String[] args) throws InterruptedException {
    System.out.println("Главный поток начал выполнение");

    Thread threadProc2 = new Thread(() -> {
      System.out.println("Поток 2 начал выполнение");
      System.out.println("Поток 2 закончил выполнение");
    });
    Thread threadProc3 = new Thread(() -> {
      try{
        threadProc2.join();
      } catch (Exception exception){
        System.out.println(threadProc2.getName() + "is interrupted");
      }
      System.out.println("Поток 3 начал выполнение");
      System.out.println("Поток 3 закончил выполнение");
    });
    Thread threadProc1 = new Thread(() ->{
      System.out.println("Поток 1 начал выполнение");
      System.out.println("Поток 1 закончил выполнение");
      threadProc2.start();
      threadProc3.start();
    });
    threadProc1.start();
    threadProc1.join();
    threadProc2.join();
    threadProc3.join();
    System.out.println("Главный поток закончил выполнение");
  }
}

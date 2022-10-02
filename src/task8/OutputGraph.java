package task8;

public class OutputGraph {



  public static void main(String[] args) {
    System.out.println("Главный поток начал выполнение");
    Runnable proc2 = () ->{
      System.out.println("Поток 2 начал выполнение");
      System.out.println("Поток 2 закончил выполнение");
    };
    Thread threadProc2 = new Thread(proc2);
    Runnable proc3 = () ->{
      try{
        threadProc2.join();
      } catch (Exception exception){
        System.out.println(threadProc2.getName() + "is interrupted");
      }
      System.out.println("Поток 3 начал выполнение");
      System.out.println("Поток 3 закончил выполнение");
    };
    Thread threadProc3 = new Thread(proc3);
    Runnable proc1 = () ->{
      System.out.println("Поток 1 начал выполнение");
      System.out.println("Поток 1 закончил выполнение");
      threadProc2.start();
      threadProc3.start();
    };
    Thread threadProc1 = new Thread(proc1);
    threadProc1.start();
    try{
      threadProc1.join();
    } catch (Exception exception){
      System.out.println(threadProc1.getName() + "is interrupted");
    }
    try{
      threadProc2.join();
    } catch (Exception exception){
      System.out.println(threadProc2.getName() + "is interrupted");
    }
    try{
      threadProc3.join();
    } catch (Exception exception){
      System.out.println(threadProc3.getName() + "is interrupted");
    }
    System.out.println("Главный поток закончил выполнение");
  }
}

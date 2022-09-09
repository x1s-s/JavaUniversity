package task3.progressed;

import java.util.Scanner;

public class Reader extends Man implements Interface{


  public Reader(String FIO, String phoneNumber, String address) {
    super(FIO,address,phoneNumber);
  }


  @Override
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    setFIO(scanner.nextLine());
    setPhoneNumber(scanner.nextLine());
    setAddress(scanner.nextLine());
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
  }

  @Override
  public void voice() {
    System.out.println("Hello");
  }

  @Override
  public String toString() {
    return "Reader{" +
        super.toString() +
        '}';
  }
}

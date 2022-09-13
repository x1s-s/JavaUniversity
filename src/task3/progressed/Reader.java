package task3.progressed;

import java.util.Scanner;

public class Reader extends Man implements InputOutput {


  public Reader(String FIO, String phoneNumber, String address) {
    super(FIO,address,phoneNumber);
  }


  @Override
  public void fill(Scanner scanner){
    super.fill(scanner);
  }

  @Override
  public void output(){
    System.out.println(this);
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

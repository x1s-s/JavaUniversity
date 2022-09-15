package task6.first;

import java.util.Scanner;

public class Reader extends Man {

  public Reader(){
    super();
  }

  public Reader(Scanner scanner){
    this.fill(scanner);
  }

  public Reader(String FIO, String phoneNumber, String address) {
    super(FIO,address,phoneNumber);
  }


  //@Override
  //public void fill(Scanner scanner){
  //  super.fill(scanner);
  //}

  //@Override
  //public void output(){
  //  System.out.println(this);
  //}

  @Override
  public void voice() {
    System.out.println("Hello");
  }


  @Override
  public String toString() {
    return "Reader{" +
        "FIO:" + super.getFIO() +
        "Phone number:" + super.getPhoneNumber() +
        "Address:" + super.getAddress() +
        '}';
  }
}

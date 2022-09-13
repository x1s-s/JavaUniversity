package task3.create;

import java.util.Scanner;

public class Reader {
  private String FIO;
  private String phoneNumber;
  private String address;

  public Reader(String FIO, String phoneNumber, String address) {
    this.FIO = FIO;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  public String getFIO() {
    return FIO;
  }

  public void setFIO(String FIO) {
    this.FIO = FIO;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void output(){
    System.out.println(this);
  }

  public void fill(Scanner scanner){
    FIO = scanner.nextLine();
    phoneNumber = scanner.nextLine();
    address = scanner.nextLine();
  }

  @Override
  public String toString() {
    return "Reader{" +
        "FIO='" + FIO + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

package task3.progressed;

import java.util.Scanner;

public abstract class Man implements InputOutput {
  private String FIO;
  private String address;
  private String phoneNumber;

  public Man(String FIO, String address, String phoneNumber) {
    this.FIO = FIO;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getFIO() {
    return FIO;
  }

  public void setFIO(String FIO) {
    this.FIO = FIO;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public abstract void voice();

  @Override
  public void fill(Scanner scanner) {
    FIO = scanner.nextLine();
    address = scanner.nextLine();
    phoneNumber = scanner.nextLine();
  }

  @Override
  public void output() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Man{" +
        "FIO='" + FIO + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}

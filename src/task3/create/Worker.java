package task3.create;

import java.util.Scanner;

public class Worker {
  private ReaderHall readerHall;
  private Position position;
  private String FIO;
  private String Address;
  private String phoneNumber;

  public Worker(ReaderHall readerHall, Position position, String FIO, String address,
      String phoneNumber) {
    this.readerHall = readerHall;
    this.position = position;
    this.FIO = FIO;
    Address = address;
    this.phoneNumber = phoneNumber;
  }

  public ReaderHall getReaderHall() {
    return readerHall;
  }

  public void setReaderHall(ReaderHall readerHall) {
    this.readerHall = readerHall;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public String getFIO() {
    return FIO;
  }

  public void setFIO(String FIO) {
    this.FIO = FIO;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void fill(){
    Scanner scanner = new Scanner(System.in);
    readerHall.fill();
    position.fill();
    FIO = scanner.nextLine();
    Address = scanner.nextLine();
    phoneNumber = scanner.nextLine();
  }

  @Override
  public String toString() {
    return "Worker{" +
        "readerHall=" + readerHall +
        ", position=" + position +
        ", FIO='" + FIO + '\'' +
        ", Address='" + Address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}

package task3.create;

import java.util.Scanner;

public class PublishingHouse {
  private String name;
  private String address;

  public PublishingHouse(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    name = scanner.nextLine();
    address = scanner.nextLine();
  }

  @Override
  public String toString() {
    return "PublishingHouse{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

package task3.progressed;

import java.util.Scanner;

public class PublishingHouse implements InputOutput {
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

  @Override
  public void fill(Scanner scanner){
    System.out.println("Name = ");
    name = scanner.nextLine();
    System.out.println("Address = ");
    address = scanner.nextLine();
  }

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "PublishingHouse{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

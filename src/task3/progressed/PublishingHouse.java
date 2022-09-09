package task3.progressed;

import java.util.Scanner;

public class PublishingHouse implements Interface{
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
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
    address = scanner.nextLine();
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
  }

  @Override
  public String toString() {
    return "PublishingHouse{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

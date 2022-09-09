package task3.progressed;

import java.util.Scanner;

public class Genre implements Interface{
  private String name;

  public Genre(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
  }

  @Override
  public String toString() {
    return "Genre{" +
        "name='" + name + '\'' +
        '}';
  }
}

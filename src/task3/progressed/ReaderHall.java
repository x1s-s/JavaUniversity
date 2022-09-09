package task3.progressed;

import java.util.Scanner;

public class ReaderHall implements Interface{
  private String name;
  private String theme;
  private int numberOfPlace;

  public ReaderHall(String name, String theme, int numberOfPlace) {
    this.name = name;
    this.theme = theme;
    this.numberOfPlace = numberOfPlace;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public int getNumberOfPlace() {
    return numberOfPlace;
  }

  public void setNumberOfPlace(int numberOfPlace) {
    this.numberOfPlace = numberOfPlace;
  }

  @Override
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
    theme = scanner.nextLine();
    numberOfPlace = scanner.nextInt();
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
  }

  @Override
  public String toString() {
    return "ReaderHall{" +
        "name='" + name + '\'' +
        ", theme='" + theme + '\'' +
        ", numberOfPlace=" + numberOfPlace +
        '}';
  }
}

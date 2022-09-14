package task6.first;

import java.util.Scanner;

public class ReaderHall implements InputOutput {
  private String name;
  private String theme;
  private int numberOfPlace;

  public ReaderHall(){
    this.name = "";
    this.theme = "";
    this.numberOfPlace = 0;
  }

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
  public void fill(Scanner scanner){
    System.out.println("Name = ");
    name = scanner.nextLine();
    System.out.println("Theme = ");
    theme = scanner.nextLine();
    System.out.println("Number of place = ");
    numberOfPlace = scanner.nextInt();
  }

  @Override
  public void output(){
    System.out.println(this);
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

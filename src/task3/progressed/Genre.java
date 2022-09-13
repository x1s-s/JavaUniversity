package task3.progressed;

import java.util.Scanner;

public class Genre implements InputOutput {
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
  public void fill(Scanner scanner){
    name = scanner.nextLine();
  }

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Genre{" +
        "name='" + name + '\'' +
        '}';
  }
}

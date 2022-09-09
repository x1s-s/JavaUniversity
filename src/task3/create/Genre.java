package task3.create;

import java.util.Scanner;

public class Genre {
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

  public void fill(){
    Scanner scanner = new Scanner(System.in);

  }

  @Override
  public String toString() {
    return "Genre{" +
        "name='" + name + '\'' +
        '}';
  }
}

package task3.create;

import java.util.Scanner;

public class Position {
  private String name;
  private int salary;

  public Position(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void fill(){
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
    salary = scanner.nextInt();
  }

  @Override
  public String toString() {
    return "Position{" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        '}';
  }
}

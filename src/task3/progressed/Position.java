package task3.progressed;

import java.util.Scanner;

public enum Position{
  DIRECTOR(100),
  CHIEFLIBERIAN(75),
  LIBERIAN(50);

  private final int salary;

  Position(int salary){
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Position{" +
        this.name() +
        ", salary=" + salary +
        '}';
  }
}

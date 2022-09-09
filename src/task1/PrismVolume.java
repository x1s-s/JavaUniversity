package task1;

import java.util.Scanner;

public class PrismVolume {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("a = ");
    double a = scanner.nextDouble();
    System.out.print("h = ");
    double h = scanner.nextDouble();
    System.out.println(h * Math.pow(a,2) * Math.sqrt(3) / 4 + " cm ^ 3");
  }
}

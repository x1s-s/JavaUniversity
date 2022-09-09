package task5;

import java.util.Scanner;

public class PrismVolume {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("a(cm) = ");
    double a = scanner.nextDouble();
    System.out.print("h(cm) = ");
    double h = scanner.nextDouble();
    try {
      System.out.println(prismVolume(a,h) + "cm ^ 3");
    } catch (Exception exception){
      System.out.println(exception.getMessage());
    }
  }

  public static double prismVolume(double a,double h){
    if(a < 0){
      throw new IllegalArgumentException("Illegal Argument Exception (a < 0)");
    }
    if(h < 0){
      throw  new IllegalArgumentException("Illegal Argument Exception (h < 0)");
    }
    return h * Math.pow(a,2) * Math.sqrt(3) / 4;
  }
}

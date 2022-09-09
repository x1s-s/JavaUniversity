package task5;

import java.io.IOException;
import java.util.Scanner;

public class PiecesInitialFunc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("[a;b] = ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    System.out.print("u = ");
    double u = scanner.nextDouble();
    System.out.print("x = ");
    double x = scanner.nextDouble();
    try{
      System.out.println(function(a,b,u,x));
    } catch (Exception exception){
      System.out.println(exception.getMessage());
    }

  }

  public static double function(double a, double b, double u, double x){
    if(x < a){
      if(x <= 0){
        throw new IllegalArgumentException("Illegal Argument Exception (x < 0)");
      }
      return Math.cos(x + Math.log(x) + Math.pow(Math.E,x));
    } else if(x > a && x < b) {
      if(x - 10 * u == 0){
       throw new IllegalArgumentException("Illegal Argument Exception (x - 10 * u == 0)");
      }
      return Math.pow(Math.E,-x) / (x - 10 * u);
    } else {
      if(- u * x + 5 <= 0){
        throw new IllegalArgumentException("Illegal Argument Exception (-ux + 5 <= 0)");
      }
      return Math.log(- u * x + 5);
    }
  }
}
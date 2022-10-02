package task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PiecesInitialFunc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = -1;
    double b = 0;
    do{
      System.out.println("[a, b] = ");

      try {
        a = scanner.nextDouble();
        b = scanner.nextDouble();
      } catch (Exception exception){
        exception.printStackTrace();
        scanner.nextLine();
      }
    }while (a > b);

    System.out.print("u = ");
    double u = scanner.nextDouble();
    double x;
    while(true){
      try{
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.println(function(a,b,u,x));
      } catch (InputMismatchException e){
        e.printStackTrace();
        break;
      } catch (Exception e){
        e.printStackTrace();
      }

    }
  }

  public static double function(double a, double b, double u, double x) throws ArithmeticException{
    if(x < a){
      if(x <= 0){
        throw new ArithmeticException("Arithmetic Exception in func 1 (x < 0)");
      }
      return Math.cos(x + Math.log(x)) + Math.pow(Math.E,x);
    } else if(x >= a && x <= b) {
      if(x - 10 * u == 0){
       throw new ArithmeticException("ArithmeticException in func 2 (x - 10 * u == 0)");
      }
      return Math.pow(Math.E,-x) / (x - 10 * u);
    } else {
      if(- u * x + 5 <= 0){
        throw new ArithmeticException("Arithmetic Exception in func 3 (-ux + 5 <= 0)");
      }
      return Math.log(- u * x + 5);
    }
  }
}

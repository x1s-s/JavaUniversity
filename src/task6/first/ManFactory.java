package task6.first;

import java.util.Scanner;

public class ManFactory {
  private static enum ManKind{
    READER, WORKER;
  }
  public static Man getFromFactory(Scanner scanner){

    switch (ManKind.valueOf(scanner.nextLine())){
      case READER -> {
        return new Reader(scanner);
      }
      case WORKER -> {
        return new Worker(scanner);
      }
      default -> throw new IllegalArgumentException();
    }
  }

}

package task6.first;

import java.util.Scanner;

public class Worker extends Man {
  private ReaderHall readerHall;
  private Position position;

  public Worker(){
    super();
    readerHall = new ReaderHall();
    position = Position.LIBERIAN;
  }

  public Worker(Scanner scanner){
    this.fill(scanner);
  }

  public Worker(ReaderHall readerHall, Position position, String FIO, String address,
      String phoneNumber) {
    super(FIO,address,phoneNumber);
    this.readerHall = readerHall;
    this.position = position;
  }

  public ReaderHall getReaderHall() {
    return readerHall;
  }

  public void setReaderHall(ReaderHall readerHall) {
    this.readerHall = readerHall;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  @Override
  public void fill(Scanner scanner){
    System.out.println("Man = ");
    super.fill(scanner);
    System.out.println("Position (DIRECTOR, CHIEFLIBERIAN, LIBERIAN) = ");
    position = Position.valueOf(scanner.nextLine());
    System.out.println("Reader hall = ");
    readerHall.fill(scanner);
  }

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public void voice() {
    System.out.println("Welcome to the library!");
  }

  @Override
  public String toString() {
    return "Worker{" +
        "readerHall=" + readerHall +
        ", position=" + position +
        super.toString() +
        '}';
  }
}

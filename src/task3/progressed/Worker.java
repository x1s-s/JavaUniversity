package task3.progressed;

import java.util.Scanner;

public class Worker extends Man implements InputOutput {
  private ReaderHall readerHall;
  private Position position;


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
    super.fill(scanner);
    readerHall.fill(scanner);
    switch (scanner.nextInt()){
      case 1 -> position = Position.DIRECTOR;
      case 2 -> position = Position.CHIEFLIBERIAN;
      case 3 -> position = Position.LIBERIAN;
    }
  }

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public void voice() {
    System.out.println("Welcome");
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

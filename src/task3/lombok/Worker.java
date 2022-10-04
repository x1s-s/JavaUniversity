package task3.lombok;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Worker extends Man implements InputOutput {
  private ReaderHall readerHall;
  private Position position;


  public Worker(ReaderHall readerHall, Position position, String FIO, String address,
                String phoneNumber) {
    super(FIO,address,phoneNumber);
    this.readerHall = readerHall;
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
    System.out.println("Welcome");
  }

}

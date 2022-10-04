package task3.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Scanner;
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public abstract class Man implements InputOutput {
  private String FIO;
  private String address;
  private String phoneNumber;
  public abstract void voice();

  @Override
  public void fill(Scanner scanner) {
    System.out.println("FIO = ");
    FIO = scanner.nextLine();
    System.out.println("Address = ");
    address = scanner.nextLine();
    System.out.println("Phone number = ");
    phoneNumber = scanner.nextLine();
  }

  @Override
  public void output() {
    System.out.println(this);
  }
}

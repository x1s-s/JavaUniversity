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
public class PublishingHouse implements InputOutput {
  private String name;
  private String address;

  @Override
  public void fill(Scanner scanner){
    System.out.println("Name = ");
    name = scanner.nextLine();
    System.out.println("Address = ");
    address = scanner.nextLine();
  }

  @Override
  public void output(){
    System.out.println(this);
  }
}

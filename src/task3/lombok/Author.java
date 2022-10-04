package task3.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Scanner;


@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Author implements InputOutput {
  String FIO;
  Date birthDate;
  String country;

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public void fill(Scanner scanner){
    if(scanner.hasNextLine()){
      scanner.nextLine();
    }
    System.out.println("FIO = ");
    FIO = scanner.nextLine();
    System.out.println("Birthday = ");
    birthDate = new Date(scanner.nextInt());
    if(scanner.hasNextLine()){
      scanner.nextLine();
    }
    System.out.println("Country =");
    country = scanner.nextLine();
  }
}

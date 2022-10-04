package task3.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Scanner;
@Data
@AllArgsConstructor
@ToString
public class ReaderHall implements InputOutput {
  private String name;
  private Genre genre;
  private int numberOfPlace;

  @Override
  public void fill(Scanner scanner){
    System.out.println("Name =");
    name = scanner.nextLine();
    System.out.println("Genre (FANTASY, SCIENCE_FICTION, DYSTOPIAN, MYSTERY, HORROR)  = ");
    genre = Genre.valueOf(scanner.nextLine());
    System.out.println("Number of places = ");
    numberOfPlace = scanner.nextInt();
  }

  @Override
  public void output(){
    System.out.println(this);
  }

}

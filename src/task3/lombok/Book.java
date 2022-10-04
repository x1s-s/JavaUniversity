package task3.lombok;

import lombok.*;

import java.util.Date;
import java.util.Scanner;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Book implements InputOutput {
  private Author author;
  private Genre genre;
  private PublishingHouse publishingHouse;
  private String name;
  private Date creationDate;

  public Book(Scanner scanner){
    this();
    this.fill(scanner);
  }

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public void fill(Scanner scanner){
    System.out.println("Author = ");
    author.fill(scanner);
    System.out.println("Publishing house = ");
    publishingHouse.fill(scanner);
    System.out.println("Genre (FANTASY, SCIENCE_FICTION, DYSTOPIAN, MYSTERY, HORROR)  = ");
    genre = Genre.valueOf(scanner.nextLine());
    System.out.println("Name = ");
    name = scanner.nextLine();
    System.out.println("Creation day =");
    creationDate = new Date(scanner.nextInt());
  }

}

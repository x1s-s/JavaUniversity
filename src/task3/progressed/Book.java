package task3.progressed;

import java.util.Date;
import java.util.Scanner;

public class Book implements InputOutput {
  private Author author;
  private Genre genre;
  private PublishingHouse publishingHouse;
  private String name;
  private Date creationDate;

  public Book(Author author, Genre genre, PublishingHouse publishingHouse, String name,
      Date creationDate) {
    this.author = author;
    this.genre = genre;
    this.publishingHouse = publishingHouse;
    this.name = name;
    this.creationDate = creationDate;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public PublishingHouse getPublishingHouse() {
    return publishingHouse;
  }

  public void setPublishingHouse(PublishingHouse publishingHouse) {
    this.publishingHouse = publishingHouse;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
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

  @Override
  public String toString() {
    return "Book{" +
        "author=" + author +
        ", genre=" + genre +
        ", publishingHouse=" + publishingHouse +
        ", name='" + name + '\'' +
        ", creationDate=" + creationDate +
        '}';
  }
}

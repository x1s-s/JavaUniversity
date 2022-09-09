package task3.progressed;

import java.util.Date;
import java.util.Scanner;

public class Book implements Interface{
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
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    author.fill();
    publishingHouse.fill();
    genre.fill();
    name = scanner.nextLine();
    creationDate = new Date(scanner.nextInt());
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
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

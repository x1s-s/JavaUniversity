package task3.create;

import java.util.Date;
import java.util.Scanner;

public class Book {
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

  public void output(){
    System.out.println(this);
  }

  public void fill(Scanner scanner){
    author.fill(scanner);
    publishingHouse.fill(scanner);
    genre.fill(scanner);
    name = scanner.nextLine();
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

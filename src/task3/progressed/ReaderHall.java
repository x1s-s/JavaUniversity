package task3.progressed;

import java.util.Scanner;

public class ReaderHall implements InputOutput {
  private String name;
  private Genre genre;
  private int numberOfPlace;

  public ReaderHall(String name, Genre genre, int numberOfPlace) {
    this.name = name;
    this.genre = genre;
    this.numberOfPlace = numberOfPlace;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Genre getTheme() {
    return genre;
  }

  public void setTheme(Genre genre) {
    this.genre = genre;
  }

  public int getNumberOfPlace() {
    return numberOfPlace;
  }

  public void setNumberOfPlace(int numberOfPlace) {
    this.numberOfPlace = numberOfPlace;
  }

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

  @Override
  public String toString() {
    return "ReaderHall{" +
        "name='" + name + '\'' +
        ", theme='" + genre + '\'' +
        ", numberOfPlace=" + numberOfPlace +
        '}';
  }
}

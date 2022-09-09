package task3.progressed;

import java.util.Date;
import java.util.Scanner;

public class Author implements Interface {
  String FIO;
  Date birthDate;
  String country;

  public Author(String FIO, Date birthDate, String country) {
    this.FIO = FIO;
    this.birthDate = birthDate;
    this.country = country;
  }

  public String getFIO() {
    return FIO;
  }

  public void setFIO(String FIO) {
    this.FIO = FIO;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    FIO = scanner.nextLine();
    birthDate = new Date(scanner.nextInt());
    country = scanner.nextLine();
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
  }

  @Override
  public String toString() {
    return "Author{" +
        "FIO='" + FIO + '\'' +
        ", birthDate=" + birthDate +
        ", country='" + country + '\'' +
        '}';
  }
}

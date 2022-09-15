package task3.create;

import java.util.Date;
import java.util.Scanner;

public class Author {
  private String FIO;
  private Date birthDate;
  private String country;

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

  public void output(){
    System.out.println(this);
  }

  public void fill(Scanner scanner){
    FIO = scanner.nextLine();
    country = scanner.nextLine();
    birthDate = new Date(scanner.nextInt());
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

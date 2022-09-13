package task6.third;

import task6.third.Author;
import task6.third.MenuException;
import task6.third.Collection;
import java.util.Date;
import java.util.Scanner;

public class Author {
  String FIO;
  Date birthDate;
  String country;

  public Author(String str1, String str2, String str3) {
    str1 = str1.substring(4);
    str2 = str2.substring(10);
    str3 = str3.substring(8);
    FIO = str1;
    birthDate = new Date(Integer.parseInt(str2));
    country = str3;
  }

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
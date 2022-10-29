package task3.progressed;

import java.util.Date;
import java.util.Scanner;

public class Author implements InputOutput {
  private String FIO;
  private Date birthDate;
  private String country;

  public Author(String FIO, Date birthDate, String country) {
    this.FIO = FIO;
    this.birthDate = birthDate;
    this.country = country;
  }

  public Author(){
    this("",new Date(),"");
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

  private void setCountry(String country) {
    this.country = country;
  }

  @Override
  public void output(){
    System.out.println(this);
  }

  @Override
  public void fill(Scanner scanner){
    System.out.println("FIO = ");
    FIO = scanner.nextLine();
    System.out.println("Birthday = ");
    birthDate = new Date(Integer.parseInt(scanner.nextLine()));
    System.out.println("Country =");
    country = scanner.nextLine();
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

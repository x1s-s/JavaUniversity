package task3.progressed;

import java.util.Date;
import java.util.Scanner;

public class BookingBook implements Interface{
  private Book book;
  private Reader reader;
  private Date startDay;
  private Date endDay;

  public BookingBook(Book book, Reader reader, Date startDay, Date endDay) {
    this.book = book;
    this.reader = reader;
    this.startDay = startDay;
    this.endDay = endDay;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Reader getReader() {
    return reader;
  }

  public void setReader(Reader reader) {
    this.reader = reader;
  }

  public Date getStartDay() {
    return startDay;
  }

  public void setStartDay(Date startDay) {
    this.startDay = startDay;
  }

  public Date getEndDay() {
    return endDay;
  }

  public void setEndDay(Date endDay) {
    this.endDay = endDay;
  }

  @Override
  public void fill(){
    Scanner scanner = new Scanner(System.in);
    book.fill();
    reader.fill();
    startDay = new Date(scanner.nextInt());
    endDay = new Date(scanner.nextInt());
  }

  @Override
  public void getFromDB(){
    System.out.println("No data base");
  }

  @Override
  public String toString() {
    return "BookingBook{" +
        "book=" + book +
        ", reader=" + reader +
        ", startDay=" + startDay +
        ", endDay=" + endDay +
        '}';
  }
}

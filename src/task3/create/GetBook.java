package task3.create;

import java.util.Date;
import java.util.Scanner;

public class GetBook {
  private Book book;
  private Reader reader;
  private Worker worker;
  private Date pickupDate;
  private Date returnDate;

  public GetBook(Book book, Reader reader, Worker worker, Date pickupDate, Date returnDate) {
    this.book = book;
    this.reader = reader;
    this.worker = worker;
    this.pickupDate = pickupDate;
    this.returnDate = returnDate;
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

  public Worker getWorker() {
    return worker;
  }

  public void setWorker(Worker worker) {
    this.worker = worker;
  }

  public Date getPickupDate() {
    return pickupDate;
  }

  public void setPickupDate(Date pickupDate) {
    this.pickupDate = pickupDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public void fill(){
    Scanner scanner = new Scanner(System.in);
    book.fill();
    reader.fill();
    worker.fill();
    pickupDate = new Date(scanner.nextInt());
    returnDate = new Date(scanner.nextInt());
  }

  @Override
  public String toString() {
    return "GetBook{" +
        "book=" + book +
        ", reader=" + reader +
        ", worker=" + worker +
        ", pickupDate=" + pickupDate +
        ", returnDate=" + returnDate +
        '}';
  }
}

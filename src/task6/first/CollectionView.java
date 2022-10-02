package task6.first;

import task3.progressed.Book;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CollectionView {
  public void OutputCollection(Book[] books) {
    AtomicInteger number = new AtomicInteger();
    Stream.of(books).filter(Objects::nonNull).forEach(x -> System.out.println("books[" + number.getAndIncrement() + "] = " + x));
  }
}

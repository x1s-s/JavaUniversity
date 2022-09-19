package task6.first;

import task3.progressed.Book;

public class CollectionView {
  public void OutputCollection(Book[] books) {
    for (int i = 0; i < books.length; i++) {
      if(books[i] != null){
        System.out.println("books[" + i + "] = "  + books[i]);
      }
    }
  }
}

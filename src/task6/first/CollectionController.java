package task6.first;

import java.util.Scanner;
import task3.progressed.Book;

public class CollectionController {
  private Collection collection;
  private CollectionView collectionView;

  public CollectionController(Collection collection,CollectionView collectionView) {
    this.collection = collection;
    this.collectionView = collectionView;
  }

  public void addElement(Scanner scanner){
    Book[] books = collection.getBooks();
    Book[] tempArray = books.clone();
    books = new Book[books.length + 1];
    books[books.length - 1] = new Book();
    System.arraycopy(tempArray,0, books,0,tempArray.length);
    collection.setBooks(books);
    //authors[authors.length - 1].fill();
  }

  public void editElement(Scanner scanner){
    System.out.print("Enter element index : ");
    Book[] books = collection.getBooks();
    books[scanner.nextInt()].fill(scanner);
    collection.setBooks(books);
  }

  public void deleteElement(Scanner scanner){
    System.out.print("Enter element index : ");
    int deleteIndex = scanner.nextInt();
    Book[] books = collection.getBooks();
    Book[] tempArray = new Book[books.length - 1];
    System.arraycopy(books,0,tempArray,0,deleteIndex);
    System.arraycopy(books,deleteIndex + 1,tempArray,deleteIndex,tempArray.length - deleteIndex);
    books = new Book[tempArray.length];
    System.arraycopy(tempArray,0, books,0, books.length);
    collection.setBooks(books);
  }

  public void updateViews(){
    collectionView.OutputCollection(collection.getBooks());
  }
}

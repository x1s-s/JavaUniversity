package task6.first;

import java.util.Scanner;

import task3.progressed.Book;

public record CollectionController(Collection collection,
                                   CollectionView collectionView) {

    public void addElement(Scanner scanner) {
        Book[] books = collection.getBooks();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book();
                //books[i].fill(scanner);
                collection.setBooks(books);
                return;
            }
        }
        System.out.println("Collection full");
    }

    public void editElement(Scanner scanner) {
        System.out.print("Enter element index : ");
        Book[] books = collection.getBooks();
        try {
            books[scanner.nextInt()].fill(scanner);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        collection.setBooks(books);
    }

    public void deleteElement(Scanner scanner) {
        System.out.print("Enter element index : ");
        int deleteIndex = scanner.nextInt();
        Book[] books = collection.getBooks();
        try {
            books[deleteIndex] = null;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        collection.setBooks(books);
    }

    public void updateViews() {
        collectionView.OutputCollection(collection.getBooks());
    }
}

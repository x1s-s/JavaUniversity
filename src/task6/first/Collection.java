package task6.first;

import task3.progressed.Book;

public class Collection {
    private Book[] books;

    public Collection(int n) {
        books = new Book[n];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}

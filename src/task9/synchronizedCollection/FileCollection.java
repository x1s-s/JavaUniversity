package task9.synchronizedCollection;

import task3.progressed.Author;
import task3.progressed.Book;
import task3.progressed.Genre;
import task3.progressed.PublishingHouse;


import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class FileCollection extends CollectionController<Book> {

    public FileCollection(Collection<Book> collection, CollectionView<Book> collectionView) {
        super(collection, collectionView);
    }

    public void outputToFile(String fileName) {
        new Thread(()->{
            try {
                lock.lock();
                File file = new File(fileName);
                FileWriter fileWriter = new FileWriter(file, false);
                Collection<Book> temp = firstElement;
                fileWriter.write("" + super.length());
                while (temp != null && temp.getElement() != null) {
                    outputElementToFile(temp.getElement(), fileWriter);
                    temp = temp.getNextElement();
                }
                fileWriter.close();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            } finally {
                lock.unlock();
            }
        }).start();
    }

    public void inputFormFile(String fileName) {
        new Thread(() -> {
            lock.lock();
            File file = new File(fileName);
            try {
                FileReader fileReader = new FileReader(file);
                Scanner fileScanner = new Scanner(fileReader);
                int length = Integer.parseInt(fileScanner.nextLine());
                for (int i = 0; i < length; i++) {
                    Book element = readBookFromFile(fileScanner);
                    if (firstElement == null || firstElement.getElement() == null) {
                        firstElement = new Collection<>(element);
                    } else {
                        findLast().setNextElement(new Collection<>(element));
                    }
                }
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                lock.unlock();
            }
        }).start();
    }

    private Book readBookFromFile(Scanner scanner) {
        Book temp = new Book();
        temp.setAuthor(new Author(scanner.nextLine().split(":")[1], new Date(Long.parseLong(scanner.nextLine().split(":")[1])), scanner.nextLine().split(":")[1]));
        temp.setGenre(Genre.valueOf(scanner.nextLine().split(":")[1]));
        temp.setPublishingHouse(new PublishingHouse(scanner.nextLine().split(":")[1], scanner.nextLine().split(":")[1]));
        temp.setName(scanner.nextLine().split(":")[1]);
        temp.setCreationDate(new Date(Long.parseLong(scanner.nextLine().split(":")[1])));
        return temp;
    }

    private void outputElementToFile(Book book, FileWriter fileWriter) {
        try {
            fileWriter.write("\nAuthor(FIO): " + (book.getAuthor().getFIO().equals("") ? " " : book.getAuthor().getFIO()));
            fileWriter.write("\nAuthor(BirthDay):" + book.getAuthor().getBirthDate().getTime());
            fileWriter.write("\nAuthor(Country):" + (book.getAuthor().getCountry().equals("") ? " " : book.getAuthor().getCountry()));
            fileWriter.write("\nGenre:" + book.getGenre().name());
            fileWriter.write("\nPublishingHouse(Name):" + (book.getPublishingHouse().getName().equals("") ? " " : book.getPublishingHouse().getName()));
            fileWriter.write("\nPublishingHouse(Address):" + (book.getPublishingHouse().getAddress().equals("") ? " " : book.getPublishingHouse().getAddress()));
            fileWriter.write("\nName:" + (book.getName().equals("") ? " " : book.getName()));
            fileWriter.write("\nCreationDate:" + book.getCreationDate().getTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

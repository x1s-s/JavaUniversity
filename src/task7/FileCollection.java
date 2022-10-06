package task7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.swing.JLabel;

import task3.progressed.Author;
import task3.progressed.Book;
import task3.progressed.Genre;
import task3.progressed.PublishingHouse;

public class FileCollection extends CollectionController<Book> {
    public FileCollection(Collection<Book> collection, CollectionView<Book> collectionView) {
        super(collection, collectionView);
    }

    public void deleteAll() {
        collection.setArray(new Book[1]);
    }
    public void outputFromFile(String filePath, JLabel label) {
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write("" + Stream.of(collection.getArray()).filter(Objects::nonNull).count());
            Stream.of(collection.getArray()).filter(Objects::nonNull).forEach(x -> outputElementToFile(x,fileWriter));
            fileWriter.close();
        } catch (IOException e) {
            label.setText("Ошибка записи в файл");
        }
    }

    public void inputFormFile(String filePath, JLabel label) {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            Scanner fileScanner = new Scanner(fileReader);
            int length = Integer.parseInt(fileScanner.nextLine());
            IntStream.range(0,length - 1).forEach(x -> addElement(readBookFromFile(fileScanner)));
            fileReader.close();
        } catch (Exception e) {
            label.setText("Ошибка чтения из файла");
        }
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

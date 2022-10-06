package task9;

import task3.progressed.Book;
import task6.second.Types;
import task9.synchronizedCollection.Collection;
import task9.synchronizedCollection.CollectionView;
import task9.synchronizedCollection.FileCollection;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        FileCollection fileCollection = new FileCollection(new Collection<>(new Book[1]), new CollectionView<>());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            fileCollection.addElement(new Book());
        }
        fileCollection.updateViews();
        fileCollection.editElement(Types.BOOK, 0, scanner);
        fileCollection.updateViews();
        fileCollection.deleteElement(0);
        fileCollection.updateViews();
        fileCollection.outputToFile("file.txt");
        fileCollection.inputFormFile("file.txt");
        fileCollection.updateViews();
        fileCollection.inputFormFile("C:\\Users\\User\\IdeaProjects\\JavaUniversity\\file.txt");
        fileCollection.updateViews();

    }
}

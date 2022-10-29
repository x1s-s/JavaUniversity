package task9;

import task3.progressed.Book;
import task6.second.Types;
import task9.synchronizedCollection.Collection;
import task9.synchronizedCollection.CollectionView;
import task9.synchronizedCollection.FileCollection;

import java.util.Random;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        FileCollection fileCollection = new FileCollection(new Collection<>(new Book[1]), new CollectionView<>());
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int i1 = random.nextInt(5);
            switch (i1){
                case 0 -> fileCollection.addElement(new Book());
                case 1 -> fileCollection.deleteElement(0);
                case 2 -> fileCollection.updateViews();
                case 3 -> fileCollection.outputToFile("file.txt");
                case 4 -> fileCollection.inputFormFile("file.txt");
            }
            System.out.println(i1);
            fileCollection.updateViews();
        }
    }
}

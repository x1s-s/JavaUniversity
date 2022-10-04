package task9;

import task3.progressed.Book;
import task9.synchronizedCollection.Collection;
import task9.synchronizedCollection.CollectionView;
import task9.synchronizedCollection.FileCollection;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        FileCollection fileCollection = new FileCollection(new Collection<>(),new CollectionView<>());
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(1000);
//            fileCollection.addElement(new Book());
//        }
//        fileCollection.updateViews();
//        fileCollection.editElement(new Book(),1);
//        fileCollection.updateViews();
//        fileCollection.deleteElement(1);
//        fileCollection.updateViews();
//        fileCollection.outputToFile("");
//        fileCollection.inputFormFile("file.txt");
//        fileCollection.updateViews();
        fileCollection.inputFormFile("C:\\Users\\User\\IdeaProjects\\JavaUniversity\\file.txt");
        fileCollection.updateViews();

    }
}

package task6.third;

import java.util.Scanner;
import task3.progressed.Book;
import task6.first.MenuException;
import task6.second.Collection;
import task6.second.CollectionController;
import task6.second.CollectionView;

public class Runner {
  public static void main(String[] args) {
    String[] mainMenu = new String[]{"add element","edit element(by index)","delete element(by index)","output all elements","output(to file)","input(from file)","exit"};
    Scanner scanner = new Scanner(System.in);

    FileCollection fileCollection = new FileCollection(new Collection<Book>(), new CollectionView<Book>());
    int menuPosition = menu(mainMenu,scanner);
    while(menuPosition != mainMenu.length - 1){
      try {
        switch (menuPosition){
          case 0 -> fileCollection.addElement(new Book());
          case 1 -> fileCollection.editElement(new Book(scanner), scanner);
          case 2 -> fileCollection.deleteElement(scanner);
          case 3 -> fileCollection.updateViews();
          case 4 -> fileCollection.outputToFile(scanner);
          case 5 -> fileCollection.inputFormFile(scanner);
          default -> throw new MenuException("invalid menu item",2);
        }
      } catch (Exception exception){
        System.out.println(exception.getMessage());
      }
      menuPosition = menu(mainMenu,scanner);
    }
  }

  public static int menu(String[] menuOptions,Scanner scanner){
    for (int i = 0; i < menuOptions.length; i++) {
      System.out.println(i + ")" + menuOptions[i]);
    }
    System.out.print("Enter menu item: ");
    return scanner.nextInt();
  }
}

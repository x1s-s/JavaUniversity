package task6.second;

import java.util.Scanner;
import task3.progressed.Book;
import task6.first.MenuException;

public class Runner {
  public static void main(String[] args) {
    String[] mainMenu = new String[]{"add element","edit element(by index)","delete element(by index)","output all elements","exit"};
    Scanner scanner = new Scanner(System.in);
    CollectionController<Book> collectionController = new CollectionController<Book>(new Collection<Book>(),new CollectionView<Book>());
    int menuPosition = menu(mainMenu,scanner);
    while(menuPosition != mainMenu.length - 1){
      try {
        switch (menuPosition){
          case 0 -> collectionController.addElement(new Book());
          case 1 -> collectionController.editElement(new Book(scanner), scanner);
          case 2 -> collectionController.deleteElement(scanner);
          case 3 -> collectionController.updateViews();
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

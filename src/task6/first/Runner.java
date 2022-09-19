package task6.first;

import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    String[] mainMenu = new String[]{"add element","edit element(by index)","delete element(by index)","output all elements","exit"};
    Scanner scanner = new Scanner(System.in);
    CollectionController collectionController = new CollectionController(new Collection(), new CollectionView());
    int menuPosition = menu(mainMenu,scanner);
    while(menuPosition != mainMenu.length - 1){
      try {
        switch (menuPosition){
          case 0 -> collectionController.addElement(scanner);
          case 1 -> collectionController.editElement(scanner);
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

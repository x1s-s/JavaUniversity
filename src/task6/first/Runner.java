package task6.first;

import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    String[] mainMenu = new String[]{"add element","edit element(by index)","delete element(by index)","output all elements","exit"};
    Collection collection = new Collection();
    Scanner scanner = new Scanner(System.in);
    int menuPosition = menu(mainMenu,scanner);
    while(menuPosition != mainMenu.length - 1){
      try {
        switch (menuPosition){
          case 0 -> collection.addElement();
          case 1 -> collection.editElement(scanner);
          case 2 -> collection.deleteElement(scanner);
          case 3 -> collection.outputElements();
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

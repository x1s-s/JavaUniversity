package task6.second;

import java.util.Scanner;

import task3.progressed.Book;
import task6.first.MenuException;

public class Runner {
    public static void main(String[] args) {
        String[] mainMenu = new String[]{"add element", "edit element(by index)", "delete element(by index)", "output all elements", "exit"};
        Scanner scanner = new Scanner(System.in);
        CollectionController<Book> collectionController = new CollectionController<>(new Collection<>(new Book[1]), new CollectionView<>());
        int menuPosition = menu(mainMenu, scanner);
        int index;
        while (menuPosition != mainMenu.length - 1) {
            try {
                switch (menuPosition) {
                    case 0 -> collectionController.addElement(new Book());
                    case 1 -> {
                        System.out.println("Index = ");
                        index = Integer.parseInt(scanner.nextLine());
                        collectionController.editElement(new Book(scanner), index);
                    }
                    case 2 -> {
                        System.out.println("Index = ");
                        index = Integer.parseInt(scanner.nextLine());
                        collectionController.deleteElement(index);
                    }
                    case 3 -> collectionController.updateViews();
                    default -> throw new MenuException("invalid menu item", menuPosition);
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
            menuPosition = menu(mainMenu, scanner);
        }
    }


    public static int menu(String[] menuOptions, Scanner scanner) {
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println(i + ")" + menuOptions[i]);
        }
        System.out.print("Enter menu item: ");
        return Integer.parseInt(scanner.nextLine());
    }
}

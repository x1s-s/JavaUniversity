package task6.second;

import task3.progressed.Book;

import java.util.Scanner;

public class Factory {
    public static Object getFromFactory(Types type, Scanner scanner) {
        return switch (type) {
            case BOOK -> new Book(scanner);
            default -> null;
        };
    }
}

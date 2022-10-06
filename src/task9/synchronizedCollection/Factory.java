package task9.synchronizedCollection;

import task3.progressed.Book;
import task6.second.Types;

import java.util.Scanner;

public class Factory {
    public static Object getFromFactory(Types type, Scanner scanner) {
        return switch (type) {
            case BOOK -> new Book(scanner);
            default -> null;
        };
    }
}

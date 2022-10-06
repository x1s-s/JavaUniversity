package task11.part1;

import task3.progressed.Author;
import task3.progressed.Book;
import task3.progressed.PublishingHouse;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) throws IOException {
        Object object = new Book();
        System.out.println("All Fields:");
        Stream.of(object.getClass().getDeclaredFields()).forEach(x -> System.out.println(x.getName()));
        System.out.println("All Methods:");
        Stream.of(object.getClass().getDeclaredMethods()).forEach(x -> System.out.println(x.getName()));
        System.out.println("Accessible Fields:");
        Stream.of(object.getClass().getFields()).forEach(x -> System.out.println(x.getName()));
        System.out.println("Accessible Methods:");
        Stream.of(object.getClass().getMethods()).forEach(x -> System.out.println(x.getName()));
        FileWriter fileWriter = new FileWriter("file.txt");
        Object[] objects = new Object[]{
                new Book(),
                new Author(),
                new PublishingHouse()
        };
        Arrays.stream(objects).forEach(x -> {
            try {
                fileWriter.write(x.getClass().getName() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fileWriter.close();
        FileReader fileReader = new FileReader("file.txt");
        Scanner fileScanner = new Scanner(fileReader);
        List<Object> objectList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            try {
                objectList.add(Class.forName(fileScanner.nextLine()).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        fileReader.close();
        objectList.forEach(x -> System.out.println(x.getClass().getName()));
    }
}
